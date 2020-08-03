package org.lasencinas.toniramon;

import org.junit.Test;
import org.lasencinas.toniramon.fastbreaktruck.behaviour.FastBreakTruck;
import org.lasencinas.toniramon.fastbreaktruck.consumibles.Eyeholes;
import org.lasencinas.toniramon.fastbreaktruck.consumibles.TurbulentJuice;
import org.lasencinas.toniramon.fastbreaktruck.domain.Desayuno;

import static org.junit.Assert.*;
import static org.junit.Assert.assertFalse;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Crea una clase TratamientoPedidoInternacional que permita tratar
     * pedidos internacionales.
     *
     * La clase permite tratar todos los pedidos excepto
     * los que van a Mordor.
     *
     * Crea las clases necesarias que se requieren en los casos test
     * respetando los constructores que se exigen.
     */
    @Test
    public void test_BreakFastTruck() {
        FastBreakTruck breakfast = new FastBreakTruck();
        assertNotNull(breakfast);
    }

    @Test
    public void calcularPrecio() {
        Eyeholes consumible1 = new Eyeholes("Eyeholes", (float) 25.0);
        TurbulentJuice consumible2 = new TurbulentJuice("Turbulent juuuuuuice", (float) 30.0);

        Desayuno merienda = new Desayuno();

        merienda.setItem(consumible1);
        merienda.setItem(consumible2);

        assertEquals( 55, merienda.getCoste(), 0);

    }
}
