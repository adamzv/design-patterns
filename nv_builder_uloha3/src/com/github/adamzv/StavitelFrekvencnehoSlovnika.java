package com.github.adamzv;

/**
 *
 * @author KI
 */
public class StavitelFrekvencnehoSlovnika implements StavitelSlovnika {

    private Slovnik data = new SlovnikSPoctamiVyskytov();

    @Override
    public void vlozSlovo(String slovo) {
        data.vlozSlovo(slovo);
    }

    @Override
    public Slovnik dajSlovnik() {
        return data;
    }

}
