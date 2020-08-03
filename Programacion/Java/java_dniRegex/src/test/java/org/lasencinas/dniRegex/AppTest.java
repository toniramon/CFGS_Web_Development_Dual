package org.lasencinas.dniRegex;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.lasencinas.dniRegex.identifiers.Dni;
import org.lasencinas.dniRegex.identifiers.Nie;
import org.lasencinas.dniRegex.main.App;
import org.lasencinas.dniRegex.utilities.RegularExpression;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

/**
 * Unit test
 */
public class AppTest 
{

    @Before
    public void initialize(){

        RegularExpression regex = RegularExpression.getMyRegularExpression();
        regex.addRegex("DNI", "\\b[0-9]{8}((?![IOUÑ]).){1}\\b");
        regex.addRegex("NIE", "\\b[XYZ]{1}[0-9]{7}((?![IOUÑ]).){1}\\b");

    }

    @Test
    public void getDniRegex(){

        RegularExpression regex = RegularExpression.getMyRegularExpression();
        System.out.println(regex.getRegexValue("DNI"));

    }

    @Test
    public void regexABCTest()
    {
        // Check that regex return the value they really have.
        RegularExpression regex = RegularExpression.getMyRegularExpression();
        regex.addRegex("DNI", "[abc]");
        regex.addRegex("NIE", "^b[cd]{4}");

        Assert.assertEquals("[abc]", regex.getRegexValue("DNI"));
        Assert.assertEquals("^b[cd]{4}", regex.getRegexValue("NIE"));
    }

    @Test
    public void setGetDniTest()
    {
        Dni dni = new Dni();
        dni.setDni("43434343X");
        Assert.assertEquals("43434343X", dni.getDni());
    }

    @Test
    public void isDniSyntaxValidTest(){
        Dni dni = new Dni();
        dni.setDni("43434343X");
        Assert.assertEquals(true, dni.isDniSyntaxValid());
    }

    @Test
    public void isDniSyntaxValidTestFailNumbers(){
        Dni dni = new Dni();
        dni.setDni("4343443X");
        Assert.assertEquals(false, dni.isDniSyntaxValid());
    }

    @Test
    public void isDniSyntaxValidTestFailLetter(){
        Dni dni = new Dni();
        dni.setDni("43434343I");
        Assert.assertEquals(false, dni.isDniSyntaxValid());
    }

    @Test
    public void calculateLetterDniTest(){
        Dni dni = new Dni();
        dni.setDni("72376173A");
        Assert.assertEquals("A", dni.calculateLetter(dni.getDni()));
    }



    @Test
    public void calculateLetterDniTest2(){
        Dni dni = new Dni();
        dni.setDni("72376173A");
        Assert.assertEquals("A", dni.obtainDniLetter(dni.getDni()));
    }

    @Test
    public void checkValidLetterDni(){
        Dni dni = new Dni();
        dni.setDni("72376173A");
        Assert.assertEquals(true, dni.isDniLetterValid());
    }

    @Test
    public void checkValidLetterDni2(){
        Dni dni = new Dni();
        dni.setDni("01817200Q");
        Assert.assertEquals(true, dni.isDniLetterValid());
    }

    @Test
    public void checkFalseLetterDni(){
        Dni dni = new Dni();
        dni.setDni("01217200Q");
        Assert.assertEquals(false, dni.isDniLetterValid());
    }




    @Test
    public void validDnisTest(){
        Dni dni = new Dni();

        String[] validDnis = {"78484464T","72376173A","01817200Q","95882054E","63587725Q",
                "26861694V","21616083Q","26868974Y","40135330P","89044648X"};

        for (String checkDni : validDnis) {

            dni.setDni(checkDni);

            Assert.assertEquals(true, dni.isDniSyntaxValid());

        }

    }

