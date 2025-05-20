package com.divya.demo.core.util.behavioraldp.visitorDP.visitor;

import com.divya.demo.core.util.behavioraldp.visitorDP.element.DoubleRoomElement;
import com.divya.demo.core.util.behavioraldp.visitorDP.element.SingleRoomElement;

public class ServiceVisitor implements RoomVisitor{
    @Override
    public void visit(SingleRoomElement element) {
        System.out.println("Single room is under service");
    }

    @Override
    public void visit(DoubleRoomElement element) {
        System.out.println("Double room us under service");
    }
}
