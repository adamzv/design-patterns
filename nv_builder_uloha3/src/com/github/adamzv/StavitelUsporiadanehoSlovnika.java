package com.github.adamzv;

public class StavitelUsporiadanehoSlovnika implements StavitelSlovnika {

    private Slovnik data = new SlovnikUsporiadany();

    @Override
    public void vlozSlovo(String slovo) {
        data.vlozSlovo(slovo);
    }

    @Override
    public Slovnik dajSlovnik() {
        return data;
    }
}
