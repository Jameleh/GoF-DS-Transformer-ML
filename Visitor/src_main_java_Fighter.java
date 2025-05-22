public class Fighter  implements Classe{
    private String name;
    private String cartel;

    public Fighter(String nome, String cartel) {
        this.name = nome;
        this.cartel = cartel;
    }

    public String getName() {
        return name;
    }

    public String getCartel() {
        return cartel;
    }

    public String toAccept(Visitor visitor) {
        return visitor.showFighter(this);
    }
}
