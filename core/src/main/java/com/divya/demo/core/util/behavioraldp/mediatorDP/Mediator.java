package com.divya.demo.core.util.behavioraldp.mediatorDP;

public interface Mediator {
    void sendMessage(Bidder b,String bid);
    void addBidder(Bidder b);
    void removeBidder(Bidder b);
}
