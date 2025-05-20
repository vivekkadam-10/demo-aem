package com.divya.demo.core.util.structuraldp.proxyDP;

public class Client {

    public static void main(String[] args) {

        Employee e = new EmployeeProxy();
        e.createEmployee();
        e.updateEmployee();
    }
}
