package com.github.adamzv;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Osoba> zoznam = new ArrayList<>();
        zoznam.add(new Osoba("Alena", 44, 175.5));
        zoznam.add(new Osoba("Boris", 23, 184.1));
        zoznam.add(new Osoba("Karol", 31, 168.5));
        zoznam.add(new Osoba("Elena", 28, 178.4));

        Collections.sort(zoznam, Osoba.COMP_VEK);

        Iterator<Osoba> it = zoznam.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
