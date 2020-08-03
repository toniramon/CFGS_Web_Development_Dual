package org.lasencinas.toniramon.fastbreaktruck.consumibles;

import org.lasencinas.toniramon.fastbreaktruck.domain.Cereales;

public class Smiggles extends Cereales {

    String nombre;
    Float pvp;

    public Smiggles(String nombre, Float pvp) {
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
