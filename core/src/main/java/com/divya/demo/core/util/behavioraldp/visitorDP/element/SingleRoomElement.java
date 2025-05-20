package com.divya.demo.core.util.behavioraldp.visitorDP.element;

import com.divya.demo.core.util.behavioraldp.visitorDP.visitor.RoomVisitor;

public class SingleRoomElement implements RoomElement{
    @Override
    public void accept(RoomVisitor visitor) {
        visitor.visit(this);
    }
}
