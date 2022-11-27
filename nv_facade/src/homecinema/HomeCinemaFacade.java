package homecinema;

// trieda implementujuca fasadu systemu domaceho kina
public class HomeCinemaFacade {
    // referencie na jednotlive komponenty (kompozicia)
    private Amplifier amp;
    private Tuner tuner;
    private DvdPlayer dvd;
    private CdPlayer cd;
    private Projector projector;
    private Lights lights;
    private Screen screen;
    private PopcornPopper popper;

    private static int watchedMovie = 0;
    private static int listenedCd = 0;
    private static int listenedRadio = 0;

    // konstruktor
    public HomeCinemaFacade(Amplifier amp,
                            Tuner tuner,
                            DvdPlayer dvd,
                            CdPlayer cd,
                            Projector projector,
                            Screen screen,
                            Lights lights,
                            PopcornPopper popper) {

        this.amp = amp;
        this.tuner = tuner;
        this.dvd = dvd;
        this.cd = cd;
        this.projector = projector;
        this.screen = screen;
        this.lights = lights;
        this.popper = popper;
    }

    // hotova metoda obsahujuca spravne kroky v spravnom poradi
    public void watchMovie(String movie) {
        System.out.println("Get ready to watch a movie...");
        // delegovanie prace na obalene objekty
        // (volanie metod z ich rozhrani)
        popper.on();
        popper.pop();
        lights.dim(10);
        screen.down();
        projector.on();
        projector.wideScreenMode();
        amp.on();
        amp.setDvd(dvd);
        amp.setSurroundSound();
        amp.setVolume(5);
        dvd.on();
        dvd.play(movie);
        watchedMovie++;
    }


    public void endMovie() {
        System.out.println("Shutting movie theater down...");
        popper.off();
        lights.on();
        screen.up();
        projector.off();
        amp.off();
        dvd.stop();
        dvd.eject();
        dvd.off();
    }

    public void listenToCd(String cdTitle) {
        System.out.println("Get ready for an audiopile experence...");
        lights.on();
        amp.on();
        amp.setVolume(5);
        amp.setCd(cd);
        amp.setStereoSound();
        cd.on();
        cd.play(cdTitle);
        listenedCd++;
    }

    public void endCd() {
        System.out.println("Shutting down CD...");
        amp.off();
        amp.setCd(cd);
        cd.eject();
        cd.off();
    }

    public void listenToRadio(double frequency) {
        System.out.println("Tuning in the airwaves...");
        tuner.on();
        tuner.setFrequency(frequency);
        amp.on();
        amp.setVolume(5);
        amp.setTuner(tuner);
        listenedRadio++;
    }

    public void endRadio() {
        System.out.println("Shutting down the tuner...");
        tuner.off();
        amp.off();
    }

    public void stats() {
        System.out.println("Watched movies: " + watchedMovie);
        System.out.println("Listened to CDs: " + listenedCd);
        System.out.println("Listened to radios: " + listenedRadio);
    }
}
