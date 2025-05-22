package adapter;

public class EmployeeCSVAdapter implements Employee{
    private EmployeeCSV instance;
    EmployeeCSVAdapter(EmployeeCSV ins){
        instance = ins;
    }
    @Override
    public String getId() {
        return instance.getNum()+"";
    }

    @Override
    public String getFirstName() {
        return instance.getN();
    }

    @Override
    public String getLastName() {
        return instance.getL();
    }

    @Override
    public String getEmail() {
        return instance.getYahooMail();
    }

    @Override
    public String toString() {
        return "EmployeeCSVAdapter{" +
                "ID=" + instance.getNum() +
                '}';
    }
}
