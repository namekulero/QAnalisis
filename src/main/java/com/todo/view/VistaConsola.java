package com.todo.view;

import com.todo.controller.Controlador;

import java.util.Scanner;

public class VistaConsola {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        menuPrincipal();
    }

    public static void menuPrincipal() {
        while(true) {
            System.out.println("Escoja la opción a ejecutar:");
            System.out.println("1. Crear tarea");
            System.out.println("2. Acabar tarea");
            System.out.println("3. Buscar tarea");
            System.out.println("4. Borrar tarea");
            System.out.println("5. Cerrar programa");

            switch (Integer.parseInt(scanner.nextLine())) {
                default:
                    System.out.println("Escoja una opción válida--");
                    break;
                case 1:
                    crearTarea();
                    break;
                case 2:
                    acabarTarea();
                    break;
                case 3:
                    buscarTarea();
                    break;
                case 4:
                    borrarTarea();
                    break;
                case 5:
                    return;
            }
        }
    }

    private static void crearTarea() {
        System.out.println("Ingrese el título de la tarea a crear:");
        String titulo = scanner.nextLine();
        System.out.println("Ingrese la descripción de la tarea:");
        String descripcion = scanner.nextLine();

        if(!Controlador.isTareaPresente(titulo)) {
            Controlador.crearTarea(titulo, descripcion);
            System.out.println("\nLa tarea fue creada exitosamente\n\n");
        } else {
            System.out.println("\nERROR: El nombre de la tarea ingresada ya está presente\n\n");
        }
    }

    private static void acabarTarea() {
        System.out.println("Ingrese el título de la tarea a terminar:");
        String titulo = scanner.nextLine();
        if(Controlador.isTareaPresente(titulo)) {
            Controlador.acabarTarea(titulo);
            System.out.println("\nLa tarea fue terminada exitosamente\n\n");
        } else {
            System.out.println("\nERROR: Ingrese el nombre de una tarea existente\n\n");
        }
    }

    private static void buscarTarea() {
        System.out.println("Ingrese el título de la tarea a buscar:");
        String titulo = scanner.nextLine();
        if(Controlador.isTareaPresente(titulo)) {
            System.out.println("Descripción de la tarea:\n" + Controlador.getDescripcion(titulo));
            if(Controlador.getEstado(titulo)) {
                System.out.println("La tarea ya ha sido acabada\n\n");
            } else {
                System.out.println("La tarea aún no ha sido acabada\n\n");
            }
        } else {
            System.out.println("\nERROR: Ingrese el nombre de una tarea existente\n\n");
        }
    }

    private static void borrarTarea() {
        System.out.println("Ingrese el título de la tarea a borrar:");
        String titulo = scanner.nextLine();
        if(Controlador.isTareaPresente(titulo)) {
            Controlador.borrarTarea(titulo);
            System.out.println("\nLa tarea fue borrada exitosamente\n\n");
        } else {
            System.out.println("\nERROR: Ingrese el nombre de una tarea existente\n\n");
        }
    }
}
