/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaz_grafica;

import operacion.Conexion_db;
import clase_abstracta.Cita_abstrac;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author 
 */
public class registrar_cita extends javax.swing.JFrame{
    Conexion_db enlace = new Conexion_db();
    Connection conect = enlace.conexion();
    public registrar_cita() {
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

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jLabel6 = new javax.swing.JLabel();
        jScrollBar1 = new javax.swing.JScrollBar();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        campNombre = new javax.swing.JTextField();
        campApellido = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        campNum = new javax.swing.JTextField();
        campEspecialidad = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        campDni = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        comboxEspecialidad = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        campFecha_cita = new javax.swing.JFormattedTextField();
        campHora_cita = new javax.swing.JFormattedTextField();
        jLabel18 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        retroBoton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        campCod_espec = new javax.swing.JTextField();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 524, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 75, Short.MAX_VALUE)
        );

        jLabel4.setText("Apellido");

        jLabel6.setText("Género");

        jLabel10.setText("jLabel10");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 204, 204));
        jLabel11.setText("Nombre");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 204, 204));
        jLabel12.setText("Nombre");

        jFormattedTextField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));

        campApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campApellidoActionPerformed(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(204, 204, 204));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Apellido");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 204, 204));
        jLabel13.setText("Nombre");

        jLabel2.setText("Nombre");

        jLabel14.setText("Número de teléfono");

        campNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campNumActionPerformed(evt);
            }
        });

        campEspecialidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campEspecialidadActionPerformed(evt);
            }
        });

        jLabel8.setText("Especialidad");

        jLabel17.setText("Documento de identidad (DNI)");

        campDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campDniActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Opcional");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(null);

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel3.add(jSeparator1);
        jSeparator1.setBounds(0, 56, 520, 3);

        comboxEspecialidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Cardiologia (123)", "Pediatria (456)", "Dermatologían(789)", "Gastroenterología (345)", " " }));
        comboxEspecialidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboxEspecialidadActionPerformed(evt);
            }
        });
        jPanel3.add(comboxEspecialidad);
        comboxEspecialidad.setBounds(170, 257, 159, 32);

        jLabel7.setText("Fecha de cita");
        jPanel3.add(jLabel7);
        jLabel7.setBounds(170, 119, 69, 16);

        jLabel9.setText("Especialidad");
        jPanel3.add(jLabel9);
        jLabel9.setBounds(170, 227, 65, 16);

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(204, 204, 204));
        jLabel15.setText("DD/MM/YY");
        jPanel3.add(jLabel15);
        jLabel15.setBounds(170, 179, 54, 14);

        jButton1.setBackground(new java.awt.Color(15, 196, 167));
        jButton1.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("ENVIAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1);
        jButton1.setBounds(279, 373, 180, 51);

        jLabel16.setText("Hora de cita");
        jPanel3.add(jLabel16);
        jLabel16.setBounds(409, 119, 64, 16);

        campFecha_cita.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));
        jPanel3.add(campFecha_cita);
        campFecha_cita.setBounds(170, 149, 160, 30);

        campHora_cita.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("h:mm "))));
        campHora_cita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campHora_citaActionPerformed(evt);
            }
        });
        jPanel3.add(campHora_cita);
        campHora_cita.setBounds(410, 149, 160, 30);

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(204, 204, 204));
        jLabel18.setText("HH:MM");
        jPanel3.add(jLabel18);
        jLabel18.setBounds(410, 179, 39, 14);

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));
        jPanel4.setForeground(new java.awt.Color(255, 255, 255));

        retroBoton.setBackground(new java.awt.Color(244, 245, 245));
        retroBoton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        retroBoton.setText("<");
        retroBoton.setBorder(null);
        retroBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retroBotonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Registra tu cita");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(retroBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(235, 235, 235)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(retroBoton, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel3.add(jPanel4);
        jPanel4.setBounds(0, 0, 780, 80);
        jPanel3.add(campCod_espec);
        campCod_espec.setBounds(410, 257, 160, 32);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(6, 6, 780, 520);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campApellidoActionPerformed

    private void campEspecialidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campEspecialidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campEspecialidadActionPerformed

    private void campDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campDniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campDniActionPerformed

    private void campNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campNumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campNumActionPerformed

    private void retroBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retroBotonActionPerformed
        menu_principal ventanaCita = new menu_principal();
        ventanaCita.setVisible(true);
        ventanaCita.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_retroBotonActionPerformed

    private void campHora_citaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campHora_citaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campHora_citaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Cita_abstrac c;
        String especialidad = comboxEspecialidad.getSelectedItem().toString();
        String hora_cita = campHora_cita.getText();
        String fecha_cita = campFecha_cita.getText();
        int cod_espec  = Integer.parseInt(campCod_espec.getText());
        c = new Cita_abstrac(fecha_cita, hora_cita, especialidad,cod_espec) {

            @Override
            public void registrar_cita() {
                try {
                    PreparedStatement guardar_esp = conect.prepareStatement("INSERT INTO ESPECIALIDAD(id_especialidad,Nombre_Espec) VALUES(?,?)");
                    guardar_esp.setInt(1,cod_espec);
                    guardar_esp.setString(2, especialidad);
                    guardar_esp.executeUpdate();
                    PreparedStatement guardar_cita = conect.prepareStatement("INSERT INTO Cita_Med(Fecha, Hora,id_especialidad) VALUES (?,?,?)");
                    guardar_cita.setString(1,fecha_cita);
                    guardar_cita.setString(2,hora_cita);
                    guardar_cita.setInt(3, cod_espec);
                    guardar_cita.executeUpdate();
                    JOptionPane.showMessageDialog(null, " Cita agendada");
                    campHora_cita.setText("");
                    campFecha_cita.setText("");
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e + " No se pudo agendar la cita");
                }
            }
        };
        c.registrar_cita();

        menu_principal ventanaCita = new menu_principal();
        ventanaCita.setVisible(true);
        ventanaCita.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void comboxEspecialidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboxEspecialidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboxEspecialidadActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField campApellido;
    private javax.swing.JTextField campCod_espec;
    private javax.swing.JTextField campDni;
    private javax.swing.JTextField campEspecialidad;
    private javax.swing.JFormattedTextField campFecha_cita;
    private javax.swing.JFormattedTextField campHora_cita;
    private javax.swing.JTextField campNombre;
    private javax.swing.JTextField campNum;
    private javax.swing.JComboBox<String> comboxEspecialidad;
    private javax.swing.JButton jButton1;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JButton retroBoton;
    // End of variables declaration//GEN-END:variables
}
