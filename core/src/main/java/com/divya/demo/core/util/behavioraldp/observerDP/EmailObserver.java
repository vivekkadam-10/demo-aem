package com.divya.demo.core.util.behavioraldp.observerDP;

public class EmailObserver implements StockObserver{
    @Override
    public void updateStockCount() {
        System.out.println("Email sent with stock count :");
    }
}
