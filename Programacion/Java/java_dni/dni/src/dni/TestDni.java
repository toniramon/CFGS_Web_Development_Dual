package dni;

public class TestDni {

    public static void main (String[] args) throws Exception {

        TablaAsignacion tabla = new TablaAsignacion();
        Dni nuevodni = new Dni();

        System.out.println(tabla.calcularLetra("43224529"));

        String[] casosTestPass = { //casos OK
                "78484464","72376173","01817200","95882054","63587725",
                "26861694","21616083","26868974","40135330","89044648"};

        System.out.println("\n ***** Casos Test PASS ***** \n");

        // Añadiremos la variable dentro del For.
        String dniVerificado;

        for(String dni : casosTestPass){

            char casotest1 = new TablaAsignacion().calcularLetra(dni);
            dniVerificado = dni.toString()  + casotest1;
            System.out.println(dniVerificado);

        }

        // Comprobamos que obtenerLetra de DNI funciona correctamente.
        System.out.println(nuevodni.obtenerLetra("43224529P"));

        // Comprobamos que obtenerLetra de DNI funciona correctamente.
        System.out.println(nuevodni.obtenerParteNumerica("43224529P"));

    }

}
