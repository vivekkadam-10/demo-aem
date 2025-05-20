package com.divya.demo.core.util.behavioraldp.templateDP;

public class PaytoMerchant extends PaymentFlow{
    @Override
    void validate() {
        System.out.println("Validate Merchant");
    }

    @Override
    void notifyStatus() {
        System.out.println("Notify Merchant");
    }
}
