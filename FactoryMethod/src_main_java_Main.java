public class Main {
    public static void main (String args[]){
        String employeeType="Android";
        IEmployee employee=EmployeeFactory.getEmployee(employeeType);
        System.out.println(employee.salary());
    }
}
