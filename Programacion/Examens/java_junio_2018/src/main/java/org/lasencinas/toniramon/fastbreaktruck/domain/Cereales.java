package org.lasencinas.toniramon.fastbreaktruck.domain;

import org.lasencinas.toniramon.fastbreaktruck.interfaces.Item;
import org.lasencinas.toniramon.fastbreaktruck.interfaces.Packing;

public abstract class Cereales implements Item {

    Caja packing = new Caja();

    /*public String empaquetado() {
        return packing.envoltorio();
    }*/

    public Packing empaquetado() {
        return null;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
