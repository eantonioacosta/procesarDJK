package djk.procesardkj.view;


import djk.procesardkj.controller.ControllerAnioLectivo;
import djk.procesardkj.domain.AnioLectivo;
import java.awt.Component;
import java.awt.Container;
import javax.swing.JOptionPane;
import javax.swing.table.TableColumnModel;

public class ViewAniosLectivos extends javax.swing.JInternalFrame {

    ControllerAnioLectivo control;

    public ViewAniosLectivos() {
        initComponents();
        iniciarComponentes();
    }

    private void iniciarComponentes() {
        enableComponents(panelCreacion, false);
        control = new ControllerAnioLectivo();
        cargarTabla();

    }

    private void cargarTabla() {
        try {
            table.setModel(control.getTabla());
            table.getColumnModel().getColumn(0).setResizable(false);
            table.getColumnModel().getColumn(0).setPreferredWidth(60);
            table.getColumnModel().getColumn(1).setResizable(false);
            table.getColumnModel().getColumn(1).setPreferredWidth(400);
        } catch (Exception ex) {
                JOptionPane.showMessageDialog(panelCentral, ex.getMessage(),
                        "Excepcion", JOptionPane.WARNING_MESSAGE);
            }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelCentral = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        btnNuevo = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        panelCreacion = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        textoNombre = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        textoCodigo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        setTitle("Creacion de los años lectivos");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelCentral.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 153, 153), null), "Años Creados", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Años lectivos creados");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(392, 27, -1, -1));

        jScrollPane1.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        table.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        table.setDragEnabled(true);
        jScrollPane1.setViewportView(table);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 16, 380, 190));

        btnNuevo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnNuevo.setText("NUEVO");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnModificar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnModificar.setText("MODIFICAR");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        panelCreacion.setBackground(new java.awt.Color(255, 255, 255));
        panelCreacion.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 153, 153), null), "Creacion/Modificacion de Datos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
        panelCreacion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Codigo: ");
        panelCreacion.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Nombre:");
        panelCreacion.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));
        panelCreacion.add(textoNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 242, -1));

        btnGuardar.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnGuardar.setText("GUARDAR");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        panelCreacion.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 40, 150, -1));

        btnCancelar.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnCancelar.setText("CANCELAR");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        panelCreacion.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 70, 150, -1));

        textoCodigo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        textoCodigo.setForeground(new java.awt.Color(204, 0, 0));
        textoCodigo.setText("0");
        panelCreacion.add(textoCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 40, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/imgAnioLectivo.png"))); // NOI18N

        javax.swing.GroupLayout panelCentralLayout = new javax.swing.GroupLayout(panelCentral);
        panelCentral.setLayout(panelCentralLayout);
        panelCentralLayout.setHorizontalGroup(
            panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCentralLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(panelCentralLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(panelCreacion, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelCentralLayout.setVerticalGroup(
            panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCentralLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelCentralLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btnNuevo)
                        .addGap(27, 27, 27)
                        .addComponent(btnModificar)))
                .addGap(19, 19, 19)
                .addComponent(panelCreacion, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(panelCentral, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 584, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        // this.panelCreacion.setVisible(true);
        enableComponents(panelCreacion, true);
        textoCodigo.setEnabled(false);
        btnGuardar.setText("GUARDAR");
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed

        botonModificar();
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if (btnGuardar.getText().equals("MODIFICAR")) {
            modificar();
        } else {
            botonGuardar();
        }
        cargarTabla();
        enableComponents(panelCreacion, false);
        limpiarCampos();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        enableComponents(panelCreacion, false);
    }//GEN-LAST:event_btnCancelarActionPerformed
    private void modificar() {
        try {
            AnioLectivo lectivo = obtenerCampos();
            control.actualizar(lectivo);
            JOptionPane.showMessageDialog(panelCentral, "Año lectivo modificado exitosamente",
                    "Informacion", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(panelCentral, ex.getMessage(),
                    "Excepcion", JOptionPane.WARNING_MESSAGE);
        }
    }

    private void botonModificar() {
        int codigo = seleccionTablaCodigo();

        if (codigo != -1) {
            enableComponents(panelCreacion, true);
            btnGuardar.setText("MODIFICAR");
            textoCodigo.setEnabled(false);
            AnioLectivo lectivo;
            try {
                lectivo = control.buscarPorCodigo(codigo);
                pintarCampos(lectivo);
            } catch (NullPointerException ex) {
                JOptionPane.showMessageDialog(panelCentral, ex.getMessage(),
                        "Validacion", JOptionPane.QUESTION_MESSAGE);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(panelCentral, ex.getMessage(),
                        "Excepcion", JOptionPane.WARNING_MESSAGE);
            }

        }
    }

    private int seleccionTablaCodigo() {
        int indice = table.getSelectedRow();
        if (indice == -1) {
            JOptionPane.showMessageDialog(panelCentral, "Seleccione un Año!",
                    "Validacion", JOptionPane.QUESTION_MESSAGE);
            return -1;
        } else {
            String codigo = String.valueOf(table.getValueAt(indice, 0));
            int cod = Integer.valueOf(codigo);
            return cod;
        }
    }

    private void botonGuardar() {
        AnioLectivo lectivo = obtenerCampos();
        try {
            control.registrar(lectivo);
            JOptionPane.showMessageDialog(panelCentral, "Año Lectivo registrado exitosamente.",
                    "Informacion", JOptionPane.INFORMATION_MESSAGE);
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(panelCentral, ex.getMessage(),
                    "Validacion", JOptionPane.QUESTION_MESSAGE);
        } catch (Exception ex) {
           
            JOptionPane.showMessageDialog(panelCentral, ex.getMessage(),
                    "Excepcion, revisar conexion a internet", JOptionPane.WARNING_MESSAGE);
        }

    }

    private AnioLectivo obtenerCampos() {
        int codigo;
        try {
            codigo = Integer.parseInt(textoCodigo.getText());
        } catch (NumberFormatException e) {
            codigo = 0;
        }
        String nombre = textoNombre.getText();

        return new AnioLectivo(codigo, nombre);

    }

    private void pintarCampos(AnioLectivo lectivo) {
        textoCodigo.setText("" + lectivo.getIdAnioLectivo());
        textoNombre.setText(lectivo.getNombre());

    }

    private void limpiarCampos() {
        textoCodigo.setText("");
        textoNombre.setText("");
    }

    public void enableComponents(Container container, boolean enable) {

        Component[] components = container.getComponents();
        for (Component component : components) {
            component.setEnabled(enable);
            if (component instanceof Container) {
                enableComponents((Container) component, enable);
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelCentral;
    private javax.swing.JPanel panelCreacion;
    private javax.swing.JTable table;
    private javax.swing.JLabel textoCodigo;
    private javax.swing.JTextField textoNombre;
    // End of variables declaration//GEN-END:variables
}
