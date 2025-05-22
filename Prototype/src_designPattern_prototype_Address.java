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
public class Address {
    private String location;
    public Address(String locatoin){
        this.location= locatoin;
    }
    public String getLocation(){
        return location;
    }
    public void setLocation(String location){
        this.location = location;
    }   
}
