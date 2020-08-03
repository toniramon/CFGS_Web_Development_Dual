package org.lasencinas.romansGoHome;

/**
 * The romansGoHome programm converts
 * roman numbers to decimal numbers.
 *
 * @author  Toni Ramon
 * @version 1.0
 * @since   02/04/2019
 */

public class Main
{
    public static void main( String[] args ) {

        // Numero Romano a convertir.
        String romanNumber = "DCXLIX";

        // Declaramos numeroRomano como nuevo objeto.
        NumerosRomanos numeroRomano = new NumerosRomanos(romanNumber);

        // Llamamos translateRomanNumber para que traduzca a número Decimal
        numeroRomano.translateRomanNumber();

        // Obtenemos el resultado por pantalla
        System.out.println( "El número romano " + numeroRomano.getRomanNumber() + " equivale a " + numeroRomano.getDecimalNumber() + " decimal." );

    }
}
