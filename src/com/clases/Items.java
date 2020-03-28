package com.clases;

import javax.swing.*;

public class Items {
    private int id = 0;
    private String desc;
    private int cant = 0;
    private double costo = 0;

    public Items(int id, String desc, int cant, double costo) {
        this.cant = cant;
        this.costo = costo;
        this.desc = desc;
        this.id = id;
    }

    public double costTotal() {
        double total = 0;
        total = this.cant * this.costo;

        return total;
    }

    public void muestraItem() {
        double total = 0;
        total = costTotal();
                System.out.println("ItemVenta: ID= " + this.id + ", DESC= " + this.desc + ", CANTIDAD= " + this.cant + ", pUnitario= $" + this.costo + ", pTotal= $" + total);
    }

}
