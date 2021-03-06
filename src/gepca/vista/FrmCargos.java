package gepca.vista;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import gepca.controlador.CCargo;
import gepca.modelo.MCargo;

/**
 *
 * @author JorgeAndres
 */
public class FrmCargos extends javax.swing.JInternalFrame {
    
    private String action = "save";
    private int row;

    /**
     * Creates new form FrmCargos
     */
    public FrmCargos() {
        initComponents();
        mostrarCargos();
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
        txtCodCargo = new javax.swing.JTextField();
        lblCodCargo = new javax.swing.JLabel();
        lblNombreCargo = new javax.swing.JLabel();
        lblGradoCargo = new javax.swing.JLabel();
        lblSectorCargo = new javax.swing.JLabel();
        cbSectorCargo = new javax.swing.JComboBox();
        btnCargoGuardar = new javax.swing.JButton();
        btnCargoCancelar = new javax.swing.JButton();
        btnCargoNuevo = new javax.swing.JButton();
        cbGradoCargo = new javax.swing.JComboBox();
        txtNombreCargo = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaCargo = new javax.swing.JTable();
        lblTCargos = new javax.swing.JLabel();
        lblCargoTotal = new javax.swing.JLabel();
        lblCargoBuscar = new javax.swing.JLabel();
        txtCargoBuscar = new javax.swing.JTextField();
        btnCargoBuscar = new javax.swing.JButton();
        btnInicio = new javax.swing.JButton();
        btnCargoEliminar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Administración de Cargos");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cargos.png"))); // NOI18N
        setPreferredSize(new java.awt.Dimension(500, 500));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "Registro de cargo"));

        txtCodCargo.setEnabled(false);

        lblCodCargo.setText("Cod. Cargo:");

        lblNombreCargo.setText("Nombre:");

        lblGradoCargo.setText("Grado:");

        lblSectorCargo.setText("Sector:");

        cbSectorCargo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "NEP", "NER", "NWP", "NWR", "SCP", "SCR", "SEP", "SER", "SNP", "SNR", "SSP", "SSR", "SUP", "SWP", "SWR", "SZP", "SZR" }));
        cbSectorCargo.setEnabled(false);

        btnCargoGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/guardar.png"))); // NOI18N
        btnCargoGuardar.setEnabled(false);
        btnCargoGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargoGuardarActionPerformed(evt);
            }
        });

        btnCargoCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cancelar.png"))); // NOI18N
        btnCargoCancelar.setText("Limpiar");
        btnCargoCancelar.setEnabled(false);
        btnCargoCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargoCancelarActionPerformed(evt);
            }
        });

        btnCargoNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/nuevo.gif"))); // NOI18N
        btnCargoNuevo.setText("Nuevo");
        btnCargoNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargoNuevoActionPerformed(evt);
            }
        });

        cbGradoCargo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "22", "25", "28" }));
        cbGradoCargo.setEnabled(false);

        txtNombreCargo.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCodCargo)
                    .addComponent(lblSectorCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombreCargo)
                    .addComponent(lblGradoCargo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cbGradoCargo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtCodCargo)
                    .addComponent(cbSectorCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombreCargo))
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCargoNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCargoCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCargoGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCodCargo)
                            .addComponent(txtCodCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNombreCargo)
                            .addComponent(txtNombreCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblGradoCargo)
                            .addComponent(cbGradoCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(btnCargoNuevo)
                        .addGap(18, 18, 18)
                        .addComponent(btnCargoCancelar)))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblSectorCargo)
                        .addComponent(cbSectorCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnCargoGuardar))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Lista de cargos"));

        tablaCargo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tablaCargo.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tablaCargo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaCargoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaCargo);

        lblTCargos.setText("Total cargos:");

        lblCargoBuscar.setText("Código cargo:");

        btnCargoBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar.png"))); // NOI18N
        btnCargoBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargoBuscarActionPerformed(evt);
            }
        });

        btnInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir.gif"))); // NOI18N
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });

        btnCargoEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/eliminar.png"))); // NOI18N
        btnCargoEliminar.setText("Eliminar");
        btnCargoEliminar.setEnabled(false);
        btnCargoEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargoEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 1, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(lblTCargos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblCargoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(lblCargoBuscar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCargoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnCargoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnCargoEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(19, 19, 19)
                                .addComponent(btnInicio)))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCargoBuscar)
                            .addComponent(txtCargoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCargoBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(btnCargoEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTCargos)
                    .addComponent(lblCargoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tablaCargoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaCargoMouseClicked
        
        enableForm();
        btnCargoEliminar.setEnabled(true);
        txtCodCargo.setEnabled(false);
        btnCargoNuevo.setEnabled(false);
        action = "edit";
        
        row = tablaCargo.rowAtPoint(evt.getPoint());

        txtCodCargo.setText(tablaCargo.getValueAt(row, 0).toString());
        txtNombreCargo.setText(tablaCargo.getValueAt(row, 1).toString());
        cbGradoCargo.setSelectedItem(tablaCargo.getValueAt(row, 2).toString());
        cbSectorCargo.setSelectedItem(tablaCargo.getValueAt(row, 3).toString());
    }//GEN-LAST:event_tablaCargoMouseClicked

    private void btnCargoEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargoEliminarActionPerformed
        btnCargoEliminar.setEnabled(false);
        limpiar();
        eliminarCargo();
        mostrarCargos();
    }//GEN-LAST:event_btnCargoEliminarActionPerformed

    private void btnCargoBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargoBuscarActionPerformed
        String idCargo = txtCargoBuscar.getText().trim();
        if (!idCargo.equals("")){
            DefaultTableModel modelo;
            MCargo mcargo = new MCargo();
            modelo = mcargo.buscarCargo(idCargo);
            if(modelo.getRowCount() >= 1){
                System.out.println("Cargo con id " + idCargo + " encontrado!!!");
                tablaCargo.setModel(modelo);
                Integer cantCargos = tablaCargo.getRowCount();
                lblCargoTotal.setText(String.valueOf(cantCargos));
                limpiar();
            }else{
                JOptionPane.showMessageDialog(rootPane, "El cargo " + idCargo + " no se encontró!!!","Busqueda de cargo",JOptionPane.INFORMATION_MESSAGE);
                txtCargoBuscar.requestFocus();
                mostrarCargos();
                limpiar();
            }
        }else{
            JOptionPane.showMessageDialog(rootPane, "El cargo " + idCargo + " no se encontró!!!","Busqueda de cargo",JOptionPane.INFORMATION_MESSAGE);
            txtCargoBuscar.requestFocus();
            mostrarCargos();
            limpiar();
        }
    }//GEN-LAST:event_btnCargoBuscarActionPerformed

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnInicioActionPerformed

    private void btnCargoNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargoNuevoActionPerformed
        enableForm();
        btnCargoNuevo.setEnabled(false);
        action = "save";
    }//GEN-LAST:event_btnCargoNuevoActionPerformed
    
    private void btnCargoCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargoCancelarActionPerformed
        btnCargoEliminar.setEnabled(false);
        limpiar();
        mostrarCargos();

    }//GEN-LAST:event_btnCargoCancelarActionPerformed

    private void btnCargoGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargoGuardarActionPerformed
        String idCargo = txtCodCargo.getText();
        String nombre = txtNombreCargo.getText();
        String grado = cbGradoCargo.getSelectedItem().toString();
        String sector = cbSectorCargo.getSelectedItem().toString();
        if (idCargo.trim().length() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Debe ingresar un código","Registro de cargo",JOptionPane.INFORMATION_MESSAGE);
            txtCodCargo.requestFocus();
            return;
        }
        if (nombre.trim().length() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Debe seleccionar un nombre","Registro de cargo",JOptionPane.INFORMATION_MESSAGE);
            txtNombreCargo.requestFocus();
            return;
        }
        if (grado.trim().length() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Debe seleccionar un grado","Registro de cargo",JOptionPane.INFORMATION_MESSAGE);
            cbGradoCargo.requestFocus();
            return;
        }
        if (sector.trim().length() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Debe seleccionar un sector","Registro de cargo",JOptionPane.INFORMATION_MESSAGE);
            cbSectorCargo.requestFocus();
            return;
        }
        CCargo cargo = new CCargo(idCargo, nombre, grado, sector);
        MCargo mcargo = new MCargo();
        if (action.equals("save")) {
            try {    
                mcargo.insertarCargo(cargo);
                mostrarCargos();
                limpiar();
            } catch (Exception e) {
                JOptionPane.showConfirmDialog(null, e);
                System.out.println("Ocurrió un error mientras se intentaba ingresar el cargo!!!");
            }
        } else {
            if (action.equals("edit")) {
                try {
                    mcargo.editarCargo(cargo);
                    mostrarCargos();
                    limpiar();
                } catch (Exception e) {
                    JOptionPane.showConfirmDialog(null, e);
                    System.out.println("Ocurrió un error mientras se intentaba editar el cargo!!!");
                }
            }
        } 
        
    }//GEN-LAST:event_btnCargoGuardarActionPerformed
    
    void enableForm(){
        txtCodCargo.setEnabled(true);
        txtNombreCargo.setEnabled(true);
        cbGradoCargo.setEnabled(true);
        cbSectorCargo.setEnabled(true);
        btnCargoCancelar.setEnabled(true);
        btnCargoGuardar.setEnabled(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JButton btnCargoBuscar;
    private static javax.swing.JButton btnCargoCancelar;
    private javax.swing.JButton btnCargoEliminar;
    private static javax.swing.JButton btnCargoGuardar;
    private javax.swing.JButton btnCargoNuevo;
    private static javax.swing.JButton btnInicio;
    private static javax.swing.JComboBox cbGradoCargo;
    private static javax.swing.JComboBox cbSectorCargo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCargoBuscar;
    private javax.swing.JLabel lblCargoTotal;
    private javax.swing.JLabel lblCodCargo;
    private javax.swing.JLabel lblGradoCargo;
    private javax.swing.JLabel lblNombreCargo;
    private javax.swing.JLabel lblSectorCargo;
    private javax.swing.JLabel lblTCargos;
    private javax.swing.JTable tablaCargo;
    private static javax.swing.JTextField txtCargoBuscar;
    private static javax.swing.JTextField txtCodCargo;
    private static javax.swing.JTextField txtNombreCargo;
    // End of variables declaration//GEN-END:variables

    public void mostrarCargos() {
        try {
            DefaultTableModel modelo;
            MCargo mcargo = new MCargo();
            modelo = mcargo.consultarCargos();
            tablaCargo.setModel(modelo);
            Integer cantCargos = tablaCargo.getRowCount();
            lblCargoTotal.setText(String.valueOf(cantCargos));
	} catch (Exception e) {
            System.out.println("Error al consultar la BD!!!" + e);
	}
    }

    public void limpiar() {
        txtCodCargo.setEnabled(false);
        txtNombreCargo.setEnabled(false);
        cbGradoCargo.setEnabled(false);
        cbSectorCargo.setEnabled(false);
        btnCargoNuevo.setEnabled(true);
        btnCargoCancelar.setEnabled(false);
        btnCargoGuardar.setEnabled(false);
        txtCodCargo.setText("");
        txtNombreCargo.setText("");
        cbGradoCargo.setSelectedIndex(0);
        cbSectorCargo.setSelectedIndex(0);
        txtCargoBuscar.setText("");
        txtCargoBuscar.requestFocus();
    }

    public void eliminarCargo() {
        
        String idCargo = tablaCargo.getValueAt(row, 0).toString();
        int confirmation = JOptionPane.showConfirmDialog(rootPane, "Estás seguro de eliminar el cargo con id " + idCargo + "?","Confirmar",2);

        if (confirmation == 0) {
            MCargo mcargo = new MCargo();
            mcargo.eliminarCargo(idCargo);
            JOptionPane.showMessageDialog(rootPane, "Cargo: " + idCargo + " borrado exitosamente!!!","Eliminación de cargo",JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
