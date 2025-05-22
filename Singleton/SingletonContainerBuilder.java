
import org.apache.openejb.config.typed.util.*;
import org.apache.openejb.config.sys.*;
import javax.xml.bind.annotation.*;
import org.apache.openejb.util.Duration;
import java.util.*;
import java.util.concurrent.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "SingletonContainer")
public class SingletonContainerBuilder extends Container {
    @XmlJavaTypeAdapter(DurationAdapter.class)
    @XmlAttribute
    private org.apache.openejb.util.Duration accessTimeout = org.apache.openejb.util.Duration.parse("30 seconds");
    public SingletonContainerBuilder() {
        setClassName("org.apache.openejb.core.singleton.SingletonContainer");
        setType("SINGLETON");
        setId("SingletonContainer");
        setConstructor("id, securityService");
    }
    public SingletonContainerBuilder id(String id) {
        setId(id);
        return this;
    }
    public SingletonContainerBuilder withAccessTimeout(org.apache.openejb.util.Duration accessTimeout) {
        this.accessTimeout = accessTimeout;
        return this;
    }
    public void setAccessTimeout(org.apache.openejb.util.Duration accessTimeout) {
        this.accessTimeout = accessTimeout;
    }
    public org.apache.openejb.util.Duration getAccessTimeout() {
        return accessTimeout;
    }
    public SingletonContainerBuilder withAccessTimeout(long time, TimeUnit unit) {
        return withAccessTimeout(new Duration(time, unit));
    }
    public void setAccessTimeout(long time, TimeUnit unit) {
        setAccessTimeout(new Duration(time, unit));
    }
    public Properties getProperties() {
        return Builders.getProperties(this);
    }
}
