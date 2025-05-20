package com.divya.demo.core.util.behavioraldp.mediatorDP;

public interface Bidder {
    void sendMessage(String bid);
    String receiveMessage(String bid);
}
