package com.codebind.demo;

public class Tablacontrol {

    private final char[] tablacontrol = {'T', 'R', 'W', 'A', 'G', 'M',
            'Y', 'F', 'P', 'D', 'X', 'B',
            'N', 'J', 'Z', 'S', 'Q', 'V',
            'H', 'L', 'C', 'K', 'E'};

    char get_letra_tabla(int position) throws ArrayIndexOutOfBoundsException {
        try {
            return this.tablacontrol[position];
        } catch (ArrayIndexOutOfBoundsException exception) {
            throw new ArrayIndexOutOfBoundsException("The position is out of bounds");
        }
    }

    private int get_modulo() {
        return this.tablacontrol.length;
    }

    char calcular_letra(String DNI) {
        int dni = Integer.parseInt(DNI);
        int posicion = dni % get_modulo();
        return get_letra_tabla(posicion);
    }
}
