import java.util.Arrays;
import java.util.List;

public class ProxyInternet implements Internet{

    private RealConnection realConnection;
    private static List<String> resctrictedSites = Arrays.asList("site1.com", "site2.com");

    public ProxyInternet(){
        this.realConnection = new RealConnection();
    }

    @Override
    public void connect(String server){
        if(resctrictedSites.contains(server.toLowerCase())){
            System.out.println("Access denied to " + server);
        } else{
            realConnection.connect(server);
        }
    }

}
