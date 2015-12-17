package PuntoVenta;

import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;

public class GuardaEventos implements Serializable {

    ArrayList<Evento> ListRecuperada = new ArrayList<Evento>();

    ArrayList<Evento> leer() {
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("Evento.dat"));

            ListRecuperada = (ArrayList<Evento>) in.readObject();
            //System.out.println("Se ha leido");
        } catch (Exception e) {
            //System.out.println("No se ha leido");
        }
        return ListRecuperada;
    }

    void serializar(ArrayList<Evento> ListaSeriar) {
        try {
            //System.out.println("Se ha Serializado");
            FileOutputStream out = new FileOutputStream("Evento.dat");
            ObjectOutputStream objOut = new ObjectOutputStream(out);
            objOut.writeObject(ListaSeriar);
            objOut.close();
        } catch (Exception e) {
            System.out.println(e);
            System.out.println(e.getLocalizedMessage());
            e.printStackTrace();
            System.out.println(e.getMessage());
        }

    }

}
