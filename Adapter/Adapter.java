package AdapterDesignPattern;

public class Adapter implements  faculty{

    Dean d = new Dean();

    @Override
    public void teaching(String str) {
       d.recrutment(str);
    }

}
