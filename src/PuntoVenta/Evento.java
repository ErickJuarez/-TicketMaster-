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
public class Evento implements Serializable {
    String nombre, descripcion;
    int id;
    
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setDescripcion(String descripcion){
        this.descripcion=descripcion;
    }
    public void setId(int id){
        this.id=id;
    }
    public String getNombre(){
        return nombre;
    }
    public String getDescripcion(){
        return descripcion;
    }
    public int getId(){
        return id;
    }
}
