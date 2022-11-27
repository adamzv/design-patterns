package com.github.adamzv;

import java.util.Arrays;

/**
 *
 * @author KI
 */
public class Ovladac {

    private Command[] onBtns;
    private Command[] offBtns;
    private Command undoBtn;

    public Ovladac(int n) {
        Command nc = new NoCommand();
        onBtns = new Command[n];
        offBtns = new Command[n];

        Arrays.fill(onBtns, nc);
        Arrays.fill(offBtns, nc);
        undoBtn = nc;
    }

    public void setCommand(int pos, Command onCmd, Command offCmd) {
        onBtns[pos] = onCmd;
        offBtns[pos] = offCmd;
    }

    public void onBtnPressed(int pos) {
        undoBtn = onBtns[pos];
        onBtns[pos].execute();
    }

    public void offBtnPressed(int pos) {
        undoBtn = offBtns[pos];
        offBtns[pos].execute();
    }

    public void undoBtnPressed() {
        undoBtn.undo();
    }
}
