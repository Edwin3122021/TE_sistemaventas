
package com.emergentes.modelo;

public class Automovil {
    private int id_automovil;
    private String num_motor;
    private String modelo;
    private String marca;
    private String color;

    public Automovil() {
    }

    public int getId_automovil() {
        return id_automovil;
    }

    public void setId_automovil(int id_automovil) {
        this.id_automovil = id_automovil;
    }

    public String getNum_motor() {
        return num_motor;
    }

    public void setNum_motor(String num_motor) {
        this.num_motor = num_motor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Automovil{" + "id_automovil=" + id_automovil + ", num_motor=" + num_motor + ", modelo=" + modelo + ", marca=" + marca + ", color=" + color + '}';
    }
    
    
    
}
