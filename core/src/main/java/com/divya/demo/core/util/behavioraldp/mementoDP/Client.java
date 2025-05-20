package com.divya.demo.core.util.behavioraldp.mementoDP;

public class Client {

    public static void main(String[] args) {
        CareTaker c = new CareTaker();
        Originator o1 = new Originator();
        State s1 = new State();
        s1.setHeight(10);
        s1.setWidth(20);
        o1.setState(s1);
        //snapshot
        Memento snapshot1 = o1.creatMemnto();
        c.addMemento(snapshot1);


        State s2 = new State();
        s2.setHeight(30);
        s2.setWidth(30);
        o1.setState(s2);

        System.out.println(o1.getState().getWidth()+"  "+o1.getState().getHeight());
        Memento restore = c.undo();
        o1.restoreMemento(restore.getS());
        System.out.println(o1.getState().getWidth()+"  "+o1.getState().getHeight());

    }
}
