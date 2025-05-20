package com.divya.demo.core.util.behavioraldp.stateDP.states;

import com.divya.demo.core.util.behavioraldp.stateDP.Coin;
import com.divya.demo.core.util.behavioraldp.stateDP.Product;
import com.divya.demo.core.util.behavioraldp.stateDP.VendingMachine;
import com.divya.demo.core.util.behavioraldp.stateDP.VendingMachineState;

public class SelectProduct implements VendingMachineState {
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
        return vm.getShelf().getProductList().stream().filter(product -> product.getCode()==code).findFirst().get();
    }

    @Override
    public int getChange(VendingMachine vm,Product product) throws Exception {

        int totalCoinsInMachine = 0;
        for(Coin c:vm.getCoins()){
            if(c.name().equals(Coin.TEN.name())){
                totalCoinsInMachine += 10;
            }else if(c.name().equals(Coin.TWENTY.name())){
                totalCoinsInMachine += 20;
            }else if(c.name().equals(Coin.FIVE.name())){
                totalCoinsInMachine += 5;
            }else if(c.name().equals(Coin.HUNDRED.name())){
                totalCoinsInMachine += 100;
            }
        }
        int diff = totalCoinsInMachine - product.getCost();
        if(diff>=0){
            System.out.println("Take ur Change Rs. " +diff);
            vm.setState(new Dispatch());
        }else {
            throw new Exception("Insufficient cash");
        }
        return diff;
    }

    @Override
    public void dispatchProduct(VendingMachine vm) throws Exception {
        throw new Exception("Select product first");
    }
}
