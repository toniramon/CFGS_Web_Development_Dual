package org.lasencinas.pigcoin;

import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.Map;

public class Wallet {

    /***** Atributos *****/

    private PublicKey address;
    private PrivateKey skey;
    private int total_input = 0;
    private int total_output = 0;
    private int balance = 0;
    private String inputTransactions = null;
    private String outputTransactions = null;


    public Wallet() {}


    /****** Getters y Setters ********/

    public PublicKey getAddress() {
        return this.address;
    }

    private Double getBalance() {
        return 0.0;
    }

    private Double getTotalOutput() {
        return 0.0;
    }

    private Double getTotalInput() {
        return 0.0;
    }

    /******* Métodos varios. *******/


    public void setSK(PrivateKey aPrivate) {
        this.skey = aPrivate;
    }

    public void setAddress(PublicKey aPublic) {
        this.address = aPublic;
    }

    public void generateKeyPair() {
        setAddress(GenSig.generateKeyPair().getPublic());
    }

    @Override
    public String toString() {
        return "\n" + "Wallet = " + getAddress().hashCode() + "\n" +
                "Total input = " + getTotalInput() + "\n" +
                "Total output = " + getTotalOutput() + "\n" +
                "Balance = " + getBalance() + "\n";
    }


    public void loadCoins(BlockChain bChain) {
    }


    public void loadInputTransactions(BlockChain bChain) {
    }

    public Object getInputTransactions() {
    }

    public void loadOutputTransactions(BlockChain bChain) {
    }

    public Boolean getOutputTransactions() {
    }

    public Map<String, Double> collectCoins(Double pigcoins) {
    }

    public byte[] signTransaction(String message) {

    }

    public void sendCoins(PublicKey address, Double pigcoins, String message, BlockChain bChain) {

    }
}
