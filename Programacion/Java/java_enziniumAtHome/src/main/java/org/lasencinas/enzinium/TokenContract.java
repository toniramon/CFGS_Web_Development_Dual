package org.lasencinas.enzinium;

import java.security.PublicKey;
import java.util.HashMap;
import java.util.Map;

public class TokenContract {

    /***** Atributos *****/

    private String name;
    private String symbol;
    private Double totalSupply;
    private Address owner;
    private Map<PublicKey, Double> balances = new HashMap<PublicKey, Double>();
    private Double priceForToken = 5d;

    /***** Constructor/es *****/

    public TokenContract(Address owner) {
        this.owner = owner;
    }


    /***** Setter & Getter *****/

    public void setName(String name) {
        this.name = name;
    }


    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }


    public void setTotalSupply(Double totalSupply) {
        this.totalSupply = totalSupply;
    }


    public PublicKey getOwner() {
        return owner.getPK();
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


    public Map<PublicKey, Double> getBalances() {
        return balances;
    }


    /***** Interfaz Pública *****/

    @Override
    public String toString() {
        return "\n" + "name = " + name() + "\n" +
                "symbol = " + symbol() + "\n" +
                "totalSupply = " + totalSupply() + "\n" +
                "owner PK = " + getOwner().hashCode();
    }


    public void addOwner(PublicKey ownerpk, Double entradas) {
        //si ya se ha asignado una vez no hace nada mas.
        if (!balances.containsKey(ownerpk)) {
            balances.put(ownerpk, entradas);
        } else {
        }

    }


    public int numOwners() {
        return this.balances.size();
    }


    public Double balanceOf(PublicKey pk) {
        if (balances.get(pk) != null) {
            return this.balances.get(pk);
        } else {
            return 0d;
        }

    }


    public void transfer(PublicKey pk, Double tickets) {

        try {
            require(balanceOf(getOwner()) > tickets);
            this.balances.put(getOwner(), balanceOf(getOwner()) - tickets);
            this.balances.put(pk, balanceOf(pk) + tickets);
        } catch (Exception e) {

        }

    }

    public void transfer(PublicKey sender, PublicKey recipient, Double tickets) {

        try {
            require(balanceOf(sender) > tickets);
            this.balances.put(sender, balanceOf(sender) - tickets);
            this.balances.put(recipient, balanceOf(recipient) + tickets);
        } catch (Exception e) {

        }

    }


    public void owners() {
        for (Map.Entry<PublicKey, Double> ticket : balances.entrySet()) {
            if (ticket.getKey().hashCode() != this.getOwner().hashCode()) {
                System.out.println("Owner: " + ticket.getKey().hashCode() + " " + ticket.getValue() + " " + this.symbol);
            }
        }
    }


    public int totalTokensSold() {
        int totalTokens = 0;
        for (Map.Entry<PublicKey, Double> ticket : balances.entrySet()) {
            if (ticket.getKey().hashCode() != this.getOwner().hashCode()) {
                totalTokens += ticket.getValue();
            }
        }
        return totalTokens;
    }


    public void payable(PublicKey recipient, Double enziniums) {

        Double tickets = ticketsFromBuy(enziniums);

        try {
            requiredTickets(tickets > 1d);
            transfer(this.getOwner(), recipient, tickets);
            owner().addEZI(enziniums);
        } catch (Exception e) {

        }
    }


    public Address owner() {
        return this.owner;
    }


    public Double ticketsFromBuy(Double enziniums) {
        return enziniums / this.priceForToken;
    }


    /***** Interfaz Privada *****/

    private void require(Boolean required) throws Exception {
        if (required) {

        } else {
            Exception failTransfer = new Exception();
            throw failTransfer;
        }

    }


    private void requiredTickets(Boolean required) throws Exception {
        if (required) {

        } else {
            Exception needMoreTickets = new Exception();
            throw needMoreTickets;
        }

    }

}
