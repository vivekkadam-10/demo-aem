package com.divya.demo.core.util.behavioraldp.commandDP;

public class ACReceiver {

    boolean on;
    int temperature;

    void turnOn(){
        this.on = true;
    }
    void turnOff(){
        this.on = false;
    }

    void setTemperature(int temp){
        this.temperature = temp;
    }
}
