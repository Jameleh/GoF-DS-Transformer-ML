
import java.util.Properties;
import org.apache.openejb.config.BeanTypes;
@Exported
public class SingletonContainer extends AbstractContainerProvider {
    private String accessTimeout;
    public String getAccessTimeout() {
        return accessTimeout;
    }
    public void setAccessTimeout(String accessTimeout) {
        this.accessTimeout = accessTimeout;
    }
    protected String getContainerType() {
        return BeanTypes.SINGLETON;
    }
    protected Properties getProperties() {
        Properties properties = new Properties();
        if (accessTimeout != null) {
            properties.setProperty("AccessTimeout", accessTimeout);
        }
        return properties;
    }
}