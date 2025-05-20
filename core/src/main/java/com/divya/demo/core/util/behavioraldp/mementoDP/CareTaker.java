package com.divya.demo.core.util.behavioraldp.mementoDP;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {

    List<Memento> history=new ArrayList<>();

    void addMemento(Memento m){
        history.add(m);
    }

    Memento undo(){

        Memento m = (history.get(history.size()-1));
        history.remove(m);
        return m;

    }

}
