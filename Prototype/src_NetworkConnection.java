import java.util.ArrayList;
import java.util.List;

public class NetworkConnection implements Cloneable {
	
	private String  ip;
	private String importantData;
	private List<String> domains = new ArrayList<>();
	

	public List<String> getDomains() {
		return domains;
	}
	public void setDomains(List<String> domains) {
		this.domains = domains;
	}
	
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getImportantData() {
		return importantData;
	}
	public void setImportantData(String importantData) {
		this.importantData = importantData;
	}
	

	
	@Override
	public String toString() {
		return "NetworkConnection [ip=" + ip + ", importantData=" + importantData + ", domains=" + domains + "]";
	}
	public void loadImportantData() throws InterruptedException {
		this.importantData = "Very Very Important data";
		domains.add("www.abc.com");
		domains.add("www.pqrs.com");
		domains.add("www.lmn.com");
		domains.add("www.xyz.com");
		Thread.sleep(5000);
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		//logic for cloning
		NetworkConnection networkConnection =new NetworkConnection();
		networkConnection.setIp(this.ip);
		networkConnection.setImportantData(this.getImportantData());
		for(String d : this.getDomains()) {
			networkConnection.getDomains().add(d);
		}
		
		return networkConnection;
	}
	
	
}
