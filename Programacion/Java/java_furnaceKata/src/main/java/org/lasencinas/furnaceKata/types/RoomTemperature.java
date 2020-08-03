package org.lasencinas.furnaceKata.types;

public class RoomTemperature {

    /***** Atributos *****/

    private static RoomTemperature myRoomTemperature = null;
    private int temperature;


    /***** Getter & Setter *****/

    public double getTemperature() {
        return this.temperature;
    }


    /***** Interfaz Pública *****/

    // Generamos patron Singleton. Comprobamos que el objeto existe. sino lo generamos UNA vez.
    public  static RoomTemperature getRoomTemperature(int temperature) {

        if (myRoomTemperature==null) {

            myRoomTemperature=new RoomTemperature(temperature);
        }
        return myRoomTemperature;
    }

    public void incrementTemperature(double temperature) {
        this.temperature += temperature;
    }


    /***** Interfaz Privada *****/

    private RoomTemperature(int temperature) {
        this.temperature = temperature;
    }


}