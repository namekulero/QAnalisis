package com.todo.controller;

import com.todo.model.Modelo;

public class Controlador {
    public static boolean isTareaPresente(String titulo) {
        return Modelo.isPresente(titulo);
    }

    public static void crearTarea(String titulo, String descripcion) {
        Modelo.crearTarea(titulo, descripcion);
    }

    public static void acabarTarea(String titulo) {
        Modelo.acabarTarea(titulo);
    }

    public static String getDescripcion(String titulo) {
        return Modelo.getDescripcion(titulo);
    }

    public static boolean getEstado(String titulo) {
        return Modelo.getEstado(titulo);
    }

    public static void borrarTarea(String titulo) {
        Modelo.eliminarTarea(titulo);
    }
}
