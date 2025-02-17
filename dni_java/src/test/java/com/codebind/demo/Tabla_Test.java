package com.codebind.demo;

import java.util.List;
import static org.junit.Assert.assertEquals;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.assertTrue;

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

    private static boolean calcular_letra_tabla_Test(List<String> casos_test, Tablacontrol tabla){

        for (String dni : casos_test) {

            String parte_numerica_dni = dni.substring(0, dni.length() - 1);
            char letra_dni = dni.charAt(dni.length() - 1);

            if (tabla.calcular_letra( parte_numerica_dni ) == letra_dni) {
                continue;
            } else {
                return false;
            }
        }
        return true;
    }

    @Test
    public void calcular_letra_permitida_Test() {

        String[] casos_test = {
                "78484464T","72376173A","01817200Q","95882054E","63587725Q",
                "26861694V","21616083Q","26868974Y","40135330P","89044648X",
                "80117501Z","34168723S","76857238R","66714505S","66499420A"};

        assertTrue(calcular_letra_tabla_Test(List.of(casos_test), tabla));
    }

}