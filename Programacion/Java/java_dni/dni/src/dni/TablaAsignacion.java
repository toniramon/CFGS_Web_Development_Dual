package dni;

public class TablaAsignacion {

    char[] tabla = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S',
                    'Q', 'V', 'H', 'L', 'C', 'K', 'E'
                   };


    public char calcularLetra(String DNI) {
        int dni = Integer.parseInt(DNI);
        int posicion = dni % getModulo();
        //System.out.println(posicion);
        return getLetra(posicion);

    }

    public char getLetra(int posicion) {
        return this.tabla[posicion];
    }


    public int getModulo(){
        return this.tabla.length;
    }


}
