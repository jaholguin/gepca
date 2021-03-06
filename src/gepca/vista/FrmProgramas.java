package gepca.vista;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import gepca.controlador.CPrograma;
import gepca.modelo.MPrograma;

/**
 *
 * @author JorgeAndres
 */
public class FrmProgramas extends javax.swing.JInternalFrame {
    
    private String action = "save";
    private int row;

    /**
     * Creates new form FrmProgramas
     */
    public FrmProgramas() {
        initComponents();
        mostrarProgramas();
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
        txtCodPrograma = new javax.swing.JTextField();
        lblCodPrograma = new javax.swing.JLabel();
        lblNombrePrograma = new javax.swing.JLabel();
        lblDuracionPrograma = new javax.swing.JLabel();
        btnProgramaGuardar = new javax.swing.JButton();
        btnProgramaCancelar = new javax.swing.JButton();
        btnProgramaNuevo = new javax.swing.JButton();
        cbDuracionPrograma = new javax.swing.JComboBox();
        txtNombrePrograma = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaPrograma = new javax.swing.JTable();
        lblTProgramas = new javax.swing.JLabel();
        lblProgramaTotal = new javax.swing.JLabel();
        lblProgramaBuscar = new javax.swing.JLabel();
        txtProgramaBuscar = new javax.swing.JTextField();
        btnProgramaBuscar = new javax.swing.JButton();
        btnInicio = new javax.swing.JButton();
        btnProgramaEliminar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Administración de Programas");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/programas.png"))); // NOI18N
        setPreferredSize(new java.awt.Dimension(520, 550));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "Registro de programa"));

        txtCodPrograma.setEnabled(false);

        lblCodPrograma.setText("Cod. Programa:");

        lblNombrePrograma.setText("Nombre:");

        lblDuracionPrograma.setText("Duración:");

        btnProgramaGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/guardar.png"))); // NOI18N
        btnProgramaGuardar.setEnabled(false);
        btnProgramaGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProgramaGuardarActionPerformed(evt);
            }
        });

        btnProgramaCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cancelar.png"))); // NOI18N
        btnProgramaCancelar.setText("Limpiar");
        btnProgramaCancelar.setEnabled(false);
        btnProgramaCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProgramaCancelarActionPerformed(evt);
            }
        });

        btnProgramaNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/nuevo.gif"))); // NOI18N
        btnProgramaNuevo.setText("Nuevo");
        btnProgramaNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProgramaNuevoActionPerformed(evt);
            }
        });

        cbDuracionPrograma.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "6", "8", "12", "15", "20", "30" }));
        cbDuracionPrograma.setEnabled(false);

        txtNombrePrograma.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCodPrograma)
                    .addComponent(lblNombrePrograma)
                    .addComponent(lblDuracionPrograma))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtCodPrograma)
                    .addComponent(cbDuracionPrograma, javax.swing.GroupLayout.Alignment.TRAILING, 0, 165, Short.MAX_VALUE)
                    .addComponent(txtNombrePrograma, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnProgramaNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnProgramaCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnProgramaGuardar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodPrograma)
                    .addComponent(txtCodPrograma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnProgramaNuevo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombrePrograma)
                    .addComponent(btnProgramaCancelar)
                    .addComponent(txtNombrePrograma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblDuracionPrograma)
                        .addComponent(cbDuracionPrograma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnProgramaGuardar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Lista de programas"));

        tablaPrograma.setModel(new javax.swing.table.DefaultTableModel(
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
        tablaPrograma.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tablaPrograma.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaProgramaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaPrograma);

        lblTProgramas.setText("Total programas:");

        lblProgramaBuscar.setText("Código programa:");

        btnProgramaBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar.png"))); // NOI18N
        btnProgramaBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProgramaBuscarActionPerformed(evt);
            }
        });

        btnInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir.gif"))); // NOI18N
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });

        btnProgramaEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/eliminar.png"))); // NOI18N
        btnProgramaEliminar.setText("Eliminar");
        btnProgramaEliminar.setEnabled(false);
        btnProgramaEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProgramaEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(lblTProgramas)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblProgramaTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(lblProgramaBuscar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtProgramaBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnProgramaBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnProgramaEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                            .addComponent(lblProgramaBuscar)
                            .addComponent(txtProgramaBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnProgramaBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(btnProgramaEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTProgramas)
                    .addComponent(lblProgramaTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
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

    private void tablaProgramaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaProgramaMouseClicked
        
        enableForm();
        btnProgramaEliminar.setEnabled(true);
        txtCodPrograma.setEnabled(false);
        btnProgramaNuevo.setEnabled(false);
        action = "edit";
        
        row = tablaPrograma.rowAtPoint(evt.getPoint());

        txtCodPrograma.setText(tablaPrograma.getValueAt(row, 0).toString());
        txtNombrePrograma.setText(tablaPrograma.getValueAt(row, 1).toString());
        cbDuracionPrograma.setSelectedItem(tablaPrograma.getValueAt(row, 2).toString());
    }//GEN-LAST:event_tablaProgramaMouseClicked

    private void btnProgramaEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProgramaEliminarActionPerformed
        btnProgramaEliminar.setEnabled(false);
        limpiar();
        eliminarPrograma();
        mostrarProgramas();
    }//GEN-LAST:event_btnProgramaEliminarActionPerformed

    private void btnProgramaBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProgramaBuscarActionPerformed
        String idPrograma = txtProgramaBuscar.getText().trim();
        if (!idPrograma.equals("")){
            DefaultTableModel modelo;
            MPrograma mprograma = new MPrograma();
            modelo = mprograma.buscarPrograma(idPrograma);
            if(modelo.getRowCount() >= 1){
                System.out.println("Programa con id " + idPrograma + " encontrado!!!");
                tablaPrograma.setModel(modelo);
                Integer cantProgramas = tablaPrograma.getRowCount();
                lblProgramaTotal.setText(String.valueOf(cantProgramas));
                limpiar();
            }else{
                JOptionPane.showMessageDialog(rootPane, "El programa " + idPrograma + " no se encontró!!!","Busqueda de programa",JOptionPane.INFORMATION_MESSAGE);
                txtProgramaBuscar.requestFocus();
                mostrarProgramas();
                limpiar();
            }
        }else{
            JOptionPane.showMessageDialog(rootPane, "El programa " + idPrograma + " no se encontró!!!","Busqueda de programa",JOptionPane.INFORMATION_MESSAGE);
            txtProgramaBuscar.requestFocus();
            mostrarProgramas();
            limpiar();
        }
    }//GEN-LAST:event_btnProgramaBuscarActionPerformed

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnInicioActionPerformed

    private void btnProgramaNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProgramaNuevoActionPerformed
        enableForm();
        btnProgramaNuevo.setEnabled(false);
        action = "save";
    }//GEN-LAST:event_btnProgramaNuevoActionPerformed
    
    private void btnProgramaCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProgramaCancelarActionPerformed
        btnProgramaEliminar.setEnabled(false);
        limpiar();
        mostrarProgramas();

    }//GEN-LAST:event_btnProgramaCancelarActionPerformed

    private void btnProgramaGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProgramaGuardarActionPerformed
        String idPrograma = txtCodPrograma.getText();
        String nombre = txtNombrePrograma.getText();
        String titulo = cbDuracionPrograma.getSelectedItem().toString();
        if (idPrograma.trim().length() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Debe ingresar un código","Registro de programa",JOptionPane.INFORMATION_MESSAGE);
            txtCodPrograma.requestFocus();
            return;
        }
        if (nombre.trim().length() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Debe seleccionar un nombre","Registro de programa",JOptionPane.INFORMATION_MESSAGE);
            txtNombrePrograma.requestFocus();
            return;
        }
        if (titulo.trim().length() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Debe seleccionar un título","Registro de titulo",JOptionPane.INFORMATION_MESSAGE);
            cbDuracionPrograma.requestFocus();
            return;
        }
        CPrograma programa = new CPrograma(idPrograma, nombre, titulo);
        MPrograma mprograma = new MPrograma();
        if (action.equals("save")) {
            try {    
                mprograma.insertarPrograma(programa);
                mostrarProgramas();
                limpiar();
            } catch (Exception e) {
                JOptionPane.showConfirmDialog(null, e);
                System.out.println("Ocurrió un error mientras se intentaba ingresar el programa!!!");
            }
        } else {
            if (action.equals("edit")) {
                try {
                    mprograma.editarPrograma(programa);
                    mostrarProgramas();
                    limpiar();
                } catch (Exception e) {
                    JOptionPane.showConfirmDialog(null, e);
                    System.out.println("Ocurrió un error mientras se intentaba editar el programa!!!");
                }
            }
        } 
        
    }//GEN-LAST:event_btnProgramaGuardarActionPerformed
    
    void enableForm(){
        txtCodPrograma.setEnabled(true);
        txtNombrePrograma.setEnabled(true);
        cbDuracionPrograma.setEnabled(true);
        btnProgramaCancelar.setEnabled(true);
        btnProgramaGuardar.setEnabled(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JButton btnInicio;
    private static javax.swing.JButton btnProgramaBuscar;
    private static javax.swing.JButton btnProgramaCancelar;
    private javax.swing.JButton btnProgramaEliminar;
    private static javax.swing.JButton btnProgramaGuardar;
    private javax.swing.JButton btnProgramaNuevo;
    private static javax.swing.JComboBox cbDuracionPrograma;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCodPrograma;
    private javax.swing.JLabel lblDuracionPrograma;
    private javax.swing.JLabel lblNombrePrograma;
    private javax.swing.JLabel lblProgramaBuscar;
    private javax.swing.JLabel lblProgramaTotal;
    private javax.swing.JLabel lblTProgramas;
    private javax.swing.JTable tablaPrograma;
    private static javax.swing.JTextField txtCodPrograma;
    private static javax.swing.JTextField txtNombrePrograma;
    private static javax.swing.JTextField txtProgramaBuscar;
    // End of variables declaration//GEN-END:variables

    public void mostrarProgramas() {
        try {
            DefaultTableModel modelo;
            MPrograma mprograma = new MPrograma();
            modelo = mprograma.consultarProgramas();
            tablaPrograma.setModel(modelo);
            Integer cantProgramas = tablaPrograma.getRowCount();
            lblProgramaTotal.setText(String.valueOf(cantProgramas));
	} catch (Exception e) {
            System.out.println("Error al consultar la BD!!!" + e);
	}
    }

    public void limpiar() {
        txtCodPrograma.setEnabled(false);
        txtNombrePrograma.setEnabled(false);
        cbDuracionPrograma.setEnabled(false);
        btnProgramaNuevo.setEnabled(true);
        btnProgramaCancelar.setEnabled(false);
        btnProgramaGuardar.setEnabled(false);
        txtCodPrograma.setText("");
        txtNombrePrograma.setText("");
        cbDuracionPrograma.setSelectedIndex(0);
        txtProgramaBuscar.setText("");
        txtProgramaBuscar.requestFocus();
    }

    public void eliminarPrograma() {
        
        String idPrograma = tablaPrograma.getValueAt(row, 0).toString();
        int confirmation = JOptionPane.showConfirmDialog(rootPane, "Estás seguro de eliminar el programa con id " + idPrograma + "?","Confirmar",2);

        if (confirmation == 0) {
            MPrograma mprograma = new MPrograma();
            mprograma.eliminarPrograma(idPrograma);
            JOptionPane.showMessageDialog(rootPane, "Programa: " + idPrograma + " borrado exitosamente!!!","Eliminación de programa",JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
