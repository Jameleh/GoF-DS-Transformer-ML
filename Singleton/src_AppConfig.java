public class AppConfig {
    //Instancia única
    private static AppConfig instance;

    //-------------------------------------------------------------
    //Variables que representan configuraciones típicas
    private String username;
    private String serverUrl;
    private int port;
    private String ipAddress;
    private String filePath;

    //-------------------------------------------------------------
    //Constructor
    private AppConfig(){
        this.username = "Paola";
        this.serverUrl = "http://example2.com";
        this.port = 1234;
        this.ipAddress = "176.8.1.1";
        this.filePath = "/ruta/archivo.mp3";
    }

    //-------------------------------------------------------------
    //Método getInstance()
    public static synchronized AppConfig getInstance() {
        if (instance == null) {
            instance = new AppConfig();
        }
        return instance;
    }

    //-------------------------------------------------------------
    //Método setInstance()
    public static void setInstance(AppConfig instance) {
        AppConfig.instance = instance;
    }

    //-------------------------------------------------------------
    //Getter y Setter de la variable para "Url del servidor"
    public String getServerUrl() {
        return serverUrl;
    }

    public void setServerUrl(String serverUrl) {
        this.serverUrl = serverUrl;
    }

    //-------------------------------------------------------------
    //Getter y Setter de la variable para "Nombre de Usuario"
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    //-------------------------------------------------------------
    //Getter y Setter de la variable para "Puerto"
    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    //-------------------------------------------------------------
    //Getter y Setter de la variable para "Dirección de IP"
    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    //-------------------------------------------------------------
    //Getter y Setter de la variable para "Ruta de Archivo"
    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }
}
