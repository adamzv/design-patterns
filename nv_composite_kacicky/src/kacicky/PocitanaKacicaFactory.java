package kacicky;


// potomok abstraktnej tovarne
// instancie, ktore ma vratit, su dekorovane
public class PocitanaKacicaFactory extends AbstractKacicaFactory {
    @Override
    public OzyvajuciSa createKacicaDiva() {
        return new KacicaPocitana(new KacicaDiva());
    }

    @Override
    public OzyvajuciSa createKacicaDomaca() {
        return new KacicaPocitana(new KacicaDomaca());
    }

    @Override
    public OzyvajuciSa createKacicaGumena() {
        return new KacicaPocitana(new KacicaGumena());
    }
}
