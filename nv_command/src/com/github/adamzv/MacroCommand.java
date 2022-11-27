package com.github.adamzv;

public class MacroCommand implements Command{

    Command[] cmds;

    public MacroCommand(Command[] cmds) {
        this.cmds = cmds;
    }

    @Override
    public void execute() {
        for (Command cmd : cmds) {
            cmd.execute();
        }
    }

    @Override
    public void undo() {
        for (Command cmd : cmds) {
            cmd.undo();
        }
    }
}
