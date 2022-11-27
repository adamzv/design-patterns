package com.github.adamzv;

import java.util.ArrayList;
import java.util.List;

public class Clovek implements Cloneable{

    private String meno;
    private List<String> schopnosti;

    public Clovek(String meno) {
        this.meno = meno;
        if (schopnosti == null) {
            schopnosti = new ArrayList<>();
        }
    }

    public void naucitSchopnost(String schopnost) {
        if (!schopnosti.contains(schopnost)) {
            schopnosti.add(schopnost);
        }
    }

    public void zabudnutSchopnost(String schopnost) {
        if (schopnosti.contains(schopnost)) {
            schopnosti.remove(schopnost);
        }
    }

    public String getMeno() {
        return meno;
    }

    public void setMeno(String meno) {
        this.meno = meno;
    }

    public List<String> getSchopnosti() {
        return schopnosti;
    }

    public void setSchopnosti(List<String> schopnosti) {
        this.schopnosti = schopnosti;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Clovek klon = (Clovek) super.clone();

        klon.schopnosti = new ArrayList<>(schopnosti);
        return klon;
    }

    @Override
    public String toString() {
        return "Clovek{" +
                "meno='" + meno + '\'' +
                ", schopnosti=" + schopnosti +
                '}';
    }
}
