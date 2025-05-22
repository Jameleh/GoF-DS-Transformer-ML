public class Main {
    public static void main(String[] args) {
        ATelefon t1 = new ATelefon();
        BTelefon t2 = new BTelefon();

        IMessage iMessage = new SMS();
        IMessage iMessage2 = new MMS();

        t1.accept(iMessage);
        t1.accept(iMessage2);

        t2.accept(iMessage);
        t2.accept(iMessage2);



    }
}