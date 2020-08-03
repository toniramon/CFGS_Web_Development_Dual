package org.formacion.factorymethod;

public class LavadoraCargaSuperiorFactoria extends FactoriaLavadora {

    @Override
    public Lavadora creaLavadoraTipo() {
        return new LavadoraCargaSuperior();
    }
}