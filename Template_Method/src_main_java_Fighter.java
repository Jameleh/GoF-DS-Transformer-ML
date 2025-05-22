public abstract class Fighter {

    private Integer id;
    private String name;
    private String specialty;
    private Integer totalWins;
    private Integer specialtyVictories;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getTotalWins() {
        return totalWins;
    }

    public void setTotalWins(Integer totalWins) {
        this.totalWins = totalWins;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public Integer getSpecialtyVictories() {
        return specialtyVictories;
    }

    public void setSpecialtyVictories(Integer specialtyVictories) {
        this.specialtyVictories = specialtyVictories;
    }
    public abstract String checkFightRecord();

    public String getTipo(){
        return "Lutador ";
    }

    public String getInfo() {
        return getTipo() + "{" +
                "Identificação: " + this.id +
                ", Nome: " + this.name +
                ", Cartel: " + this.checkFightRecord() +
                "}";

    }
}