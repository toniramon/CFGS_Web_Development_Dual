package appalma;

public class TarjetaUsuario {

    //Atributos o Propiedades
    private String id;  // Identificador de la tarjeta: un número de nueve dígitos.
    private boolean activada;  // Valor lógico que indica si la tarjeta está activada o no.

    public TarjetaUsuario(String id, boolean activada) {
        this.id = id;
        this.activada = activada;
    }

    public boolean getActivada() {
        return this.activada;
    }
}
