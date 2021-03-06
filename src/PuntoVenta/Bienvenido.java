package PuntoVenta;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Serializable;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Erick
 */
public class Bienvenido extends javax.swing.JFrame implements Serializable{

    GuardaAsientos gAsientos;
    GuardaAsientos2 gAsientos2;
    GuardaAsientos3 gAsientos3;
    GuardaEventos gEventos;

    public Bienvenido() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Punto de Venta");
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/ticketmaster_logo.svg")).getImage());
        btnIngresar.addActionListener(botones);
        btnInformacion.addActionListener(botones);
        gAsientos = new GuardaAsientos();
        gAsientos2 = new GuardaAsientos2();
        gAsientos3 = new GuardaAsientos3();
        gEventos = new GuardaEventos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnIngresar = new javax.swing.JButton();
        btnInformacion = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnIngresar.setText("Ingresar");
        getContentPane().add(btnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, -1, -1));

        btnInformacion.setText("Informacion");
        getContentPane().add(btnInformacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 230, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logo_esr.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 90));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ticketmaster.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 270, 80));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo.jpg"))); // NOI18N
        lblFondo.setText("jLabel2");
        getContentPane().add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 404, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public ActionListener botones = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ae) {
            if (ae.getSource() == btnIngresar) {
                if(gEventos.leer().isEmpty()){
                    Asientos.ingresarEvento("Solei", "El Circus Du Solei es el evento más grande, una espectacular noche que no dejará de sorprenderte", 0);
                    Asientos.ingresarEvento("Pony", "Un gran día para tus pequeñines con toda la magia de los Caballitos", 1);
                    Asientos.ingresarEvento("Horror", "Vive el miedo como si no pudieras escapar de él", 2);
                    //System.out.println(Asientos.lEventos);
                    gEventos.serializar(Asientos.lEventos);
                }
                if (gAsientos.leer().isEmpty()) {
                    for (int i = 0; i < 10; i++) {
                        Asientos.ingresarAsiento(100.0, true, i);
                    }
                    for (int i = 0; i < 10; i++) {
                        Asientos.ingresarAsiento2(150.0, true, i);
                    }
                    for (int i = 0; i < 10; i++) {
                        Asientos.ingresarAsiento3(200.0, true, i);
                    }
                    //System.out.println(Asientos.lAsientos);
                    gAsientos.serializar(Asientos.lAsientos);
                    gAsientos2.serializar(Asientos.lAsientos2);
                    gAsientos3.serializar(Asientos.lAsientos3);
                }
                new Eventos().setVisible(true);
                dispose();
            } else if (ae.getSource() == btnInformacion) {
                JOptionPane.showMessageDialog(null, "Version: 1.0     Autor: Erick");
            }
        }

    };
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInformacion;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblFondo;
    // End of variables declaration//GEN-END:variables
}
