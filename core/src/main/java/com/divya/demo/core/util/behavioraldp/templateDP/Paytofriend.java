package com.divya.demo.core.util.behavioraldp.templateDP;

public class Paytofriend extends PaymentFlow{
    @Override
    void validate() {
        System.out.println("Validate friends number");
    }

    @Override
    void notifyStatus() {
        System.out.println("Notify friend");
    }
}
