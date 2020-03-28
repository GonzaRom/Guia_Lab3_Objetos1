package com.clases;

public class CtaCte {

    private int id=0;
    private String nombre;
    private double balance=0;

    public CtaCte (String nombre,double balInicial,int id){
        this.balance=balInicial;
        this.nombre=nombre;
        this.id=id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double credito (double deposito){
        this.balance+=deposito;
        return balance;
    }

    public double debito(double extraccion){
        if(balance>=extraccion){
            balance-=extraccion;
        }
        else{
            System.out.println("---Fondos insuficiente para realizar la extraccion.");
        }
        return balance;
    }

    public void resumen(){
        System.out.println("id = " + id);
        System.out.println("nombre = " + nombre);
        System.out.println("balance = $" + balance);
    }
}
