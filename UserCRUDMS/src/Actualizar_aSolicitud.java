import javax.swing.table.DefaultTableModel;
import java.sql.SQLException;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Actualizar_aSolicitud extends javax.swing.JFrame {

    private UserCRUD crud;
    private UserCRUD crudArticulos;
    
    public Actualizar_aSolicitud() {
        initComponents();
        this.crud= new UserCRUD();
        this.crudArticulos = new UserCRUD();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tableArticulo = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnEditar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        cbEstado = new javax.swing.JComboBox<>();
        btnBuscarEstado = new javax.swing.JButton();
        btnActualizarCambio = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tableArticulo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "id_usuario", "Id_articulo", "Cantidad", "Fecha", "Hora", "Estado"
            }
        ));
        jScrollPane1.setViewportView(tableArticulo);

        jLabel1.setText("Actualizar y notificar las solicitudes de artículos");

        jLabel2.setText("ADMINISTRADOR");

        btnEditar.setText("Editar artículo");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        jLabel3.setText("Estado de la solicitud:");

        cbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "En proceso", "Artículo no disponibles", "Disponible para recolección", "Entregado" }));
        cbEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbEstadoActionPerformed(evt);
            }
        });

        btnBuscarEstado.setText("Buscar por estado");
        btnBuscarEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarEstadoActionPerformed(evt);
            }
        });

        btnActualizarCambio.setText("Guardar cambio");
        btnActualizarCambio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarCambioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 568, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(113, 113, 113)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnEditar)
                            .addComponent(cbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 44, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(199, 199, 199)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(253, 253, 253)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(btnBuscarEstado))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(238, 238, 238)
                        .addComponent(btnActualizarCambio)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addComponent(jLabel2)
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscarEstado)
                    .addComponent(btnEditar))
                .addGap(42, 42, 42)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(btnActualizarCambio)
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
        int selectedRow = tableArticulo.getSelectedRow();

        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Por favor, seleccione una solicitud para editar.");
            return;
        }

        int id_solicitud = (int) tableArticulo.getValueAt(selectedRow, 0);
        String estadoselec = (String) cbEstado.getSelectedItem();
        
        System.out.println("ID de solicitud: " + id_solicitud);
    System.out.println("Estado seleccionado: " + estadoselec);

        if (crudArticulos.updateSolicitudArticulos(id_solicitud, estadoselec)) {
            JOptionPane.showMessageDialog(this, "Estado de la solicitud actualizado correctamente.");
             actualizarTabla();
        } else {
            JOptionPane.showMessageDialog(this, "Error al actualizar el estado de la solicitud.");
        }
    }//GEN-LAST:event_btnEditarActionPerformed
    
    private void cbEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbEstadoActionPerformed
        // TODO add your handling code here:
        String estadoSeleccionado = (String) cbEstado.getSelectedItem();
        System.out.println("Estado seleccionado: " + estadoSeleccionado);
    }//GEN-LAST:event_cbEstadoActionPerformed

    private void btnBuscarEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarEstadoActionPerformed
        // TODO add your handling code here:
        String estadoSeleccionado = (String) cbEstado.getSelectedItem();

    if (estadoSeleccionado == null || estadoSeleccionado.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Por favor, seleccione un estado.");
        return;
    }

    try {
        ResultSet rs = crudArticulos.buscarPorEstado(estadoSeleccionado);
        DefaultTableModel modelo = (DefaultTableModel) tableArticulo.getModel();
        modelo.setRowCount(0);  
        
        while (rs.next()) {
            modelo.addRow(new Object[]{
                rs.getInt("id_usuario"),
                rs.getInt("id_solicitud"),
                rs.getInt("cantidad"),
                rs.getDate("fecha_solicitud"),
                rs.getTime("hora"),
                rs.getString("estado"),
            });
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error al buscar las solicitudes por estado.");
        System.out.println("Error al realizar la búsqueda: " + e.getMessage());
    }
    }//GEN-LAST:event_btnBuscarEstadoActionPerformed

    private void btnActualizarCambioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarCambioActionPerformed
        // TODO add your handling code here:
        actualizarTabla();
    }//GEN-LAST:event_btnActualizarCambioActionPerformed

    private void actualizarTabla() {
    ResultSet rs = crudArticulos.obtenerTodosArticulos();
    DefaultTableModel modelo = (DefaultTableModel) tableArticulo.getModel();
    modelo.setRowCount(0);  // Limpiar la tabla antes de llenarla con los nuevos resultados

    try {
        while (rs.next()) {
            modelo.addRow(new Object[]{
                rs.getInt("id_solicitud"),
                rs.getInt("id_usuario"),
                rs.getInt("cantidad"),
                rs.getDate("fecha_solicitud"),
                rs.getTime("hora"),
                rs.getString("estado")
            });
        }
    } catch (SQLException e) {
        System.out.println("Error al actualizar la tabla: " + e.getMessage());
    }
}
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
            java.util.logging.Logger.getLogger(Actualizar_aSolicitud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Actualizar_aSolicitud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Actualizar_aSolicitud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Actualizar_aSolicitud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Actualizar_aSolicitud().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizarCambio;
    private javax.swing.JButton btnBuscarEstado;
    private javax.swing.JButton btnEditar;
    private javax.swing.JComboBox<String> cbEstado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableArticulo;
    // End of variables declaration//GEN-END:variables
}
