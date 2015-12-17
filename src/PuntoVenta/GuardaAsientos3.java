package PuntoVenta;

import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;

public class GuardaAsientos3 implements Serializable {

    ArrayList<Asiento> ListRecuperada = new ArrayList<Asiento>();

    ArrayList<Asiento> leer() {
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("Asiento3.dat"));

            ListRecuperada = (ArrayList<Asiento>) in.readObject();
            //System.out.println("Se ha leido");
        } catch (Exception e) {
            //System.out.println("No se ha leido");
        }
        return ListRecuperada;
    }

    void serializar(ArrayList<Asiento> ListaSeriar) {
        try {
            System.out.println("Se ha Serializado");
            FileOutputStream out = new FileOutputStream("Asiento3.dat");
            ObjectOutputStream objOut = new ObjectOutputStream(out);
            objOut.writeObject(ListaSeriar);
            objOut.close();
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }

    }

}
