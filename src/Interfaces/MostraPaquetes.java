/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaces;
import conexionbd.ConexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ERNESTO GARCIA
 */
public class MostraPaquetes extends javax.swing.JFrame {
private DefaultTableColumnModel model;
    /**
     * Creates new form MostraPaquetes
     */
    public MostraPaquetes() {
        initComponents();
        this.setTitle("Buscar");
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        TF_Busqueda_remitente = new javax.swing.JTextField();
        Boton_Buscar = new javax.swing.JButton();
        Boton_Limpiar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla_Busqueda = new javax.swing.JTable();
        Boton_Mostra = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        BT_Mover = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 255, 204));

        jLabel1.setFont(new java.awt.Font("Kristen ITC", 3, 12)); // NOI18N
        jLabel1.setText("Mostra paquetes del remitente");

        TF_Busqueda_remitente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TF_Busqueda_remitenteActionPerformed(evt);
            }
        });

        Boton_Buscar.setText("Buscar");
        Boton_Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_BuscarActionPerformed(evt);
            }
        });

        Boton_Limpiar.setText("Limpiar");
        Boton_Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_LimpiarActionPerformed(evt);
            }
        });

        Tabla_Busqueda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Remitente", "Destinatario", "Tipo", "Fragil", "Peso", "Clase", "Forma", "Detalles"
            }
        ));
        jScrollPane1.setViewportView(Tabla_Busqueda);

        Boton_Mostra.setText("Mostra");
        Boton_Mostra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_MostraActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Kristen ITC", 0, 12)); // NOI18N
        jLabel2.setText("Ingresa el Nombre del remitentes a buscar");

        BT_Mover.setText("Eliminar");
        BT_Mover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_MoverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 596, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(89, 89, 89)
                            .addComponent(BT_Mover))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(TF_Busqueda_remitente, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(29, 29, 29)
                            .addComponent(Boton_Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(Boton_Limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(Boton_Mostra, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(BT_Mover)))
                .addGap(11, 11, 11)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TF_Busqueda_remitente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Boton_Buscar)
                    .addComponent(Boton_Limpiar)
                    .addComponent(Boton_Mostra))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Boton_BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_BuscarActionPerformed
        // TODO add your handling code here:
        try{
            buscarPaquete();
        }catch(SQLException ex){
            Logger.getLogger(MostraPaquetes.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_Boton_BuscarActionPerformed

    private void Boton_LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_LimpiarActionPerformed
        // TODO add your handling code here:
        limpiarTabla();
        limpiarCampoBuscar();
    }//GEN-LAST:event_Boton_LimpiarActionPerformed

    private void Boton_MostraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_MostraActionPerformed
        // TODO add your handling code here:
        try{
            cargarDatosTabla();
            
        }catch(SQLException ex){
            Logger.getLogger(MostraPaquetes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Boton_MostraActionPerformed

    private void TF_Busqueda_remitenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TF_Busqueda_remitenteActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_TF_Busqueda_remitenteActionPerformed

    private void BT_MoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_MoverActionPerformed
        // TODO add your handling code here:
        EliminarPaquete EP= new EliminarPaquete();
        EP.setVisible(true);
    }//GEN-LAST:event_BT_MoverActionPerformed

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
            java.util.logging.Logger.getLogger(MostraPaquetes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MostraPaquetes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MostraPaquetes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MostraPaquetes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
 
 
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MostraPaquetes().setVisible(true);
            }
        });
    }
    
    private void cargarDatosTabla() throws SQLException {
         DefaultTableModel model = new DefaultTableModel();
         model.addColumn("remitente");
    model.addColumn("destinatario");
    model.addColumn("tipo");
    model.addColumn("fragil");
    model.addColumn("peso");
    model.addColumn("clase");
    model.addColumn("forma");
    model.addColumn("detalles");
    Tabla_Busqueda.setModel(model);
    
    ConexionBD conec = new ConexionBD("paqueteria");
    Connection conn = conec.conexion();
    
    if (conn != null) {
        try {
            String query = "SELECT * FROM paqueteria";
            PreparedStatement preparedStatement = conn.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                String[] rowData = {
                    resultSet.getString("remitente"),
                    resultSet.getString("destinatario"),
                    resultSet.getString("tipo"),
                    resultSet.getString("fragil"),
                    resultSet.getString("peso"),
                    resultSet.getString("clase"),
                    resultSet.getString("forma"),
                    resultSet.getString("detalles")
                };
                model.addRow(rowData);
            }

            resultSet.close();
            preparedStatement.close();

        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            if (conn != null) {
                conn.close();
            }
        }
    } else {
        JOptionPane.showMessageDialog(null, "No se pudo conectar a la base de datos.");
    }
}
    

   private void limpiarTabla() {
        DefaultTableModel model = (DefaultTableModel) Tabla_Busqueda.getModel(); // Usa 'getModel' en lugar de 'getmodel'
        model.setRowCount(0); // Elimina todas las filas de la tabla
}
    
private void limpiarCampoBuscar() {
    TF_Busqueda_remitente.setText(""); // Limpia el contenido del campo de búsqueda
}



private void buscarPaquete() throws SQLException {//remitente, destinatario, tipo, fragil, peso, clase, forma, detalles
    String remitente = TF_Busqueda_remitente.getText().trim(); // Obtener el texto de un campo de texto llamado TF_Busqueda_remitente
DefaultTableModel model = new DefaultTableModel();
model.addColumn("remitente");
model.addColumn("destinatario");
model.addColumn("tipo");
model.addColumn("fragil");
model.addColumn("peso");
model.addColumn("clase");
model.addColumn("forma");
model.addColumn("detalles");
Tabla_Busqueda.setModel(model);


     if (!remitente.isEmpty()) {
        ConexionBD conec = new ConexionBD("paqueteria");
        Connection conn = conec.conexion();

        if (conn != null) {
            try {
                String query = "SELECT * FROM paqueteria WHERE remitente LIKE ?";
                PreparedStatement preparedStatement = conn.prepareStatement(query);
                preparedStatement.setString(1, "%" + remitente + "%");
                ResultSet resultSet = preparedStatement.executeQuery();

                if (!resultSet.isBeforeFirst()) { // Verifica si no hay resultados
                    JOptionPane.showMessageDialog(null, "No se encontraron registros en la base de datos."); //remitente, destinatario, tipo, fragil, peso, clase, forma, detalles
                } else {
                    while (resultSet.next()) {
                        String[] rowData = {
                            resultSet.getString("remitente"),
                            resultSet.getString("destinatario"),
                            resultSet.getString("tipo"),
                            resultSet.getString("fragil"),
                            resultSet.getString("peso"),
                            resultSet.getString("clase"),
                            resultSet.getString("forma"),
                            resultSet.getString("detalles")
                        };
                        model.addRow(rowData);
                    }
                }

                resultSet.close();
                preparedStatement.close();

            } catch (SQLException ex) {
                ex.printStackTrace();
            } finally {
                conn.close();
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo conectar a la base de datos.");
        }
    } else {
        JOptionPane.showMessageDialog(null, "Ingresa un nombre de animal para buscar.");
    }
}



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BT_Mover;
    private javax.swing.JButton Boton_Buscar;
    private javax.swing.JButton Boton_Limpiar;
    private javax.swing.JButton Boton_Mostra;
    private javax.swing.JTextField TF_Busqueda_remitente;
    private javax.swing.JTable Tabla_Busqueda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
