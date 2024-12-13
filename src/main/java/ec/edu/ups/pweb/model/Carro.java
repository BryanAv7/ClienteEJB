/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.pweb.model;

import java.io.Serializable;

/**
 *
 * @author
 */
public class Carro implements Serializable {

    private static final long serialVersionUID = 1L;

    //  Atributos
    private String placa;
    private String modelo;
    private String marca;

    
     // Métodos getter y setter
    
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
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

    @Override
    public String toString() {
        return "Carro{" + "placa=" + placa + ", modelo=" + modelo + ", marca=" + marca + '}';
    }
    
    
}
