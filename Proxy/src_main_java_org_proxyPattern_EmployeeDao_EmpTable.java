package org.proxyPattern.EmployeeDao;

public interface EmpTable{
    public void create(String client, Employee obj) throws Exception;
    public void remove(String client, int id) throws Exception;
    public Employee get(String client,int empId) throws Exception;
}
