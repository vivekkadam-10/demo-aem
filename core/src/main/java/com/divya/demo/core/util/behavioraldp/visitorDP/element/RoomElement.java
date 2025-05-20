package com.divya.demo.core.util.behavioraldp.visitorDP.element;

import com.divya.demo.core.util.behavioraldp.visitorDP.visitor.RoomVisitor;

public interface RoomElement {

    void accept(RoomVisitor visitor);
}
