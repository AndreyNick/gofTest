package com.patterns.gof.command.rc;

import com.patterns.gof.command.rc.commands.*;
import com.patterns.gof.command.rc.devices.CeilingFan;
import com.patterns.gof.command.rc.devices.Conditioner;
import com.patterns.gof.command.rc.devices.RoomLight;
import com.patterns.gof.command.rc.devices.TV;
import org.junit.Before;
import org.junit.Test;

public class RemoteControlTest {

    RemoteControl remoteControl;

    Conditioner conditioner;
    RoomLight roomLight;
    TV tv;
    CeilingFan ceilingFan;

    ConditionerOnCommand conditionerOnCommand;
    ConditionerOffCommand conditionerOffCommand;
    RoomLightOnCommand roomLightOnCommand;
    RoomLightOffCommand roomLightOffCommand;
    TVOnCommand tvOnCommand;
    TVOffCommand tvOffCommand;
    CeilingFanHighCommand ceilingFanHighCommand;
    CeilingFanMediumCommand ceilingFanMediumCommand;
    CeilingFanLowCommand ceilingFanLowCommand;
    CeilingFanOffCommand ceilingFanOffCommand;

    @Before
    public void fillDevicesAndCommands() {
        remoteControl = new RemoteControl();

        conditioner = new Conditioner();
        roomLight = new RoomLight();
        tv = new TV();
        ceilingFan = new CeilingFan();

        conditionerOnCommand = new ConditionerOnCommand(conditioner);
        conditionerOffCommand = new ConditionerOffCommand(conditioner);
        roomLightOnCommand = new RoomLightOnCommand(roomLight);
        roomLightOffCommand = new RoomLightOffCommand(roomLight);
        tvOnCommand = new TVOnCommand(tv);
        tvOffCommand = new TVOffCommand(tv);
        ceilingFanHighCommand = new CeilingFanHighCommand(ceilingFan);
        ceilingFanMediumCommand = new CeilingFanMediumCommand(ceilingFan);
        ceilingFanLowCommand = new CeilingFanLowCommand(ceilingFan);
        ceilingFanOffCommand = new CeilingFanOffCommand(ceilingFan);
    }


    @Test
    public void remoteControlTest() {
        System.out.println(remoteControl);
        setDefaultCommands();
        System.out.println(remoteControl);

        remoteControl.pushOnButton(0);
        remoteControl.pushOnButton(2);
        remoteControl.pushOffButton(0);
        remoteControl.pushUndoButton();
    }

    @Test
    public void ceilingFanRemoteDeviceTest() {
        setCeilingFanCommands();
        System.out.println(remoteControl);
        remoteControl.pushOnButton(0);
        remoteControl.pushOffButton(0);
        remoteControl.pushUndoButton();
        remoteControl.pushOffButton(1);
        remoteControl.pushUndoButton();
    }



    private void setDefaultCommands() {
        remoteControl.setCommand(0, conditionerOnCommand, conditionerOffCommand);
        remoteControl.setCommand(1, roomLightOnCommand, roomLightOffCommand);
        remoteControl.setCommand(2, tvOnCommand, tvOffCommand);
    }

    private void setCeilingFanCommands() {
        remoteControl.setCommand(0, ceilingFanHighCommand, ceilingFanMediumCommand);
        remoteControl.setCommand(1, ceilingFanLowCommand, ceilingFanOffCommand);
    }

}