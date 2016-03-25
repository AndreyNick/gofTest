package com.patterns.gof.command.rc.commands;

import com.patterns.gof.command.rc.devices.Conditioner;

public class ConditionerOffCommand implements Command {

    private Conditioner conditioner;

    public ConditionerOffCommand(Conditioner conditioner) {
        this.conditioner = conditioner;
    }

    @Override
    public void execute() {
        conditioner.off();
    }

    @Override
    public void undo() {
        conditioner.on();
    }
}
