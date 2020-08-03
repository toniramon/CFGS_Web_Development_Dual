package org.lasencinas.furnaceKata.main;

import org.lasencinas.furnaceKata.hardware.AndroidSensor;
import org.lasencinas.furnaceKata.hardware.ElectricHeater;
import org.lasencinas.furnaceKata.hardware.Regulator;
import org.lasencinas.furnaceKata.interfaces.Heater;
import org.lasencinas.furnaceKata.interfaces.Thermometer;
import org.lasencinas.furnaceKata.otherstuff.Charmander;
import org.lasencinas.furnaceKata.types.RoomTemperature;

/**
 * Esta práctica trata de crear un sistema de
 * calefacción para una habitación pudiendo
 * reutilizar el sistema para infinidad de
 * sistemas de calefacción utilizando la misma
 * habitación. Reutilizamos el código con el uso
 * de Interfaces y evitamos acoplamiento y
 * dependencias innecesarias.
 *
 * @author  Toni Ramon
 * @version 1.0
 * @since   03/04/2019
 */

public class App {
    public static void main( String[] args ){

        /***** Atributos *****/

        final double minTemp = 15.0;
        final double maxTemp = 21.0;

        /***** Interfaz Pública *****/

        /**
         *
         * Creating RoomTemperature to work with. Then
         * create a Heater (Electric) to add or substract
         * temperature and finally a Regulator to controll
         * the temps.
         *
         * transfer()
         * @param Thermometer thermometer, Heater heater
         *        double minTemp, double maxTemp,
         *        Roomtemperature temperature.
         */
        RoomTemperature temperature = RoomTemperature.getRoomTemperature(15);
        Heater heater = new ElectricHeater();
        Thermometer thermometer = new AndroidSensor();

        Regulator regulator = new Regulator();

        System.out.println( "Starting Heat System..." );
        regulator.regulate(thermometer, heater, minTemp, maxTemp, temperature);


        /**
         *
         * Invoking a Charmander to instant heat the Room.
         * As we invoke him, the temp increases 980º!!
         * The temp is too high so we let him go to get
         * a normal temp.
         *
         */
        Charmander charmander = new Charmander();
        System.out.println( "\nCharmander i choose you!" );
        regulator.regulate(thermometer, charmander, minTemp, maxTemp, temperature);
        charmander.speak();
    }
}