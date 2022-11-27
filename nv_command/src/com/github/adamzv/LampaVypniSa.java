package com.github.adamzv;

/**
 *
 * @author KI
 */
public class LampaVypniSa  implements Command   {
    private Lampa lampa;

    public LampaVypniSa(Lampa lampa) {
        this.lampa = lampa;
    }

    @Override
    public void execute() {
       lampa.vypni();
    }

    @Override
    public void undo() {
        lampa.zapni();
    }
}
