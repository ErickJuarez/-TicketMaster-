/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PuntoVenta;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Erick
 */
public class Asientos implements Serializable{
    static Asiento asiento[] = new Asiento[20];
    static Asiento asiento2[] = new Asiento[20];
    static Asiento asiento3[] = new Asiento[20];
    static Evento evento[] = new Evento[5];
    static ArrayList<Asiento> lAsientos = new ArrayList<Asiento>();
    static ArrayList<Asiento> lAsientos2 = new ArrayList<Asiento>();
    static ArrayList<Asiento> lAsientos3 = new ArrayList<Asiento>();
    static ArrayList<Evento> lEventos = new ArrayList<Evento>();
    static GuardaAsientos asien;
    static GuardaAsientos2 asien2;
    static GuardaAsientos3 asien3;
    static GuardaEventos events;
    static int cuentaAsientos = 0, cuentaAsientos2 = 0, cuentaAsientos3 = 0;
    static int cuentaEventos = 0;
    
    public static void actualizaDatos(int numero, boolean disponible) {
        asien=new GuardaAsientos();
        lAsientos=asien.leer();
        for (int i = 0; i < lAsientos.size(); i++) {
            if (numero == lAsientos.get(i).getNumero()) {
                lAsientos.get(i).setDisponible(disponible);
            }
        }
    }
    public static void actualizaDatos2(int numero, boolean disponible) {
        asien2=new GuardaAsientos2();
        lAsientos2=asien2.leer();
        for (int i = 0; i < lAsientos2.size(); i++) {
            if (numero == lAsientos2.get(i).getNumero()) {
                lAsientos2.get(i).setDisponible(disponible);
            }
        }
    }
    public static void actualizaDatos3(int numero, boolean disponible) {
        asien3=new GuardaAsientos3();
        lAsientos3=asien3.leer();
        for (int i = 0; i < lAsientos3.size(); i++) {
            if (numero == lAsientos3.get(i).getNumero()) {
                lAsientos3.get(i).setDisponible(disponible);
            }
        }
    }
    
    public static void ingresarAsiento(double precio, boolean disponible, int numero) {
        Asiento asi = new Asiento();
        asi.setDisponible(true);
        asi.setNumero(numero);
        asi.setPrecio(precio);
        asiento[cuentaAsientos] = asi;
        lAsientos.add(asi);
        cuentaAsientos++;
    }
    public static void ingresarAsiento2(double precio, boolean disponible, int numero) {
        Asiento asi = new Asiento();
        asi.setDisponible(true);
        asi.setNumero(numero);
        asi.setPrecio(precio);
        asiento2[cuentaAsientos2] = asi;
        lAsientos2.add(asi);
        cuentaAsientos2++;
    }
    public static void ingresarAsiento3(double precio, boolean disponible, int numero) {
        Asiento asi = new Asiento();
        asi.setDisponible(true);
        asi.setNumero(numero);
        asi.setPrecio(precio);
        asiento3[cuentaAsientos3] = asi;
        lAsientos3.add(asi);
        cuentaAsientos3++;
    }
    
    public static void ingresarEvento(String nombre, String descripcion, int id) {
        Evento evt = new Evento();
        evt.setDescripcion(descripcion);
        evt.setNombre(nombre);
        evt.setId(id);
        evento[cuentaEventos] = evt;
        lEventos.add(evt);
        cuentaEventos++;
    }
}
