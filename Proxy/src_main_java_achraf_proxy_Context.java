package achraf.proxy;

public class Context {
    private IService service;

    public void setService(IService service) {
        this.service = service;
    }

    public void compute(int parameter){
        System.out.println("==============");
        double result = service.compute(parameter);
        System.out.println("Results => " +result);
        System.out.println("==============");
    }
}
