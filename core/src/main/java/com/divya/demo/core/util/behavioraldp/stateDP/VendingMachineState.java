package com.divya.demo.core.util.behavioraldp.stateDP;

public interface VendingMachineState {
    void pressInsertCoins(VendingMachine vm);
    void  addCoins(VendingMachine vm,Coin coin) throws Exception;
    void pressSelectProduct(VendingMachine vm) throws Exception;
    Product selectProduct(VendingMachine vm,int code) throws Exception;
    int getChange(VendingMachine vm,Product product) throws Exception;
    void dispatchProduct(VendingMachine vm) throws Exception;
}
