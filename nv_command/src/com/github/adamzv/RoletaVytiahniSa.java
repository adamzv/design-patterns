package com.github.adamzv;

public class RoletaVytiahniSa implements Command {

    private Roleta roleta;

    public RoletaVytiahniSa(Roleta roleta) {
        this.roleta = roleta;
    }

    @Override
    public void execute() {
        roleta.vytiahni();
    }

    @Override
    public void undo() {
        roleta.spusti();
    }
}
