package org.lasencinas.furnaceKata.otherstuff;

import org.lasencinas.furnaceKata.hardware.ElectricHeater;
import org.lasencinas.furnaceKata.interfaces.Heater;
import org.lasencinas.furnaceKata.types.RoomTemperature;

public class Charmander implements Heater {

    /***** Atributos *****/

    double flareTemperature = 980;


    /***** Interfaz Pública *****/

    /**
     * Showing Charmander's Flare to
     * increment the room's temperature.
     *
     * engage()
     * @param RoomTemperature temperature.
     */
    public void engage(RoomTemperature temperature){
        temperature.incrementTemperature(this.showFlare());
    }

    /**
     * Stop showing Charmander's Flare to
     * decrement the room's temperature.
     *
     * disengage()
     * @param RoomTemperature temperature.
     */
    public void disengage(RoomTemperature temperature){
        Heater heater = new ElectricHeater();
        this.stopFlare(heater, temperature);
    }

    public void speak() {
        System.out.println("Oh! Temperature it's normal again...");
        System.out.println("\t How..");
        System.out.println("\t Is this..");
        System.out.println("\t Possible..");
        System.out.println("\t ");
        System.out.println("\t ");
        System.out.println("\t  ▬▬▬.◙.▬▬▬ ");
        System.out.println("\t  ═▂▄▄▓▄▄▂ ");
        System.out.println("\t ◢◤ █▀▀████▄▄▄▄◢◤  ");
        System.out.println("\t █▄ █ █▄ ███▀▀▀▀▀▀▀╬ ");
        System.out.println("\t ◥█████◤  ");
        System.out.println("\t ══╩══╩═ ");
        System.out.println("\t ╬═╬    ");
        System.out.println("\t ╬═╬  ");
        System.out.println("\t ╬═╬ Charmander...  ");
        System.out.println("\t ╬═╬  ");
        System.out.println("\t ╬═╬  ");
        System.out.println("\t ╬═╬☻/  HAS BEEN SLAINED!   ");
        System.out.println("\t ╬═╬/▌  ");
        System.out.println("\t ╬═╬/ \\  ");
        System.out.println("\t   ");


    }


    /***** Interfaz Privada *****/

    private double showFlare(){
        return this.flareTemperature;
    }

    /**
     * Stop showing Charmander's Flare to
     * decrement the room's temperature.
     *
     * stopFlare()
     * @param Heater heater, RoomTemperature temperature.
     */
    private void stopFlare(Heater heater, RoomTemperature temperature){
        temperature.incrementTemperature(-980);
        heater.disengage(temperature);
    }


}
