public class Referee  implements Classe{
    private String name;
    private int refereedFights ;

    public Referee(String nome, int refereedFights) {
        this.name = nome;
        this.refereedFights = refereedFights;
    }

    public String getName() {
        return name;
    }

    public int getRefereedFights() {
        return refereedFights;
    }

    public String toAccept(Visitor visitor) {
        return visitor.showReferee(this);
    }
}
