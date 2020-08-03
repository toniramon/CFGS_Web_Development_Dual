package org.lasencinas;

public class Rectangulo extends FiguraGeometrica{

    private double horizontal;
    private double vertical;

    public Rectangulo(){
        super(); /* invocamos al constructor sin parámetro de la superclase FiguraGeometrica */
    }

    public Rectangulo(double horizontal, double vertical) {
        super();
        setHorizontal(horizontal);
        setVertical(vertical);
    }


    public Rectangulo(String nombre, double horizontal, double vertical) {
        super(nombre);
        setHorizontal(horizontal);
        setVertical(vertical);
    }


    public double getHorizontal() {
        return horizontal;
    }

    public double getVertical() {
        return vertical;
    }

    public void setHorizontal(double horizontal) {
        this.horizontal = horizontal;
    }

    public void setVertical(double vertical) {
        this.vertical = vertical;
    }




    @Override
    public double area() {
        return getHorizontal() * getVertical();
    }

}
