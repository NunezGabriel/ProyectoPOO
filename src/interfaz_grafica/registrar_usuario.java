/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaz_grafica;

import clase_concreta.paciente_clase;

public class registrar_usuario extends javax.swing.JFrame {

    
    
    
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

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
        jPanel1.setLayout(null);

        genero_usuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Masculino", "Femenino" }));
        genero_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genero_usuarioActionPerformed(evt);
            }
        });
        jPanel1.add(genero_usuario);
        genero_usuario.setBounds(380, 140, 150, 22);

        jLabel7.setBackground(new java.awt.Color(204, 204, 204));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("DD/MM/YYYY");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(160, 340, 66, 14);

        jLabel10.setText("Género:");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(380, 110, 41, 16);

        jButton2.setBackground(new java.awt.Color(15, 196, 167));
        jButton2.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("ENVIAR");
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(270, 450, 160, 60);

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(204, 204, 204));
        jLabel15.setText("Nombre");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(160, 230, 38, 14);

        jLabel19.setText("Número de teléfono:");
        jPanel1.add(jLabel19);
        jLabel19.setBounds(380, 320, 110, 16);

        jLabel20.setText("Fecha de Nacimiento:");
        jPanel1.add(jLabel20);
        jLabel20.setBounds(160, 320, 115, 16);

        jLabel3.setText("Nombres y Apellidos:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(160, 200, 113, 16);

        jLabel21.setText("Documento de identidad (DNI):");
        jPanel1.add(jLabel21);
        jLabel21.setBounds(160, 110, 166, 16);

        jLabel8.setBackground(new java.awt.Color(204, 204, 204));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("Apellido");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(380, 230, 39, 14);

        camp_DNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                camp_DNIActionPerformed(evt);
            }
        });
        jPanel1.add(camp_DNI);
        camp_DNI.setBounds(160, 140, 160, 22);
        jPanel1.add(campApellido);
        campApellido.setBounds(380, 250, 150, 22);
        jPanel1.add(camp_Nombre);
        camp_Nombre.setBounds(160, 250, 150, 22);
        jPanel1.add(campFecha_nac);
        campFecha_nac.setBounds(160, 360, 150, 22);
        jPanel1.add(campTelefono);
        campTelefono.setBounds(380, 360, 150, 22);

        jPanel2.setBackground(new java.awt.Color(48, 49, 75));
        jPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("REGISTRAR USUARIO");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(230, 30, 248, 30);

        jButton3.setBackground(new java.awt.Color(48, 49, 75));
        jButton3.setFont(new java.awt.Font("Bahnschrift", 1, 36)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("<");
        jButton3.setBorder(null);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3);
        jButton3.setBounds(60, 20, 44, 44);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 690, 80);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 686, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 563, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        
        paciente_clase p=new paciente_clase(dni, nombre, apellido, genero, celular, fecha_nac);
                    
        p.registrar_paciente(dni, nombre, apellido, genero, celular, fecha_nac);
        menu_principal ventanaCita = new menu_principal();
        ventanaCita.setVisible(true);
        ventanaCita.setLocationRelativeTo(null);
        this.setVisible(false);
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

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Login ventanaLogin = new Login();
        ventanaLogin.setVisible(true);
        ventanaLogin.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed


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
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
