package com.github.adamzv;

import java.util.ArrayList;
import java.util.List;

public class ManazerSkriniek {
    private static ManazerSkriniek instance = null;
    private static int pocet = 0;
    private static List<Integer> volne = null;
    private static List<Integer> obsadene = null;

    private ManazerSkriniek(int n) {
        volne = naplnPole(n);
        obsadene = new ArrayList<>();
        pocet = n;
    }

    public static ManazerSkriniek getInstance() {
        if (instance == null) {
            instance = new ManazerSkriniek(50);
        }
        return instance;
    }

    public static ManazerSkriniek getInstance(int n) {
        if (instance == null) {
            instance = new ManazerSkriniek(n);
        }
        return instance;
    }

    private List<Integer> naplnPole(int n) {
        List<Integer> l = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            l.add(i);
        }
        return l;
    }

    public int getPocetSkriniek() {
        return pocet;
    }

    public int getPocetVolnych() {
        return volne.size();
    }

    public int getPrvaVolna() {
        return volne.get(0);
    }

    public void obsad(int n) {
        if (volne.contains(n)) {
            volne.remove(volne.indexOf(n));
            obsadene.add(n);
        }
    }

    public void uvolni(int n) {
        if (obsadene.contains(n)) {
            obsadene.remove(obsadene.indexOf(n));
            volne.add(n);
        }
    }
}
