/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PuntoVenta;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Erick
 */
public class Compra extends javax.swing.JFrame implements Serializable {

    String asientos = "";
    double sub, tot, iva, linea1 = 150, linea2 = 100, linea3 = 50;
    int evt;
    Asientos asien;
    GuardaAsientos gAsientos0;
    GuardaAsientos2 gAsientos1;
    GuardaAsientos3 gAsientos2;
    static ArrayList<Asiento> lAsientos, lAsientos2, lAsientos3;

    public Compra(int evt) {
        initComponents();

        this.evt=evt;
        jCheck1.addItemListener(item);
        jCheck2.addItemListener(item);
        jCheck3.addItemListener(item);
        jCheck4.addItemListener(item);
        jCheck5.addItemListener(item);
        jCheck6.addItemListener(item);
        jCheck7.addItemListener(item);
        jCheck8.addItemListener(item);
        jCheck9.addItemListener(item);
        txtSub.setEditable(false);
        txtSub.setText("0.0");
        txtTotal.setEditable(false);
        txtIva.setEditable(false);

        lAsientos = new ArrayList<Asiento>();
        lAsientos2 = new ArrayList<Asiento>();
        lAsientos3 = new ArrayList<Asiento>();
        gAsientos0 = new GuardaAsientos();
        gAsientos1 = new GuardaAsientos2();
        gAsientos2 = new GuardaAsientos3();

        btnComprar.addActionListener(botones);
        switch (evt) {
            case 0:
                lAsientos = gAsientos0.leer();
                verifica();
                break;
            case 1:
                lAsientos2 = gAsientos1.leer();
                verifica2();
                break;
            case 2:
                lAsientos3 = gAsientos2.leer();
                verifica3();
                break;
        }
        //System.out.println(lAsientos);        
    }
    ActionListener botones = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ae) {
            if (ae.getSource() == btnComprar) {
                if (jCheck1.isSelected()) {
                    jCheck1.setEnabled(false);
                }
                if (jCheck2.isSelected()) {
                    jCheck2.setEnabled(false);
                }
                if (jCheck3.isSelected()) {
                    jCheck3.setEnabled(false);
                }
                if (jCheck4.isSelected()) {
                    jCheck4.setEnabled(false);
                }
                if (jCheck5.isSelected()) {
                    jCheck5.setEnabled(false);
                }
                if (jCheck6.isSelected()) {
                    jCheck6.setEnabled(false);
                }
                if (jCheck7.isSelected()) {
                    jCheck7.setEnabled(false);
                }
                if (jCheck8.isSelected()) {
                    jCheck8.setEnabled(false);
                }
                if (jCheck9.isSelected()) {
                    jCheck9.setEnabled(false);
                }

                JOptionPane.showMessageDialog(null, "Ha comprado con éxito");
                sub = 0;
                tot = 0;
                iva = 0;
                txtSub.setText("0.0");
                txtTotal.setText("0.0");
                txtIva.setText("0.0");
                txtAsientos.setText("");
                //JOptionPane.showConfirmDialog(null, "Desea otra Compra?", "Mensaje de Aviso", WIDTH);
                Eventos.cancion.stop();
                Eventos.cancion.interrupt();
                dispose();
                new Bienvenido().setVisible(true);
            }
        }
    };
    ItemListener item = new ItemListener() {
        public void itemStateChanged(ItemEvent ie) {
            if (ie.getSource() == jCheck1) {
                if (jCheck1.isSelected()) {
                    asientos = txtAsientos.getText();
                    asientos += "1, ";
                    txtAsientos.setText(asientos);

                    sub = Double.parseDouble(txtSub.getText());
                    sub += linea1;
                    txtSub.setText(String.valueOf(sub));

                    switch (evt) {
                        case 0:
                            Asientos.actualizaDatos(0, false);
                            gAsientos0.serializar(Asientos.lAsientos);
                            break;
                        case 1:
                            Asientos.actualizaDatos2(0, false);
                            gAsientos1.serializar(Asientos.lAsientos2);
                            break;
                        case 2:
                            Asientos.actualizaDatos3(0, false);
                            gAsientos2.serializar(Asientos.lAsientos3);
                            break;
                    }

                } else {
                    asientos = txtAsientos.getText();
                    asientos = asientos.replace("1, ", "");
                    txtAsientos.setText(asientos);

                    sub = Double.parseDouble(txtSub.getText());
                    sub -= linea1;
                    txtSub.setText(String.valueOf(sub));

                    switch (evt) {
                        case 0:
                            Asientos.actualizaDatos(0, true);
                            gAsientos0.serializar(Asientos.lAsientos);
                            break;
                        case 1:
                            Asientos.actualizaDatos2(0, true);
                            gAsientos1.serializar(Asientos.lAsientos2);
                            break;
                        case 2:
                            Asientos.actualizaDatos3(0, true);
                            gAsientos2.serializar(Asientos.lAsientos3);
                            break;
                    }
                }
            }
            if (ie.getSource() == jCheck2) {
                if (jCheck2.isSelected()) {
                    asientos = txtAsientos.getText();
                    asientos += "2, ";
                    txtAsientos.setText(asientos);

                    sub = Double.parseDouble(txtSub.getText());
                    sub += linea1;
                    txtSub.setText(String.valueOf(sub));

                    switch (evt) {
                        case 0:
                            Asientos.actualizaDatos(1, false);
                            gAsientos0.serializar(Asientos.lAsientos);
                            break;
                        case 1:
                            Asientos.actualizaDatos2(1, false);
                            gAsientos1.serializar(Asientos.lAsientos2);
                            break;
                        case 2:
                            Asientos.actualizaDatos3(1, false);
                            gAsientos2.serializar(Asientos.lAsientos3);
                            break;
                    }

                } else {
                    asientos = txtAsientos.getText();
                    asientos = asientos.replace("2, ", "");
                    txtAsientos.setText(asientos);

                    sub = Double.parseDouble(txtSub.getText());
                    sub -= linea1;
                    txtSub.setText(String.valueOf(sub));

                    switch (evt) {
                        case 0:
                            Asientos.actualizaDatos(1, true);
                            gAsientos0.serializar(Asientos.lAsientos);
                            break;
                        case 1:
                            Asientos.actualizaDatos2(1, true);
                            gAsientos1.serializar(Asientos.lAsientos2);
                            break;
                        case 2:
                            Asientos.actualizaDatos3(1, true);
                            gAsientos2.serializar(Asientos.lAsientos3);
                            break;
                    }
                }
            }
            if (ie.getSource() == jCheck3) {
                if (ie.getStateChange() == 1) {
                    asientos = txtAsientos.getText();
                    asientos += "3, ";
                    txtAsientos.setText(asientos);

                    sub = Double.parseDouble(txtSub.getText());
                    sub += linea2;
                    txtSub.setText(String.valueOf(sub));

                    switch (evt) {
                        case 0:
                            Asientos.actualizaDatos(2, false);
                            gAsientos0.serializar(Asientos.lAsientos);
                            break;
                        case 1:
                            Asientos.actualizaDatos2(2, false);
                            gAsientos1.serializar(Asientos.lAsientos2);
                            break;
                        case 2:
                            Asientos.actualizaDatos3(2, false);
                            gAsientos2.serializar(Asientos.lAsientos3);
                            break;
                    }
                } else {
                    asientos = txtAsientos.getText();
                    asientos = asientos.replace("3, ", "");
                    txtAsientos.setText(asientos);

                    sub = Double.parseDouble(txtSub.getText());
                    sub -= linea2;
                    txtSub.setText(String.valueOf(sub));

                    switch (evt) {
                        case 0:
                            Asientos.actualizaDatos(2, true);
                            gAsientos0.serializar(Asientos.lAsientos);
                            break;
                        case 1:
                            Asientos.actualizaDatos2(2, true);
                            gAsientos1.serializar(Asientos.lAsientos2);
                            break;
                        case 2:
                            Asientos.actualizaDatos3(2, true);
                            gAsientos2.serializar(Asientos.lAsientos3);
                            break;
                    }
                }
            }
            if (ie.getSource() == jCheck4) {
                if (ie.getStateChange() == 1) {
                    asientos = txtAsientos.getText();
                    asientos += "4, ";
                    txtAsientos.setText(asientos);

                    sub = Double.parseDouble(txtSub.getText());
                    sub += linea2;
                    txtSub.setText(String.valueOf(sub));

                    switch (evt) {
                        case 0:
                            Asientos.actualizaDatos(3, false);
                            gAsientos0.serializar(Asientos.lAsientos);
                            break;
                        case 1:
                            Asientos.actualizaDatos2(3, false);
                            gAsientos1.serializar(Asientos.lAsientos2);
                            break;
                        case 2:
                            Asientos.actualizaDatos3(3, false);
                            gAsientos2.serializar(Asientos.lAsientos3);
                            break;
                    }
                } else {
                    asientos = txtAsientos.getText();
                    asientos = asientos.replace("4, ", "");
                    txtAsientos.setText(asientos);

                    sub = Double.parseDouble(txtSub.getText());
                    sub -= linea2;
                    txtSub.setText(String.valueOf(sub));

                    switch (evt) {
                        case 0:
                            Asientos.actualizaDatos(3, true);
                            gAsientos0.serializar(Asientos.lAsientos);
                            break;
                        case 1:
                            Asientos.actualizaDatos2(3, true);
                            gAsientos1.serializar(Asientos.lAsientos2);
                            break;
                        case 2:
                            Asientos.actualizaDatos3(3, true);
                            gAsientos2.serializar(Asientos.lAsientos3);
                            break;
                    }
                }
            }
            if (ie.getSource() == jCheck5) {
                if (ie.getStateChange() == 1) {
                    asientos = txtAsientos.getText();
                    asientos += "5, ";
                    txtAsientos.setText(asientos);

                    sub = Double.parseDouble(txtSub.getText());
                    sub += linea2;
                    txtSub.setText(String.valueOf(sub));

                    switch (evt) {
                        case 0:
                            Asientos.actualizaDatos(4, false);
                            gAsientos0.serializar(Asientos.lAsientos);
                            break;
                        case 1:
                            Asientos.actualizaDatos2(4, false);
                            gAsientos1.serializar(Asientos.lAsientos2);
                            break;
                        case 2:
                            Asientos.actualizaDatos3(4, false);
                            gAsientos2.serializar(Asientos.lAsientos3);
                            break;
                    }
                } else {
                    asientos = txtAsientos.getText();
                    asientos = asientos.replace("5, ", "");
                    txtAsientos.setText(asientos);

                    sub = Double.parseDouble(txtSub.getText());
                    sub -= linea2;
                    txtSub.setText(String.valueOf(sub));

                    switch (evt) {
                        case 0:
                            Asientos.actualizaDatos(4, true);
                            gAsientos0.serializar(Asientos.lAsientos);
                            break;
                        case 1:
                            Asientos.actualizaDatos2(4, true);
                            gAsientos1.serializar(Asientos.lAsientos2);
                            break;
                        case 2:
                            Asientos.actualizaDatos3(4, true);
                            gAsientos2.serializar(Asientos.lAsientos3);
                            break;
                    }
                }
            }
            if (ie.getSource() == jCheck6) {
                if (ie.getStateChange() == 1) {
                    asientos = txtAsientos.getText();
                    asientos += "6, ";
                    txtAsientos.setText(asientos);

                    sub = Double.parseDouble(txtSub.getText());
                    sub += linea3;
                    txtSub.setText(String.valueOf(sub));

                    switch (evt) {
                        case 0:
                            Asientos.actualizaDatos(5, false);
                            gAsientos0.serializar(Asientos.lAsientos);
                            break;
                        case 1:
                            Asientos.actualizaDatos2(5, false);
                            gAsientos1.serializar(Asientos.lAsientos2);
                            break;
                        case 2:
                            Asientos.actualizaDatos3(5, false);
                            gAsientos2.serializar(Asientos.lAsientos3);
                            break;
                    }
                } else {
                    asientos = txtAsientos.getText();
                    asientos = asientos.replace("6, ", "");
                    txtAsientos.setText(asientos);

                    sub = Double.parseDouble(txtSub.getText());
                    sub -= linea3;
                    txtSub.setText(String.valueOf(sub));

                    switch (evt) {
                        case 0:
                            Asientos.actualizaDatos(5, true);
                            gAsientos0.serializar(Asientos.lAsientos);
                            break;
                        case 1:
                            Asientos.actualizaDatos2(5, true);
                            gAsientos1.serializar(Asientos.lAsientos2);
                            break;
                        case 2:
                            Asientos.actualizaDatos3(5, true);
                            gAsientos2.serializar(Asientos.lAsientos3);
                            break;
                    }
                }
            }
            if (ie.getSource() == jCheck7) {
                if (ie.getStateChange() == 1) {
                    asientos = txtAsientos.getText();
                    asientos += "7, ";
                    txtAsientos.setText(asientos);

                    sub = Double.parseDouble(txtSub.getText());
                    sub += linea3;
                    txtSub.setText(String.valueOf(sub));

                    switch (evt) {
                        case 0:
                            Asientos.actualizaDatos(6, false);
                            gAsientos0.serializar(Asientos.lAsientos);
                            break;
                        case 1:
                            Asientos.actualizaDatos2(6, false);
                            gAsientos1.serializar(Asientos.lAsientos2);
                            break;
                        case 2:
                            Asientos.actualizaDatos3(6, false);
                            gAsientos2.serializar(Asientos.lAsientos3);
                            break;
                    }
                } else {
                    asientos = txtAsientos.getText();
                    asientos = asientos.replace("7, ", "");
                    txtAsientos.setText(asientos);

                    sub = Double.parseDouble(txtSub.getText());
                    sub -= linea3;
                    txtSub.setText(String.valueOf(sub));

                    switch (evt) {
                        case 0:
                            Asientos.actualizaDatos(6, true);
                            gAsientos0.serializar(Asientos.lAsientos);
                            break;
                        case 1:
                            Asientos.actualizaDatos2(6, true);
                            gAsientos1.serializar(Asientos.lAsientos2);
                            break;
                        case 2:
                            Asientos.actualizaDatos3(6, true);
                            gAsientos2.serializar(Asientos.lAsientos3);
                            break;
                    }
                }
            }
            if (ie.getSource() == jCheck8) {
                if (ie.getStateChange() == 1) {
                    asientos = txtAsientos.getText();
                    asientos += "8, ";
                    txtAsientos.setText(asientos);

                    sub = Double.parseDouble(txtSub.getText());
                    sub += linea3;
                    txtSub.setText(String.valueOf(sub));

                    switch (evt) {
                        case 0:
                            Asientos.actualizaDatos(7, false);
                            gAsientos0.serializar(Asientos.lAsientos);
                            break;
                        case 1:
                            Asientos.actualizaDatos2(7, false);
                            gAsientos1.serializar(Asientos.lAsientos2);
                            break;
                        case 2:
                            Asientos.actualizaDatos3(7, false);
                            gAsientos2.serializar(Asientos.lAsientos3);
                            break;
                    }
                } else {
                    asientos = txtAsientos.getText();
                    asientos = asientos.replace("8, ", "");
                    txtAsientos.setText(asientos);

                    sub = Double.parseDouble(txtSub.getText());
                    sub -= linea3;
                    txtSub.setText(String.valueOf(sub));

                    switch (evt) {
                        case 0:
                            Asientos.actualizaDatos(7, true);
                            gAsientos0.serializar(Asientos.lAsientos);
                            break;
                        case 1:
                            Asientos.actualizaDatos2(7, true);
                            gAsientos1.serializar(Asientos.lAsientos2);
                            break;
                        case 2:
                            Asientos.actualizaDatos3(7, true);
                            gAsientos2.serializar(Asientos.lAsientos3);
                            break;
                    }
                }
            }
            if (ie.getSource() == jCheck9) {
                if (ie.getStateChange() == 1) {
                    asientos = txtAsientos.getText();
                    asientos += "9, ";
                    txtAsientos.setText(asientos);

                    sub = Double.parseDouble(txtSub.getText());
                    sub += linea3;
                    txtSub.setText(String.valueOf(sub));

                    switch (evt) {
                        case 0:
                            Asientos.actualizaDatos(8, false);
                            gAsientos0.serializar(Asientos.lAsientos);
                            break;
                        case 1:
                            Asientos.actualizaDatos2(8, false);
                            gAsientos1.serializar(Asientos.lAsientos2);
                            break;
                        case 2:
                            Asientos.actualizaDatos3(8, false);
                            gAsientos2.serializar(Asientos.lAsientos3);
                            break;
                    }
                } else {
                    asientos = txtAsientos.getText();
                    asientos = asientos.replace("9, ", "");
                    txtAsientos.setText(asientos);

                    sub = Double.parseDouble(txtSub.getText());
                    sub -= linea3;
                    txtSub.setText(String.valueOf(sub));

                    switch (evt) {
                        case 0:
                            Asientos.actualizaDatos(8, true);
                            gAsientos0.serializar(Asientos.lAsientos);
                            break;
                        case 1:
                            Asientos.actualizaDatos2(8, true);
                            gAsientos1.serializar(Asientos.lAsientos2);
                            break;
                        case 2:
                            Asientos.actualizaDatos3(8, true);
                            gAsientos2.serializar(Asientos.lAsientos3);
                            break;
                    }
                }
            }
            iva = Double.parseDouble(txtSub.getText()) * .16;
            tot = Double.parseDouble(txtSub.getText()) + iva;
            txtIva.setText(String.valueOf(iva));
            txtTotal.setText(String.valueOf(tot));
        }
    };

    public void verifica() {
        if (!lAsientos.get(0).getDisponible()) {
            jCheck1.setEnabled(false);
        }
        if (!lAsientos.get(1).getDisponible()) {
            jCheck2.setEnabled(false);
        }
        if (!lAsientos.get(2).getDisponible()) {
            jCheck3.setEnabled(false);
        }
        if (!lAsientos.get(3).getDisponible()) {
            jCheck4.setEnabled(false);
        }
        if (!lAsientos.get(4).getDisponible()) {
            jCheck5.setEnabled(false);
        }
        if (!lAsientos.get(5).getDisponible()) {
            jCheck6.setEnabled(false);
        }
        if (!lAsientos.get(6).getDisponible()) {
            jCheck7.setEnabled(false);
        }
        if (!lAsientos.get(7).getDisponible()) {
            jCheck8.setEnabled(false);
        }
        if (!lAsientos.get(8).getDisponible()) {
            jCheck9.setEnabled(false);
        }
    }

    public void verifica2() {
        if (!lAsientos2.get(0).getDisponible()) {
            jCheck1.setEnabled(false);
        }
        if (!lAsientos2.get(1).getDisponible()) {
            jCheck2.setEnabled(false);
        }
        if (!lAsientos2.get(2).getDisponible()) {
            jCheck3.setEnabled(false);
        }
        if (!lAsientos2.get(3).getDisponible()) {
            jCheck4.setEnabled(false);
        }
        if (!lAsientos2.get(4).getDisponible()) {
            jCheck5.setEnabled(false);
        }
        if (!lAsientos2.get(5).getDisponible()) {
            jCheck6.setEnabled(false);
        }
        if (!lAsientos2.get(6).getDisponible()) {
            jCheck7.setEnabled(false);
        }
        if (!lAsientos2.get(7).getDisponible()) {
            jCheck8.setEnabled(false);
        }
        if (!lAsientos2.get(8).getDisponible()) {
            jCheck9.setEnabled(false);
        }
    }

    public void verifica3() {
        if (!lAsientos3.get(0).getDisponible()) {
            jCheck1.setEnabled(false);
        }
        if (!lAsientos3.get(1).getDisponible()) {
            jCheck2.setEnabled(false);
        }
        if (!lAsientos3.get(2).getDisponible()) {
            jCheck3.setEnabled(false);
        }
        if (!lAsientos3.get(3).getDisponible()) {
            jCheck4.setEnabled(false);
        }
        if (!lAsientos3.get(4).getDisponible()) {
            jCheck5.setEnabled(false);
        }
        if (!lAsientos3.get(5).getDisponible()) {
            jCheck6.setEnabled(false);
        }
        if (!lAsientos3.get(6).getDisponible()) {
            jCheck7.setEnabled(false);
        }
        if (!lAsientos3.get(7).getDisponible()) {
            jCheck8.setEnabled(false);
        }
        if (!lAsientos3.get(8).getDisponible()) {
            jCheck9.setEnabled(false);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheck1 = new javax.swing.JCheckBox();
        jCheck2 = new javax.swing.JCheckBox();
        jCheck3 = new javax.swing.JCheckBox();
        jCheck4 = new javax.swing.JCheckBox();
        jCheck5 = new javax.swing.JCheckBox();
        jCheck6 = new javax.swing.JCheckBox();
        jCheck7 = new javax.swing.JCheckBox();
        jCheck8 = new javax.swing.JCheckBox();
        jCheck9 = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblCirque = new javax.swing.JLabel();
        btnComprar = new javax.swing.JButton();
        txtSub = new javax.swing.JTextField();
        txtAsientos = new javax.swing.JTextField();
        txtIva = new javax.swing.JTextField();
        txtTotal = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jCheck1.setText("1");
        getContentPane().add(jCheck1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, -1, -1));

        jCheck2.setText("2");
        getContentPane().add(jCheck2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, -1, -1));

        jCheck3.setText("3");
        getContentPane().add(jCheck3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, -1, -1));

        jCheck4.setText("4");
        getContentPane().add(jCheck4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, -1, -1));

        jCheck5.setText("5");
        getContentPane().add(jCheck5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, -1, -1));

        jCheck6.setText("6");
        getContentPane().add(jCheck6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        jCheck7.setText("7");
        getContentPane().add(jCheck7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, -1, -1));

        jCheck8.setText("8");
        getContentPane().add(jCheck8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, -1, -1));

        jCheck9.setText("9");
        getContentPane().add(jCheck9, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/پرده پذیرایی 13.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 150, 40));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Ha seleccionado");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 30, 130, 20));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("los asientos:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 50, 100, 20));

        jLabel5.setFont(new java.awt.Font("Viner Hand ITC", 0, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setText("Asientos");
        jLabel5.setToolTipText("");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 140, 40));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("SubTotal");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 120, 50, 20));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("IVA");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 160, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Total");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 240, -1, -1));

        lblCirque.setFont(new java.awt.Font("Vivaldi", 0, 36)); // NOI18N
        lblCirque.setForeground(new java.awt.Color(102, 255, 51));
        lblCirque.setText("Cirque Du Solei");
        getContentPane().add(lblCirque, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 250, 30));

        btnComprar.setText("Comprar");
        getContentPane().add(btnComprar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 260, -1, -1));
        getContentPane().add(txtSub, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 120, 90, -1));
        getContentPane().add(txtAsientos, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 80, 130, -1));
        getContentPane().add(txtIva, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 160, 90, -1));
        getContentPane().add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 240, 90, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Gnome_wallpapers_382.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnComprar;
    private javax.swing.JCheckBox jCheck1;
    private javax.swing.JCheckBox jCheck2;
    private javax.swing.JCheckBox jCheck3;
    private javax.swing.JCheckBox jCheck4;
    private javax.swing.JCheckBox jCheck5;
    private javax.swing.JCheckBox jCheck6;
    private javax.swing.JCheckBox jCheck7;
    private javax.swing.JCheckBox jCheck8;
    private javax.swing.JCheckBox jCheck9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lblCirque;
    private javax.swing.JTextField txtAsientos;
    private javax.swing.JTextField txtIva;
    private javax.swing.JTextField txtSub;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
