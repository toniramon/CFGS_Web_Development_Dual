package org.lasencinas.romansGoHome;

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
        SimbolosRomanos numero = SimbolosRomanos.C.X;
        assertThat(numero).isInstanceOf(SimbolosRomanos.class);
        assertThat(numero.ordinal()).isEqualTo(2);
        assertThat(numero.name()).isEqualToIgnoringWhitespace("X");
        assertThat(SimbolosRomanos.valueOf(numero.name())).isEqualTo(SimbolosRomanos.X);
        assertThat(numero.compareTo(numero.X)).isEqualTo(0);
        assertThat(numero.toString()).isEqualToIgnoringWhitespace("X");
        assertThat(numero.equals(numero.X)).isEqualTo(true);
        assertThat(SimbolosRomanos.values()[2]).isEqualTo(numero);
    }

    @Test
    public void NumerosRomanosX() {
        SimbolosRomanos numerosRomanos = SimbolosRomanos.C.X;
        assertThat(numerosRomanos.getNumero()).isEqualTo(10);
    }

    @Test
    public void NumerosRomanosCM() {
        SimbolosRomanos numerosRomanos = SimbolosRomanos.C.CM;
        assertThat(numerosRomanos.getNumero()).isEqualTo(900);
    }

    @Test
    public void NumerosRomanosUMMMUCCCU() {
        String romanNumber = "UMMMUCCCU";
        NumerosRomanos numeroRomano = new NumerosRomanos(romanNumber);
        assertThat(numeroRomano.translateRomanNumber()).isEqualTo(3300);
    }

    @Test
    public void NumerosRomanosMCCXXXIV() {
        String romanNumber = "MCCXXXIV";
        NumerosRomanos numeroRomano = new NumerosRomanos(romanNumber);
        assertThat(numeroRomano.translateRomanNumber()).isEqualTo(1234);
    }

    @Test
    public void NumerosRomanosMCCXCVIII() {
        String romanNumber = "MCCXCVIII";
        NumerosRomanos numeroRomano = new NumerosRomanos(romanNumber);
        assertThat(numeroRomano.translateRomanNumber()).isEqualTo(1298);
    }

    @Test
    public void NumerosRomanosCDXLIV() {
        String romanNumber = "CDXLIV";
        NumerosRomanos numeroRomano = new NumerosRomanos(romanNumber);
        assertThat(numeroRomano.translateRomanNumber()).isEqualTo(444);
    }

    @Test
    public void NumerosRomanosCDXXXIX() {
        String romanNumber = "CDXXXIX";
        NumerosRomanos numeroRomano = new NumerosRomanos(romanNumber);
        assertThat(numeroRomano.translateRomanNumber()).isEqualTo(439);
    }

    @Test
    public void NumerosRomanosMCDXCI() {
        String romanNumber = "MCDXCI";
        NumerosRomanos numeroRomano = new NumerosRomanos(romanNumber);
        assertThat(numeroRomano.translateRomanNumber()).isEqualTo(1491);
    }

    @Test
    public void NumerosRomanosMMMMCXLI() {
        String romanNumber = "MMMMCXLI";
        NumerosRomanos numeroRomano = new NumerosRomanos(romanNumber);
        assertThat(numeroRomano.translateRomanNumber()).isEqualTo(4141);
    }

    @Test
    public void NumerosRomanosCMXCIX() {
        String romanNumber = "CMXCIX";
        NumerosRomanos numeroRomano = new NumerosRomanos(romanNumber);
        assertThat(numeroRomano.translateRomanNumber()).isEqualTo(999);
    }

}
