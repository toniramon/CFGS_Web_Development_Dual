package org.lasencinas;

public class Cuadrado extends FiguraGeometrica {

    private double lado;


    public Cuadrado(){};

    public Cuadrado(int radio) {
        setLado(radio);
    }


    public Cuadrado(String nombre, double lado) {
        super(nombre);
        setLado(lado);
    }


    public void setLado(double lado) {
        this.lado = lado;
    }


    public double getLado() {
        return lado;
    }


    @Override
    public double area() {
        return Math.pow(getLado(), 2);
    }

}
