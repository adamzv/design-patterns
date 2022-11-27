package kacicky;

// potomok abstraktnej tovarne
// instancie, ktore ma vratit, su nedekorovane
public class ObycajnaKacicaFactory  extends AbstractKacicaFactory {
    @Override
    public OzyvajuciSa createKacicaDiva() {
        return new KacicaDiva();
    }

    @Override
    public OzyvajuciSa createKacicaDomaca() {
        return new KacicaDomaca();
    }

    @Override
    public OzyvajuciSa createKacicaGumena() {
        return new KacicaGumena();
    }
}
