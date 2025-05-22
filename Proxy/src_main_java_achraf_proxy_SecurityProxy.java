package achraf.proxy;

public class SecurityProxy implements IService {
    private IServiceImpl service = new IServiceImpl();
    @Override
    public double compute(int parameter) {
        if(SecurityContext.role.equals("root")){
            return service.compute(parameter);
        }else{
            throw new RuntimeException("Not authorized");
        }
    }
}
