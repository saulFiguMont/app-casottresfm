/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.ejemplo.app;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;



class AppTest {

    @Test
    void saludoDevuelveMensajeCorrecto() {
        assertEquals("Hola, Ana!", App.saludo("Ana"));
    }
}