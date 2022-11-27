package com.github.adamzv;

import java.util.Random;

public class Gula {
    private static Gula instance = null;

    private Gula() {
    }

    public static Gula getInstance() {
        if (instance == null) {
            Random random = new Random();
            int n = random.nextInt(3);
            switch (n) {
                case 0:
                    instance = new GulaOptimistika();
                    break;
                case 1:
                    instance = new GulaPesimistka();
                    break;
                case 2:
                    instance = new GulaTiperka();
                    break;
            }
        }
        return instance;
    }

    // tuto metodu v potomkoch prekryjeme
    public String getOdpoved() {
        return "to nikto nevie";
    }

    private static class GulaOptimistika extends Gula {
        @Override
        public String getOdpoved() {
            return "Veštecká guľa hovorí, že dnes sa ti všetko podarí!";
        }
    }

    private static class GulaPesimistka extends Gula {
        @Override
        public String getOdpoved() {
            return "Veštecká guľa hovorí, že sa ti dnes nebude dariť!";
        }
    }

    private static class GulaTiperka extends Gula {
        @Override
        public String getOdpoved() {
            return (new Random().nextInt(2) == 1) ?
                    "Tipérska veštecká guľa hovorí, že dnes sa ti všetko podarí!" :
                    "Tipérska veštecká guľa hovorí, že sa ti dnes nebude dariť!";
        }
    }
}