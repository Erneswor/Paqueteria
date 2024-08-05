
package interfaces;
import Interfaces.MostraPaquetes;
import conexionbd.ConexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ERNESTO GARCIA
 */
public class ActualizarPaquetes extends javax.swing.JFrame {

    public ActualizarPaquetes() throws SQLException {
        initComponents();
       cargarDatosTabla();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tabla_Busqueda = new javax.swing.JTable();
        btnMostra = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 255, 153));

        jLabel4.setFont(new java.awt.Font("Kristen ITC", 0, 12)); // NOI18N
        jLabel4.setText("Ingresa el Nombre del remitentes a Editar");

        jLabel3.setFont(new java.awt.Font("Kristen ITC", 3, 12)); // NOI18N
        jLabel3.setText("Editar Paquetes");

        txtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarActionPerformed(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
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
        jScrollPane2.setViewportView(Tabla_Busqueda);

        btnMostra.setText("Mostra");
        btnMostra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostraActionPerformed(evt);
            }
        });

        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)
                                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnMostra, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnRegresar))
                            .addComponent(jLabel4)
                            .addComponent(jScrollPane2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(307, 307, 307)
                        .addComponent(jLabel3)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar)
                    .addComponent(btnMostra)
                    .addComponent(btnEditar)
                    .addComponent(btnRegresar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
     MostraPaquetes MP= new MostraPaquetes();
     MP.setVisible(true);
     this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnMostraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostraActionPerformed
        try {
            cargarDatosTabla();
        } catch (SQLException ex) {
            System.out.println("No es posible cargar los datos");
            Logger.getLogger(ActualizarPaquetes.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnMostraActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        try {
            editarPaquete();
        } catch (SQLException ex) {
            System.out.println("No es posible esditar paquetes");
            Logger.getLogger(ActualizarPaquetes.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        try {
            buscarPaquete();
        } catch (SQLException ex) {
            System.out.println("No carga paquete");

        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarActionPerformed

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new ActualizarPaquetes().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(ActualizarPaquetes.class.getName()).log(Level.SEVERE, null, ex);
                }
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

    private void limpiar() {
        txtBuscar.setText("");
       DefaultTableModel model = (DefaultTableModel) Tabla_Busqueda.getModel(); // Usa 'getModel' en lugar de 'getmodel'
        model.setRowCount(0);
    }

    private void editarPaquete() throws SQLException {
        // Obtener la fila seleccionada
        int selectedRow = Tabla_Busqueda.getSelectedRow();
        if (selectedRow != -1) {
            // Obtener los datos de la fila seleccionada
            String remitente = (String) Tabla_Busqueda.getValueAt(selectedRow, 0);
            String destinatario = (String) Tabla_Busqueda.getValueAt(selectedRow, 1);
            String tipo = (String) Tabla_Busqueda.getValueAt(selectedRow, 2);
            String fragil = (String) Tabla_Busqueda.getValueAt(selectedRow, 3);
            String peso = (String) Tabla_Busqueda.getValueAt(selectedRow, 4);
            String clase = (String) Tabla_Busqueda.getValueAt(selectedRow, 5);
            String forma = (String) Tabla_Busqueda.getValueAt(selectedRow, 6);
            String detalles = (String) Tabla_Busqueda.getValueAt(selectedRow, 7);

            // Solicitar nuevos valores al usuario
            String nuevoRemitente = JOptionPane.showInputDialog(null, "Editar Remitente:", remitente);
            String nuevoDestinatario = JOptionPane.showInputDialog(null, "Editar Destinatario:", destinatario);
            String nuevoTipo = JOptionPane.showInputDialog(null, "Editar Tipo:", tipo);
            String nuevoFragil = JOptionPane.showInputDialog(null, "Editar Fragil:", fragil);
            String nuevoPeso = JOptionPane.showInputDialog(null, "Editar Peso:", peso);
            String nuevaClase = JOptionPane.showInputDialog(null, "Editar Clase:", clase);
            String nuevaForma = JOptionPane.showInputDialog(null, "Editar Forma:", forma);
            String nuevosDetalles = JOptionPane.showInputDialog(null, "Editar Detalles:", detalles);

            // Conexión a la base de datos
            ConexionBD conec = new ConexionBD("paqueteria");
            Connection conn = conec.conexion();

            if (conn != null) {
                try {
                    // Actualizar los datos en la base de datos
                    String query = "UPDATE paqueteria SET remitente = ?, destinatario = ?, tipo = ?, fragil = ?, peso = ?, clase = ?, forma = ?, detalles = ? WHERE remitente = ?";
                    PreparedStatement preparedStatement = conn.prepareStatement(query);
                    preparedStatement.setString(1, nuevoRemitente);
                    preparedStatement.setString(2, nuevoDestinatario);
                    preparedStatement.setString(3, nuevoTipo);
                    preparedStatement.setString(4, nuevoFragil);
                    preparedStatement.setString(5, nuevoPeso);
                    preparedStatement.setString(6, nuevaClase);
                    preparedStatement.setString(7, nuevaForma);
                    preparedStatement.setString(8, nuevosDetalles);
                    preparedStatement.setString(9, remitente);
                    int rowsAffected = preparedStatement.executeUpdate();

                    if (rowsAffected > 0) {
                        // Actualizar la tabla
                        Tabla_Busqueda.setValueAt(nuevoRemitente, selectedRow, 0);
                        Tabla_Busqueda.setValueAt(nuevoDestinatario, selectedRow, 1);
                        Tabla_Busqueda.setValueAt(nuevoTipo, selectedRow, 2);
                        Tabla_Busqueda.setValueAt(nuevoFragil, selectedRow, 3);
                        Tabla_Busqueda.setValueAt(nuevoPeso, selectedRow, 4);
                        Tabla_Busqueda.setValueAt(nuevaClase, selectedRow, 5);
                        Tabla_Busqueda.setValueAt(nuevaForma, selectedRow, 6);
                        Tabla_Busqueda.setValueAt(nuevosDetalles, selectedRow, 7);

                        JOptionPane.showMessageDialog(null, "Paquete editado correctamente.");
                    } else {
                        JOptionPane.showMessageDialog(null, "No se pudo editar el paquete.");
                    }

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
            JOptionPane.showMessageDialog(null, "Selecciona un paquete para editar.");
        }
    }
    
   private void buscarPaquete() throws SQLException {//remitente, destinatario, tipo, fragil, peso, clase, forma, detalles
    String remitente = txtBuscar.getText().trim(); // Obtener el texto de un campo de texto llamado TF_Busqueda_remitente
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
    private javax.swing.JTable Tabla_Busqueda;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnMostra;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
