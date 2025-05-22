public class Coach implements Classe {
    private String name;
    private String team;

    public Coach(String nome, String team) {
        this.name = nome;
        this.team = team;
    }

    public String getName() {
        return name;
    }

    public String getTeam() {
        return team;
    }

    public String toAccept(Visitor visitor) {
        return visitor.showCoach(this);
    }
}
