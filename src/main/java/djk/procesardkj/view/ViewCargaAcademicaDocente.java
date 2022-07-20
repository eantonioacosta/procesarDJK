package djk.procesardkj.view;

import djk.procesardkj.controller.ControllerAsignaturas;
import djk.procesardkj.controller.ControllerCargaAcademica;
import djk.procesardkj.controller.ControllerDocente;
import djk.procesardkj.controller.ControllerGrupo;
import djk.procesardkj.domain.AnioLectivo;
import djk.procesardkj.domain.CargaAcademica;
import djk.procesardkj.domain.Docente;
import djk.procesardkj.domain.Grupo;
import java.awt.Component;
import java.awt.Container;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

public class ViewCargaAcademicaDocente extends javax.swing.JInternalFrame {

    ControllerGrupo controlGrupos;
    ControllerCargaAcademica controlCarga;
    ControllerDocente controlDocente;
    AnioLectivo anioLectivo;
    Grupo grupoLocal;
    CargaAcademica cargaLocal;

    public ViewCargaAcademicaDocente() {
        initComponents();
        inicarComponentes();
    }

    private void inicarComponentes() {
        controlGrupos = new ControllerGrupo();
        controlCarga = new ControllerCargaAcademica();
        controlDocente = new ControllerDocente();

        anioLectivo = ViewAdministrador.anioLectivo;
        grupoLocal = null;
        cargaLocal = null;
        cargarTablaGrupos();
        enableComponents(panelDocente, false);
        enableComponents(panelGruposConsulta, false);
        cargarComboDocente();
    }

