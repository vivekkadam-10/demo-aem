package com.divya.demo.core.util.behavioraldp.commandDP;

public class SetTempCommand implements Command{

    ACReceiver acReceiver;
    int temp;
    SetTempCommand(ACReceiver ac){
        this.acReceiver = ac;
    }
    @Override
    public void execute() {
        acReceiver.setTemperature(temp);
    }

    @Override
    public void undo() {
        acReceiver.setTemperature(0);
    }
}
