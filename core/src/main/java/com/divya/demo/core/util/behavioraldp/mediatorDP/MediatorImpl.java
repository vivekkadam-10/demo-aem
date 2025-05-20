package com.divya.demo.core.util.behavioraldp.mediatorDP;

import java.util.ArrayList;
import java.util.List;

public class MediatorImpl implements Mediator{

    List<Bidder> bidders =new ArrayList<>();

    @Override
    public void addBidder(Bidder b){
        bidders.add(b);
    }

    @Override
    public void removeBidder(Bidder b){
        bidders.remove(b);
    }

    @Override
    public void sendMessage(Bidder bidder,String bid) {
        bidder.sendMessage(bid);
        for(Bidder b:bidders){
            b.receiveMessage("Received bid by "+bidder);
        }
    }
}
