package com.divya.demo.core.util.behavioraldp.stateDP.states;

import com.divya.demo.core.util.behavioraldp.stateDP.Coin;
import com.divya.demo.core.util.behavioraldp.stateDP.Product;
import com.divya.demo.core.util.behavioraldp.stateDP.VendingMachine;
import com.divya.demo.core.util.behavioraldp.stateDP.VendingMachineState;

public class HasMoneyState implements VendingMachineState {
    @Override
    public void pressInsertCoins(VendingMachine vm) {

    }

    @Override
    public void addCoins(VendingMachine vm, Coin coin) {
        vm.getCoins().add(coin);
        vm.setCoins(vm.getCoins());
    }

    @Override
    public void pressSelectProduct(VendingMachine vm) {
        vm.setState(new SelectProduct());
    }

    @Override
    public Product selectProduct(VendingMachine vm, int code) {
        return null;
    }

    @Override
    public int getChange(VendingMachine vm,Product product) {
        return 0;
    }

    @Override
    public void dispatchProduct(VendingMachine vm) {

    }
}
