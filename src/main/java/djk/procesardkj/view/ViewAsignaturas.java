package djk.procesardkj.view;

import djk.procesardkj.controller.ControllerAreasAsignaturas;
import djk.procesardkj.controller.ControllerAsignaturas;
import djk.procesardkj.datos.exceptions.IllegalOrphanException;
import djk.procesardkj.datos.exceptions.NonexistentEntityException;
import djk.procesardkj.domain.Area;
import djk.procesardkj.domain.Asignatura;
import java.awt.Component;
import java.awt.Container;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.TableColumnModel;

public class ViewAsignaturas extends javax.swing.JInternalFrame {

    ControllerAreasAsignaturas controlArea;
    ControllerAsignaturas controlAsignatura;

    public ViewAsignaturas() {
        initComponents();
        iniciarComponentes();
    }

    private void iniciarComponentes() {
        enableComponents(panelCreacionAsignatura, false);
        enableComponents(panelCreacionArea, false);
        controlAsignatura = new ControllerAsignaturas();
        controlArea = new ControllerAreasAsignaturas();
        cargarTablaArea();
        cargarTablaAsignaturas();
    }

    private void cargarTablaArea() {
        try {
            tablaArea.setModel(controlArea.getTabla());
            tablaArea.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
            TableColumnModel columnModel = tablaArea.getColumnModel();
            columnModel.getColumn(0).setPreferredWidth(35);
            columnModel.getColumn(1).setPreferredWidth(400);
            columnModel.getColumn(2).setPreferredWidth(70);
            cargarComboArea();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(PanelArea, ex.getMessage(), "Excepcion", JOptionPane.WARNING_MESSAGE);
        }

    }

