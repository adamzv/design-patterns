package com.github.adamzv;

public class GarazZatvorSa implements Command {

    private Garaz garaz;

    public GarazZatvorSa(Garaz garaz) {
        this.garaz = garaz;
    }

    @Override
    public void execute() {
        garaz.zatvor();
    }

    @Override
    public void undo() {
        garaz.otvor();
    }
}
