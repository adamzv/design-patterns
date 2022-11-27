package com.github.adamzv;

/**
 *
 * @author KI
 */
public interface Slovnik {
    void vlozSlovo(String slovo);
    boolean obsahujeSlovo(String slovo);
    String vratVsetkySlova();
    int vratPocetSlov();
}
