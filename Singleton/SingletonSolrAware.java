
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.apache.solr.client.solrj.embedded.EmbeddedSolrServer;
import org.apache.solr.core.CloseHook;
import org.apache.solr.core.CoreContainer;
import org.apache.solr.core.SolrCore;
import org.apache.solr.handler.component.ResponseBuilder;
import org.apache.solr.handler.component.SearchComponent;
import org.apache.solr.util.plugin.SolrCoreAware;
public class SingletonSolrAware extends SearchComponent implements SolrCoreAware {
	private static CoreContainer coreContainer;
	private static volatile SingletonSolrAware INSTANCE;
	private Map<String, EmbeddedSolrServer> serverMap = new HashMap<String, EmbeddedSolrServer>();
	private CloseHook closeHook = new CloseHook() {
		@Override
		public void preClose(SolrCore core) {
		}
		@Override
		public void postClose(SolrCore core) {
			INSTANCE = null;
			coreContainer = null;
			serverMap = new HashMap<String, EmbeddedSolrServer>();
		}
	};
	private SingletonSolrAware() {
		if (INSTANCE != null) {
			throw new IllegalStateException("SolrAware already created");
		}
		INSTANCE = this;
	}
	public void inform(SolrCore core) {
		if (coreContainer == null) {
			coreContainer = core.getCoreContainer();
		}
		core.addCloseHook(closeHook);
	}
	public synchronized static SingletonSolrAware getInstance() {
		if (INSTANCE == null) {
			new SingletonSolrAware();
		}
		return INSTANCE;
	}
	public Collection<String> getCoreNames() {
		return coreContainer.getAllCoreNames();
	}
	public SolrCore getCoreByName(String coreName) {
		return coreContainer.getCore(coreName);
	}
	public synchronized EmbeddedSolrServer getEmbeddedSolrServerByCoreName(String coreName) {
		EmbeddedSolrServer server = serverMap.get(coreName);
		if (server == null) {
			if(coreContainer.getAllCoreNames().contains(coreName)) {
				server = new EmbeddedSolrServer(coreContainer, coreName);
				serverMap.put(coreName, server);
			} else {
				throw new IllegalArgumentException(coreName+" not found");
			}
		}
		return server;
	}
	@Override
	public void prepare(ResponseBuilder rb) throws IOException {
		throw new UnsupportedOperationException();
	}
	@Override
	public void process(ResponseBuilder rb) throws IOException {
		throw new UnsupportedOperationException();
	}
	@Override
	public String getDescription() {
		return "SolrAware";
	}
	@Override
	public String getSource() {
		throw new UnsupportedOperationException();
	}
	@Override
	public String getVersion() {
		throw new UnsupportedOperationException();
	}
}
