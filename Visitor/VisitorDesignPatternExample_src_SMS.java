public class SMS implements IMessage{
    @Override
    public void visit(ITelefon iTelefon) {

        System.out.println("a tel için sms var");

    }
    public void visit(BTelefon iTelefon){
        System.out.println("B tel için sms yok");

    }
}
