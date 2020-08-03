package org.lasencinas.numerosRomanos;

public enum NumerosRomanos {

    I (1),
    V (5),
    X (10),
    L (50),
    C (100),
    D (500),
    M (1000),
    IV(4),
    IX(9),
    XL(40),
    XC(90),
    CD(400),
    CM(900);

    //ATRIBUTOS

    int numero = 0;

    private NumerosRomanos(int numero) {
        this.numero = numero;
    }

    //GETTERS

    public int getNumero() {
        return this.numero;
    }
}
