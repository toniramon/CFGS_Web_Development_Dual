package org.lasencinas.furnaceKata.hardware;

import org.lasencinas.furnaceKata.interfaces.Heater;
import org.lasencinas.furnaceKata.interfaces.Thermometer;
import org.lasencinas.furnaceKata.types.AndroidScreenLayout;
import org.lasencinas.furnaceKata.types.RoomTemperature;

public class Regulator {

    /**
     * Regulate the temperature is always important
     * so in this case we regulate between
     * the max and min params and show a message
     * to AndroidScreenLayout (Android App) telling
     * the user the change and current temperature.
     *
     * regulate()
     * @param Thermometer thermometer, Heater heater, double minTemp,
     *        double maxTemp, RoomTemperature temperature.
     */
    public void regulate(Thermometer thermometer, Heater heater, double minTemp, double maxTemp, RoomTemperature temperature) {
        AndroidScreenLayout code;
        while (thermometer.read(temperature) < maxTemp) {
            code = AndroidScreenLayout.HEATING;
            heater.engage(temperature);
            message(code, temperature);
        }
        while (thermometer.read(temperature) > minTemp) {
            code = AndroidScreenLayout.WAITING;
            heater.disengage(temperature);
            message(code, temperature);
        }
    }


    /**
     * Message shows the user interface
     * what's going on with the temperatures.
     *
     * message()
     * @param AndroidScreenLayout code, RoomTemperature temperature
     */
    private void message(AndroidScreenLayout code, RoomTemperature temperature) {
        switch (code) {
            case HEATING:
                System.out.println("Increasing temperature:  " + temperature.getTemperature());
                break;
            case WAITING:
                System.out.println("Reducing temperature:  " + temperature.getTemperature());
                break;
            default:
                System.out.println("Error...");
                break;
        }
    }


}
