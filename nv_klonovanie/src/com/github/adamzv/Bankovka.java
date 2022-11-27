package com.github.adamzv;

public class Bankovka implements Cloneable {

    private boolean stav;
    private int hodnota;
    private String mena;

    public Bankovka(int hodnota, String mena) {
        this.stav = true;
        this.hodnota = hodnota;
        this.mena = mena;
    }

    public String getMena() {
        return mena;
    }

    public int getHodnota() {
        return hodnota;
    }

    @Override
    public String toString() {
        return hodnota + " " + mena + ", " + stav;
    }

    public void poskod() {
        stav = false;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