    private void cargarTablaAsignaturas() {
        try {
            tablaAsignatura.setModel(controlAsignatura.getTabla());
            tablaAsignatura.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
            TableColumnModel columnModel = tablaAsignatura.getColumnModel();
            columnModel.getColumn(0).setPreferredWidth(35);
            columnModel.getColumn(1).setPreferredWidth(200);
            columnModel.getColumn(2).setPreferredWidth(300);
            columnModel.getColumn(3).setPreferredWidth(70);
            columnModel.getColumn(4).setPreferredWidth(200);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(PanelArea, ex.getMessage(),
                    "Excepcion", JOptionPane.WARNING_MESSAGE);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        PanelArea = new javax.swing.JPanel();
        btnNuevoArea = new javax.swing.JButton();
        btnModificarArea = new javax.swing.JButton();
        btnEliminarArea = new javax.swing.JButton();
        panelCreacionArea = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        textoNombreArea = new javax.swing.JTextField();
        btnGuardarArea = new javax.swing.JButton();
        btnCancelarArea = new javax.swing.JButton();
        labelCodigoArea = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaArea = new javax.swing.JTable();
        panelAsignaturas = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaAsignatura = new javax.swing.JTable();
        btnNuevo = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        panelCreacionAsignatura = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        spinnerHoraria = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        textoNombre = new javax.swing.JTextField();
        textoNombreCompleto = new javax.swing.JTextField();
        comboArea = new javax.swing.JComboBox<>();
        comboPorcentaje = new javax.swing.JComboBox<>();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        labelCodigo = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Creacion y modificacion de Areas/Asignaturas");
        setMinimumSize(new java.awt.Dimension(859, 640));
        setPreferredSize(new java.awt.Dimension(1000, 640));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        PanelArea.setBackground(new java.awt.Color(255, 255, 255));
        PanelArea.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Areas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
        PanelArea.setPreferredSize(new java.awt.Dimension(909, 180));
        PanelArea.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnNuevoArea.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnNuevoArea.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGS/documento_1.png"))); // NOI18N
        btnNuevoArea.setText("NUEVO");
        btnNuevoArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoAreaActionPerformed(evt);
            }
        });
        PanelArea.add(btnNuevoArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 20, 120, -1));

        btnModificarArea.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnModificarArea.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGS/editar.png"))); // NOI18N
        btnModificarArea.setText("MODIFICAR");
        btnModificarArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarAreaActionPerformed(evt);
            }
        });
        PanelArea.add(btnModificarArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 20, -1, -1));

        btnEliminarArea.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnEliminarArea.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGS/basura.png"))); // NOI18N
        btnEliminarArea.setText("ELIMINAR");
        btnEliminarArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarAreaActionPerformed(evt);
            }
        });
        PanelArea.add(btnEliminarArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 20, -1, -1));

        panelCreacionArea.setBackground(new java.awt.Color(255, 255, 255));
        panelCreacionArea.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Creacion / Modificacion de Datos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
        panelCreacionArea.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel1.setText("Codigo:");
        panelCreacionArea.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Nombre:");
        panelCreacionArea.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));
        panelCreacionArea.add(textoNombreArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 240, -1));

        btnGuardarArea.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnGuardarArea.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGS/controlar.png"))); // NOI18N
        btnGuardarArea.setText("GUARDAR");
        btnGuardarArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarAreaActionPerformed(evt);
            }
        });
        panelCreacionArea.add(btnGuardarArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, -1, -1));

        btnCancelarArea.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnCancelarArea.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGS/varita-magica.png"))); // NOI18N
        btnCancelarArea.setText("CANCELAR");
        btnCancelarArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarAreaActionPerformed(evt);
            }
        });
        panelCreacionArea.add(btnCancelarArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, -1, -1));

        labelCodigoArea.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelCodigoArea.setForeground(new java.awt.Color(204, 0, 0));
        labelCodigoArea.setText("0");
        panelCreacionArea.add(labelCodigoArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(335, 10, 40, -1));

        PanelArea.add(panelCreacionArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 60, 390, 110));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Areas creadas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        jScrollPane1.setViewportView(tablaArea);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 458, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
        );

        PanelArea.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 470, 160));

        panelAsignaturas.setBackground(new java.awt.Color(255, 255, 255));
        panelAsignaturas.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Asignaturas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Asignaturas creadas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        tablaAsignatura.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tablaAsignatura);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
        );

        btnNuevo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGS/documento_1.png"))); // NOI18N
        btnNuevo.setText("NUEVO");
        btnNuevo.setPreferredSize(new java.awt.Dimension(117, 25));
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnModificar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGS/editar.png"))); // NOI18N
        btnModificar.setText("MODIFICAR");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGS/basura.png"))); // NOI18N
        btnEliminar.setText("ELIMINAR");
        btnEliminar.setMaximumSize(new java.awt.Dimension(97, 23));
        btnEliminar.setMinimumSize(new java.awt.Dimension(97, 23));
        btnEliminar.setPreferredSize(new java.awt.Dimension(117, 25));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        panelCreacionAsignatura.setBackground(new java.awt.Color(255, 255, 255));
        panelCreacionAsignatura.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Creacion / Modificacion de Datos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
        panelCreacionAsignatura.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Codigo:");
        panelCreacionAsignatura.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 30, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Nombre Menú:");
        panelCreacionAsignatura.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 63, -1, -1));

        spinnerHoraria.setModel(new javax.swing.SpinnerNumberModel(1, 1, 10, 1));
        panelCreacionAsignatura.add(spinnerHoraria, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 30, 55, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Intensidad horaria:");
        panelCreacionAsignatura.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 30, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Nombre Completo:");
        panelCreacionAsignatura.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 94, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Porcentaje de Nota:");
        panelCreacionAsignatura.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 60, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Area:");
        panelCreacionAsignatura.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 125, -1, -1));
        panelCreacionAsignatura.add(textoNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 61, 201, -1));
        panelCreacionAsignatura.add(textoNombreCompleto, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 92, 341, -1));

        comboArea.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione un area:" }));
        panelCreacionAsignatura.add(comboArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 123, 341, -1));

        comboPorcentaje.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0%", "10%", "20%", "30%", "40%", "50%", "60%", "70%", "80%", "90%", "100%" }));
        panelCreacionAsignatura.add(comboPorcentaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 60, -1, -1));

        btnGuardar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGS/controlar.png"))); // NOI18N
        btnGuardar.setText("GUARDAR");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        panelCreacionAsignatura.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 50, -1, -1));

        btnCancelar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGS/varita-magica.png"))); // NOI18N
        btnCancelar.setText("CANCELAR");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        panelCreacionAsignatura.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 110, -1, -1));

        labelCodigo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelCodigo.setForeground(new java.awt.Color(204, 0, 0));
        labelCodigo.setText("0");
        panelCreacionAsignatura.add(labelCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 30, 55, -1));

        javax.swing.GroupLayout panelAsignaturasLayout = new javax.swing.GroupLayout(panelAsignaturas);
        panelAsignaturas.setLayout(panelAsignaturasLayout);
        panelAsignaturasLayout.setHorizontalGroup(
            panelAsignaturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAsignaturasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelAsignaturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAsignaturasLayout.createSequentialGroup()
                        .addComponent(panelCreacionAsignatura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(panelAsignaturasLayout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addGroup(panelAsignaturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnModificar, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnNuevo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31))))
        );
        panelAsignaturasLayout.setVerticalGroup(
            panelAsignaturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAsignaturasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelAsignaturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelAsignaturasLayout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(panelAsignaturasLayout.createSequentialGroup()
                        .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnModificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)))
                .addComponent(panelCreacionAsignatura, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelArea, javax.swing.GroupLayout.DEFAULT_SIZE, 964, Short.MAX_VALUE)
                    .addComponent(panelAsignaturas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelArea, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelAsignaturas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoAreaActionPerformed
        enableComponents(panelCreacionArea, true);
        labelCodigoArea.setEnabled(false);
        btnGuardarArea.setText("GUARDAR");
    }//GEN-LAST:event_btnNuevoAreaActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        enableComponents(panelCreacionAsignatura, true);
        labelCodigo.setEnabled(false);
        btnGuardar.setText("GUARDAR");
        cargarComboArea();

    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnGuardarAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarAreaActionPerformed
        if (btnGuardarArea.getText().equals("MODIFICAR")) {
            modificarArea();

        } else {
            botonGuardarArea();
        }
        cargarTablaArea();
    }//GEN-LAST:event_btnGuardarAreaActionPerformed

    private void btnCancelarAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarAreaActionPerformed
        limpiarCamposArea();
        enableComponents(panelCreacionArea, false);
    }//GEN-LAST:event_btnCancelarAreaActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        limpiarCamposAsignatura();
        enableComponents(panelCreacionAsignatura, false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnModificarAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarAreaActionPerformed
        botonModificarArea();
    }//GEN-LAST:event_btnModificarAreaActionPerformed

    private void btnEliminarAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarAreaActionPerformed
        enableComponents(panelCreacionArea, false);
        limpiarCamposArea();
        botonEliminarArea();
    }//GEN-LAST:event_btnEliminarAreaActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        botonModificarAsignatura();
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if (btnGuardar.getText().equals("MODIFICAR")) {
            modificarAsignatura();

        } else {
            botonGuardarAsignatura();
        }
        cargarTablaAsignaturas();
        cargarTablaArea();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        enableComponents(panelCreacionAsignatura, false);
        limpiarCamposAsignatura();
        botonEliminarAsignatura();
    }//GEN-LAST:event_btnEliminarActionPerformed
    private void botonGuardarArea() {
        Area area = obtenerArea();
        try {
            controlArea.registrar(area);
            JOptionPane.showMessageDialog(PanelArea, "Area registrada exitosamente.",
                    "Informacion", JOptionPane.INFORMATION_MESSAGE);
            limpiarCamposArea();
            enableComponents(panelCreacionArea, false);
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(PanelArea, ex.getMessage(),
                    "Validacion", JOptionPane.QUESTION_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(PanelArea, ex.getMessage(),
                    "Excepcion", JOptionPane.WARNING_MESSAGE);
        }

    }

    private void botonGuardarAsignatura() {
        Asignatura asignatura = obtenerAsignatura();
        try {
            controlAsignatura.registrar(asignatura);
            JOptionPane.showMessageDialog(panelAsignaturas, "Asignatura registrada exitosamente.", "Informacion", JOptionPane.INFORMATION_MESSAGE);
            limpiarCamposAsignatura();
            enableComponents(panelCreacionAsignatura, false);
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(panelAsignaturas, ex.getMessage(),
                    "Validacion", JOptionPane.QUESTION_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(panelAsignaturas, ex.getMessage(),
                    "Excepcion", JOptionPane.WARNING_MESSAGE);
        }

    }

    private void botonEliminarArea() {
        int codigo = seleccionTablaCodigoArea();

        if (codigo != -1) {
            if (JOptionPane.showConfirmDialog(PanelArea, "Seguro que desea eliminar el Area?",
                    "AVISO", JOptionPane.WARNING_MESSAGE, JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                try {
                    controlArea.eliminar(codigo);
                    JOptionPane.showMessageDialog(PanelArea, "Area eliminado exitosamente.",
                            "Informacion", JOptionPane.INFORMATION_MESSAGE);
                    cargarTablaArea();
                } catch (NullPointerException ex) {
                    JOptionPane.showMessageDialog(PanelArea, ex.getMessage(),
                            "Validacion", JOptionPane.QUESTION_MESSAGE);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(PanelArea, ex.getMessage(),
                            "Excepcion", JOptionPane.WARNING_MESSAGE);
                }
            }
        }
    }

    private void botonEliminarAsignatura() {
        int codigo = seleccionTablaCodigoAsignatura();

        if (codigo != -1) {
            if (JOptionPane.showConfirmDialog(panelAsignaturas, "Seguro que desea eliminar la asignatura?",
                    "AVISO", JOptionPane.WARNING_MESSAGE, JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                try {
                    controlAsignatura.eliminar(codigo);
                    JOptionPane.showMessageDialog(panelAsignaturas, "asignatura eliminado exitosamente.",
                            "Informacion", JOptionPane.INFORMATION_MESSAGE);
                    cargarTablaAsignaturas();
                } catch (NullPointerException ex) {
                    JOptionPane.showMessageDialog(panelAsignaturas, ex.getMessage(),
                            "Validacion", JOptionPane.QUESTION_MESSAGE);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(panelAsignaturas, ex.getMessage(),
                            "Excepcion", JOptionPane.WARNING_MESSAGE);
                }
            }
        }
    }

    private void modificarArea() {
        try {
            Area area = obtenerAreaActualizar();
            controlArea.actualizar(area);
            JOptionPane.showMessageDialog(PanelArea, "Area modificada exitosamente.",
                    "Informacion", JOptionPane.INFORMATION_MESSAGE);
            limpiarCamposArea();
            enableComponents(panelCreacionArea, false);
        } catch (NullPointerException | IllegalOrphanException | NonexistentEntityException ex) {
            ex.printStackTrace(System.out);
            JOptionPane.showMessageDialog(PanelArea, ex.getMessage(), "Validacion", JOptionPane.QUESTION_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(PanelArea, ex.getMessage(), "Excepcion", JOptionPane.WARNING_MESSAGE);
        }
    }

    private void modificarAsignatura() {
        try {
            Asignatura asignatura = obtenerAsignaturaActualizar();
            controlAsignatura.actualizar(asignatura);
            JOptionPane.showMessageDialog(panelAsignaturas, "Asignatura modificada exitosamente.",
                    "Informacion", JOptionPane.INFORMATION_MESSAGE);
            limpiarCamposArea();
            enableComponents(panelCreacionAsignatura, false);
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(panelAsignaturas, ex.getMessage(), "Validacion", JOptionPane.QUESTION_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(panelAsignaturas, ex.getMessage(), "Excepcion", JOptionPane.WARNING_MESSAGE);
        }
    }

    private void cargarComboArea() {
        eliminarItemComboArea();
        try {
            List<Area> lista = controlArea.verAreas();
            lista.forEach((area) -> {
                comboArea.addItem(area.getNombre());
            });
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(panelCreacionAsignatura, ex.getMessage(), "Excepcion", JOptionPane.WARNING_MESSAGE);
        }
    }

    private void botonModificarArea() {
        int codigo = seleccionTablaCodigoArea();
        if (codigo != -1) {
            enableComponents(PanelArea, true);
            btnGuardarArea.setText("MODIFICAR");
            labelCodigoArea.setEnabled(false);

            Area area;
            try {
                area = controlArea.buscarPorCodigo(codigo);
                pintarCamposArea(area);
            } catch (NullPointerException ex) {
                JOptionPane.showMessageDialog(PanelArea, ex.getMessage(), "Validacion", JOptionPane.QUESTION_MESSAGE);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(PanelArea, ex.getMessage(), "Excepcion", JOptionPane.WARNING_MESSAGE);
            }

        }
    }

    private void botonModificarAsignatura() {//Modificando
        int codigo = seleccionTablaCodigoAsignatura();
        if (codigo != -1) {
            enableComponents(panelAsignaturas, true);
            btnGuardar.setText("MODIFICAR");
            labelCodigo.setEnabled(false);

            Asignatura asignatura;
            try {
                asignatura = controlAsignatura.buscarPorCodigo(codigo);
                pintarCamposAsignatura(asignatura);
            } catch (NullPointerException ex) {
                JOptionPane.showMessageDialog(panelAsignaturas, ex.getMessage(), "Validacion", JOptionPane.QUESTION_MESSAGE);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(panelAsignaturas, ex.getMessage(), "Excepcion", JOptionPane.WARNING_MESSAGE);
            }

        }
    }

    private Area obtenerArea() {
        int codigo = Integer.valueOf(labelCodigoArea.getText());
        String nombre = textoNombreArea.getText();
        return new Area(codigo, nombre);
    }

    private Area obtenerAreaActualizar() {
        int codigo = Integer.valueOf(labelCodigoArea.getText());
        try {
            Area area = controlArea.buscarPorCodigo(codigo);
            area.setNombre(textoNombreArea.getText());
            return area;
        } catch (Exception ex) {
            return null;
        }
    }

    private Asignatura obtenerAsignatura() {
        int codigo = Integer.valueOf(labelCodigo.getText());
        String nombre = textoNombre.getText();
        String nombreCompleto = textoNombreCompleto.getText();
        int iHoraria = (int) spinnerHoraria.getValue();
        int porcentaje = comboPorcentaje.getSelectedIndex();
        int itemArea = comboArea.getSelectedIndex() - 1;
        Area area;
        try {
            area = controlArea.buscarPorItem(itemArea);
        } catch (Exception ex) {
            area = null;
        }
        return new Asignatura(codigo, nombre, iHoraria, nombreCompleto, porcentaje, area);
    }

    private Asignatura obtenerAsignaturaActualizar() {
        int codigo = Integer.valueOf(labelCodigo.getText());
        try {
            Asignatura asignatura = controlAsignatura.buscarPorCodigo(codigo);
            asignatura.setNombre(textoNombre.getText());
            asignatura.setNombreCompleto(textoNombreCompleto.getText());
            asignatura.setIHoraria((int) spinnerHoraria.getValue());
            asignatura.setPorcentaje(comboPorcentaje.getSelectedIndex());
            int itemArea = comboArea.getSelectedIndex() - 1;
            Area area;
            
            try {
                area = controlArea.buscarPorItem(itemArea);
            } catch (Exception ex) {
                area = null;
            }
            asignatura.setArea(area);
            return asignatura;
        } catch (Exception ex) {
            return null;
        }
    }

    private int seleccionTablaCodigoArea() {
        int indice = tablaArea.getSelectedRow();
        if (indice == -1) {
            JOptionPane.showMessageDialog(PanelArea, "Seleccione un Area!", "Validacion", JOptionPane.INFORMATION_MESSAGE);
            return -1;
        } else {
            String codigo = String.valueOf(tablaArea.getValueAt(indice, 0));
            int cod = Integer.valueOf(codigo);
            return cod;
        }
    }

    private int seleccionTablaCodigoAsignatura() {
        int indice = tablaAsignatura.getSelectedRow();
        if (indice == -1) {
            JOptionPane.showMessageDialog(panelAsignaturas, "Seleccione una Asignatura!", "Validacion", JOptionPane.INFORMATION_MESSAGE);
            return -1;
        } else {
            String codigo = String.valueOf(tablaAsignatura.getValueAt(indice, 0));
            int cod = Integer.valueOf(codigo);
            return cod;
        }
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

    private void pintarCamposArea(Area area) {
        labelCodigoArea.setText("" + area.getIdArea());
        textoNombreArea.setText(area.getNombre());
    }

    private void pintarCamposAsignatura(Asignatura asignatura) {
        labelCodigo.setText("" + asignatura.getIdAsignatura());
        textoNombre.setText(asignatura.getNombre());
        textoNombreCompleto.setText(asignatura.getNombreCompleto());
        spinnerHoraria.setValue(asignatura.getIHoraria());
        comboPorcentaje.setSelectedIndex(asignatura.getPorcentaje());

        try {
            int indice = controlArea.buscarPorIndice(asignatura.getArea().getIdArea());
            comboArea.setSelectedIndex(indice);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(panelAsignaturas, ex.getMessage(), "Excepción", JOptionPane.WARNING_MESSAGE);
        }

    }

    private void limpiarCamposArea() {
        textoNombreArea.setText("");
        labelCodigoArea.setText("0");
    }

    private void limpiarCamposAsignatura() {
        labelCodigo.setText("0");
        comboArea.setSelectedIndex(0);
        comboArea.setSelectedIndex(0);
        textoNombre.setText("");
        textoNombreCompleto.setText("");
        spinnerHoraria.setValue(1);
    }

    private void eliminarItemComboArea() {
        comboArea.removeAllItems();
        comboArea.addItem("Seleccione un area:");
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelArea;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCancelarArea;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnEliminarArea;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnGuardarArea;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnModificarArea;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnNuevoArea;
    private javax.swing.JComboBox<String> comboArea;
    private javax.swing.JComboBox<String> comboPorcentaje;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelCodigo;
    private javax.swing.JLabel labelCodigoArea;
    private javax.swing.JPanel panelAsignaturas;
    private javax.swing.JPanel panelCreacionArea;
    private javax.swing.JPanel panelCreacionAsignatura;
    private javax.swing.JSpinner spinnerHoraria;
    private javax.swing.JTable tablaArea;
    private javax.swing.JTable tablaAsignatura;
    private javax.swing.JTextField textoNombre;
    private javax.swing.JTextField textoNombreArea;
    private javax.swing.JTextField textoNombreCompleto;
    // End of variables declaration//GEN-END:variables
}
