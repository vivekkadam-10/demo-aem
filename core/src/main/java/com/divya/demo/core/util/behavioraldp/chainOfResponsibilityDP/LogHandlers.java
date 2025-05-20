package com.divya.demo.core.util.behavioraldp.chainOfResponsibilityDP;

public abstract class LogHandlers {

    static int INFO = 1;
    static int DEBUG = 2;

    LogHandlers handler;
    LogHandlers(LogHandlers handler){
        this.handler = handler;
    }
    void log(int level,String m){
        if(handler!=null){
            handler.log(level,m);
        }
    }
}
