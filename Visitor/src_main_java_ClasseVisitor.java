public class ClasseVisitor implements Visitor{
    public String exibir(Classe classe) {
        return classe.toAccept(this);
    }

    @Override
    public String showFighter(Fighter fighter) {
        return "Lutador{" +
                "nome='" + fighter.getName() + '\'' +
                ", cartel=" + fighter.getCartel() +
                '}';
    }

    @Override
    public String showReferee(Referee referee) {
        return "Arbitro{" +
                "nome='" + referee.getName() + '\'' +
                ", lutas arbitradas='" + referee.getRefereedFights() + '\'' +
                '}';
    }

    @Override
    public String showCoach(Coach coach) {
        return "Treinador{" +
                "nome='" + coach.getName() + '\'' +
                ", equipe='" + coach.getTeam() + '\'' +
                '}';
    }
}
