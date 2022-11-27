package com.github.adamzv;

public class Main {

    public static void main(String[] args) {
	    Clovek c1 = new Clovek("Adam");
	    c1.naucitSchopnost("citat");
	    c1.naucitSchopnost("programovat");

        Clovek c2 = null;
        try {
            c2 = (Clovek) c1.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        System.out.println(c1);
        System.out.println(c2);

        System.out.println();

        c2.naucitSchopnost("pocitat");

        System.out.println(c1);
        System.out.println(c2);

        System.out.println();

        c2.setMeno("Filip");
        c1.zabudnutSchopnost("programovat");

        System.out.println(c1);
        System.out.println(c2);
    }
}
