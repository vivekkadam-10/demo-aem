package com.divya.demo.core.util.behavioraldp.observerDP;

import java.util.ArrayList;
import java.util.List;

public class StockObservableImpl implements StockObservable{

    List<StockObserver> stockObserverList = new ArrayList<>();
    int stockCount=0;

    @Override
    public void addObserver(StockObserver stockObserver) {
        stockObserverList.add(stockObserver);
    }

    @Override
    public void removeObsercer(StockObserver stockObserver) {
        stockObserverList.remove(stockObserver);
    }

    @Override
    public void notifyAllObservers() {
        for(StockObserver observer:stockObserverList){
            observer.updateStockCount();
        }
    }

    @Override
    public void setStockCount(int count) {

        if(stockCount == 0){
            notifyAllObservers();
        }
        this.stockCount += count;
    }

    @Override
    public int getStockCount() {
        return this.stockCount;
    }
}
