/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaces;
import conexionbd.ConexionBD;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author ERNESTO GARCIA
 */
public class AltaPaquete extends javax.swing.JFrame {

    /**
     * Creates new form AltaPaquete
     */
    public AltaPaquete() {
        initComponents();
        this.setTitle("Registro de paquetes");
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        RB_Fragil_si = new javax.swing.JRadioButton();
        RB_Fragil_no = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        TF_Nombre = new javax.swing.JTextField();
        TF_Destino = new javax.swing.JTextField();
        RB_TE_Espress = new javax.swing.JRadioButton();
        RB_TE_Extandar = new javax.swing.JRadioButton();
        CB_ClaseEnvio = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        CB_Forma = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        TA_Descripcion = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        TF_Peso = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Boton_Guardar = new javax.swing.JButton();
        Boton_Limpiar = new javax.swing.JButton();
        Boton_Regreso = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(153, 255, 204));

        jLabel1.setFont(new java.awt.Font("Kristen ITC", 0, 12)); // NOI18N
        jLabel1.setText("Remitente");

        jLabel2.setFont(new java.awt.Font("Kristen ITC", 0, 12)); // NOI18N
        jLabel2.setText("Destinatario");

        jLabel3.setFont(new java.awt.Font("Kristen ITC", 0, 12)); // NOI18N
        jLabel3.setText("¿Es fragil?");

