package com.divya.demo.core.util.behavioraldp.templateDP;

public abstract class PaymentFlow {

    abstract void validate();
    abstract void notifyStatus();

    void debitAmt(){
        System.out.println("Money debited");
    }

    //Final template method
    final void sendMoney(){
        validate();
        debitAmt();
        notifyStatus();
    }
}
