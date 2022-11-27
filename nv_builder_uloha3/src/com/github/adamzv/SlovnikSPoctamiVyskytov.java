package com.github.adamzv;

import java.util.*;

/**
 *
 * @author KI
 */
public class SlovnikSPoctamiVyskytov implements Slovnik {

    private Map<String, Integer> slovnik;

    public SlovnikSPoctamiVyskytov() {
        slovnik = new HashMap<>();
    }

    @Override
    public void vlozSlovo(String slovo) {

        if (slovnik.containsKey(slovo)) {
            int pocetVyskytov = slovnik.get(slovo);
            slovnik.put(slovo, ++pocetVyskytov);
        } else {
            slovnik.put(slovo, 1);
        }
    }

    @Override
    public boolean obsahujeSlovo(String slovo) {
        return slovnik.containsKey(slovo);
    }

    @Override
    public String vratVsetkySlova() {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, Integer> e : slovnik.entrySet()) {
            sb.append(e.getKey()+ " -> " + e.getValue()+" krat\n");
        }

        return sb.toString();
    }

    @Override
    public int vratPocetSlov() {
        return slovnik.size();
    }
}
