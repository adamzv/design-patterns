package com.github.adamzv;

import java.io.*;

public abstract class Prisera implements Cloneable {

    private String vzhlad;

    public Prisera(String menoSuboru) {
        try {
            FileReader fr = new FileReader(menoSuboru);
            BufferedReader br = new BufferedReader(fr);
            String riadok;
            StringBuilder pom = new StringBuilder();
            while ((riadok = br.readLine()) != null) {
                pom.append(riadok);
                pom.append("\n");
            }
            vzhlad = pom.toString();
            br.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public String ukazSa() {
        return vzhlad;
    }

    public abstract String urobBububu();

    @Override
    public Object clone() throws CloneNotSupportedException {   

        return super.clone();
    }
    
    
}
