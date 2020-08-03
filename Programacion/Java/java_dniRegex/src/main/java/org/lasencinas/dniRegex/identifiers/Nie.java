package org.lasencinas.dniRegex.identifiers;

import org.lasencinas.dniRegex.utilities.AssignmentTable;
import org.lasencinas.dniRegex.utilities.RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Nie {

    /***** Atributos *****/

    private String nie;
    private RegularExpression regexDictionary = RegularExpression.getMyRegularExpression();
    private AssignmentTable table = new AssignmentTable();

    /***** Constructor/es *****/

    public Nie() {
    }

    public Nie(String nie) {
        this.nie = nie;
    }


    /***** Setter & Getter *****/

    public void setNie(String nie) {
        this.nie = nie;
    }

    public String getNie(){
        return this.nie;
    }


    /***** Interfaz Pública *****/

    public boolean isNieSyntaxValid() {
        Matcher matcher = createMatcher(regexDictionary.getRegexValue("NIE"), getNie());

        if (matcher.find()) {
            System.out.println("El NIE: " + getNie() + " es válido.");
            return true;
        } else {
            System.out.println("El NIE: " + getNie() + " NO es válido.");
            return false;
        }
    }

    public boolean isNieLetterValid() {
        if (calculateLetter(getNie()).equals(obtainNieLastLetter(getNie()))){
            System.out.println("La letra " + obtainNieLastLetter(getNie()) +  " del NIE " + getNie()  + " es válida.");
            return true;
        } else {
            System.out.println("La letra " + obtainNieLastLetter(getNie()) +  " del NIE " + getNie()  + " NO es válida.");
            return false;
        }

    }

    public String calculateLetter(String NIE){

        String firstNumber = obtainNieFirstLetterValue(getNie());

        String str = NIE;
        str = str.replaceAll("[A-Z]{1}","");

        String nieNumber = firstNumber+str;
        System.out.println("String number: " + nieNumber);

        int nieFinalNumber = Integer.parseInt(nieNumber);


        int posicion = nieFinalNumber % table.getNieModule();
        return String.valueOf(table.getLetter(posicion));
    }



    public String obtainNieFirstLetterValue(String nie){
        String text = "XYZ";
        String word = String.valueOf(nie.charAt(0));
        return String.valueOf(table.getNieFirstLetterValue(text.indexOf(word)));
    }


    public String obtainNieLastLetter(String DNI){
        String str = DNI;
        str = str.replaceAll("[XYZ]{1}[0-9]{7}","");
        return str;
    }


    /***** Interfaz Privada *****/

    /**
     * Create a matcher for the
     * regex received.
     *
     * createMatcher()
     * @param String regex, String nie
     * @return matcher
     */

    private Matcher createMatcher(String regex, String nie) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(nie);
        return matcher;
    }

}