    @Test
    public void TenInvalidDnisTest(){
        Dni dni = new Dni();

        ArrayList<String> invalidDni = new ArrayList<String>();

        // Generate invalid dnis.
        for (int i = 0; i < 10; i++) {

            Random r = new Random();
            String numbers = Integer.toString(r.nextInt((9999999 - 0100000) + 1) + 0100000);

            Random r2 = new Random();
            char letter = (char)(r2.nextInt(26) + 'A');
            String letterString =String.valueOf(letter);

            String dniInvalid = numbers+letterString.toUpperCase();
            invalidDni.add(dniInvalid);

        }

        // Check 10 invalid dnis.
        for (String checkDni : invalidDni) {

            dni.setDni(checkDni);

            Assert.assertEquals(false, dni.isDniSyntaxValid());
            System.out.println("Invalid dni: " + dni.getDni());
        }

    }

    @Test
    public void TenValidNiesTest(){
        Nie nie = new Nie();

        ArrayList<String> validNie = new ArrayList<String>();

        // Generate valid nie.
        for (int i = 0; i < 10; i++) {

            // First Letter
            Random randLetterInit = new Random();
            String alphabet = "XYZ";
            String initialLetter = String.valueOf(alphabet.charAt(randLetterInit.nextInt(alphabet.length())));

            // Last letter
            Random randLetterFinal = new Random();
            String alphabet2 = "ABCDEFGHJKLMNOPRSTVWXYZ";
            String letterFinal = String.valueOf(alphabet.charAt(randLetterInit.nextInt(alphabet.length())));

            // Random number of 7 digits.
            Random number = new Random();
            String numbers = Integer.toString(number.nextInt((9999999 - 1000000) + 1) + 1000000);

            String nieValidrand = initialLetter+numbers+letterFinal;
            validNie.add(nieValidrand);
        }

        // Check 10 valid nies.
        for (String checkNie : validNie) {

            nie.setNie(checkNie);

            Assert.assertEquals(true, nie.isNieSyntaxValid());
            System.out.println("Valid Nie: " + nie.getNie());
        }

    }

    @Test
    public void TenInvalidNiesTest(){
        Nie nie = new Nie();

        ArrayList<String> validNie = new ArrayList<String>();

        // Generate valid nie.
        for (int i = 0; i < 10; i++) {

            // First Letter
            Random randLetterInit = new Random();
            String alphabet = "SDF";
            String initialLetter = String.valueOf(alphabet.charAt(randLetterInit.nextInt(alphabet.length())));

            // Last letter
            Random randLetterFinal = new Random();
            String alphabet2 = "ABCDEFGHJKLMNOPRSTVWXYZ";
            String letterFinal = String.valueOf(alphabet.charAt(randLetterInit.nextInt(alphabet.length())));

            // Random number of 7 digits.
            Random number = new Random();
            String numbers = Integer.toString(number.nextInt((9999999 - 10000) + 1) + 1000000);

            String nieValidrand = initialLetter+numbers+letterFinal;
            validNie.add(nieValidrand);
        }

        // Check 10 valid nies.
        for (String checkNie : validNie) {

            nie.setNie(checkNie);

            Assert.assertEquals(false, nie.isNieSyntaxValid());
            System.out.println("Invalid Nie: " + nie.getNie());
        }

    }

    @Test
    public void calculateNieFirstLetter(){
        Nie nie = new Nie();
        nie.setNie("Y6409439C");
        Assert.assertEquals("1", nie.obtainNieFirstLetterValue(nie.getNie()));

        nie.setNie("Z8599034Y");
        Assert.assertEquals("2", nie.obtainNieFirstLetterValue(nie.getNie()));

        nie.setNie("X9482702D");
        Assert.assertEquals("0", nie.obtainNieFirstLetterValue(nie.getNie()));

    }

    @Test
    public void calculateNieLetter(){
        Nie nie = new Nie();
        nie.setNie("Y6409439C");
        Assert.assertEquals("C", nie.calculateLetter(nie.getNie()));

        nie.setNie("Z8599034Y");
        Assert.assertEquals("Y", nie.calculateLetter(nie.getNie()));

        nie.setNie("X9482702D");
        Assert.assertEquals("D", nie.calculateLetter(nie.getNie()));

    }

}
