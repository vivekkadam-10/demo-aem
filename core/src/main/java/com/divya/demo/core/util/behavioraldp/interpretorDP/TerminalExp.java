package com.divya.demo.core.util.behavioraldp.interpretorDP;

public class TerminalExp extends Expression{

    String operator;

    TerminalExp(String operator){
        this.operator = operator;
    }
    @Override
    int interpret() {
        return Integer.parseInt(operator);
    }
}
