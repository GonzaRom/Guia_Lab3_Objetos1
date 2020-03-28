package com.clases;

public class Geometria {
    private String nombre = "Rectangulo";
    private double alto;
    private double ancho;
/*
    public Geometria(double alto, double ancho) {
        this.alto = alto;
        this.ancho = ancho;
    }
*/

    public Geometria() {
        this.alto = 1.0;
        this.ancho = 1.0;
    }

    public void setAlto(double altura) {
        this.alto = altura;
    }

    public double getAlto() {
        return this.alto;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public String getNombre() {
        return nombre;
    }

    public double calcArea() {
        double area = 0;
        area = this.alto * this.ancho;

        return area;
    }

    public double calcPerimetro() {
        double perimetro = 0;
        perimetro = 2 * (this.ancho + this.alto);

        return perimetro;
    }

    public void mostrarAyP ( ){
        System.out.println("Area y Perimetro de la instancia:\n");
        System.out.println("Area de la figura " + nombre + " es " + calcArea());
        System.out.println("Perimetro de la figura " + nombre + " es " + calcPerimetro());
    }
}
