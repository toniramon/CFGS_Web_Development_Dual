package org.lasencinas.pigcoin;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.Map;

import org.junit.Test;


public class WalletTest {


    @Test
    public void constructor_test() {
        Wallet wallet = new Wallet();
        assertNotNull(wallet);
    }
}
