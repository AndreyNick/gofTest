package com.patterns.gof.command.rc.commands;

public interface Command {
    public void execute();
    public void undo();
}
