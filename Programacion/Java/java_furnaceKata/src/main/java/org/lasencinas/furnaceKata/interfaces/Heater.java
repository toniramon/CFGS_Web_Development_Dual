package org.lasencinas.furnaceKata.interfaces;

import org.lasencinas.furnaceKata.types.RoomTemperature;

public interface Heater {

    /**
     * Interface Heater adds the
     * functionality to allow to engage
     * and disengage the Heater system.
     *
     * @param RoomTemperature temperature.
     */

    public void engage(RoomTemperature temperature);
    public void disengage(RoomTemperature temperature);

}