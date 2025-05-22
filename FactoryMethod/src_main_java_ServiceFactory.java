public class ServiceFactory {
    public static IService getService(String service) {
        Class classe = null;
        Object objeto = null;
        try {
            classe = Class.forName("Service" + service);
            objeto = classe.newInstance();
        } catch (Exception ex) {
            throw new IllegalArgumentException("Serviço inexistente");
        }
        if (!(objeto instanceof IService)) {
            throw new IllegalArgumentException("Serviço inválido");
        }
        return (IService) objeto;
    }
}
