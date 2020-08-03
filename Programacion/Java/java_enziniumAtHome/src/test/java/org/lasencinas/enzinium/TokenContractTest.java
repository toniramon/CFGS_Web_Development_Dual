package org.lasencinas.enzinium;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TokenContractTest {

    private Address rick = null;
    private TokenContract ricknillos = null;
    private Address morty = null;


    @Before
    public void init() {

        rick = new Address();
        rick.generateKeyPair();

        morty = new Address();
        morty.generateKeyPair();

        ricknillos = new TokenContract(rick);
        ricknillos.setName("Ricknillos");
        ricknillos.setSymbol("RNiLL");
        ricknillos.setTotalSupply(100d);

        ricknillos.addOwner(rick.getPK(), ricknillos.totalSupply());
        // verifica que Rick no se actualiza una vez que ya existe en el balance
        ricknillos.addOwner(rick.getPK(), 500d);
    }

    @Test
    public void addOwnerTest() {

        assertEquals(ricknillos.totalSupply(), ricknillos.getBalances().get(rick.getPK()));

    }

    @Test
    public void numOwnersTest() {
        assertEquals(ricknillos.numOwners(), 1);
        ricknillos.transfer(morty.getPK(), 2d);
        assertEquals(ricknillos.numOwners(), 2);
    }


    @Test
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
}
