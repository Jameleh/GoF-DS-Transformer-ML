import java.util.List;

public class FighterProxy implements IFighter {
    private Fighter fighter;
    private Integer key;

    public FighterProxy(Integer key) {
        this.key = key;
    }
    @Override
    public List<String> accessFighterData(){
        if(this.fighter == null){
            this.fighter = new Fighter(this.key);
        }
        return this.fighter.accessFighterData();
    }

    @Override
    public List<String>accessContractClauses(Employee employee){
        if (!employee.isAdministrator()) {
            throw new IllegalArgumentException("Acesso não autorizado.");
        }
        if(this.fighter == null){
            this.fighter = new Fighter(this.key);
        }
        return this.fighter.accessContractClauses(employee);
    }
}