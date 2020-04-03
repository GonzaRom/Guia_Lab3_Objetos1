package com.clases;

public class Hora {
    private int hora;
    private int minutos;
    private int segundos;

    public Hora(int h, int m, int s) {
        if (h >= 24) System.out.println("Hora no valida.");
        else hora = h;
        if (m >= 60) {
            hora += (m / 60);
            minutos += m % 60;
        } else minutos = m;
        if (s >= 60) {
            minutos += (m / 60);
            segundos += m % 60;
        } else segundos = s;
    }


    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        if (hora >= 24) System.out.println("Hora no valida.");
        else this.hora = hora;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        if (minutos >= 60) this.hora += ((minutos / 60) % 10);
        this.minutos = minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    public void queHora() {
        System.out.println(hora + ":" + minutos + ":" + segundos);
    }

    public void unSegMas() {
        if (segundos >= 59) {
            setMinutos(++this.minutos);
            segundos = 0;
        } else ++segundos;
    }

    public void unSegMenos() {
        if (segundos == 0) {
            --minutos;
            segundos = 59;
        } else --segundos;
    }
}
