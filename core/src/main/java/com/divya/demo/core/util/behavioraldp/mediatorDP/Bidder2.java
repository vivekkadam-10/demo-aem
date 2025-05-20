package com.divya.demo.core.util.behavioraldp.mediatorDP;

public class Bidder2 implements Bidder{
    @Override
    public void sendMessage(String bid) {
        System.out.println("Bidder2 is bidding");
    }

    @Override
    public String receiveMessage(String bid) {
        System.out.println(bid);
        return bid;
    }
}
