
import org.openbel.framework.ws.model.ObjectFactory;
public class ObjectFactorySingleton {
    private static final ObjectFactory INSTANCE = new ObjectFactory();
    private ObjectFactorySingleton() {
    }
    public static ObjectFactory getInstance() {
        return INSTANCE;
    }
}
