package org.lasencinas.romansGoHome;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumerosRomanos {

    /***** Atributos *****/

    private String romanNumber;
    private int decimalNumber = 0;
    private String[] regex = {"(?<!C)[DM]|(?<!X)[LC](?![DM])|(?<!I)[VX](?![LC])|I(?![VX])",
            "(C[DM])|(X[LC])|(I[VX])"};


    /***** Constructor/es *****/

    public NumerosRomanos(String romanNumber) {
        setRomanNumber(romanNumber);
    }


    /***** Setter & Getter *****/

    public String getRomanNumber() {
        return romanNumber;
    }

    public int getDecimalNumber() {
        return decimalNumber;
    }

    public void setRomanNumber(String romanNumber) {
        this.romanNumber = romanNumber;
    }


    /***** Interfaz Pública *****/

    /**
     * We want to translate a number so,
     * for each regex we need to check
     * the results and add it to the
     * real decimal number. Finally
     * we return it.
     *
     * translateRomanNumber()
     * @return The decimal number.
     */

    public int translateRomanNumber() {

        for(String regularExpression : regex) {
            Matcher matcher = createMatcher(regularExpression, getRomanNumber());
            addTotalDecimal(matcher);
        }
        return getDecimalNumber();
    }


    /***** Interfaz Privada *****/

    /**
     * Create a matcher for the
     * regex and number received.
     *
     * createMatcher()
     * @param String regex, String number
     * @return matcher
     */

    private Matcher createMatcher(String regex, String number) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(number);
        return matcher;
    }


    /**
     * Adding the Decimal value of
     * the result to the total to
     * get the total Decimal number.
     *
     * addToDecimal()
     * @param matcher
     */

    private void addTotalDecimal(Matcher matcher) {
        while (matcher.find()) {

            try {

                this.decimalNumber += romanToDecimal(matcher.group());

            } catch (IllegalArgumentException e) {

                for (String s : matcher.group().split("")) {
                    this.decimalNumber += romanToDecimal(s);
                }

            }
        }
    }


    /**
     * We are asking for the
     * converted part of the regex
     * to a Decimal number.
     * Example: M = 1000.
     *
     * romanToDecimal
     * @param String romanNumber
     * @return the equivalent of the number in Decimal
     */
    private int romanToDecimal(String romanNumber) {
        SimbolosRomanos nr = Enum.valueOf(SimbolosRomanos.class, String.valueOf(romanNumber));
        return nr.getNumero();
    }


}