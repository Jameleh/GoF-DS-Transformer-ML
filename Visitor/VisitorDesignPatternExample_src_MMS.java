public class MMS implements IMessage{
    @Override
    public void visit(ITelefon iTelefon) {

            System.out.println("a tel için mms yok");

        }
        public void visit(BTelefon iTelefon){
            System.out.println("B tel için mms var");

        }
    }

