package org.lasencinas.toniramon.fastbreaktruck.domain;

import org.lasencinas.toniramon.fastbreaktruck.interfaces.Packing;

public class Caja implements Packing {

    @Override
    public String envoltorio() {
        return "Caja";
    }
}
