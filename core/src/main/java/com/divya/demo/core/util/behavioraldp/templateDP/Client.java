package com.divya.demo.core.util.behavioraldp.templateDP;

public class Client {
    public static void main(String[] args) {

        PaymentFlow pf = new Paytofriend();
        pf.sendMoney();
        PaymentFlow pf2 = new PaytoMerchant();
        pf2.sendMoney();
    }
}
