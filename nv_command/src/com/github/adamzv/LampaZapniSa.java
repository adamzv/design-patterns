package com.github.adamzv;

/**
 *
 * @author KI
 */
public class LampaZapniSa implements Command {

    private Lampa lampa;

    public LampaZapniSa(Lampa lampa) {
        this.lampa = lampa;
    }

    public void execute() {
        lampa.zapni();
    }

    @Override
    public void undo() {
        lampa.vypni();
    }


}
