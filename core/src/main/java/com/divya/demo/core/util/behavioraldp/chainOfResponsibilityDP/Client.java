package com.divya.demo.core.util.behavioraldp.chainOfResponsibilityDP;

public class Client {
    public static void main(String[] args) {
        LogHandlers handlers = new InfoHandler(new DebugHandler(null));
        handlers.log(2,"Logger printed");
        handlers.log(2,"Logger printed");
        handlers.log(1,"Logger printed");
    }
}
