package com.divya.demo.core.util.behavioraldp.chainOfResponsibilityDP;

public class DebugHandler extends LogHandlers {

    DebugHandler(LogHandlers handlers){
        super(handlers);
    }

    void log(int level,String mess){
        if(level==2) {
            System.out.println("DEBUG: "+mess);
        }else {
            super.log(level,mess);
        }
    }
}
