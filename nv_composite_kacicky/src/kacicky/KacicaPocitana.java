package kacicky;

// dekorator
public class KacicaPocitana implements  OzyvajuciSa {
    private OzyvajuciSa o;
    private static int n = 0;

    public KacicaPocitana(OzyvajuciSa o) {
        this.o = o;
    }

    @Override
    public void ozviSa() {
        o.ozviSa();
        n++;
    }

    public static int getN() {
        return n;
    }
}
