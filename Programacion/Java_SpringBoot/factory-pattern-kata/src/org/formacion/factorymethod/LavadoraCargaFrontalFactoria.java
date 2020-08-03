package org.formacion.factorymethod;

public class LavadoraCargaFrontalFactoria extends FactoriaLavadora {

    /**
     * overriding method: public o protected
     * ya que overridden method es protected
     * (siempre igualando o relajando el modificador de acceso)
     */
    @Override
    public Lavadora creaLavadoraTipo() {
        return new LavadoraCargaFrontal();
    }

}