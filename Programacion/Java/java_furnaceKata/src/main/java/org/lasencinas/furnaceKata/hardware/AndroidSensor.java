package org.lasencinas.furnaceKata.hardware;

import org.lasencinas.furnaceKata.interfaces.Thermometer;
import org.lasencinas.furnaceKata.types.RoomTemperature;

public class AndroidSensor implements Thermometer {

    /**
     *
     * Creating an AndroidSensor is smart because
     * we can controll the temperatures of the
     * Thermometer.
     *
     * Main function: get the temperature
     * of the Thermometer.
     *
     * read()
     * @param RoomTemperature temperature
     * @return (int) the temperature of the room.
     */
    public double read(RoomTemperature temperature) {
        return temperature.getTemperature();
    }
}
