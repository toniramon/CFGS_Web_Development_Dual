package org.lasencinas.enumTypes;

/**
 *
 * Este programa nos sirve para calcular
 * cuánto pesamos en los diferentes
 * planetas de nuestro sistema solar.
 *
 * Deberíamos añadir Pluto? :)
 *
 * @author  Toni Ramon
 */
public class ArnoldMain {

    public static void main(String[] args) {

        double peso = 1.0; // kg

        for(Planeta planeta : Planeta.values()){
            System.out.printf("Your weight on %s is %f N%n", planeta.name(), planeta.pesoSuperficie(peso));
        }

        System.out.println("\nYour weight only on the terrestrial planets: ");
        for(Planeta planeta: Planeta.getPlanetasTerrestres()){
            System.out.printf("Your weight on %s is %f N%n", planeta.name(), planeta.pesoSuperficie(peso));
        }

        System.out.println("\nYour weight only on the gas giant planets: ");
        for(Planeta planeta: Planeta.getGigantesGaseosos()){
            System.out.printf("Your weight on %s is %f N%n", planeta.name(), planeta.pesoSuperficie(peso));
        }
    }

}