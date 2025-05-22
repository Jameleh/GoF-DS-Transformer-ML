public class StrikerFighter extends Fighter{
    @Override
    public String checkFightRecord() {
        if(this.getTotalWins() > 0){
            if ( ((float)this.getSpecialtyVictories() / this.getTotalWins()) >= 0.5){
                return "Vitorias por " + this.getSpecialty() + ": " +  this.getSpecialtyVictories() ;
            }
            else
            {
                return "Total de vitórias: " + this.getTotalWins() ;
            }
        }
        else {
            return "Lutador sem vitórias";
        }
    }
    @Override
    public String getTipo(){
        return "Lutador Striker ";
    }
}
