package com.divya.demo.core.util.structuraldp.proxyDP;

public class EmployeeImpl implements Employee{


    @Override
    public void createEmployee() {
        System.out.println("Employee created");
    }

    @Override
    public void deleteEmployee() {
        System.out.println("Employee deleted");
    }

    @Override
    public void updateEmployee() {
        System.out.println("Employee updated");
    }
}
