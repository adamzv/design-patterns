package com.github.adamzv;

public class RoletaSpustiSa  implements Command {

    private Roleta roleta;

    public RoletaSpustiSa(Roleta roleta) {
        this.roleta = roleta;
    }

    @Override
    public void execute() {
        roleta.spusti();
    }

    @Override
    public void undo() {
        roleta.vytiahni();
    }
}
