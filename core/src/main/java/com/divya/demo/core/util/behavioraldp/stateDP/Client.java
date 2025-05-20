package com.divya.demo.core.util.behavioraldp.stateDP;

public class Client {
    public static void main(String[] args) throws Exception {

        VendingMachine vendingMachine = new VendingMachine();

        vendingMachine.getState().pressInsertCoins(vendingMachine);

        vendingMachine.getState().addCoins(vendingMachine,Coin.TWENTY);
        vendingMachine.getState().addCoins(vendingMachine,Coin.TWENTY);
        vendingMachine.getState().addCoins(vendingMachine,Coin.FIVE);

        vendingMachine.getState().pressSelectProduct(vendingMachine);
        Product p = vendingMachine.getState().selectProduct(vendingMachine,102);
        vendingMachine.getState().getChange(vendingMachine,p);
        vendingMachine.getState().dispatchProduct(vendingMachine);

    }
}
