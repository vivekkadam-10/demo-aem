package com.divya.demo.core.util.structuraldp.adapterDP;

public class Client {

    public static void main(String[] args) {
        WeighingMachineAdapter weighingMachineAdapter = new WeighingMachineAdapterImpl();
        System.out.println(weighingMachineAdapter.getWeightInKgs());
    }
}