    private void cargarTablaGrupos() {
        try {
            tablaGrupos.setModel(controlGrupos.getTablaCarga(anioLectivo));
            tablaGrupos.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
            TableColumnModel columnModel = tablaGrupos.getColumnModel();
            columnModel.getColumn(0).setPreferredWidth(30);
            columnModel.getColumn(1).setPreferredWidth(530);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(panelCentral, ex.getMessage(),
                    "Excepcion", JOptionPane.WARNING_MESSAGE);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelCentral = new javax.swing.JPanel();
        panelGrupos = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaGrupos = new javax.swing.JTable();
        panelBotones = new javax.swing.JPanel();
        botonAjustar = new javax.swing.JButton();
        botonConsulta = new javax.swing.JButton();
        botonCancelar3 = new javax.swing.JButton();
        panelGruposConsulta = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaConsulta = new javax.swing.JTable();
        panelBotonesRelacion = new javax.swing.JPanel();
        botonEliminar = new javax.swing.JButton();
        botonCancelar1 = new javax.swing.JButton();
        botonAgregar = new javax.swing.JButton();
        panelDocente = new javax.swing.JPanel();
        botonRegistrar = new javax.swing.JButton();
        botonCancelar2 = new javax.swing.JButton();
        comboDocente = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        labelAsignatura = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        txtGrado = new javax.swing.JLabel();
        txtNAsignaturas = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Creacion y modificacion - Relacion Asignaturas Docente");
        setPreferredSize(new java.awt.Dimension(1220, 640));
        setVisible(false);

        panelCentral.setBackground(new java.awt.Color(255, 255, 255));
        panelCentral.setPreferredSize(new java.awt.Dimension(1200, 640));

        panelGrupos.setBackground(new java.awt.Color(255, 255, 255));
        panelGrupos.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Grupos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jScrollPane1.setViewportView(tablaGrupos);

        panelBotones.setBackground(new java.awt.Color(255, 255, 255));
        panelBotones.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        panelBotones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonAjustar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        botonAjustar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGS/editar.png"))); // NOI18N
        botonAjustar.setText("Ajustar");
        botonAjustar.setPreferredSize(new java.awt.Dimension(100, 25));
        botonAjustar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAjustarActionPerformed(evt);
            }
        });
        panelBotones.add(botonAjustar, new org.netbeans.lib.awtextra.AbsoluteConstraints(432, 0, 130, -1));

        botonConsulta.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        botonConsulta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGS/busqueda.png"))); // NOI18N
        botonConsulta.setText("Consultar");
        botonConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonConsulta(evt);
            }
        });
        panelBotones.add(botonConsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, -1));

        botonCancelar3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        botonCancelar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGS/varita-magica.png"))); // NOI18N
        botonCancelar3.setText("Cancelar");
        botonCancelar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCancelar3ActionPerformed(evt);
            }
        });
        panelBotones.add(botonCancelar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 130, -1));

        javax.swing.GroupLayout panelGruposLayout = new javax.swing.GroupLayout(panelGrupos);
        panelGrupos.setLayout(panelGruposLayout);
        panelGruposLayout.setHorizontalGroup(
            panelGruposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGruposLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelGruposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(panelBotones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelGruposLayout.setVerticalGroup(
            panelGruposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGruposLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panelGruposConsulta.setBackground(new java.awt.Color(255, 255, 255));
        panelGruposConsulta.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Consulta relacion docente - asignaturas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jScrollPane2.setViewportView(tablaConsulta);

        panelBotonesRelacion.setBackground(new java.awt.Color(255, 255, 255));
        panelBotonesRelacion.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelBotonesRelacion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGS/basura.png"))); // NOI18N
        botonEliminar.setText("Eliminar");
        botonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarActionPerformed(evt);
            }
        });
        panelBotonesRelacion.add(botonEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 120, -1));

        botonCancelar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGS/varita-magica.png"))); // NOI18N
        botonCancelar1.setText("Cancelar");
        botonCancelar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCancelar1ActionPerformed(evt);
            }
        });
        panelBotonesRelacion.add(botonCancelar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, 120, -1));

        botonAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGS/documento_1.png"))); // NOI18N
        botonAgregar.setText("Actualizar");
        botonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarActionPerformed(evt);
            }
        });
        panelBotonesRelacion.add(botonAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 120, -1));

        javax.swing.GroupLayout panelGruposConsultaLayout = new javax.swing.GroupLayout(panelGruposConsulta);
        panelGruposConsulta.setLayout(panelGruposConsultaLayout);
        panelGruposConsultaLayout.setHorizontalGroup(
            panelGruposConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGruposConsultaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelGruposConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 546, Short.MAX_VALUE)
                    .addComponent(panelBotonesRelacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelGruposConsultaLayout.setVerticalGroup(
            panelGruposConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGruposConsultaLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelBotonesRelacion, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panelDocente.setBackground(new java.awt.Color(255, 255, 255));
        panelDocente.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Docentes disponibles", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        botonRegistrar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        botonRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGS/controlar.png"))); // NOI18N
        botonRegistrar.setText("Registrar");
        botonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistrarActionPerformed(evt);
            }
        });

        botonCancelar2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        botonCancelar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGS/varita-magica.png"))); // NOI18N
        botonCancelar2.setText("Cancelar");
        botonCancelar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCancelar2ActionPerformed(evt);
            }
        });

        comboDocente.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        comboDocente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione:" }));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Asignatura:");

        javax.swing.GroupLayout panelDocenteLayout = new javax.swing.GroupLayout(panelDocente);
        panelDocente.setLayout(panelDocenteLayout);
        panelDocenteLayout.setHorizontalGroup(
            panelDocenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDocenteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDocenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelDocenteLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(31, 31, 31)
                        .addComponent(labelAsignatura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(comboDocente, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelDocenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botonRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                    .addComponent(botonCancelar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelDocenteLayout.setVerticalGroup(
            panelDocenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDocenteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDocenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboDocente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonRegistrar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelDocenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelAsignatura, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelDocenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(botonCancelar2)
                        .addComponent(jLabel3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Monospaced", 2, 12)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("Uso de la vista <Carga Academica - Docente>\n1. Boton consultar: \n2. Boton Agregar:\n3.\n4.\n5.\n6.");
        jScrollPane4.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(0, 204, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtGrado.setBackground(new java.awt.Color(255, 255, 255));
        txtGrado.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        txtGrado.setForeground(new java.awt.Color(51, 0, 204));
        txtGrado.setText("*");

        txtNAsignaturas.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        txtNAsignaturas.setForeground(new java.awt.Color(51, 0, 204));
        txtNAsignaturas.setText("0");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("No de Asignaturas:");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Grado:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(20, 20, 20)
                .addComponent(txtGrado, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(31, 31, 31)
                .addComponent(txtNAsignaturas, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtGrado)
                        .addComponent(jLabel2)
                        .addComponent(txtNAsignaturas)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelCentralLayout = new javax.swing.GroupLayout(panelCentral);
        panelCentral.setLayout(panelCentralLayout);
        panelCentralLayout.setHorizontalGroup(
            panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCentralLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelGrupos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelDocente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelGruposConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(12, 12, 12))
        );
        panelCentralLayout.setVerticalGroup(
            panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCentralLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelGruposConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelGrupos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCentralLayout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap(83, Short.MAX_VALUE))
                    .addGroup(panelCentralLayout.createSequentialGroup()
                        .addComponent(panelDocente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCentral, javax.swing.GroupLayout.DEFAULT_SIZE, 1204, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCentral, javax.swing.GroupLayout.DEFAULT_SIZE, 610, Short.MAX_VALUE)
        );

        getAccessibleContext().setAccessibleName("Creacion y modificacion - Relacion Asignaturas Docentes");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonConsulta(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonConsulta
        botonConsultar();
    }//GEN-LAST:event_botonConsulta

    private void botonCancelar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelar2ActionPerformed
        limpiarPanelDocente();
    }//GEN-LAST:event_botonCancelar2ActionPerformed

    private void botonCancelar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelar1ActionPerformed
        enableComponents(panelDocente, false);
        enableComponents(panelGruposConsulta, false);
        enableComponents(panelGrupos, true);
        limpiarCampos();
    }//GEN-LAST:event_botonCancelar1ActionPerformed

    private void botonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistrarActionPerformed
        botonRegistrar();
    }//GEN-LAST:event_botonRegistrarActionPerformed

    private void botonAjustarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAjustarActionPerformed
        if (botonConsultar()) {
            enableComponents(panelBotonesRelacion, true);
            enableComponents(panelDocente, false);
            enableComponents(panelGrupos, false);
        }
    }//GEN-LAST:event_botonAjustarActionPerformed

    private void botonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarActionPerformed
        botonEliminar();
    }//GEN-LAST:event_botonEliminarActionPerformed

    private void botonCancelar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelar3ActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_botonCancelar3ActionPerformed

    private void botonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarActionPerformed
        botonAgregarDocente();
    }//GEN-LAST:event_botonAgregarActionPerformed
    private void botonAgregarDocente() {
        int codigo = seleccionTablaConsultaCodigo();
        if (codigo != -1) {
            try {
                cargaLocal = controlCarga.buscarPorCodigo(codigo);
                //
                enableComponents(panelDocente, true);
                enableComponents(panelGruposConsulta, false);
                labelAsignatura.setText(cargaLocal.getAsignatura().getNombreCompleto());

            } catch (NullPointerException ex) {
                JOptionPane.showMessageDialog(panelCentral, ex.getMessage(), "Validacion", JOptionPane.QUESTION_MESSAGE);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(panelCentral, ex.getMessage(), "Excepcion", JOptionPane.WARNING_MESSAGE);
            }
        }
    }

    private void botonRegistrar() {
        int indice = comboDocente.getSelectedIndex();
        if (indice == -1 || indice == 0) {
            JOptionPane.showMessageDialog(panelCentral, "Seleccionar un docente", "Validacion", JOptionPane.QUESTION_MESSAGE);
        } else {
            try {
                Docente docente = controlDocente.verDocentesActivo().get(indice - 1);
                cargaLocal.setDocente(docente);
                controlCarga.actualizar(cargaLocal);
                JOptionPane.showMessageDialog(panelCentral, "Docente registrado exitosamente.", "Informacion", JOptionPane.INFORMATION_MESSAGE);
                limpiarPanelDocente();
                botonAjustarActionPerformed(null);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(panelCentral, ex.getMessage(), "Excepcion", JOptionPane.WARNING_MESSAGE);
            }
        }
    }

    private void cargarComboDocente() {
        try {
            controlDocente.verDocentesActivo().forEach((docente) -> {
                comboDocente.addItem(docente.getNombreCompleto());
            });
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(panelCentral, ex.getMessage(),
                    "Excepcion", JOptionPane.WARNING_MESSAGE);
        }

    }

    private void botonEliminar() {
        int codigo = seleccionTablaConsultaCodigo();
        if (codigo != -1) {
            try {
                cargaLocal = controlCarga.buscarPorCodigo(codigo);
                //
                if (cargaLocal.getDocente() == null) {
                    JOptionPane.showMessageDialog(panelCentral, "No tiene docente", "Validacion", JOptionPane.QUESTION_MESSAGE);
                } else {
                    cargaLocal.setDocente(null);
                    controlCarga.actualizar(cargaLocal);
                    JOptionPane.showMessageDialog(panelCentral, "Docente eliminado exitosamente.", "Informacion", JOptionPane.INFORMATION_MESSAGE, frameIcon);
                    botonAjustarActionPerformed(null);
                }
            } catch (NullPointerException ex) {
                JOptionPane.showMessageDialog(panelCentral, ex.getMessage(), "Validacion", JOptionPane.QUESTION_MESSAGE);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(panelCentral, ex.getMessage(), "Excepcion", JOptionPane.WARNING_MESSAGE);
            }
        }
    }

    private boolean botonConsultar() {
        int codigo = seleccionTablaGrupoCodigo();
        if (codigo != -1) {
            try {
                grupoLocal = controlGrupos.buscarPorCodigo(codigo);
                tablaAsignaturasRegistradas();
                enableComponents(panelGruposConsulta, true);
                enableComponents(panelBotonesRelacion, false);
                txtGrado.setText(grupoLocal.toString());
                txtNAsignaturas.setText("" + grupoLocal.getCargaAcademicaList().size());
                return true;
            } catch (NullPointerException ex) {
                JOptionPane.showMessageDialog(panelCentral, ex.getMessage(), "Validacion", JOptionPane.QUESTION_MESSAGE);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(panelCentral, ex.getMessage(), "Excepcion", JOptionPane.WARNING_MESSAGE);
            }
        }
        grupoLocal = null;
        return false;
    }

    private int seleccionTablaGrupoCodigo() {
        int indice = tablaGrupos.getSelectedRow();
        if (indice == -1) {
            JOptionPane.showMessageDialog(panelCentral, "Seleccione un Grupo! ", "Validacion", JOptionPane.QUESTION_MESSAGE);
            return -1;
        } else {
            String codigo = String.valueOf(tablaGrupos.getValueAt(indice, 0));
            return Integer.valueOf(codigo);
        }
    }

    private int seleccionTablaConsultaCodigo() {
        int indice = tablaConsulta.getSelectedRow();
        if (indice == -1) {
            JOptionPane.showMessageDialog(panelCentral, "Seleccione un registro! ", "Validacion", JOptionPane.QUESTION_MESSAGE);
            return -1;
        } else {
            String codigo = String.valueOf(tablaConsulta.getValueAt(indice, 0));
            return Integer.valueOf(codigo);
        }
    }

    private void tablaAsignaturasRegistradas() {
        if (grupoLocal.getCargaAcademicaList().size() <= 0) {
            JOptionPane.showMessageDialog(panelCentral, "No tiene asignaturas registradas! ", "Validacion", JOptionPane.QUESTION_MESSAGE);
        }

        String[] columnas = {"#", "RELACION"};
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.setColumnIdentifiers(columnas);

        String[] fila = new String[columnas.length];
        for (CargaAcademica cargar : grupoLocal.getCargaAcademicaList()) {
            fila[0] = "" + cargar.getIdCarga();
            fila[1] = cargar.toString();
            modelo.addRow(fila);
        }
        tablaConsulta.setModel(modelo);
        tablaConsulta.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        TableColumnModel columnModel = tablaConsulta.getColumnModel();
        columnModel.getColumn(0).setPreferredWidth(30);
        columnModel.getColumn(1).setPreferredWidth(516);
    }

    private void limpiarCampos() {
        txtGrado.setText("");
        txtNAsignaturas.setText("");
        tablaConsulta.setModel(new DefaultTableModel());

    }

    private void limpiarPanelDocente() {
        labelAsignatura.setText("");
        comboDocente.setSelectedIndex(0);
        enableComponents(panelDocente, false);
        enableComponents(panelGruposConsulta, true);
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
    private javax.swing.JButton botonAgregar;
    private javax.swing.JButton botonAjustar;
    private javax.swing.JButton botonCancelar1;
    private javax.swing.JButton botonCancelar2;
    private javax.swing.JButton botonCancelar3;
    private javax.swing.JButton botonConsulta;
    private javax.swing.JButton botonEliminar;
    private javax.swing.JButton botonRegistrar;
    private javax.swing.JComboBox<String> comboDocente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel labelAsignatura;
    private javax.swing.JPanel panelBotones;
    private javax.swing.JPanel panelBotonesRelacion;
    private javax.swing.JPanel panelCentral;
    private javax.swing.JPanel panelDocente;
    private javax.swing.JPanel panelGrupos;
    private javax.swing.JPanel panelGruposConsulta;
    private javax.swing.JTable tablaConsulta;
    private javax.swing.JTable tablaGrupos;
    private javax.swing.JLabel txtGrado;
    private javax.swing.JLabel txtNAsignaturas;
    // End of variables declaration//GEN-END:variables
}
