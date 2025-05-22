
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock;
import org.alfresco.repo.tenant.TenantUtil;
import org.alfresco.util.GUID;
public class TransactionAwareSingleton<T> extends TransactionListenerAdapter
{
    private final String txnKey;
    private final ReadLock singletonReadLock;
    private final WriteLock singletonWriteLock;
    private Map<String, Object> tenantSingletonValue = new HashMap<String, Object>(1); 
    public TransactionAwareSingleton()
    {
        txnKey = GUID.generate();
        ReentrantReadWriteLock serverReadWriteLock = new ReentrantReadWriteLock();
        singletonReadLock = serverReadWriteLock.readLock();
        singletonWriteLock = serverReadWriteLock.writeLock();
    }
    private void setValue(Object value)
    {
        singletonWriteLock.lock();
        try
        {
            tenantSingletonValue.put(TenantUtil.getCurrentDomain(), value);
        }
        finally
        {
            singletonWriteLock.unlock();
        }
    }
    private Object getValue()
    {
        singletonReadLock.lock();
        try
        {
            return tenantSingletonValue.get(TenantUtil.getCurrentDomain());
        }
        finally
        {
            singletonReadLock.unlock();
        }
    }
    @SuppressWarnings("unchecked")
    public T get()
    {
        TransactionStorage storage = (TransactionStorage) AlfrescoTransactionSupport.getResource(txnKey);
        if (storage != null)
        {
            return (T) storage.newValue;
        }
        else
        {
            return (T) getValue();
        }
    }
    public void put(T value)
    {
        TransactionStorage storage = (TransactionStorage) AlfrescoTransactionSupport.getResource(txnKey);
        if (storage == null)
        {
            storage = new TransactionStorage();
            AlfrescoTransactionSupport.bindResource(txnKey, storage);
            AlfrescoTransactionSupport.bindListener(this);
        }
        storage.newValue = value;
    }
    public void afterCommit()
    {
        TransactionStorage storage = (TransactionStorage) AlfrescoTransactionSupport.getResource(txnKey);
        if (storage != null)
        {
            setValue(storage.newValue);
        }
    }
    private static class TransactionStorage
    {
        public Object newValue;
    }
}