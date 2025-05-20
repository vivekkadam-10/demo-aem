package com.divya.demo.core.util.behavioraldp.chainOfResponsibilityDP;

public class InfoHandler extends LogHandlers{

    InfoHandler(LogHandlers handlers){
        super(handlers);
    }

    void log(int level,String mess){
        if(level==1) {
            System.out.println("INFO: "+mess);
        }else {
            super.log(level,mess);
        }
    }
}
