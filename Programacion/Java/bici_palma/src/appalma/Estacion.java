package appalma;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class Estacion {

    //Atributos o Propiedades

    int id;  // Identificador de la estación
    String direccion; // Dirección de la estación
    int numeroAnclajes; // Número de anclajes de la estación
    private String[] anclajes = null; // Array -- anclajes[numeroAnclajes] -- donde almacenarás las bicicletas que se anclen en la estación

    Estacion(int id, String direccion, int numeroAnclajes) {

        this.id = id;
        this.direccion = direccion;
        this.numeroAnclajes = numeroAnclajes;
        this.anclajes = new String[numeroAnclajes];

    }


    public int getId() {
        return id;
    }


    public String getDireccion() {
        return direccion;
    }


    public int getNumeroAnclajes() {
        return numeroAnclajes;
    }


    public String mostrarAnclaje(int anclaje) {
        int sumatorio = anclaje + 1;
        return Integer.toString(sumatorio);
    }


    public void consultarEstacion() {
        // Muestra un mensaje con id, direccion y numeroAnclajes

        System.out.println("id: " + getId());
        System.out.println("direccion: " + getDireccion());
        System.out.println("numeroAnclajes: " + getNumeroAnclajes());
    }


    public int anclajesLibres() {
        // Devuelve la cantidad de anclajes libres

        int count = 0;
        for (String ancla : anclajes) {
            if ( ancla == null ) count++;
        }
        return count;
    }


    public void anclarBicicleta(Bicicleta bicicleta) {
        // Inserta el objeto bicicleta en el primer registro libre del array anclajes y llama a mostrarAnclaje()

        boolean controlAnclaje = false;
        int contadorPosicion = 0;

        while (!controlAnclaje){

            if ( anclajes[contadorPosicion] == null) {
                // Accion añadir una nueva bici.
                anclajes[contadorPosicion] = String.valueOf(bicicleta.getBicicleta());
                mostrarAnclaje(bicicleta.getBicicleta(), contadorPosicion );
                controlAnclaje = true;
            } else {
                contadorPosicion += 1;
            }

        }

    }


    public void mostrarAnclaje(int bicicleta, int numeroAnclaje) {
        // Muestra un mensaje con el id de la bicicleta anclada y en qué anclaje se ha anclado
        System.out.println("bicicleta: " + bicicleta + " anclada en el anclaje: " + mostrarAnclaje(numeroAnclaje));
    }


    public void consultarAnclajes(){
        // Recorre el array anclajes y muestra el id de la bici anclada o si está libre

        int totalPosiciones = getNumeroAnclajes();

        for (int posicion = 0; posicion < getNumeroAnclajes(); posicion++) {

            if ( anclajes[posicion] != null) {
                System.out.println("Anclaje " + (posicion + 1) + " " + anclajes[posicion] );

            } else {
                System.out.println("Anclaje " + (posicion + 1)  + " libre");
            }

        }
    }


    public boolean leerTarjetaUsuario(TarjetaUsuario tarjetaUsuario) {
        return tarjetaUsuario.getActivada();
    }


    public void retirarBicicleta(TarjetaUsuario tarjetaUsuario) {
        /*
        Si la tarjeta de usuario está activada retira una bici del anclaje y muestra su información en
        pantalla llamando a mostrarBicicleta(bicicleta, numeroAnclaje).
        Para simular que un usuario/a del servicio ancla una bici, debes generar una posición
        al azar entre los anclajes y eliminar esa bici con el método generarAnclaje().
        Para eliminar una bici del array debes poner esa posicion del array a null.
         */

        if (tarjetaUsuario.getActivada() == true) {
            generarAnclaje();
        }
    }


    public void mostrarBicicleta(String bicicleta, int numeroAnclaje) {
        // Muestra un mensaje con el id de la bici y el número de anclaje donde estaba.
        System.out.println("bicicleta retirada " + bicicleta + " del anclaje " + (numeroAnclaje + 1));
    }


    public void generarAnclaje(){
        // Devuelve una posición al azar entre el número de anclajes. Utiliza ThreadLocalRandom.current()

        int biciAleatoria = ThreadLocalRandom.current().nextInt(0, obtenerAnclajesLibres().size());
        String biciEliminada = anclajes[biciAleatoria];
        anclajes[biciAleatoria] = null;

        mostrarBicicleta(biciEliminada, biciAleatoria);
    }


    public ArrayList<String> obtenerAnclajesLibres() {
        ArrayList<String> anclajesDisponibles = new ArrayList<String>();
        int totalPosiciones = getNumeroAnclajes();

        for (int posicion = 0; posicion < getNumeroAnclajes(); posicion++) {
            if ( anclajes[posicion] != null) {
                anclajesDisponibles.add(anclajes[posicion]);
            }
        }

        return anclajesDisponibles;
    }

}
