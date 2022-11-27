package com.github.adamzv;

import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class SlovnikUsporiadany implements Slovnik {

    private Set<String> slovnik;

    public SlovnikUsporiadany() {
        this.slovnik = new TreeSet<>();
    }

    @Override
    public void vlozSlovo(String slovo) {
        slovnik.add(slovo);
    }

    @Override
    public boolean obsahujeSlovo(String slovo) {
        return slovnik.contains(slovo);
    }

    @Override
    public String vratVsetkySlova() {
        return slovnik.toString();
    }

    @Override
    public int vratPocetSlov() {
        return slovnik.size();
    }
}
