package com.divya.demo.core.util.behavioraldp.visitorDP;

import com.divya.demo.core.util.behavioraldp.visitorDP.element.RoomElement;
import com.divya.demo.core.util.behavioraldp.visitorDP.element.SingleRoomElement;
import com.divya.demo.core.util.behavioraldp.visitorDP.visitor.PricingVisitor;
import com.divya.demo.core.util.behavioraldp.visitorDP.visitor.RoomVisitor;
import com.divya.demo.core.util.behavioraldp.visitorDP.visitor.ServiceVisitor;

//Double Dispatch
public class Client {
    public static void main(String[] args) {
        RoomElement singleRoom = new SingleRoomElement();
        RoomVisitor priceVisitor = new PricingVisitor();
        RoomVisitor serviceVisitor = new ServiceVisitor();

        singleRoom.accept(priceVisitor);
        singleRoom.accept(serviceVisitor);
    }
}
