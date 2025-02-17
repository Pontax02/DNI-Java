package com.codebind.demo;

import static org.junit.Assert.assertEquals;
import org.junit.BeforeClass;
import org.junit.Test;

public class Tabla_Test {

    private static Tablacontrol tabla;

    @BeforeClass
    public static void crearTabla() {
        tabla = new Tablacontrol();
    }






    @Test
    public void get_letra_tabla_Test() {
        assertEquals('T',tabla.get_letra_tabla(0));
        assertEquals('E',tabla.get_letra_tabla(22));
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void get_letra_fuera_rango_Test() {
        tabla.get_letra_tabla(100);
    }




}