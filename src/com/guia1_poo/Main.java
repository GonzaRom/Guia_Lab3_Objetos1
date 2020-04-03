package com.guia1_poo;


import com.clases.*;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    static Scanner scanner;

    public static void main(String[] args) throws InterruptedException {
        scanner = new Scanner(System.in);

        String control = "SI";
        double salAnual = 0;
        double balance = 0;
        int opcion = 0;
        int opcion2 = 0;

        Geometria figura1 = new Geometria();
        Empleado empB = new Empleado(33953781,"Gutiérrez",25000,"Carlos");
        Empleado empA = new Empleado(34234123,"Sánchez",27500,"Ana");
        Items item = new Items(1, "Lata de choclo", 260, 3.50);
        CtaCte cuenta1 = new CtaCte("Gonzalo", 15000, 1);
        Hora hora = new Hora(10, 90, 110);


        System.out.println("Bienvenido:");
        do {
            System.out.println("---------------Menu Pricipal-------------------");
            System.out.println("Ejercicio 1: Modele el objeto Rectángulo.......");
            System.out.println("Ejercicio 2: Modele el objeto Empleado.........");
            System.out.println("Ejercicio 3: Modele el objeto Ítem de Venta....");
            System.out.println("Ejercicio 4: Modele el objeto Cuenta Corriente.");
            System.out.println("Ejercicio 5: Modele el objeto Hora.............");
            System.out.println("Precione 6 para SALIR");
            System.out.println("\nIndique el NUMERO del ejercicio que desea realizar:");
            // scanner.nextLine();
            opcion = Integer.parseInt(scanner.next());
            opcion2 = 0;

            switch (opcion) {
                case 1:
                    do {
                        System.out.println("\n1 Inicializar un objeto Rectángulo estableciendo ancho y alto.");
                        System.out.println("2 Imprimir por pantalla el alto y ancho.");
                        System.out.println("3 Imprimir por pantalla el área y perímetro.");
                        System.out.println("4 Modificar el alto y el ancho de la instancia.");
                        System.out.println("5 para Volver al menu principal");
                        System.out.println("\nIndique el NUMERO del ejercicio que desea realizar:");
                        //scanner.nextLine();
                        opcion2 = Integer.parseInt(scanner.next());

                        switch (opcion2) {
                            case 1:
                                figura1 = cargarFigura(figura1);
                                break;

                            case 2:
                                System.out.println("\nDimensiones de la figura:\nALTO: " + figura1.getAlto() + "\nANCHO: " + figura1.getAncho());
                                break;
                            case 3:
                                figura1.mostrarAyP();
                                break;
                            case 4:
                                System.out.println("Desea modificar las dimensiones de la figura:.....SI/NO");
                                control = scanner.nextLine();
                                figura1 = (control.equalsIgnoreCase("si")) ? modiFigura(figura1) : figura1;
                                System.out.println("Nuevos valores de Area y Perimetro:");
                                figura1.mostrarAyP();
                                break;
                            default:
                                System.out.println("OPCION NO VALIDA");
                        }
                    }
                    while (opcion2 != 5);
                    break;

                case 2:
                    do {
                        System.out.println("1 \nInicialice un empleado Carlos Gutiérrez, con dni 23456345 y salario inicial de\n" +
                                "25000.");
                        System.out.println("2 Inicialice un empleado Ana Sánchez, con dni 34234123 y salario inicial de\n" +
                                "27500.");
                        System.out.println("3 Imprimir Empleados por pantalla");
                        System.out.println("4 Aumente el salario del empleado Carlos en un 15% e imprima en pantalla el\n" +
                                "salario anual del mismo.");
                        System.out.println("5 Volver al Menu Principal.");
                        System.out.println("\nIndique el NUMERO del ejercicio que desea realizar:");

                        opcion2 = Integer.parseInt(scanner.next());
                        switch (opcion2) {
                            case 1:

                                System.out.println(".............EMPLEADO CREADO EXITOSAMENTE..........");
                                break;
                            case 2:

                                System.out.println(".............EMPLEADO CREADO EXITOSAMENTE..........");
                                break;
                            case 3:
                                System.out.println("\nEmpleado 1:");
                                empA.muestraEmp();
                                System.out.println("\nEmpleado 2:");
                                empB.muestraEmp();
                                break;
                            case 4:
                                empB.aumentaSalari(15);
                                System.out.println(".............SALARIO AUMENTADO EXITOSAMENTE........");
                                System.out.println("\nSalario anual de " + empB.getNombre() + " $" + (salAnual = empB.calcSalAnual()));
                                break;
                            default:
                                System.out.println("OPCION INVALIDA");
                        }
                    }
                    while (opcion2 != 5);

                case 3:
                    do {
                        System.out.println("1 Mostrar ItemVenta[id=?, descripción=?, cantidad=?, pUnitario=?, pTotal=?].");
                        System.out.println("2 Volver al menu principal");
                        System.out.println("\nIndique el NUMERO del ejercicio que desea realizar:");
                        opcion2 = Integer.parseInt(scanner.next());
                        switch (opcion2) {
                            case 1:
                                item.muestraItem();
                                break;
                            default:
                                System.out.println("OPCION INVALIDA");
                        }
                    } while (opcion2 != 2);
                case 4:
                    do {
                        System.out.println("1 Inicialice una cuenta con un monto inicial de 15000.");
                        System.out.println("2 Realice una operación de crédito de 2500.");
                        System.out.println("3 Realice una operación de compra de 1500.");
                        System.out.println("4 Realice una operación de compra de 30000.");
                        System.out.println("5 Imprimir por pantalla Cuenta Corriente");
                        System.out.println("6 Volver al menu principal");
                        System.out.println("\nIndique el NUMERO del ejercicio que desea realizar:");
                        opcion2 = Integer.parseInt(scanner.next());
                        switch (opcion2) {
                            case 1:
                                System.out.println(".....CUENTA INICILIZADA CORRECTAMENTE....");
                                cuenta1.resumen();
                                break;
                            case 2:
                                System.out.println("Credito otorgado por $2.500");
                                balance = cuenta1.credito(2500);
                                cuenta1.resumen();
                                break;
                            case 3:
                                System.out.println("\nCompra por 1500");
                                balance = cuenta1.debito(1500);
                                cuenta1.resumen();
                                break;
                            case 4:
                                System.out.println("\nCompra por 30.000");
                                balance = cuenta1.debito(30000);
                                cuenta1.resumen();
                                break;
                            case 5:
                                cuenta1.resumen();
                                break;
                            default:
                                System.out.println("OPCION INVALIDA");
                        }
                    } while (opcion2 != 6);

                case 5:
                    hora.queHora();
                    for (int i = 0; i < 30; i++) {
                        hora.unSegMas();
                        hora.queHora();
                        Thread.sleep(900);
                    }
                    for (int i = 0; i < 30; i++) {
                        hora.unSegMenos();
                        hora.queHora();
                        Thread.sleep(900);
                    }
                    break;
                default:
                    System.out.println("OPCION INVALIDA");
            }
        } while (opcion != 6);

    }

    private static Geometria cargarFigura(Geometria figura) {
        double alto = 0;
        double ancho = 0;

        System.out.println("Ingrese altura del Rectangulo:");
        alto = scanner.nextDouble();


        System.out.println("Ingrese ancho del Rectangulo:");
        ancho = scanner.nextDouble();

        figura.setAlto(alto);
        figura.setAncho(ancho);

        return figura;
    }

    private static Geometria modiFigura(Geometria figura1) {
        String aModificar;
        String control = "SI";
        double alto = 0;
        double ancho = 0;
        do {
            System.out.println("Modifican ALTO o ANCHO ?");
            aModificar = scanner.nextLine();
            if ((aModificar.equalsIgnoreCase("ALTO"))) {
                System.out.println("ALTO: ");
                figura1.setAlto(alto = scanner.nextDouble());
            } else {
                System.out.println("ANCHO: ");
                figura1.setAncho(ancho = scanner.nextDouble());
            }
            System.out.println("Modificar otro valor ? ");

            scanner.nextLine();
            control = scanner.nextLine();
        }
        while (control.equalsIgnoreCase("si"));

        return figura1;
    }


    private static Empleado cargarEmp(Empleado E) {
        String nombre;
        String apellido;
        int dni = 0;
        double salario = 0;


        System.out.println("Ingrese Nombre del empleado:");
        E.setNombre(nombre = scanner.nextLine());

        System.out.println("Ingrese Apellido del empleado:");
        E.setApellido(apellido = scanner.nextLine());

        System.out.println("Ingrese DNI del empleado:");
        E.setDni(dni = scanner.nextInt());

        System.out.println("Ingrese Salario del empleado:");
        E.setSalario(salario = scanner.nextInt());
        scanner.nextLine();

        return E;
    }
}

