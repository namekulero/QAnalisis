package com.todo.model;

import java.util.HashMap;

public class Modelo {
    private static HashMap<String, Tarea> mapTareas = new HashMap<>();

    public static void crearTarea(String titulo, String descripcion) {
        Tarea tarea = new Tarea(titulo, descripcion);
        anadirTarea(tarea);
    }

    public static void anadirTarea(Tarea tarea) {
        mapTareas.put(tarea.getTitulo(), tarea);
    }

    public static void eliminarTarea(String titulo) {
        mapTareas.remove(titulo);
    }

    public static void acabarTarea(String titulo) {
        Tarea tareaAcabada = mapTareas.get(titulo);
        tareaAcabada.acabarTarea();
        mapTareas.put(tareaAcabada.getTitulo(), tareaAcabada);
    }

    public static String getDescripcion(String titulo) {
        return mapTareas.get(titulo).getDescripcion();
    }

    public static boolean getEstado(String titulo) {
        return mapTareas.get(titulo).isFinished();
    }
    public static boolean isPresente(String titulo) {
        return mapTareas.containsKey(titulo);
    }

}
