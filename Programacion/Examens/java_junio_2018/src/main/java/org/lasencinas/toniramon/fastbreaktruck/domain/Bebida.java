package org.lasencinas.toniramon.fastbreaktruck.domain;


import org.lasencinas.toniramon.fastbreaktruck.interfaces.Item;
import org.lasencinas.toniramon.fastbreaktruck.interfaces.Packing;

public abstract class Bebida implements Item {

    public Packing empaquetado() {
        return null;
    }
}
