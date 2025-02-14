package com.codebind.demo;

public class Tablacontrol {

    private final char[] tablacontrol = {'T', 'R', 'W', 'A', 'G', 'M',
            'Y', 'F', 'P', 'D', 'X', 'B',
            'N', 'J', 'Z', 'S', 'Q', 'V',
            'H', 'L', 'C', 'K', 'E'};

    Tablacontrol(){};

        char get_letra_tabla(int position) throws ArrayIndexOutOfBoundsException{
            try{
                return this.tablacontrol[position];
            }

            catch(ArrayIndexOutOfBoundsException exception){
                throw new ArrayIndexOutOfBoundsException("The position is out of bounds");




            }
    }

















}