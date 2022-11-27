package com.github.adamzv;

public class KacicaPocitana implements OzyvajuciSa {
    private OzyvajuciSa o;
    private static int N = 0;

    public KacicaPocitana(OzyvajuciSa o) {
        this.o = o;
    }

    @Override
    public void ozviSa() {
        o.ozviSa();
        N++;
    }

    public static int getN() {
        return N;
    }
}
