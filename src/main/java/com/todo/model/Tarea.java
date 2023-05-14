package com.todo.model;

public class Tarea {
    private String titulo;
    private String descripcion;
    private boolean estado = false;

    public Tarea(String titulo, String descripcion) {
        this.titulo = titulo;
        this.descripcion = descripcion;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public boolean isFinished() {
        return estado;
    }

    public void acabarTarea() {
        this.estado = true;
    }
}
