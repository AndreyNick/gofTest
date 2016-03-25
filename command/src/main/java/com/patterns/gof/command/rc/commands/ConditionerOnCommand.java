package com.patterns.gof.command.rc.commands;

import com.patterns.gof.command.rc.devices.Conditioner;

public class ConditionerOnCommand implements Command {

    private Conditioner conditioner;

    public ConditionerOnCommand(Conditioner conditioner) {
        this.conditioner = conditioner;
    }

    @Override
    public void execute() {
        conditioner.on();
    }

    @Override
    public void undo() {
        conditioner.off();
    }
}
