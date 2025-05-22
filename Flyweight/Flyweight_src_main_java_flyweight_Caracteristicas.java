package flyweight;

public class Caracteristicas {
    private String layout;
    private String codBarras;
    private String keycaps;
    private String switches;

    public Caracteristicas(String layout, String codBarras, String keycaps, String switches) {
        this.layout = layout;
        this.codBarras = codBarras;
        this.keycaps = keycaps;
        this.switches = switches;
    }

    public String getLayout() {
        return layout;
    }

    public String getCodBarras() {
        return codBarras;
    }

    public String getKeycaps() {
        return keycaps;
    }

    public String getSwitches() {
        return switches;
    }
}
