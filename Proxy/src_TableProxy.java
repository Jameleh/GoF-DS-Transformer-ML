public class TableProxy extends ITable {
    public ITable table;

    public TableProxy() {
        table = new Table();
    }

    @Override
    public void create(String User) {
        if(User.equals("ADMIN")) {
            table.create(User);
        }
        else
            System.out.println("Not Authorized");
    }

    @Override
    public void remove(String User) {
        if(User.equals("ADMIN")) {
            table.remove(User);
        }
        else
            System.out.println("Not Authorized");
    }

    @Override
    public void update(String User) {
        if(User.equals("ADMIN")) {
            table.update(User);
        }
        else
            System.out.println("Not Authorized");
    }
}
