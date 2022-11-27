package com.github.adamzv;

/**
 * @author KI
 */
public class CDplayer {

    // doplnte si svojich oblubenych interpretov :)
    private static final String[] cds = {"?", "?", "?", "?", "?", "?"};
    private int cd;

    public CDplayer() {
        cd = 0;
    }

    public void play() {
        System.out.println("hra cd " + cds[cd]);
    }

    public void stop() {
        System.out.println("nehra ziadne cd");
    }

    public void random() {
        cd = (int) (Math.random() * cds.length);
    }

    public void setCD(int ktore) {
        if (ktore > 0 && ktore < cds.length) {
            cd = ktore;
        }
    }

    public int getCD() {
        return cd;
    }
}