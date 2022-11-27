package kacicky;

public class Simulator {

    public static void main(String[] args) {
        AbstractKacicaFactory factory = new PocitanaKacicaFactory();
        //AbstractKacicaFactory factory = new ObycajnaKacicaFactory();

        Simulator simulator = new Simulator();
        simulator.simuluj(factory);
    }

    private void simuluj(AbstractKacicaFactory factory) {
        Pastier pastier = new Pastier();
        Krdel krdel = new Krdel();
        krdel.pridaj(factory.createKacicaDiva());
        krdel.pridaj(factory.createKacicaDiva());
        krdel.pridaj(factory.createKacicaGumena());
        krdel.pridaj(factory.createKacicaDiva());
        krdel.pridaj(factory.createKacicaDiva());

        pastier.addObserver(krdel);
        pastier.notifyObservers();

        Krdel domace = new Krdel();
        krdel.pridaj(factory.createKacicaDomaca());
        krdel.pridaj(factory.createKacicaDomaca());
        krdel.pridaj(factory.createKacicaDomaca());

        krdel.pridaj(domace);

        krdel.ozviSa();

        // stav pocitadla
        System.out.println(KacicaPocitana.getN());
    }
}
