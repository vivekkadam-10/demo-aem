package com.divya.demo.core.util.behavioraldp.commandDP;

import java.util.Stack;

public class RemoteInvoker {


    Command command;

    Stack<Command> history = new Stack<>();
    RemoteInvoker(Command command){
        this.command = command;
    }
     void pressButton(){
        command.execute();
         history.push(command);
     }

     void undo(){
        Command c = history.pop();
        c.undo();
     }
}
