package com.github.adamzv;

public class Main {

    public static void main(String[] args) {
//        Bankovka b1 = new Bankovka(50, "Eur");
//        Bankovka b2 = null;
//
//        try {
//            b2 = (Bankovka) b1.clone();
//        } catch (CloneNotSupportedException ex) {
//            ex.printStackTrace();
//        }
//        System.out.println(b1);
//        System.out.println(b2);

        Penazenka p = new Penazenka(10);
        p.pridajBankovku(10, "Eur");
        p.pridajBankovku(20, "Eur");
        p.pridajBankovku(50, "Eur");
        p.pridajBankovku(5, "USD");

        Penazenka p2 = null;
        try {
            p2 = (Penazenka) p.clone();
        } catch (CloneNotSupportedException ex) {
            ex.printStackTrace();
        }
        System.out.println(p);
        System.out.println(p2);

        p.poskodNahodnu();
        p2.pridajBankovku(100, "EUR");

        System.out.println(p);
        System.out.println(p2);
    }
}
