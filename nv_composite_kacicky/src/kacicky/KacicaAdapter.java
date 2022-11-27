package kacicky;

public class KacicaAdapter implements  OzyvajuciSa {
    private Hus hus;

    public KacicaAdapter(Hus hus) {
        this.hus = hus;
    }
    @Override
    public void ozviSa() {
        hus.zagagaj();
    }
}
