package org.lasencinas.bowlinGame;

import org.junit.*;

import static junit.framework.TestCase.assertEquals;

public class TarjetaTest {

    private Tarjeta tarjeta = null;

    @Before
    public void init() {
        tarjeta = new Tarjeta();
    }


    @Test
    public void computarStrikeTest() {

        Assert.assertEquals(tarjeta.getStrike(), tarjeta.computarStrike('X'));
        Assert.assertEquals(0, tarjeta.computarStrike('9'));
    }


    @Test
    public void computePinTest() {
        String pines = "-123456789";

        for (int i = 0; i < pines.length(); i++) {
            Assert.assertEquals(i, tarjeta.computarPines(pines.charAt(i)));
        }

    }


    @Test
    public void computarTarjetaVeinteBolasTest() {
        String puntuacion = "11111111111111111111";
        tarjeta = new Tarjeta(puntuacion);
        Assert.assertEquals(20, tarjeta.computarTarjeta(puntuacion));

        puntuacion = "22222222222222222222";
        tarjeta = new Tarjeta(puntuacion);
        Assert.assertEquals(40, tarjeta.computarTarjeta(puntuacion));

        puntuacion = "-1111111111111111111";
        tarjeta = new Tarjeta(puntuacion);
        Assert.assertEquals(19, tarjeta.computarTarjeta(puntuacion));

    }


    @Test
    public void computarTarjetaVeinteBolasConStrikeTest() {
        String puntuacion = "X111111111111111111";
        tarjeta = new Tarjeta(puntuacion);
        Assert.assertEquals(30, tarjeta.computarTarjeta(puntuacion));

        puntuacion = "XX1111111111111111";
        tarjeta = new Tarjeta(puntuacion);
        Assert.assertEquals(49, tarjeta.computarTarjeta(puntuacion));

        puntuacion = "12323236259-62178-63";
        tarjeta = new Tarjeta(puntuacion);
        Assert.assertEquals(71, tarjeta.computarTarjeta(puntuacion));

        puntuacion = "-28162122222XXXXXX";
        tarjeta = new Tarjeta(puntuacion);
        Assert.assertEquals(150, tarjeta.computarTarjeta(puntuacion));

        puntuacion = "XXXXXXXXXXXX";
        tarjeta = new Tarjeta(puntuacion);
        Assert.assertEquals(300, tarjeta.computarTarjeta(puntuacion));

        puntuacion = "9-9-9-9-9-9-9-9-9-9-";
        tarjeta = new Tarjeta(puntuacion);
        Assert.assertEquals(90, tarjeta.computarTarjeta(puntuacion));

        puntuacion = "9-9-9-9-9-9-9-9-9-X9-";
        tarjeta = new Tarjeta(puntuacion);
        Assert.assertEquals(100, tarjeta.computarTarjeta(puntuacion));

    }



    @Test
    public void computarTarjetaVeinteBolasConSpareTest() {
        String puntuacion = "121/123/4/5/8/111111";
        tarjeta = new Tarjeta(puntuacion);
        tarjeta.computarTarjeta(puntuacion);
        Assert.assertEquals(81, tarjeta.getPuntuacionTotal());

    }




    @Test
    public void computarSpareTest() {

        Assert.assertEquals(10, tarjeta.computarSpare("5/"));
        Assert.assertEquals(0, tarjeta.computarSpare("9X"));

        // comprobar que antes se ha lanzado una bola y no es un Strike.
    }

    /* CASOS TEST DAVID */

    @Test
    public void TotalScoreHittingPinsTest() {

        // Hitting pins total = 60
        String pins = "12345123451234512345";
        int total = 60;

        Tarjeta tarjeta = new Tarjeta(pins);

        tarjeta.computarTarjeta(pins);

        assertEquals(total, tarjeta.getPuntuacionTotal());
    }

    @Test
    public void TotalScoreHittingPinsFailTest() {

        // test symbol -

        String pins = "9-9-9-9-9-9-9-9-9-9-";
        int total = 90;
        Tarjeta tarjeta = new Tarjeta(pins);
        tarjeta.computarTarjeta(pins);
        assertEquals(total, tarjeta.getPuntuacionTotal());

        pins = "9-3561368153258-7181";
        total = 82;
        tarjeta = new Tarjeta(pins);
        tarjeta.computarTarjeta(pins);
        assertEquals(total, tarjeta.getPuntuacionTotal());
    }

