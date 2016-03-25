package com.patterns.gof.command.rc;

import com.patterns.gof.command.rc.commands.Command;
import com.patterns.gof.command.rc.commands.NoCommand;

/**
 * This class represents Invoker (Initiator) role in Command pattern
 */
public class RemoteControl {

    private Command[] onCommands;
    private Command[] offCommands;
    private Command undoCommand;

    public RemoteControl() {
        onCommands = new Command[3];
        offCommands = new Command[3];

        Command noCommand = new NoCommand();
        for(int i = 0; i < 3; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        undoCommand = noCommand;
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void pushOnButton(int slot) {
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    public void pushOffButton(int slot) {
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    public void pushUndoButton() {
        undoCommand.undo();
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("\n-----------RemoteControl---------------\n");
        for(int i = 0; i < onCommands.length; i++) {
            sb.append("slot [" + i + "] "
                    + onCommands[i].getClass().getSimpleName()
                    + "  "
                    + offCommands[i].getClass().getSimpleName() + "\n");
        }
        return sb.toString();
    }
}
