package com.divya.demo.core.util.behavioraldp.strategyDP;

public class Client {

    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart(new UPIStrategy());
        shoppingCart.addItem(new Item("item1",100));
        shoppingCart.addItem(new Item("item2",200));
        shoppingCart.pay();
    }
}
