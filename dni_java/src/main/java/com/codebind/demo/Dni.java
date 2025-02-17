package com.codebind.demo;

public class Dni {
    private final String dni;
    private final int LONGITUD_DNI = 9;
    private Boolean numero = false;
    private Boolean letra = false;

    private Tablacontrol tabla = new Tablacontrol();

    public Dni(String dni) {
        this.dni = dni;
    }

    private String get_dni() {
        return this.dni;

    }

    private void set_numero(Boolean value) {
        this.numero = value;
    }

    private void set_letra(Boolean value) {
        this.letra = value;
    }

    private Boolean is_numero() {
        return this.numero;
    }

    private Boolean is_letra() {
        return this.letra;
    }

    private int get_longitud() {
        return this.LONGITUD_DNI;
    }

    public String get_parte_numerica() {
        return get_dni().substring(0, LONGITUD_DNI - 1);
    }

    public Boolean is_dni_numero(String dni) {
        for (int i = 0; i < dni.length(); i++) {
            if (Character.isDigit(dni.charAt(i))) {
                return true;
            } else
                ;
        }
        return false;
    }

}