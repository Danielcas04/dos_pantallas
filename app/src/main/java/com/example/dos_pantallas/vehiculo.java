package com.example.dos_pantallas;

public class vehiculo {
    public String color;
    public String tamano;
    public String N_sillas;
    public String ano;
    public String placa;
    public String kilometraje;

     vehiculo(String color, String tamano, String N_sillas, String ano, String placa, String kilometraje) {

        this.color = "";
        this.tamano = "";
        this.N_sillas = "";
        this.ano = "";
        this.placa = "";
        this.kilometraje="";
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public String getN_sillas() {
        return N_sillas;
    }

    public void setN_sillas(String n_sillas) {
        N_sillas = n_sillas;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(String kilometraje) {
        this.kilometraje = kilometraje;
    }
    vehiculo (String color, String tamano, String peso, String N_sillas, String ano, String placa, String kilometraje){



    }
}