    @Test
    public void TotalScoreSpareTest() {
        /*
         * If in two tries he knocks them all down, this is called
         * a “spare” and his score for the frame is ten plus the
         * number of pins knocked down on his next throw (in
         * his next turn).
         * If he gets a spare or strike in the last (tenth) frame,
         * the bowler gets to throw one or two more bonus balls,
         * respectively. - These bonus throws are taken as part of
         * the same turn. If the bonus throws knock down all the
         * pins, the process does not repeat: the bonus throws are
         * only used to calculate the score of the final frame.
         */

        String pins = "5/5/5/5/5/5/5/5/5/5/5";
        int total = 150;
        Tarjeta tarjeta = new Tarjeta(pins);
        tarjeta.computarTarjeta(pins);
        assertEquals(total, tarjeta.getPuntuacionTotal());

        pins = "9-3/613/815/-/8-7/8/8";
        total = 131;
        tarjeta = new Tarjeta(pins);
        tarjeta.computarTarjeta(pins);
        assertEquals(total, tarjeta.getPuntuacionTotal());
    }

    @Test
    public void TotalScoreStrikeTest() {
        /* If on his first try in the frame he knocks down all the
         * pins, this is called a “strike”. His turn is over, and his
         * score for the frame is ten plus the simple total of the
         * pins knocked down in his next two rolls.
         * If he gets a spare or strike in the last (tenth) frame,
         * the bowler gets to throw one or two more bonus balls,
         * respectively. - These bonus throws are taken as part of
         * the same turn. If the bonus throws knock down all the
         * pins, the process does not repeat: the bonus throws are
         * only used to calculate the score of the final frame.
         */

        String pins = "X9-9-9-9-9-9-9-9-9-";
        int total = 100;
        Tarjeta tarjeta = new Tarjeta(pins);
        tarjeta.computarTarjeta(pins);
        assertEquals(total, tarjeta.getPuntuacionTotal());

        // two extra final rolls
        pins = "9-9-9-9-9-9-9-9-9-X9-";
        total = 100;
        tarjeta = new Tarjeta(pins);
        tarjeta.computarTarjeta(pins);
        assertEquals(total, tarjeta.getPuntuacionTotal());

        pins = "X9-X9-9-9-9-9-9-9-";
        total = 110;
        tarjeta = new Tarjeta(pins);
        tarjeta.computarTarjeta(pins);
        assertEquals(total, tarjeta.getPuntuacionTotal());

        // two strikes in a row is a double
        pins = "XX9-9-9-9-9-9-9-9-";
        total = 120;
        tarjeta = new Tarjeta(pins);
        tarjeta.computarTarjeta(pins);
        assertEquals(total, tarjeta.getPuntuacionTotal());

        // three strikes in a row is a triple
        pins = "XXX9-9-9-9-9-9-9-";
        total = 141;
        tarjeta = new Tarjeta(pins);
        tarjeta.computarTarjeta(pins);
        assertEquals(total, tarjeta.getPuntuacionTotal());

        // two strikes in extra rolls
        pins = "9-9-9-9-9-9-9-9-9-XXX";
        total = 111;
        tarjeta = new Tarjeta(pins);
        tarjeta.computarTarjeta(pins);
        assertEquals(total, tarjeta.getPuntuacionTotal());

        // 12 strikes is a “Thanksgiving Turkey”.
        pins = "XXXXXXXXXXXX";
        total = 300;
        tarjeta = new Tarjeta(pins);
        tarjeta.computarTarjeta(pins);
        assertEquals(total, tarjeta.getPuntuacionTotal());

        // spare in extra roll
        pins = "X5/X5/XX5/--5/X5/";
        total = 175;
        tarjeta = new Tarjeta(pins);
        tarjeta.computarTarjeta(pins);
        assertEquals(total, tarjeta.getPuntuacionTotal());

    }


    @Test
    public void TotalScoreStrikeTest2() {
        // spare in extra roll
        String pins = "8/549-XX5/53639/9/X";
        int total = 149;
        tarjeta = new Tarjeta(pins);
        tarjeta.computarTarjeta(pins);
        assertEquals(total, tarjeta.getPuntuacionTotal());

    }


    @Test
    public void ToniTest() {
        // spare in extra roll
        Toni toni = new Toni("Toni", 10, 1.70, "asdf");
        toni.tornarHasMap();
        toni.tornarArrayList();
        toni.tornarTreeMap();
        toni.tornarLinkedHashMap();
        toni.tornarHashSet();
        toni.tornarTreeSet();
        toni.tornarLinkedHashSet();
    }

}