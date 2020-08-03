package org.lasencinas;

public class Circulo extends FiguraGeometrica{


    private double radio;
    private final double PI = Math.PI;

    public Circulo(){};

    public Circulo(int radio) {
        setRadio(radio);
    }

    public Circulo(String nombre, int radio) {
        super(nombre);
        setRadio(radio);
    }


    public double getRadio() {
        return radio;
    }


    public void setRadio(double radio) {
        this.radio = radio;
    }


    @Override
    public double area() {
        return PI * Math.pow(getRadio(), 2);
    }

}
