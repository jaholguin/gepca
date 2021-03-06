package gepca.vista;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import gepca.modelo.MEntrenamiento;

/**
 *
 * @author JorgeAndres
 */
public class FrmConsultaPInstructor extends javax.swing.JInternalFrame {
    
    private String action = "save";
    private int row;

    /**
     * Creates new form FrmProgramas
     */
    public FrmConsultaPInstructor() {
        initComponents();
        mostrarPersonalEnto();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaEntrenamientos = new javax.swing.JTable();
        lblTEntrenamientos = new javax.swing.JLabel();
        lblTotalEntrenamientos = new javax.swing.JLabel();
        lblBuscarUsuario = new javax.swing.JLabel();
        txtBuscarUsuario = new javax.swing.JTextField();
        btnBuscarUsuario = new javax.swing.JButton();
        btnInicio = new javax.swing.JButton();
        btnUsrCancelar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Consulta entrenamientos");
        setToolTipText("");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/consultaCapacitacion.png"))); // NOI18N
        setPreferredSize(new java.awt.Dimension(1000, 600));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Lista de entrenamientos"));
        jPanel2.setPreferredSize(new java.awt.Dimension(650, 600));

        tablaEntrenamientos.setModel(new javax.swing.table.DefaultTableModel(
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
        tablaEntrenamientos.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tablaEntrenamientos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaEntrenamientosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaEntrenamientos);

        lblTEntrenamientos.setText("Total entrenamientos:");

        lblBuscarUsuario.setText("Id Usuario:");

        btnBuscarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar.png"))); // NOI18N
        btnBuscarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarUsuarioActionPerformed(evt);
            }
        });

        btnInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir.gif"))); // NOI18N
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });

        btnUsrCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cancelar.png"))); // NOI18N
        btnUsrCancelar.setText("Limpiar");
        btnUsrCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsrCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 932, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(lblTEntrenamientos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblTotalEntrenamientos, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(lblBuscarUsuario)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtBuscarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnBuscarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnUsrCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
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
                            .addComponent(lblBuscarUsuario)
                            .addComponent(txtBuscarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBuscarUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(btnUsrCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 456, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTEntrenamientos)
                    .addComponent(lblTotalEntrenamientos, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 964, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 548, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tablaEntrenamientosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaEntrenamientosMouseClicked
        
        enableForm();
        row = tablaEntrenamientos.rowAtPoint(evt.getPoint());

    }//GEN-LAST:event_tablaEntrenamientosMouseClicked

    private void btnBuscarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarUsuarioActionPerformed
        String idUsr = txtBuscarUsuario.getText().trim();
        if (!idUsr.equals("")) {
            DefaultTableModel modelo;
            MEntrenamiento mentrenamiento = new MEntrenamiento();
            modelo = mentrenamiento.buscarUsuario(idUsr);
            if(modelo.getRowCount() >= 1){
                System.out.println("Usuario con identificacion " + idUsr + " encontrado!!!");
                tablaEntrenamientos.setModel(modelo);
                Integer cantEntrenamientos = tablaEntrenamientos.getRowCount();
                lblTotalEntrenamientos.setText(String.valueOf(cantEntrenamientos));
            }else{
                JOptionPane.showMessageDialog(rootPane, "El usuario " + idUsr + " no se encontró!!!","Busqueda de usuario",JOptionPane.INFORMATION_MESSAGE);
                txtBuscarUsuario.requestFocus();
                mostrarPersonalEnto();
            }
        }else{
            JOptionPane.showMessageDialog(rootPane, "El usuario " + idUsr + " no se encontró!!!","Busqueda de usuario",JOptionPane.INFORMATION_MESSAGE);
            txtBuscarUsuario.requestFocus();
            mostrarPersonalEnto();
        }
    }//GEN-LAST:event_btnBuscarUsuarioActionPerformed

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnInicioActionPerformed

    private void btnUsrCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsrCancelarActionPerformed
        txtBuscarUsuario.setText("");
        mostrarPersonalEnto();
    }//GEN-LAST:event_btnUsrCancelarActionPerformed
        
    void enableForm(){
        txtBuscarUsuario.setEnabled(true);
        btnBuscarUsuario.setEnabled(true);
        btnInicio.setEnabled(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JButton btnBuscarUsuario;
    private static javax.swing.JButton btnInicio;
    private static javax.swing.JButton btnUsrCancelar;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBuscarUsuario;
    private javax.swing.JLabel lblTEntrenamientos;
    private javax.swing.JLabel lblTotalEntrenamientos;
    private javax.swing.JTable tablaEntrenamientos;
    private static javax.swing.JTextField txtBuscarUsuario;
    // End of variables declaration//GEN-END:variables

    public void mostrarPersonalEnto() {
        try {
            DefaultTableModel modelo;
            MEntrenamiento mentrenamiento = new MEntrenamiento();
            modelo = mentrenamiento.consultarEntrenamientos();
            tablaEntrenamientos.setModel(modelo);
            Integer cantEntrenamientos = tablaEntrenamientos.getRowCount();
            lblTotalEntrenamientos.setText(String.valueOf(cantEntrenamientos));
	} catch (Exception e) {
            System.out.println("Error al consultar la BD!!!" + e);
	}
    }

}
