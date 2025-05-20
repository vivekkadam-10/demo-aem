package com.divya.demo.core.util.behavioraldp.interpretorDP;

public class Client {
    public static void main(String[] args) {
        Expression t1 = new TerminalExp("10");
        Expression t2 = new TerminalExp("10");
        Expression t3 = new NonTerminalAddition(t1,t2);
        System.out.println(t1.interpret());
        System.out.println(t2.interpret());
        System.out.println(t3.interpret());
    }
}
