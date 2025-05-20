package com.divya.demo.core.util.behavioraldp.commandDP;

public class TurnOffCommand implements Command{

    ACReceiver acReceiver;

    TurnOffCommand(ACReceiver ac){
        this.acReceiver = ac;
    }
    @Override
    public void execute() {
        acReceiver.turnOff();
    }

    @Override
    public void undo(){
        acReceiver.turnOn();
    }
}
