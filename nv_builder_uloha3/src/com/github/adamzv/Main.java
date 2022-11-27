package com.github.adamzv;

public class Main {

    public static void main(String[] args) {
        StavitelSlovnika stavitelSlovnika = new StavitelFrekvencnehoSlovnika();
        Vydavatel vydavatel = new Vydavatel(stavitelSlovnika);
        Slovnik slovnik = vydavatel.analyzujSubor("vstup.txt");
        System.out.println(slovnik.vratVsetkySlova());
        System.out.println(slovnik.vratPocetSlov());


        StavitelSlovnika stavitelSlovnika1 = new StavitelUsporiadanehoSlovnika();
        Vydavatel vydavatel1 = new Vydavatel(stavitelSlovnika1);
        Slovnik slovnik1 = vydavatel1.analyzujSubor("vstup.txt");
        System.out.println(slovnik1.vratVsetkySlova());
    }
}
