package com.divya.demo.core.util.behavioraldp.interpretorDP;

public class NonTerminalAddition extends Expression{

    Expression left;
    Expression right;
    NonTerminalAddition(Expression left, Expression right){
        this.left = left;
        this.right = right;
    }
    @Override
    int interpret() {
        return left.interpret() + right.interpret();
    }
}
