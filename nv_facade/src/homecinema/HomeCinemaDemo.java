package homecinema;

// klient (testovacia trieda)


import javax.swing.*;

public class HomeCinemaDemo {
    public static void main(String[] args) {
        // priprava objektov tvoriacich domace kino
        Amplifier amp = new Amplifier("Philips Amplifier");
        Tuner tuner = new Tuner("Philips  AM/FM Tuner", amp);
        DvdPlayer dvd = new DvdPlayer("Philips  DVD Player", amp);
        CdPlayer cd = new CdPlayer("Sony CD Player", amp);
        Projector projector = new Projector("LG Projector", dvd);
        Lights lights = new Lights("Ceiling Lights");
        Screen screen = new Screen("Projection Screen");
        PopcornPopper popper = new PopcornPopper("Popcorn Popper");

        // pomocou objektu pripravenej fasadovej triedy...
        HomeCinemaFacade homeCinema =
                new HomeCinemaFacade(amp, tuner, dvd, cd,
                        projector, screen, lights, popper);
        // ...dosiahneme ciel velmi lahko,
        // rovno zavolame metody z fasady:
        homeCinema.watchMovie("Forrest Gump");

        System.out.println("========================");

        homeCinema.endMovie();

        System.out.println("========================");

        homeCinema.listenToCd("Alive 2007");
        homeCinema.endCd();

        System.out.println("========================");

        homeCinema.watchMovie("Life of Brian");
        homeCinema.endMovie();

        System.out.println("========================");

        homeCinema.stats();
    }
}
