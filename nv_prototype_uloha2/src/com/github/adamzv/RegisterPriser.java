package com.github.adamzv;

import java.util.HashMap;
import java.util.Map;

public class RegisterPriser {

    private Map<String, Prisera> register = new HashMap<String, Prisera>();

    public Prisera dajPriseru(String typ) {
        Prisera vzor = register.get(typ);

        Prisera klon = null;
        try {
            klon = (Prisera) vzor.clone();
        } catch (CloneNotSupportedException ex) {
        }
        return klon;
    }

    public void pridajVzorPrisery(String typ, Prisera p) {
        register.put(typ, p);
    }
}
