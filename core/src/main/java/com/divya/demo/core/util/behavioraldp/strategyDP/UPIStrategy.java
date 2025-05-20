package com.divya.demo.core.util.behavioraldp.strategyDP;

public class UPIStrategy implements PayStrategy{
    @Override
    public void pay(int amt) {
        System.out.println("Payment of Rs. "+amt+" done via UPI");
    }
}
