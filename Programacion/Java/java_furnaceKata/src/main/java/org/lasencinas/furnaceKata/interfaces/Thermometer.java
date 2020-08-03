package org.lasencinas.furnaceKata.interfaces;

import org.lasencinas.furnaceKata.types.RoomTemperature;

public interface Thermometer {

    /**
     * Interface Thermometer adds
     * the functionality to allow
     * to read the temperature.
     *
     * @param RoomTemperature temperature.
     */

    public double read(RoomTemperature temperature);
}