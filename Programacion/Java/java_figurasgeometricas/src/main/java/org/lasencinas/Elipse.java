package org.lasencinas;

public class Elipse extends FiguraGeometrica{

    // area = pi * ladocorto * ladolargo
    private double ladoCorto;
    private double ladoLargo;
    private final double PI = Math.PI;

    public Elipse() {}

    public Elipse(double ladoCorto, double ladoLargo) {
        super();
        this.ladoCorto = ladoCorto;
        this.ladoLargo = ladoLargo;
    }

    public Elipse(String nombre, double ladoCorto, double ladoLargo) {
        super(nombre);
        this.ladoCorto = ladoCorto;
        this.ladoLargo = ladoLargo;
    }

    public double getLadoCorto() {
        return ladoCorto;
    }

    public double getLadoLargo() {
        return ladoLargo;
    }

    @Override
    public double area() {
        return Math.pow(getLadoCorto() * getLadoLargo() * PI, 2);
    }

}
