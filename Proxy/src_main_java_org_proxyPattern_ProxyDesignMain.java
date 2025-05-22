package org.proxyPattern;

import org.proxyPattern.EmployeeDao.EmpTable;
import org.proxyPattern.EmployeeDao.Employee;
import org.proxyPattern.EmployeeDao.Impl.EmpTableImpl;
import org.proxyPattern.EmployeeDao.Proxy.ProxyEmpTableImpl;

public class ProxyDesignMain {
    public static void main(String[] args) {
        try{
            EmpTable obj=new ProxyEmpTableImpl();
            obj.remove("ADMIN",2);
//            obj.get("USER",3);
            System.out.println("Operation successful");

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}