package org.lasencinas.furnaceKata.hardware;

import org.lasencinas.furnaceKata.interfaces.Heater;
import org.lasencinas.furnaceKata.types.RoomTemperature;

public class ElectricHeater implements Heater {

    /**
     * We need to connect the Heater system
     * so, engage connects it.
     *
     * engage()
     * @param RoomTemperature temperature
     * Action: increment it's temperature by 1.
     */
    public void engage(RoomTemperature temperature){
        temperature.incrementTemperature(1);
    }


    /**
     * We need to disconnect the Heater system
     * so, disengaging it.
     *
     * disengage()
     * @param RoomTemperature temperature
     * Action: decrement it's temperature by 1.
     */
    public void disengage(RoomTemperature temperature){
        temperature.incrementTemperature(-1);
    }

}
