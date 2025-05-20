package com.divya.demo.core.util.behavioraldp.mediatorDP;

public class Client {
    public static void main(String[] args) {
        Bidder b1 = new Bidder1();
        Bidder b2 = new Bidder2();

        Mediator m = new MediatorImpl();
        m.addBidder(b1);
        m.addBidder(b2);
        m.sendMessage(b1,"Bidding");
        m.sendMessage(b2,"bidding");
    }
}
