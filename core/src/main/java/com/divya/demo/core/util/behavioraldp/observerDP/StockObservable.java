package com.divya.demo.core.util.behavioraldp.observerDP;

public interface StockObservable {

    void addObserver(StockObserver stockObserver);
    void removeObsercer(StockObserver stockObserver);
    void notifyAllObservers();

    void setStockCount(int count);
    int getStockCount();
}
