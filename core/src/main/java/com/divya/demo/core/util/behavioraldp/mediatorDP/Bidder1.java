package com.divya.demo.core.util.behavioraldp.mediatorDP;

public class Bidder1 implements Bidder{

    Mediator mediator;

    @Override
    public void sendMessage(String bid) {
        System.out.println("Bidder 1 is bidding");
    }

    @Override
    public String receiveMessage(String bid) {
        System.out.println(bid);
        return bid;
    }
}
