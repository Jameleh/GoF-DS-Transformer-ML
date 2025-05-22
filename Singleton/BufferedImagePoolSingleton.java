
import org.allbinary.logic.communication.log.LogFactory;
import org.allbinary.logic.communication.log.LogUtil;
import org.allbinary.logic.util.cache.CachePolicyFactory;
import org.allbinary.logic.util.cache.PoolInterface;
import org.allbinary.logic.util.cache.PoolInterfaceFactory;
import org.allbinary.logic.util.cache.PoolTypeFactory;
public class BufferedImagePoolSingleton
{
    private static PoolInterface poolInterface = null;
    static
    {
        try
        {
            LogUtil.put(LogFactory.getInstance("Start", "BufferedImagePoolSingleton", "Static Block"));
            poolInterface =
                PoolInterfaceFactory.getInstance(
                new BufferedImageCacheableFactory(),
                PoolTypeFactory.getInstance().VECTOR_POOL, 
                CachePolicyFactory.getInstance().MAX_TIME_THOUSAND_MAX);
            LogUtil.put(LogFactory.getInstance("End", "BufferedImagePoolSingleton", "Static Block"));
        }
        catch(Exception e)
        {
            LogUtil.put(LogFactory.getInstance("Exception", "BufferedImagePoolSingleton", "Static Block", e));
        }
    }
    private BufferedImagePoolSingleton()
    {
    }
    public static PoolInterface getInstance()
    {
        return poolInterface;
    }
}
