package com.github.adamzv;

/**
 *
 * @author KI
 */
public class Simulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(KacicaPocitana.getN());

        OzyvajuciSa kacica = new KacicaPocitana(new KacicaGumena());
        kacica.ozviSa();

        OzyvajuciSa kacica2 = new KacicaPocitana(new KacicaDiva());
        kacica2.ozviSa();
        kacica2.ozviSa();

//        OzyvajuciSa hus = new KacicaAdapter(new Hus()));
//        hus.ozviSa();

        System.out.println(KacicaPocitana.getN());

        new ObycajnaKacicaFactory().createKacicaDiva().ozviSa();

        new PocitanaKacicaFactory().createKacicaGumena().ozviSa();
        new PocitanaKacicaFactory().createKacicaDiva().ozviSa();

        System.out.println(KacicaPocitana.getN());
    }
}
