package org.lasencinas.enzinium;

import java.security.PublicKey;
import java.util.HashMap;
import java.util.Map;

public class TokenContract {

    private String name;
    private String symbol;
    private Double totalSupply;
    private PublicKey owner;
    private double quantity = 0.0;
    //private HashMap<PublicKey, Double> balances = new HashMap<PublicKey, Double>();

    private Map<PublicKey, Double> balances = new HashMap<PublicKey, Double>();
    public TokenContract() {};


    public TokenContract(Address name) {
        this.owner = name.getPK();
    }

    public String name() {
        return name;
    }

    public String symbol() {
        return symbol;
    }

    public Double totalSupply() {
        return totalSupply;
    }

    public PublicKey getOwner() {
        return owner;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }


    public void setTotalSupply(Double totalSupply) {
        this.totalSupply = totalSupply;
    }

    public void addQuantity(double enzimus){
        this.quantity += enzimus;
    }


    public void addOwner(PublicKey ownerpk, Double entradas) {
        //si ya se ha asignado una vez no hace nada mas.
        if (!balances.containsKey(ownerpk)) {
            balances.put(ownerpk,entradas);
        } else {}

    }


    @Override
    public String toString() {
        return "\n" + "name = " + name() + "\n" +
                "symbol = " + symbol() + "\n" +
                "totalSupply = " + totalSupply() + "\n" +
                "owner PK = " + getOwner().hashCode();
    }

    public int numOwners() {
        return this.balances.size();
    }

    public Double balanceOf(PublicKey pk) {
        if (balances.get(pk) != null) {
            return this.balances.get(pk);
        } else {
            return 0.0;
        }

    }

    public double require(PublicKey pk) {
        return balanceOf(pk);
    }

    public void transfer(PublicKey pk, double valor) {
        double entradasActual = balanceOf(pk);
        double entradasOwner = require(this.owner);

        try {
                if(entradasOwner > valor) {
                    entradasOwner -= valor;
                    this.balances.put(this.owner, entradasOwner);
                    entradasActual += valor;
                    this.balances.put(pk, entradasActual);
                }

        } catch (Exception e) {}

    }

    public void transfer(PublicKey pk, PublicKey pk2, double valor) {
        double entradasComprador = balanceOf(pk2);
        double entradasVendedor = balanceOf(pk);

        try {
            if(entradasVendedor > valor) {
                entradasVendedor -= valor;
                this.balances.put(pk, entradasVendedor);
                entradasComprador += valor;
                this.balances.put(pk2, entradasComprador);
            }

        } catch (Exception e) {}
    }

    public void owners() {
        for(Map.Entry<PublicKey, Double> ticket: balances.entrySet()) {
            if(ticket.getKey().hashCode() != this.getOwner().hashCode()) {
                System.out.println("Owner: "+ticket.getKey().hashCode()+ " "+ ticket.getValue() + " " + this.symbol);
            }
        }
    }



    public int totalTokensSold() {
        int totalTokens = 0;
        for(Map.Entry<PublicKey, Double> ticket: balances.entrySet()) {
            if(ticket.getKey().hashCode() != this.getOwner().hashCode()) {
                totalTokens += ticket.getValue();
            }
        }
        return totalTokens;
    }

    public void payable(PublicKey owner, double value) {

    }
}
