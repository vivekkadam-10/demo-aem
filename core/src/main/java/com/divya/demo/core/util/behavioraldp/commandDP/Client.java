package com.divya.demo.core.util.behavioraldp.commandDP;

public class Client {
    public static void main(String[] args) {
        ACReceiver acReceiver = new ACReceiver();
        Command c1 = new TurnOnCommand(acReceiver);
        RemoteInvoker remoteInvoker = new RemoteInvoker(c1);
        remoteInvoker.pressButton();
        System.out.println("AC is"+acReceiver.on);

        Command c2 = new TurnOffCommand(acReceiver);
        RemoteInvoker remoteInvoker2 = new RemoteInvoker(c2);
        remoteInvoker2.pressButton();
        System.out.println("AC is"+acReceiver.on);

        c2.undo();
        System.out.println("AC is"+acReceiver.on);
    }
}
