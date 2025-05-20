package com.divya.demo.core.util.behavioraldp.commandDP;

public class TurnOnCommand implements Command{

    ACReceiver acReceiver;

    TurnOnCommand(ACReceiver ac){
        this.acReceiver = ac;
    }
    @Override
    public void execute() {
        acReceiver.turnOn();
    }

    @Override
    public void undo(){
        acReceiver.turnOff();
    }
}
