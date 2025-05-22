public class Main {
    public static void main(String[] args) {
        ITable table = new TableProxy();
        table.create("Slave");
        table.create("ADMIN");
        table.update("Slave");
    }
}