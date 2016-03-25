package com.patterns.gof.command.rc.commands;

import com.patterns.gof.command.rc.devices.CeilingFan;

public class CeilingFanOffCommand extends CeilingFanCommand {

    public CeilingFanOffCommand(CeilingFan ceilingFan) {
        super(ceilingFan);
    }

    @Override
    public void execute() {
        previousSpeed = ceilingFan.getSpeed();
        ceilingFan.setOff();
    }
}
