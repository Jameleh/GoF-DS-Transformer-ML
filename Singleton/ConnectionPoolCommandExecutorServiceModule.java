
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicInteger;
import org.jclouds.http.HttpUtils;
import org.jclouds.lifecycle.config.LifeCycleModule;
import com.google.inject.AbstractModule;
import com.google.inject.Provides;
public abstract class ConnectionPoolCommandExecutorServiceModule<C> extends AbstractModule {
   protected void configure() {
      install(new LifeCycleModule());
      bind(AtomicInteger.class).toInstance(new AtomicInteger());
      binder().requestInjection(this);
   }
   @Provides
   public abstract BlockingQueue<C> provideAvailablePool(HttpUtils utils) throws Exception;
   @Provides
   public Semaphore provideTotalConnectionSemaphore(HttpUtils utils) throws Exception {
      return new Semaphore(utils.getMaxConnectionsPerHost() != 0 ? utils.getMaxConnectionsPerHost()
               : utils.getMaxConnections(), true);
   }
}
