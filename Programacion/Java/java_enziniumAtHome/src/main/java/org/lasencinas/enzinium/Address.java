package org.lasencinas.enzinium;

import java.security.PrivateKey;
import java.security.PublicKey;

public class Address {

    /***** Atributos *****/

    public PublicKey PK;
    private PrivateKey SK;
    private Double balance = 0d;
    private String symbol = "EZI";


    /***** Constructor/es *****/

    public Address() {}


    /***** Setter & Getter *****/

    public PublicKey getPK() {
        return PK;
    }


    public PrivateKey getSK() {
        return SK;
    }


    public Double getBalance() {
        return balance;
    }


    public String getSymbol() {
        return symbol;
    }


    /***** Interfaz Pública *****/

    public void generateKeyPair() {
        this.PK = GenSig.generateKeyPair().getPublic();
        this.SK = GenSig.generateKeyPair().getPrivate();
    }

    @Override
    public String toString() {
        return "\n" + "PK = " + getPK().hashCode() + "\n" +
                "Balance = " + getBalance() + " " + getSymbol() + "\n";
    }


    public void addEZI(Double ezi) {
        this.balance += ezi;
    }


    public void payEZI(Double ezi) {
        this.balance -= ezi;
    }


    public void send(TokenContract contract, Double enziniums) {

        try {
            require(getBalance() > enziniums);
            contract.payable(this.getPK(), enziniums);
            this.payEZI(enziniums);
        } catch (Exception e) {

        }

    }

    public void transferEZI(Double enziniums) {
        this.balance += enziniums;
    }



    /***** Interfaz Privada *****/

    private void require(Boolean required)throws Exception {
        if (required) {

        } else {
            Exception failTransfer = new Exception();
            throw failTransfer;
        }

    }

}
