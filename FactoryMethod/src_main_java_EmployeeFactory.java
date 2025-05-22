public class EmployeeFactory {

    public  static IEmployee getEmployee(String employeeType){
        if(employeeType.equals("Web"))
            return new WebDeveloper();
        else if(employeeType.equals("Android"))
                return new AndroidDeveloper();
        else
            return (IEmployee) new IllegalArgumentException("W  rong Employee type");

    }
}
