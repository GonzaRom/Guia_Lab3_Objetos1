package com.clases;

public class Empleado {
    private int dni = 0;
    private String nombre;
    private String apellido;
    private double salario = 0;

    public Empleado(int dni, String apellido, double salario, String nombre) {
        this.apellido = apellido;
        this.dni = dni;
        this.salario = salario;
        this.nombre = nombre;
    }


    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido(String s) {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double calcSalAnual() {
        double anual = 0;
        anual = this.salario * 12;
        return anual;
    }

    public void aumentaSalari(double porcen) {
        double nuevo = 0;
        nuevo = ((porcen * this.salario) / 100);
        nuevo += this.salario;
        setSalario(nuevo);
    }

    public void muestraEmp() {
        System.out.println("EMPLEADO: DNI= " + this.dni + ", NOMBRE= " + this.nombre + ", APELLIDO= " + this.apellido + ", SALARIO= $" + this.salario);
        /*System.out.println("DNI     : "+this.dni);
        System.out.println("NOMBRE  : "+this.nombre);
        System.out.println("APELLIDO: "+this.apellido);
        System.out.println("SALARIO : $"+this.salario);*/
    }
}
