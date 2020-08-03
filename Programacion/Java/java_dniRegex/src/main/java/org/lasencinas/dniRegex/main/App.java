package org.lasencinas.dniRegex.main;

import org.lasencinas.dniRegex.identifiers.Dni;
import org.lasencinas.dniRegex.identifiers.Nie;
import org.lasencinas.dniRegex.utilities.RegularExpression;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        RegularExpression regex = RegularExpression.getMyRegularExpression();
        regex.addRegex("DNI", "\\b[0-9]{8}((?![IOUÑ]).){1}\\b");
        regex.addRegex("NIE", "\\b[XYZ]{1}[0-9]{7}((?![IOUÑ]).){1}\\b");

        // If DNI else if NIE: buscamos el tipo de documento y generamos regex.
        // Asignamos el tipo a la variable documentType.
        // Una vez lo encontramos comprobamos que es valido (letra)
        // Finalmente decimos que es válido, en caso contrario decimos que no lo es.
        // ELSE PROBAMOS OTRO TIPO DE DOCUMENTO.

        RegularExpression dniRegex = RegularExpression.getMyRegularExpression();

        // Dni valido con letra no valida.
        Dni dni = new Dni("78204754Q");
        dni.isDniSyntaxValid();
        dni.isDniLetterValid();

        System.out.println("\n *********** \n");

        dni.setDni("40135330P");
        dni.isDniSyntaxValid();
        dni.isDniLetterValid();

        System.out.println("\n *********** \n");

        Nie nie = new Nie("X5439537G");
        nie.isNieSyntaxValid();
        nie.isNieLetterValid();

        System.out.println("\n *********** \n");

        nie.setNie("X1234567S");
        nie.isNieSyntaxValid();
        nie.isNieLetterValid();

    }


}
