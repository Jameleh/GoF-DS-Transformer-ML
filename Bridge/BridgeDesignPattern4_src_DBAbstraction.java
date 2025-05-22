public abstract class DBAbstraction {

    protected IDBImplementor implementor;

    public DBAbstraction(IDBImplementor implementor){
        this.implementor = implementor;
    }


    public abstract void execute(String sql);
    public abstract void openConection(String sqlCon);
}