        RB_Fragil_si.setText("si");
        RB_Fragil_si.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RB_Fragil_siActionPerformed(evt);
            }
        });

        RB_Fragil_no.setText("No");
        RB_Fragil_no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RB_Fragil_noActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Kristen ITC", 0, 12)); // NOI18N
        jLabel4.setText("Tipo de envio");

        jLabel5.setFont(new java.awt.Font("Kristen ITC", 0, 12)); // NOI18N
        jLabel5.setText("Alta de Paquetes ");

        TF_Nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TF_NombreActionPerformed(evt);
            }
        });

        TF_Destino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TF_DestinoActionPerformed(evt);
            }
        });

        RB_TE_Espress.setText("Expres");
        RB_TE_Espress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RB_TE_EspressActionPerformed(evt);
            }
        });

        RB_TE_Extandar.setText("Extandar");
        RB_TE_Extandar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RB_TE_ExtandarActionPerformed(evt);
            }
        });

        CB_ClaseEnvio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elige una opcion", "Punto", "Reembolso", "Domicilio", "Punto de trabajo" }));
        CB_ClaseEnvio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_ClaseEnvioActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Kristen ITC", 0, 12)); // NOI18N
        jLabel6.setText("Clase de envio");

        jLabel7.setFont(new java.awt.Font("Kristen ITC", 0, 12)); // NOI18N
        jLabel7.setText("Forma");

        CB_Forma.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione la forma", "Terrestre", "Maritimos ", "Aereo", " " }));
        CB_Forma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_FormaActionPerformed(evt);
            }
        });

        TA_Descripcion.setColumns(20);
        TA_Descripcion.setFont(new java.awt.Font("Kristen ITC", 0, 12)); // NOI18N
        TA_Descripcion.setRows(5);
        jScrollPane1.setViewportView(TA_Descripcion);
        TA_Descripcion.getAccessibleContext().setAccessibleName("Detalles de envio");
        TA_Descripcion.getAccessibleContext().setAccessibleDescription("Detalles de envio");

        jLabel8.setFont(new java.awt.Font("Kristen ITC", 0, 12)); // NOI18N
        jLabel8.setText("Peso");

        TF_Peso.setText("Peso KG");
        TF_Peso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TF_PesoActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Kristen ITC", 0, 12)); // NOI18N
        jLabel9.setText("Descripcion");

        jPanel1.setBackground(new java.awt.Color(153, 255, 204));

        Boton_Guardar.setText("Guardar");
        Boton_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_GuardarActionPerformed(evt);
            }
        });

        Boton_Limpiar.setText("Limpiar");
        Boton_Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_LimpiarActionPerformed(evt);
            }
        });

        Boton_Regreso.setText("Regresar");
        Boton_Regreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_RegresoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(Boton_Guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addComponent(Boton_Limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92)
                .addComponent(Boton_Regreso, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Boton_Guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Boton_Limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Boton_Regreso, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        Boton_Guardar.getAccessibleContext().setAccessibleParent(Boton_Guardar);
        Boton_Limpiar.getAccessibleContext().setAccessibleParent(Boton_Limpiar);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(TF_Destino, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(106, 106, 106)
                                .addComponent(jLabel7)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(TF_Peso)
                                    .addComponent(CB_Forma, 0, 208, Short.MAX_VALUE)
                                    .addComponent(CB_ClaseEnvio, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(51, 51, 51)
                                        .addComponent(jLabel5))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(207, 207, 207)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGap(21, 21, 21)
                                                .addComponent(jLabel6))
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGap(12, 12, 12)
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(RB_TE_Extandar)
                                                    .addComponent(RB_TE_Espress)))))))
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TF_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(63, 63, 63)
                                .addComponent(jLabel8)))
                        .addGap(0, 88, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel3)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(RB_Fragil_si)
                        .addGap(29, 29, 29)
                        .addComponent(RB_Fragil_no)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(24, 24, 24)))
                        .addComponent(TF_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(RB_TE_Espress)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(RB_TE_Extandar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TF_Destino, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(RB_Fragil_si)
                            .addComponent(RB_Fragil_no)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CB_ClaseEnvio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CB_Forma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TF_Peso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Boton_LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_LimpiarActionPerformed
        // TODO add your handling code here:
       
        TA_Descripcion.setText(" ");
        TF_Destino.setText(" ");
        TF_Nombre.setText(" ");
        TF_Peso.setText(" ");
    }//GEN-LAST:event_Boton_LimpiarActionPerformed

    private void RB_Fragil_siActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RB_Fragil_siActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RB_Fragil_siActionPerformed

    private void TF_DestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TF_DestinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TF_DestinoActionPerformed

    private void RB_Fragil_noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RB_Fragil_noActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RB_Fragil_noActionPerformed

    private void Boton_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_GuardarActionPerformed
       String remitente= TF_Nombre.getText();
       String Destinatario= TF_Destino.getText();
       String Fragil= RB_Fragil_si.isSelected()? "Si" : "No";
       double peso= 0.0;
       String Clase="";
       String Tipo= RB_TE_Espress.isSelected()? "Express":"Estandar";
       String Forma="";
       String Detalle= TA_Descripcion.getText();
       
       //exepcion para numeros 
       try{
           peso= Double.parseDouble(TF_Peso.getText());
       }catch(NumberFormatException ex){
           JOptionPane.showMessageDialog(null, "El valor de peso no es valido");
           return;
       }
       
       //Guardar las clase de envios de los paqutes 
       
        String claseString = (String) CB_ClaseEnvio.getSelectedItem();
        if (claseString != null && !claseString.isEmpty()) {
            Clase = claseString;
        } else {
            JOptionPane.showMessageDialog(null, "Selecciona un valor de clase de envio.");
            return;
        }
        
        //Guarda las forma de los paquetes 
        String formaString = (String) CB_Forma.getSelectedItem();
        if (formaString != null && !formaString.isEmpty()) {
            Forma = formaString;
        } else {
            JOptionPane.showMessageDialog(null, "Selecciona un valor de forma de envio.");
            return;
        }
        
        //Objecto para la coneccion 
        ConexionBD con= new ConexionBD();
        Connection connection = con.conexion();
        
         if (connection != null) {
            try {
                String existsQuery = "SELECT COUNT(*) FROM paqueteria WHERE remitente = ?";
                try (PreparedStatement existsStatement = connection.prepareStatement(existsQuery)) {
                    existsStatement.setString(1, remitente);
                    ResultSet existsResult = existsStatement.executeQuery();
                    if (existsResult.next() && existsResult.getInt(1) > 0) {
                        JOptionPane.showMessageDialog(null, "El paquete ya existe en la base de datos.");
                        return;
                    }
                }

                String insertQuery = "INSERT INTO paqueteria (remitente, destinatario, tipo, fragil, peso, clase, forma, detalles) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
                try (PreparedStatement preparedStatement = connection.prepareStatement(insertQuery)) {
                    preparedStatement.setString(1, remitente);
                    preparedStatement.setString(2, Destinatario);
                    preparedStatement.setString(3, Tipo);
                    preparedStatement.setString(4, Fragil);
                    preparedStatement.setDouble(5, peso);
                    preparedStatement.setString(6, Clase);
                    preparedStatement.setString(7, Forma);
                    preparedStatement.setString(8, Detalle);

                    preparedStatement.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Registro guardado exitosamente.");
                }

            } catch (SQLException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(null, "Error al guardar el registro.");
            } finally {
                try {
                    if (connection != null) {
                        connection.close();
                    }
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo conectar a la base de datos.");
        }
    
                
        
    }//GEN-LAST:event_Boton_GuardarActionPerformed

    private void Boton_RegresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_RegresoActionPerformed
        // TODO add your handling code here:
        MostraPaquetes MS = new MostraPaquetes();
        MS.setVisible(true);
    }//GEN-LAST:event_Boton_RegresoActionPerformed

    private void TF_PesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TF_PesoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TF_PesoActionPerformed

    private void CB_FormaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_FormaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CB_FormaActionPerformed

    private void CB_ClaseEnvioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_ClaseEnvioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CB_ClaseEnvioActionPerformed

    private void RB_TE_ExtandarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RB_TE_ExtandarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RB_TE_ExtandarActionPerformed

    private void RB_TE_EspressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RB_TE_EspressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RB_TE_EspressActionPerformed

    private void TF_NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TF_NombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TF_NombreActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AltaPaquete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AltaPaquete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AltaPaquete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AltaPaquete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AltaPaquete().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Boton_Guardar;
    private javax.swing.JButton Boton_Limpiar;
    private javax.swing.JButton Boton_Regreso;
    private javax.swing.JComboBox<String> CB_ClaseEnvio;
    private javax.swing.JComboBox<String> CB_Forma;
    private javax.swing.JRadioButton RB_Fragil_no;
    private javax.swing.JRadioButton RB_Fragil_si;
    private javax.swing.JRadioButton RB_TE_Espress;
    private javax.swing.JRadioButton RB_TE_Extandar;
    private javax.swing.JTextArea TA_Descripcion;
    private javax.swing.JTextField TF_Destino;
    private javax.swing.JTextField TF_Nombre;
    private javax.swing.JTextField TF_Peso;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
