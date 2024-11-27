/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaz_grafica;

import javax.swing.JOptionPane;
import java.sql.*;
import operacion.Conexion_db;
import clase_abstracta.Paciente;

public class registrar_usuario extends javax.swing.JFrame {

    Conexion_db enlace = new Conexion_db();
    Connection conect = enlace.conexion();
    
    
    
    public registrar_usuario() {
        initComponents();
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        G_usuario = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        Num_usuario = new javax.swing.JTextField();
        f_nacimiento = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        camp_dni = new javax.swing.JTextField();
        N_usuario = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        A_usuario = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        con_usuario = new javax.swing.JFormattedTextField();
        camp_dni1 = new javax.swing.JTextField();
        A_usuario1 = new javax.swing.JTextField();
        N_usuario1 = new javax.swing.JTextField();
        con_usuario1 = new javax.swing.JFormattedTextField();
        Num_usuario1 = new javax.swing.JTextField();
        f_nacimiento1 = new javax.swing.JFormattedTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        genero_usuario = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        camp_DNI = new javax.swing.JTextField();
        campApellido = new javax.swing.JTextField();
        camp_Nombre = new javax.swing.JTextField();
        campFecha_nac = new javax.swing.JTextField();
        campTelefono = new javax.swing.JTextField();

        G_usuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Masculino", "Femenino" }));
        G_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G_usuarioActionPerformed(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(204, 204, 204));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Mayus, Minus, Nums");

        jLabel9.setText("Género:");

        jButton1.setBackground(new java.awt.Color(102, 255, 102));
        jButton1.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("GUARDAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 204, 204));
        jLabel13.setText("Nombre");

        jLabel14.setText("Número de teléfono:");

        jLabel16.setText("Fecha de Nacimiento:");

        Num_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Num_usuarioActionPerformed(evt);
            }
        });

        f_nacimiento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));

        jLabel2.setText("Nombres y Apellidos:");

        camp_dni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                camp_dniActionPerformed(evt);
            }
        });

        jLabel17.setText("Documento de identidad (DNI):");

        A_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A_usuarioActionPerformed(evt);
            }
        });

        jLabel18.setText("Contraseña:");

        jLabel5.setBackground(new java.awt.Color(204, 204, 204));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Apellido");

        con_usuario.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));

        camp_dni1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                camp_dni1ActionPerformed(evt);
            }
        });

        A_usuario1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A_usuario1ActionPerformed(evt);
            }
        });

        con_usuario1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));

        Num_usuario1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Num_usuario1ActionPerformed(evt);
            }
        });

        f_nacimiento1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));

        jTextField2.setText("jTextField2");

        jLabel22.setText("Contraseña:");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        genero_usuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Masculino", "Femenino" }));
        genero_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genero_usuarioActionPerformed(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(204, 204, 204));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("Año - mes -  dia");

        jLabel10.setText("Género:");

        jButton2.setBackground(new java.awt.Color(102, 255, 102));
        jButton2.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("ENVIAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(204, 204, 204));
        jLabel15.setText("Nombre");

        jLabel19.setText("Número de teléfono:");

        jLabel20.setText("Fecha de Nacimiento:");

        jLabel3.setText("Nombres y Apellidos:");

        jLabel21.setText("Documento de identidad (DNI):");

        jLabel8.setBackground(new java.awt.Color(204, 204, 204));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("Apellido");

        camp_DNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                camp_DNIActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel21)
                .addGap(64, 64, 64)
                .addComponent(jLabel10))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(camp_DNI, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(genero_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel3))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel15)
                .addGap(182, 182, 182)
                .addComponent(jLabel8))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(camp_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(campApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel20)
                .addGap(105, 105, 105)
                .addComponent(jLabel19))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel7))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(campFecha_nac, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(campTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21)
                    .addComponent(jLabel10))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(camp_DNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(genero_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addComponent(jLabel3)
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(jLabel8))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(camp_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20)
                    .addComponent(jLabel19))
                .addGap(4, 4, 4)
                .addComponent(jLabel7)
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campFecha_nac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void G_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_G_usuarioActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        

    }//GEN-LAST:event_jButton1ActionPerformed

    private void Num_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Num_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Num_usuarioActionPerformed

    private void camp_dniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_camp_dniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_camp_dniActionPerformed

    private void A_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_A_usuarioActionPerformed

    private void genero_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genero_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genero_usuarioActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        int dni = Integer.parseInt(camp_DNI.getText());
        String nombre = camp_Nombre.getText();
        String apellido = campApellido.getText();
        String genero = genero_usuario.getSelectedItem().toString();
        int celular = Integer.parseInt(campTelefono.getText());
        String fecha_nac = campFecha_nac.getText();
        
        Paciente p;
        p = new Paciente(dni, nombre, apellido, genero, celular, fecha_nac) {
            @Override
            public void registrar_paciente() {
                try {
                    PreparedStatement guardar_user = conect.prepareStatement("INSERT INTO Paciente(dni_paciente, Nombre, Apellido, Genero, Celular, Fecha_nacimiento) VALUES (?,?,?,?,?,?)");
                    guardar_user.setInt(1,dni);
                    guardar_user.setString(2,nombre);
                    guardar_user.setString(3, apellido);
                    guardar_user.setString(4, genero);
                    guardar_user.setInt(5,celular);
                    guardar_user.setString(6, fecha_nac);
                    guardar_user.executeUpdate();
                    JOptionPane.showMessageDialog(null, " Usuario agregado");
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e + " No se pudo agregar el usuario");
                }
            }
            
        };
        
        usuario user = new usuario();
        user.setDni_paciente(Integer.toString(dni));
        user.setNombre_paciente(nombre);
        user.setApellido_paciente(apellido);
        user.setGener_paciente(genero);
        user.setCelular_paciente(Integer.toString(celular));
        user.setFecha_nac(fecha_nac);

    }//GEN-LAST:event_jButton2ActionPerformed

    private void Num_usuario1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Num_usuario1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Num_usuario1ActionPerformed

    private void camp_dni1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_camp_dni1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_camp_dni1ActionPerformed

    private void A_usuario1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A_usuario1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_A_usuario1ActionPerformed

    private void camp_DNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_camp_DNIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_camp_DNIActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField A_usuario;
    private javax.swing.JTextField A_usuario1;
    private javax.swing.JComboBox<String> G_usuario;
    private javax.swing.JTextField N_usuario;
    private javax.swing.JTextField N_usuario1;
    private javax.swing.JTextField Num_usuario;
    private javax.swing.JTextField Num_usuario1;
    private javax.swing.JTextField campApellido;
    private javax.swing.JTextField campFecha_nac;
    private javax.swing.JTextField campTelefono;
    private javax.swing.JTextField camp_DNI;
    private javax.swing.JTextField camp_Nombre;
    private javax.swing.JTextField camp_dni;
    private javax.swing.JTextField camp_dni1;
    private javax.swing.JFormattedTextField con_usuario;
    private javax.swing.JFormattedTextField con_usuario1;
    private javax.swing.JFormattedTextField f_nacimiento;
    private javax.swing.JFormattedTextField f_nacimiento1;
    private javax.swing.JComboBox<String> genero_usuario;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
