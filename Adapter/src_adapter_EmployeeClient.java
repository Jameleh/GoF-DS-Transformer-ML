package adapter;

import java.util.ArrayList;
import java.util.List;

public class EmployeeClient {
    public List<Employee> getEmployeeList(){
        List<Employee> employees = new ArrayList<>();
        EmployeeDB emp1 = new EmployeeDB("12", "Deepa", "Navaneeth", "deepa@navi.com");
       // Employee empLap = new EmployeeLdap("13", "Akil", "Anbalagan", "akil@gmail.com");
        employees.add(emp1);
        EmployeeLdap empLap = new EmployeeLdap("13", "Akil", "Anbalagan", "akil@gmail.com");
        // We are using the below adapter to map to employee class - this adapter implements emp and returns the empLdap obj
        employees.add(new EmployeeLdapAdapter(empLap));
        // We are using the second adapter
        EmployeeCSV empCSV= new EmployeeCSV(14, "Akil", "Anbalagan", "akil@gmail.com");
        employees.add(new EmployeeCSVAdapter(empCSV));
        return employees;
    }
}
