package com.github.adamzv;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Vydavatel {

    private StavitelSlovnika stavitel;

    public Vydavatel(StavitelSlovnika stavitel) {
        this.stavitel = stavitel;
    }

    public Slovnik analyzujSubor(String subor) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(subor));

            String riadok;
            while ((riadok = br.readLine()) != null) {
                stavitel.vlozSlovo(riadok);
            }

            br.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return stavitel.dajSlovnik();
    }
}
