package com.patterns.gof.command.rc.commands;

import com.patterns.gof.command.rc.devices.CeilingFan;

public abstract class CeilingFanCommand implements Command {

    protected CeilingFan ceilingFan;
    protected int previousSpeed;


    protected CeilingFanCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void undo() {
        if(CeilingFan.HIGH == previousSpeed) {
            ceilingFan.setHigh();
        } else if(CeilingFan.MEDIUM == previousSpeed) {
            ceilingFan.setMedium();
        } else if(CeilingFan.LOW == previousSpeed) {
            ceilingFan.setLow();
        } else if(CeilingFan.OFF == previousSpeed) {
            ceilingFan.setOff();
        }
    }
}
