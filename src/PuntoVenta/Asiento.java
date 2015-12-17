/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PuntoVenta;

import java.io.Serializable;

/**
 *
 * @author Erick
 */
public class Asiento implements Serializable {
    int numero;
    double precio;
    boolean disponible;

    public void setPrecio(double precio){
        this.precio=precio;
    }
    public void setDisponible(boolean disponible){
        this.disponible=disponible;
    }
    public void setNumero(int numero){
        this.numero=numero;
    }
    public double getPrecio(){
        return precio;
    }
    public boolean getDisponible(){
        return disponible;
    }
    public int getNumero(){
        return numero;
    }
}
