package org.lasencinas.numerosRomanos;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple Main.
 */
public class MainTest
{

    @Test
    public void NumerosRomanosConstructorTest() {
        // voy a asegurarme de que los metodos de los Enum Types
        // se comportan como yo espero
        NumerosRomanos numero = NumerosRomanos.X;
        assertThat(numero).isInstanceOf(NumerosRomanos.class);
        assertThat(numero.ordinal()).isEqualTo(2);
        assertThat(numero.name()).isEqualToIgnoringWhitespace("X");
        assertThat(NumerosRomanos.valueOf(numero.name())).isEqualTo(NumerosRomanos.X);
        assertThat(numero.compareTo(numero.X)).isEqualTo(0);
        assertThat(numero.toString()).isEqualToIgnoringWhitespace("X");
        assertThat(numero.equals(numero.X)).isEqualTo(true);
        assertThat(NumerosRomanos.values()[2]).isEqualTo(numero);
    }

    @Test
    public void NumerosRomanosX() {
        NumerosRomanos numerosRomanos = NumerosRomanos.X;
        assertThat(numerosRomanos.getNumero()).isEqualTo(10);
    }

    @Test
    public void NumerosRomanosCM() {
        NumerosRomanos numerosRomanos = NumerosRomanos.CM;
        assertThat(numerosRomanos.getNumero()).isEqualTo(900);
    }

}
