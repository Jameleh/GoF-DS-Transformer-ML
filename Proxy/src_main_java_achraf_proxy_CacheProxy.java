package achraf.proxy;

import java.util.HashMap;
import java.util.Map;

public class CacheProxy implements IService {
    private IServiceImpl service = new IServiceImpl();
    private Map<Integer, Double> cache = new HashMap<>();

    @Override
    public double compute(int parameter) {
        Double cacheValue = cache.get(parameter);
        if(cacheValue!=null) {
            System.out.println("cache results*------------");
            return cacheValue;
        }
        else{
            double res = service.compute(parameter);
            cache.put(parameter, res);
            System.out.println("new computing tresults----------");
            return res;
        }
    }
}
