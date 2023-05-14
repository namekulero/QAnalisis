package com.todo.model;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.TestInstance.Lifecycle.PER_CLASS;

@TestInstance(PER_CLASS)
class ModeloTest {

    @BeforeEach
    void inicioTest() {
        Modelo.crearTarea("test", "");
    }

    @org.junit.jupiter.api.Test
     void crearTarea() {
        assertEquals(true, Modelo.isPresente("test"));
    }

    @org.junit.jupiter.api.Test
    void acabarTarea() {
        Modelo.acabarTarea("test");
        assertEquals(true, Modelo.getEstado("test"));
    }

    @org.junit.jupiter.api.Test
    void eliminarTarea() {
        Modelo.eliminarTarea("test");
        assertEquals(false, Modelo.isPresente("test"));
    }
}