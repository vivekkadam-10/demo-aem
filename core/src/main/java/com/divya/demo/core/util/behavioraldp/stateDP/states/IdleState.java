package com.divya.demo.core.util.behavioraldp.stateDP.states;


import com.divya.demo.core.util.behavioraldp.stateDP.Coin;
import com.divya.demo.core.util.behavioraldp.stateDP.Product;
import com.divya.demo.core.util.behavioraldp.stateDP.VendingMachine;
import com.divya.demo.core.util.behavioraldp.stateDP.VendingMachineState;

public class IdleState implements VendingMachineState {

    @Override
    public void pressInsertCoins(VendingMachine vm) {
        vm.setShelf();
        vm.setState(new HasMoneyState());
    }

    @Override
    public void addCoins(VendingMachine vm, Coin coin) throws Exception {
        throw new Exception("Cannot add Money");
    }

    @Override
    public void pressSelectProduct(VendingMachine vm) throws Exception {
       throw new Exception("Cannot select Product");
    }

    @Override
    public Product selectProduct(VendingMachine vm, int code) throws Exception {
        throw new Exception("Cannot select Product");
    }

    @Override
    public int getChange(VendingMachine vm, Product product) throws Exception {
        throw new Exception("Cannot give change");
    }

    @Override
    public void dispatchProduct(VendingMachine vm) throws Exception {
        throw new Exception("Cannot Dispatch");
    }
}
