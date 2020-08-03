package org.lasencinas.toniramon.fastbreaktruck.consumibles;

import org.lasencinas.toniramon.fastbreaktruck.domain.Bebida;

public class TurbulentJuice extends Bebida {

    String nombre;
    Float pvp;

    public TurbulentJuice(String nombre, Float pvp) {
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
