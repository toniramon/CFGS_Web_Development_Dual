package org.lasencinas.enzinium;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TokenContractTest {

    @Test
    public void comprobarOwners() {
        Address rick = new Address();
        rick.generateKeyPair();
        Address morty = new Address();
        morty.generateKeyPair();

        TokenContract ricknillos = new TokenContract(rick);
        ricknillos.setName("Ricknillos");
        ricknillos.setSymbol("RNiLL");
        ricknillos.setTotalSupply(100d);

        ricknillos.addOwner(rick.getPK(), ricknillos.totalSupply());


        assertEquals(1,ricknillos.numOwners());
    }

    @Test
    public void comprobarEntradasDisponibles() {
        Address rick = new Address();
        rick.generateKeyPair();
        Address morty = new Address();
        morty.generateKeyPair();

        TokenContract ricknillos = new TokenContract(rick);
        ricknillos.setName("Ricknillos");
        ricknillos.setSymbol("RNiLL");
        ricknillos.setTotalSupply(100d);

        ricknillos.addOwner(rick.getPK(), ricknillos.totalSupply());
        ricknillos.addOwner(rick.getPK(), 500d);

        assertEquals(100.0, ricknillos.totalSupply(), 0);
    }

    @Test
    public void comprobarEntradasRick() {
        Address rick = new Address();
        rick.generateKeyPair();
        Address morty = new Address();
        morty.generateKeyPair();

        TokenContract ricknillos = new TokenContract(rick);
        ricknillos.setName("Ricknillos");
        ricknillos.setSymbol("RNiLL");
        ricknillos.setTotalSupply(100d);

        ricknillos.addOwner(rick.getPK(), ricknillos.totalSupply());
        ricknillos.addOwner(rick.getPK(), 500d);

        assertEquals(100.0, ricknillos.balanceOf(rick.getPK()), 0);
    }

    @Test
    public void transferimosDosEntradas() {
        Address rick = new Address();
        rick.generateKeyPair();
        Address morty = new Address();
        morty.generateKeyPair();

        TokenContract ricknillos = new TokenContract(rick);
        ricknillos.setName("Ricknillos");
        ricknillos.setSymbol("RNiLL");
        ricknillos.setTotalSupply(100d);

        ricknillos.addOwner(rick.getPK(), ricknillos.totalSupply());
        ricknillos.transfer(morty.getPK(), 2d);

        assertEquals(2.0, ricknillos.balanceOf(morty.getPK()), 0);
    }

    @Test
    public void transferimosDosMasEntradas() {
        Address rick = new Address();
        rick.generateKeyPair();
        Address morty = new Address();
        morty.generateKeyPair();

        TokenContract ricknillos = new TokenContract(rick);
        ricknillos.setName("Ricknillos");
        ricknillos.setSymbol("RNiLL");
        ricknillos.setTotalSupply(100d);

        ricknillos.addOwner(rick.getPK(), ricknillos.totalSupply());
        ricknillos.transfer(morty.getPK(), 2d);

        assertEquals(2.0, ricknillos.balanceOf(morty.getPK()), 0);

        ricknillos.transfer(morty.getPK(), 2d);

        assertEquals(4.0, ricknillos.balanceOf(morty.getPK()), 0);

    }




    /*@Test
    public void payable_test() {

        Address rick = new Address();
        rick.generateKeyPair();
        TokenContract ricknillos = new TokenContract(rick);
        ricknillos.addOwner(rick.getPK(), 100d);
        Address morty = new Address();
        morty.generateKeyPair();

        morty.addEZI(20d);

        // verifico la transferencia de entradas
        ricknillos.payable(morty.getPK(), morty.getBalance());
        assertEquals(4d, ricknillos.balanceOf(morty.getPK()), 0d);

        // verifico la trasnferencia de EZI
        assertEquals(20d, ricknillos.owner().getBalance(), 0d);
    }
    */
}