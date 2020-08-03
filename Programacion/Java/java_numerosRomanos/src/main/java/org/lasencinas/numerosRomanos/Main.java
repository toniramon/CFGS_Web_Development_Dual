package org.lasencinas.numerosRomanos;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Hello world!
 *
 */
public class Main
{
    public static void main( String[] args )
    {
        String grupoSumatorio = "[MCXI]{3}|(?<!C)[DM]|(?<!X)[LC](?!D)|(?<!I)[VX](?![LC])|I(?![VX])";
        String grupoSustractivo = "(C[DM])|(X[LC])|(I[VX])";
        String numeroRomano = "MDCCCLXXXVIII";

        //findPattern(grupoSumatorio, numeroRomano);
        traducirNumeroRomano("M");

    }

    public static void findPattern(String regex, String source) {

        // Compile regex into a Pattern object.
        Pattern p = Pattern.compile(regex);

        // Get a Matcher object.
        Matcher m = p.matcher(source);

        // Perform Find
        while(m.find()) {
            System.out.println("Encontramos coincidencia: " + m.group());
            if (m.group().length() == 1) {
                traducirNumeroRomano(m.group());
            }
        }

    }

    public static void traducirNumeroRomano(String letra) {
        NumerosRomanos nr = NumerosRomanos.valueOf(letra);
        System.out.println("Letra: " + letra);
        System.out.println(nr.getNumero());
    }


}
