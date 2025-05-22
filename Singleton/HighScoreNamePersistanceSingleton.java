
import javax.microedition.rms.RecordEnumeration;
import javax.microedition.rms.RecordStore;
import org.allbinary.util.BasicArrayList;
import org.allbinary.logic.basic.string.CommonStrings;
import org.allbinary.logic.basic.string.StringMaker;
import org.allbinary.logic.basic.string.StringUtil;
import org.allbinary.logic.communication.log.LogFactory;
import org.allbinary.logic.communication.log.LogUtil;
import org.allbinary.logic.java.exception.ExceptionUtil;
import org.allbinary.logic.math.SmallIntegerSingletonFactory;
public class HighScoreNamePersistanceSingleton
{
    private static HighScoreNamePersistanceSingleton SINGLETON = new HighScoreNamePersistanceSingleton();
    public static HighScoreNamePersistanceSingleton getInstance()
    {
        return SINGLETON;
    }
    private final String RECORD_ID = "_Saved_Name";
    private String name = StringUtil.getInstance().EMPTY_STRING;
    private BasicArrayList nameBasicArrayList = new BasicArrayList();
    public void clear()
    {
        this.name = StringUtil.getInstance().EMPTY_STRING;
    }
    public void deleteAll() throws Exception
    {
        int size = nameBasicArrayList.size();
        for (int index = 0; index < size; index++)
        {
            Integer integer = (Integer) this.nameBasicArrayList.objectArray[index];
            this.delete(integer.intValue());
        }
        this.clear();
    }
    public void delete(int deleteId) throws Exception
    {
        LogUtil.put(LogFactory.getInstance(new StringMaker().append("Deleting: ").append(deleteId).toString(), this, "delete"));
        RecordStore recordStore = RecordStore.openRecordStore(RECORD_ID, true);
        recordStore.deleteRecord(deleteId);
        recordStore.closeRecordStore();
    }
    public BasicArrayList getIds()
    {
        return this.nameBasicArrayList;
    }
    public String load()
    {
        final String LOAD = "load";
        try
        {
            if (this.name == StringUtil.getInstance().EMPTY_STRING)
            {
                final String LOADING_ID = "Loading id: ";
                RecordStore recordStore = RecordStore.openRecordStore(RECORD_ID, true);
                RecordEnumeration recordEnum = recordStore.enumerateRecords(null, null, true);
                final SmallIntegerSingletonFactory smallIntegerSingletonFactory = SmallIntegerSingletonFactory.getInstance();
                while (recordEnum.hasNextElement())
                {
                    int id = recordEnum.nextRecordId();
                    LogUtil.put(LogFactory.getInstance(new StringMaker().append(LOADING_ID).append(id).toString(), this, LOAD));
                    nameBasicArrayList.add(smallIntegerSingletonFactory.getInstance(id));
                }
                recordStore.closeRecordStore();
            }
        } catch (Exception e)
        {
            this.save(this.name);
            LogUtil.put(LogFactory.getInstance(new StringMaker().append(CommonStrings.getInstance().EXCEPTION_LABEL).append(ExceptionUtil.getInstance().getStackTrace(e)).toString(), this, LOAD));
        }
        return this.name;
    }
    public void save(String name)
    {
        try
        {
            LogUtil.put(LogFactory.getInstance(new StringMaker().append("Saving: ").append(name).toString(), this, "save"));
            RecordStore recordStore = RecordStore.openRecordStore(RECORD_ID, true);
            recordStore.closeRecordStore();
            this.name = name;
        } catch (Exception e)
        {
            LogUtil.put(LogFactory.getInstance(CommonStrings.getInstance().EXCEPTION, this, "save", e));
        }
    }
}
