package kacicky;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Observable;
import java.util.Observer;

public class Krdel implements OzyvajuciSa, Observer {

    private ArrayList<OzyvajuciSa> krdel;

    public Krdel() {
        krdel = new ArrayList<>();
    }

    public void pridaj(OzyvajuciSa o) {
        krdel.add(o);
    }

    @Override
    public void ozviSa() {
        Iterator<OzyvajuciSa> it = krdel.iterator();
        while (it.hasNext()) {
            OzyvajuciSa o = it.next();
            o.ozviSa();
        }
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Pastier zakričal číslo " + arg);
        if (arg instanceof Integer) {
            int it = (Integer) arg;
            for (int i = 0; i < it; i++) {
                ozviSa();
            }
        }
        System.out.println();
    }
}
