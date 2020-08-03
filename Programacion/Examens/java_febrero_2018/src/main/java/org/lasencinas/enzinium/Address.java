package org.lasencinas.enzinium;

import java.security.PrivateKey;
import java.security.PublicKey;

public class Address {

    public PublicKey PK;
    private PrivateKey SK;
    private Double balance = 0.0;
    private String symbol = "EZI";


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


    public void generateKeyPair() {
        this.PK = GenSig.generateKeyPair().getPublic();
        this.SK = GenSig.generateKeyPair().getPrivate();
    }


    public void addEZI(Double ezi) {
        this.balance += ezi;
    }


    @Override
    public String toString() {
        return "\n" + "PK = " + getPK().hashCode() + "\n" +
                "Balance = " + getBalance() + " " + getSymbol() + "\n";
    }

    public void send(TokenContract contract, double money) {
        if(this.balance > money) {
            contract.addQuantity(money);
            this.balance -= money;
        }
    }

    public void transferEZI(Address receiver, double money) {

    }
}
