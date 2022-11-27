package com.github.adamzv;

import java.util.Comparator;

public class Osoba {

    public static final Comparator<Osoba> COMP_MENO = new Comparator<Osoba>() {
        @Override
        public int compare(Osoba o1, Osoba o2) {
            return o1.meno.compareTo(o2.meno);
        }
    };

    public static final Comparator<Osoba> COMP_VEK = new Comparator<Osoba>() {
        @Override
        public int compare(Osoba o1, Osoba o2) {
            return o1.vek - o2.vek;
        }
    };

    private String meno;
    private int vek;
    private double vyska;

    public Osoba(String meno, int vek, double vyska) {
        this.meno = meno;
        this.vek = vek;
        this.vyska = vyska;
    }

    @Override
    public String toString() {
        return "Osoba{" +
                "meno='" + meno + '\'' +
                ", vek=" + vek +
                ", vyska=" + vyska +
                '}';
    }
}
