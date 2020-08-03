package dni;

public class Dni {

    //Atributos
    private String dni = null;
    private TablaAsignacion tabla = new TablaAsignacion();


    //Encapsulación
    public String getDni() {
        return this.dni;
    }

    //Métodos
    public String obtenerLetra( String dni) {
        //Sacar la letra del DNI introducido
        String letra = dni.substring(dni.length() - 1);
        return letra;
    }

    public String obtenerParteNumerica( String dni ) {
        // Sacar la parte numerica del DNI.
        String parteNumerica = dni.substring(0 , 8);
        return parteNumerica;
    }





}

//verificar que dni tiene 8 digitos. clase. // hacer en casa.

//obtener parte numerica dni
//obtener letra dni.