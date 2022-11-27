package com.github.adamzv;

public class GarazOtvorSa implements Command {

    private Garaz garaz;

    public GarazOtvorSa(Garaz garaz) {
        this.garaz = garaz;
    }

    @Override
    public void execute() {
        garaz.otvor();
    }

    @Override
    public void undo() {
        garaz.zatvor();
    }
}
