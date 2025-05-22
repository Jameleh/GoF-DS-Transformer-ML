
import org.allbinary.logic.communication.log.LogFactory;
import org.allbinary.logic.communication.log.LogUtil;
import org.allbinary.logic.util.cache.CacheInterface;
import org.allbinary.logic.util.cache.CacheInterfaceFactory;
import org.allbinary.logic.util.cache.CachePolicyFactory;
import org.allbinary.logic.util.cache.CacheTypeFactory;
public class ImageComparisonResultCacheSingleton
{
    private static CacheInterface cacheInterface = null;
    static
    {
        try
        {
            LogUtil.put(LogFactory.getInstance("Start", "ImageComparisonCacheSingleton", "Static Block"));
            cacheInterface = CacheInterfaceFactory.getInstance(CacheTypeFactory.getInstance().CACHE, CachePolicyFactory.getInstance().ONE_MINUTE_FIVE_MAX);
            LogUtil.put(LogFactory.getInstance("End", "ImageComparisonCacheSingleton", "Static Block"));
        }
        catch(Exception e)
        {
            LogUtil.put(LogFactory.getInstance("Exception", "ImageComparisonCacheSingleton", "Static Block", e));
        }
    }
    private ImageComparisonResultCacheSingleton()
    {
    }
    public static CacheInterface getInstance()
    {
        return cacheInterface;
    }    
}
