package com.divya.demo.core.util.structuraldp.adapterDP;

//This is concret adapter class which will act like a wrapper
public class WeighingMachineAdapterImpl implements WeighingMachineAdapter{

    WeighingMachineAdaptee weightMachine;
    @Override
    public int getWeightInKgs() {
        // this line is just to run main method otherwise not required
        weightMachine = new WeighingMachineAdapteeImpl();
        int w = (int) (weightMachine.getWeight()*0.45f);
        return w;
    }
}
