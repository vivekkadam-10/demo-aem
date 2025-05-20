package com.divya.demo.core.util.behavioraldp.stateDP;


import com.divya.demo.core.util.behavioraldp.stateDP.states.IdleState;

import java.util.ArrayList;
import java.util.List;

/*Vending Machine has following states and operations -
Idle -> press insert coins
SelectProduct -> enter product code
hasMoneyState -> check cost of product and coins inserted and give back change
dispatch -> dispatch the object and return to idle state
*/
public class VendingMachine {
    VendingMachineState state;
    List<Coin> coins = new ArrayList<>();
    Shelf shelf;

    VendingMachine(){
        state = new IdleState();
    }

    public void setState(VendingMachineState state) {
        this.state = state;
    }

    public VendingMachineState getState() {
        return state;
    }

    public void setCoins(List<Coin> coins) {
        this.coins = coins;
    }

    public List<Coin> getCoins() {
        return coins;
    }

    public void setShelf() {
        this.shelf = initalizeProducts();;
    }

    public Shelf getShelf() {
        return shelf;
    }

    public Shelf initalizeProducts() {
        Product p1 = new Product("juice",10,101);
        Product p2 = new Product("coke",50,102);
        Product p3 = new Product("cake",30,103);
        Shelf s1 = new Shelf();
        s1.setProductList(List.of(p1,p2,p3));
        return s1;
    }
}

