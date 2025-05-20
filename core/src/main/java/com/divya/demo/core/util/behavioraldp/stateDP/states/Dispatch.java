package com.divya.demo.core.util.behavioraldp.stateDP.states;

import com.divya.demo.core.util.behavioraldp.stateDP.Coin;
import com.divya.demo.core.util.behavioraldp.stateDP.Product;
import com.divya.demo.core.util.behavioraldp.stateDP.VendingMachine;
import com.divya.demo.core.util.behavioraldp.stateDP.VendingMachineState;

public class Dispatch implements VendingMachineState {
    @Override
    public void pressInsertCoins(VendingMachine vm) {

    }

    @Override
    public void addCoins(VendingMachine vm,  Coin coin) throws Exception {

    }

    @Override
    public void pressSelectProduct(VendingMachine vm) {

    }

    @Override
    public Product selectProduct(VendingMachine vm, int code) throws Exception {
        return null;
    }

    @Override
    public int getChange(VendingMachine vm, Product product) throws Exception {
        return 0;
    }

    @Override
    public void dispatchProduct(VendingMachine vm) throws Exception {
        System.out.println("Product dispatched successfully");
        vm.setState(new IdleState());
    }
}
