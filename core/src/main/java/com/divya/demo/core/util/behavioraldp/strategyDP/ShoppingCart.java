package com.divya.demo.core.util.behavioraldp.strategyDP;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    PayStrategy payStrategy;

    List<Item> items = new ArrayList<>();

    ShoppingCart(PayStrategy payStrategy){
        this.payStrategy = payStrategy;
    }

    void addItem(Item i){
        items.add(i);
    }

    void removeItem(Item i){
        items.remove(i);
    }

    void pay(){
        payStrategy.pay(getCartValue());
    }

    private int getCartValue() {
        int val = 0;
        for (Item i:items){
            val += i.getCost();
        }
        return val;
    }
}
