package org.lasencinas.toniramon.fastbreaktruck.domain;

import org.lasencinas.toniramon.fastbreaktruck.interfaces.Item;

import java.util.HashSet;
import java.util.Set;

public class Desayuno {

    // Este set contendrá varios items de un pedido.
    private Set<Item> items = new HashSet<>();
    private Double costeTotal =  0d;

    // Constructor con items.
    public Desayuno() {
    }

    public Double getCoste() {
        for (Item consumible : items) {
            costeTotal += consumible.pvp();
        }
        return costeTotal;
    }

    public void mostrarItems() {
        for (Item consumible : items) {
            System.out.println("\nItem: " + consumible.toString() + ", Empaquetado: " + consumible.empaquetado() + ", Precio: " + consumible.pvp());
        }
    }

    public void setItem(Item consumable) {
        items.add(consumable);
    }

}
