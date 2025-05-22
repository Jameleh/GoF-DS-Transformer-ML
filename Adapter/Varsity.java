package AdapterDesignPattern;

public class Varsity {

    public static void main(String[] args) {

      faculty f = new Adapter();
      Department d = new Department();

       d.setF(f);
       d.education("Good Education depends on best teaching");

    }
}
