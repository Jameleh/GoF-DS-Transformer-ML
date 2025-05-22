public class Main {
    public static void main(String[] args) {
        DBAbstraction abstraction = new DbRefinedImplementor(new SQLServerImplementor());
        abstraction.openConection("e-ticaret db");
        abstraction.execute("select * from Urun");
        abstraction = new DbRefinedImplementor(new OracleImplementor());
        abstraction.openConection("e-ticaret db");
        abstraction.execute("select * from Urun");
    }
}