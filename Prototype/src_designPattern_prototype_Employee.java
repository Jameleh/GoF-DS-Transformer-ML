/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designPattern.prototype;

/**
 *
 * @author Mohammed dwikat
 */
import designPattern.prototype.Address;
import designPattern.prototype.Prototype;
public class Employee implements Prototype,Cloneable{
    private String name;
    private String lastName;
    private int age;
    private Address address;

    public Employee(){
        System.out.println(" Human description ");
        System.out.println("------------------------------------------------");
        System.out.println("Name"+"\t"+"Last Name"+"\t"+"Age"+"\t"+"Location");
    }

    public Employee(String name, String lastName, int age,Address address) {
        this();
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.address = address;
    }
    public void setName(String name){
        this.name = name;
    }
    
    public void showHuman(){
        System.out.println(name+"\t"+lastName+"\t"+age+"\t"+address.getLocation());
    }


//    @Override
//    public Employee clone() throws CloneNotSupportedException {
//        return (Employee) super.clone();
//    }

    @Override
    public Employee clone() throws CloneNotSupportedException {
        return (Employee) super.clone();
    }
}
