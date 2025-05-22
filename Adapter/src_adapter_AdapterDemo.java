package adapter;

import java.util.List;

public class AdapterDemo {
    public static void main(String args[]){
        EmployeeClient client = new EmployeeClient();
        List<Employee> list = client.getEmployeeList();
        System.out.println(list);
    }
}
