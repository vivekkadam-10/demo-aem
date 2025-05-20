package com.divya.demo.core.util.behavioraldp.visitorDP.visitor;

import com.divya.demo.core.util.behavioraldp.visitorDP.element.DoubleRoomElement;
import com.divya.demo.core.util.behavioraldp.visitorDP.element.SingleRoomElement;

public interface RoomVisitor {

    void visit(SingleRoomElement element);
    void visit(DoubleRoomElement element);
}
