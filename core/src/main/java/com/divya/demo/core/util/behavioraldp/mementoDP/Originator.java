package com.divya.demo.core.util.behavioraldp.mementoDP;

public class Originator {

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    State state;

    Memento creatMemnto(){
        Memento m = new Memento();
        m.setS(state);
        return m;
    }

    void restoreMemento(State state){
        this.state = state;
    }
}
