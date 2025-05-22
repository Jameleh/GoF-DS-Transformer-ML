
import org.apache.webbeans.config.WebBeansContext;
import org.apache.webbeans.spi.SingletonService;
public interface ThreadSingletonService extends SingletonService<WebBeansContext> {
    void initialize(StartupObject startupObject);
    Object contextEntered(WebBeansContext newOWBContext);
    void contextExited(Object oldOWBContext);
}
