package com.divya.demo.core.util.behavioraldp.observerDP;

public class SMSObserver implements StockObserver{
    @Override
    public void updateStockCount() {
        System.out.println("SMS sent with stock count :");
    }
}
