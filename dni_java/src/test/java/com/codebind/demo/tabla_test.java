package com.codebind.demo.Tablacontrol;

import org.junit.Test;
import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;
import org.junit.BeforeClass;

public class Tabla_test {

    private static Tablacontrol tabla;

    @BeforClass
    public static void crearTabla(){
        tabla = new tablacontrol();


    }


    @Test
    public void get_letra_tabla_Test() {
        assertEquals('T', tabla.get_letra_tabla(0));
        assertEquals('N', tabla.get_letra_tabla(22));
    }
}