package com.patterns.gof.command.rc.commands;

import com.patterns.gof.command.rc.devices.RoomLight;

public class RoomLightOffCommand implements Command {

    private RoomLight roomLight;

    public RoomLightOffCommand(RoomLight roomLight) {
        this.roomLight = roomLight;
    }

    @Override
    public void execute() {
        roomLight.off();
    }

    @Override
    public void undo() {
        roomLight.on();
    }
}
