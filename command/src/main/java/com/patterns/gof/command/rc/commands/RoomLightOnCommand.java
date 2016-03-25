package com.patterns.gof.command.rc.commands;

import com.patterns.gof.command.rc.devices.RoomLight;

public class RoomLightOnCommand implements Command {

    private RoomLight roomLight;

    public RoomLightOnCommand(RoomLight roomLight) {
        this.roomLight = roomLight;
    }

    @Override
    public void execute() {
        roomLight.on();
    }

    @Override
    public void undo() {
        roomLight.off();
    }
}
