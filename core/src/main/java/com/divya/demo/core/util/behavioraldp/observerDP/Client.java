package com.divya.demo.core.util.behavioraldp.observerDP;

public class Client {

    public static void main(String[] args) {
        StockObservable stockObservable = new StockObservableImpl();

        StockObserver s1 = new EmailObserver();
        StockObserver s2 = new EmailObserver();
        StockObserver s3 = new SMSObserver();

        stockObservable.addObserver(s1);
        stockObservable.addObserver(s2);
        stockObservable.addObserver(s3);

        stockObservable.setStockCount(10);
    }
}
