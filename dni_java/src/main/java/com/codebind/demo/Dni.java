package com.codebind.demo;

public class Dni  {
    private final String dni;
    private final int LONGITUD_DNI = 9;
    private Boolean numero = false;
    private Boolean letra = false;

    private Tablacontrol tabla = new Tablacontrol();

    public Dni(String dni) {
        this.dni = dni;
    }

    private String get_dni(){
        return this.dni;

    }
    private void String set_numero(Boolean value){
        this.numero = value;


    }
    private void String set_letra(Boolean value){
        this.letra = value;
    }

    private Boolean is_numero(){
        return this.numero;
    }


    private Boolean is_letra(){
        return this.letra;
    }



}