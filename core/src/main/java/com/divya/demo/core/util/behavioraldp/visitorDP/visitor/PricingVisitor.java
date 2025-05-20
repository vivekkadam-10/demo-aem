package com.divya.demo.core.util.behavioraldp.visitorDP.visitor;

import com.divya.demo.core.util.behavioraldp.visitorDP.element.DoubleRoomElement;
import com.divya.demo.core.util.behavioraldp.visitorDP.element.SingleRoomElement;

public class PricingVisitor implements RoomVisitor{
    @Override
    public void visit(SingleRoomElement singleRoomElement) {
        System.out.println("Single room price is 2000");
    }

    @Override
    public void visit(DoubleRoomElement element) {
        System.out.println("Double room price is 4000");
    }
}
