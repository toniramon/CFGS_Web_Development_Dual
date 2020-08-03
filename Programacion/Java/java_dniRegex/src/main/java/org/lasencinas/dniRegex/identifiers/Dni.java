package org.lasencinas.dniRegex.identifiers;

import org.lasencinas.dniRegex.utilities.AssignmentTable;
import org.lasencinas.dniRegex.utilities.RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Dni {

    /***** Atributos *****/

    private String dni;
    private RegularExpression regexDictionary = RegularExpression.getMyRegularExpression();
    private AssignmentTable table = new AssignmentTable();

    /***** Constructor/es *****/

    public Dni() {
    }

    public Dni(String dni) {
        this.dni = dni;
    }


    /***** Setter & Getter *****/

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getDni(){
        return this.dni;
    }


    /***** Interfaz Pública *****/


    public boolean isDniSyntaxValid() {
        Matcher matcher = createMatcher(regexDictionary.getRegexValue("DNI"), getDni());

        if (matcher.find()) {
            System.out.println("El DNI: " + getDni() + " es válido.");
            return true;
        } else {
            System.out.println("El DNI: " + getDni() + " NO es válido.");
            return false;
        }
    }

    public boolean isDniLetterValid() {
        if (calculateLetter(getDni()).equals(obtainDniLetter(getDni()))){
            System.out.println("La letra " + obtainDniLetter(getDni()) +  " del DNI " + getDni()  + " es válida.");
            return true;
        } else {
            System.out.println("La letra " + obtainDniLetter(getDni()) +  " del DNI " + getDni()  + " NO es válida.");
            return false;
        }

    }

    public String calculateLetter(String DNI){
        String str = DNI;
        str = str.replaceAll("\\D+","");
        int dni = Integer.parseInt(str);
        int posicion = dni % table.getDniModule();
        return String.valueOf(table.getLetter(posicion));
    }

    public String obtainDniLetter(String DNI){
        String str = DNI;
        str = str.replaceAll("[0-9]","");
        return str;
    }


    /***** Interfaz Privada *****/

    /**
     * Create a matcher for the
     * regex received.
     *
     * createMatcher()
     * @param String regex, String dni
     * @return matcher
     */

    private Matcher createMatcher(String regex, String dni) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(dni);
        return matcher;
    }

}
