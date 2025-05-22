package achraf;

import achraf.proxy.*;

public class Main {
    public static void main(String[] args) {
        SecurityContext.authenticate("user1", "1234", "USER");
        Context context = new Context();
        context.setService(new SecurityProxy(new CacheProxy(new LoggingProxy(new IServiceImpl()))));
        context.compute(6);

    }
}