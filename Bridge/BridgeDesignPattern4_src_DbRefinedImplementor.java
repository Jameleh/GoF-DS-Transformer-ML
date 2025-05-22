public class DbRefinedImplementor extends DBAbstraction{


    public DbRefinedImplementor(IDBImplementor implementor) {
        super(implementor);
    }

    @Override
    public void execute(String sql) {

    }

    @Override
    public void openConection(String sqlCon) {

    }
}
