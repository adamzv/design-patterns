package kacicky;

import java.util.*;

public class Pastier extends Observable {

    public Pastier() {
    }

    @Override
    public void notifyObservers() {
        Random random = new Random();
        setChanged();
        notifyObservers(Integer.valueOf(random.nextInt(10)));
    }
}
