/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package araneda.nicole.Models;

/**
 *
 * @author Pc
 */
public class Motor {
    private String modelo;
    private String fabricante;
    private int potencia;
    private int peso;
    private int cantidad;
    private int optimo;

    public Motor()
    {}
    
    public Motor(String modelo, String fabricante,
            int potencia, int peso, int cantidad, int optimo)
    {
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.potencia = potencia;
        this.peso = peso;
        this.cantidad = cantidad;
        this.optimo = (peso/potencia);
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }
    
    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
    
    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    public int getOptimo() {
        return optimo;
    }

    public void setOptimo(int optimo) {
        this.optimo = optimo;
    }
    
}
