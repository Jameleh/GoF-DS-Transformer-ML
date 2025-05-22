/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designPattern.prototype;




import designPattern.prototype.Employee;

public class PrototypeDemo {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) throws CloneNotSupportedException {
        Address address = new Address("Nablus");
        Employee employee = new Employee("Mohammed", "Dwikat", 21,address);
        System.out.println("---------e1");
        employee.showHuman();
        Employee employee2 = (Employee) employee.clone();
        System.out.println("---------e2");
        employee2.showHuman();
        employee2.setName("Ali");
        System.out.println("--------- update e2");
        employee2.showHuman();
        System.out.println("--------- e1");
        employee.showHuman();
        
        System.out.println("----------------------------");
        Employee employee3 = employee;
        System.out.println("---------e3");
        employee3.showHuman();
        System.out.println("--------- update e3");
        employee3.setName("Ahmad");
        employee3.showHuman();
        System.out.println("--------- e1");
        employee.showHuman();
        System.out.println("----------------------------");
        System.out.println("---------e1");
        employee.showHuman();
        System.out.println("--------- update e1");
        employee.setName("Mahmud");
        employee3.showHuman();
        System.out.println("--------- e3");
        employee.showHuman();
    }    
}
