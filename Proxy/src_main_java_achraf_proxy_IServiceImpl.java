package achraf.proxy;

public class IServiceImpl implements IService {
    @Override
    public double compute(int parameter) {
        double value = 33;
        return value*parameter;
    }
}
