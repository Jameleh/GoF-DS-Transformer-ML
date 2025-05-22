package org.proxyPattern.EmployeeDao.Impl;

import org.proxyPattern.EmployeeDao.EmpTable;
import org.proxyPattern.EmployeeDao.Employee;

public class EmpTableImpl implements EmpTable {

    @Override
    public void create(String client, Employee obj) {
        //create a new row
        System.out.println("created ");

    }

    @Override
    public void remove(String client, int id) {
        //remove from DB
        System.out.println("deleted with Id "+ id);

    }

    @Override
    public Employee get(String client, int empId) {
        System.out.println("fetching data from db");
        return new Employee();
    }
}
