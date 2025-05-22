
import javax.ejb.RemoveException;
import java.lang.reflect.Method;
public class SingletonEJBHomeHandler extends EJBHomeHandler {
    public SingletonEJBHomeHandler() {
    }
    public SingletonEJBHomeHandler(EJBMetaDataImpl ejb, ServerMetaData server, ClientMetaData client) {
        super(ejb, server, client);
    }
    protected Object findX(Method method, Object[] args, Object proxy) throws Throwable {
        throw new SystemException(new UnsupportedOperationException("Session beans may not have find methods"));
    }
    protected Object removeByPrimaryKey(Method method, Object[] args, Object proxy) throws Throwable {
        throw new ApplicationException(new RemoveException("Session objects are private resources and do not have primary keys"));
    }
    protected Object removeWithHandle(Method method, Object[] args, Object proxy) throws Throwable {
        return null;
    }
    protected EJBObjectHandler newEJBObjectHandler() {
        return new SingletonEJBObjectHandler();
    }
}
