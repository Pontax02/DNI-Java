package com.codebind.demo;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
public class Dni_Test {




   private static final String[] casos_test = {"78484464T","72376173A","01817200Q","95882054E","63587725Q",
           "26861694V","21616083Q","26868974Y","40135330P","89044648X",
           "80117501Z","34168723S","76857238R","66714505S","66499420A"};

    @Test
    public void parte_numerica_test(){
        Dni objeto_dni = null;
        for(String dni : casos_test){
            objeto_dni = new Dni(dni);
            assertTrue(
                    objeto_dni.check_parte_numerica(objeto_dni.get_parte_numerica())
            );


        }


    }





}