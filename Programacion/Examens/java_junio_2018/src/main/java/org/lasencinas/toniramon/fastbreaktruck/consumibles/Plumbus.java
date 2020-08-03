package org.lasencinas.toniramon.fastbreaktruck.consumibles;

import org.lasencinas.toniramon.fastbreaktruck.domain.Cereales;
import org.lasencinas.toniramon.fastbreaktruck.domain.Juguetes;

public class Plumbus extends Juguetes {

    String nombre;
    Float pvp;

    public Plumbus(String nombre, Float pvp) {
        this.nombre = nombre;
        this.pvp = pvp;
    }

    @Override
    public String nombre() {
        return this.nombre;
    }

    @Override
    public Float pvp() {
        return this.pvp;
    }

    @Override
    public String toString() {
        return this.nombre;
    }
}
