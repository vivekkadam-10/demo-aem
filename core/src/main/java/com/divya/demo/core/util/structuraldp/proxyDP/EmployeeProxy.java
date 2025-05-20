package com.divya.demo.core.util.structuraldp.proxyDP;

public class EmployeeProxy implements Employee{

    EmployeeImpl employee;

    EmployeeProxy(){
        this.employee = new EmployeeImpl();
    }

    @Override
    public void createEmployee() {
        //preprocess
        employee.createEmployee();
    }

    @Override
    public void deleteEmployee() {
        //preprocess
        employee.deleteEmployee();
    }

    @Override
    public void updateEmployee() {
        //preprocess
        employee.updateEmployee();
    }
}
