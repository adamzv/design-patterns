package com.github.adamzv;

public class Penazenka implements Cloneable {

    private Bankovka[] b;
    private int pocetBankoviek = 0;

    public Penazenka(int kapacita) {
        b = new Bankovka[kapacita];
    }

    public void pridajBankovku(int hodnota, String mena) {
        if (pocetBankoviek < b.length) {
            b[pocetBankoviek++] = new Bankovka(hodnota, mena);
        }
    }

    public int getSuma(String mena) {
        int suma = 0;
        for (int i = 0; i < pocetBankoviek; i++) {
            if (b[i].getMena().equals(mena)) {
                suma += b[i].getHodnota();
            }
        }
        return suma;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < pocetBankoviek; i++) {
            sb.append(b[i]).append("\n");
        }
        return "Penazenka:\n" + sb;
    }


    public void poskodNahodnu() {
        int nahoda = (int) (Math.random() * pocetBankoviek);
        b[nahoda].poskod();
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Penazenka klon = (Penazenka) super.clone();

        // musime zabezpecit vytvorenie hlbokej kopie
        // (klon nesmie zdielat pole bankoviek s originalom)
        klon.b = new Bankovka[b.length];
        for (int i=0; i < pocetBankoviek; i++) {
            klon.b[i]=(Bankovka)b[i].clone();
        }

        return klon;
    }

}


//public class Penazenka implements Cloneable {
//    
//    private Bankovka[] b;
//    private int pocetBankoviek;
//    
//    public Penazenka(int kapacita) {
//        b = new Bankovka[kapacita];      
//    }
//    
//    public void pridajBankovku(int hodnota, String mena) {
//        if (pocetBankoviek < b.length) {
//            b[pocetBankoviek++] = new Bankovka(hodnota, mena);
//        }
//    }
//    
//    public int getSuma(String mena) {
//        int suma = 0;
//        for (int i = 0; i < pocetBankoviek; i++) {
//           if (b[i].getMena().equals(mena)){
//               suma += b[i].getHodnota();
//           }
//        }
//        return suma;
//    }
//   
//
//    @Override
//    public String toString() {
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < pocetBankoviek; i++) {
//            sb.append(b[i]).append("\n");
//        }
// 
//        return "Penazenka:\n"+ sb;
//    }
//
//    @Override
//    public Object clone() throws CloneNotSupportedException {
//        Penazenka klon = (Penazenka) super.clone();
//            
////        // musime zabezpecit vytvorenie hlbokej kopie
////        // (klon nesmie zdielat pole bankoviek s originalom)
////        klon.b = new Bankovka[b.length];
////        for (int i=0; i < pocetBankoviek; i++) {
////            klon.b[i]=(Bankovka)b[i].clone();
////        }
//        
//   
//        return klon;
//    }
//    
//    public void poskodNahodnu() {
//        int nahoda = (int)(Math.random()*pocetBankoviek);
//        b[nahoda].poskod();
//    }
//    
//    
//    
//}