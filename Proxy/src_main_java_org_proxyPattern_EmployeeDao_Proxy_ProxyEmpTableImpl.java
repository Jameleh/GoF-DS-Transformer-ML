package org.proxyPattern.EmployeeDao.Proxy;

import org.proxyPattern.EmployeeDao.EmpTable;
import org.proxyPattern.EmployeeDao.Employee;
import org.proxyPattern.EmployeeDao.Impl.EmpTableImpl;

public class ProxyEmpTableImpl implements EmpTable {
    EmpTable empTable; //as has-a relationship

    //constructor
    public ProxyEmpTableImpl(){
        this.empTable=new EmpTableImpl();
    }
    @Override
    public void create(String client, Employee obj) throws Exception {
        if(client.equals("ADMIN")){
            empTable.create(client,obj);
            return;
        }
        throw new Exception("Access denied!");
    }

    @Override
    public void remove(String client, int id) throws Exception {
        if(client.equals("ADMIN")){
            empTable.remove(client,id);
            return;
        }
        throw new Exception("Access denied!");
    }

    @Override
    public Employee get(String client, int empId) throws Exception {
        if(client.equals("ADMIN") || client.equals("USER")){
            return empTable.get(client,empId);
        }
        throw new Exception("Access denied!");

    }
}
