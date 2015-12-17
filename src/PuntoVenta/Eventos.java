/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PuntoVenta;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author Erick
 */
public class Eventos extends javax.swing.JFrame implements Serializable {

    public static Cancion cancion;

    static ArrayList<Evento> lEventos = new ArrayList<Evento>();
    static GuardaEventos gEventos;
    
//    static ArrayList<Asiento> lAsientos = new ArrayList<Asiento>();
//    static GuardaAsientos gAsientos;
//    static GuardaAsientos2 gAsientos2;
//    static GuardaAsientos3 gAsientos3;

    public Eventos() {
        initComponents();
        cancion = new Cancion();
//        gEventos = new GuardaEventos();
//        lEventos = gEventos.leer();
//        //System.out.println(lEventos);
//        
//        gAsientos = new GuardaAsientos();
//        lAsientos = gAsientos.leer();
//        System.out.println(lAsientos);
//        
//        gAsientos2 = new GuardaAsientos2();
//        lAsientos = gAsientos2.leer();
//        System.out.println(lAsientos);
//        
//        gAsientos3 = new GuardaAsientos3();
//        lAsientos = gAsientos3.leer();
//        System.out.println(lAsientos);
        
        cancion.start();
        lista.addListSelectionListener(list);
        btnComprar.addActionListener(botones);
        txtInfo.setLineWrap(true);
        txtInfo.setWrapStyleWord(true);
    }

    public ActionListener botones = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ae) {
            if (ae.getSource() == btnComprar) {
                dispose();
                switch (lista.getSelectedIndex()) {
                    case 0:
                        new Compra(0).setVisible(true);
                        break;
                    case 1:
                        new Compra(1).setVisible(true);
                        break;
                    case 2:
                        new Compra(2).setVisible(true);
                        break;
                }
            }
        }
    };

    ListSelectionListener list = new ListSelectionListener() {
        @Override
        public void valueChanged(ListSelectionEvent lse) {
            gEventos = new GuardaEventos();
            lEventos = gEventos.leer();
            if (lse.getSource() == lista) {
                if (lse.getValueIsAdjusting()) {
                    switch (lista.getSelectedIndex()) {
                        case 0:
                            txtInfo.setText(lEventos.get(0).getDescripcion());
                            break;
                        case 1:
                            txtInfo.setText(lEventos.get(1).getDescripcion());
                            break;
                        case 2:
                            txtInfo.setText(lEventos.get(2).getDescripcion());
                            break;
                        default:
                            break;
                    }
                }
            }
        }

    };

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnComprar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtInfo = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        lista = new javax.swing.JList();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 204, 204));
        setSize(new java.awt.Dimension(1920, 1200));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/bienvenidos.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 340, 120));

        jLabel3.setFont(new java.awt.Font("Tempus Sans ITC", 1, 22)); // NOI18N
        jLabel3.setText("Evento a Seleccionar");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 220, 40));

        btnComprar.setText("Comprar");
        getContentPane().add(btnComprar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, -1, -1));

        txtInfo.setBackground(new java.awt.Color(240, 240, 240));
        txtInfo.setColumns(20);
        txtInfo.setRows(5);
        jScrollPane2.setViewportView(txtInfo);
        txtInfo.setEditable(false);

        txtInfo.setText("");

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, -1, -1));

        lista.setBackground(null);
        lista.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Cirque du Soleil", "Circo de los Horrores", "My Little Pony" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(lista);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/megatron_dark_wallpaper___free_desktop_background-1024x640.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 340));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 120, 100));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnComprar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList lista;
    private javax.swing.JTextArea txtInfo;
    // End of variables declaration//GEN-END:variables
}
