package djk.procesardkj.view;

import djk.procesardkj.controller.ControllerAsignaturas;
import djk.procesardkj.controller.ControllerCargaAcademica;
import djk.procesardkj.controller.ControllerGrupo;
import djk.procesardkj.domain.AnioLectivo;
import djk.procesardkj.domain.Asignatura;
import djk.procesardkj.domain.CargaAcademica;
import djk.procesardkj.domain.Grupo;
import java.awt.Component;
import java.awt.Container;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

public class ViewCargaAcademica extends javax.swing.JInternalFrame {

    ControllerGrupo controlGrupos;
    ControllerCargaAcademica controlCarga;
    ControllerAsignaturas controlAsignatura;
    AnioLectivo anioLectivo;
    Grupo grupoLocal;

    public ViewCargaAcademica() {
        initComponents();
        inicarComponentes();
    }

    private void inicarComponentes() {
        controlGrupos = new ControllerGrupo();
        controlCarga = new ControllerCargaAcademica();
        controlAsignatura = new ControllerAsignaturas();
        anioLectivo = ViewAdministrador.anioLectivo;
        grupoLocal = null;
        cargarTablaGrupos();
        enableComponents(panelAsignaturas, false);
        enableComponents(panelGruposConsulta, false);
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
        botonAgregar = new javax.swing.JButton();
        botonAjustar = new javax.swing.JButton();
        botonConsulta = new javax.swing.JButton();
        panelGruposConsulta = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaConsulta = new javax.swing.JTable();
        panelBotonesEliminar = new javax.swing.JPanel();
        botonEliminar = new javax.swing.JButton();
        botonCancelar1 = new javax.swing.JButton();
        panelAsignaturas = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaAsignatura = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        botonGuardar = new javax.swing.JButton();
        botonCancelar2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        txtGrado = new javax.swing.JLabel();
        txtNAsignaturas = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Creacion y modificacion - Relacion grupos asignaturas");
        setPreferredSize(new java.awt.Dimension(1220, 640));
        setVisible(false);

        panelCentral.setBackground(new java.awt.Color(255, 255, 255));
        panelCentral.setPreferredSize(new java.awt.Dimension(1200, 640));

        panelGrupos.setBackground(new java.awt.Color(204, 204, 204));
        panelGrupos.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Grupos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jScrollPane1.setViewportView(tablaGrupos);

        panelBotones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonAgregar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        botonAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGS/documento_1.png"))); // NOI18N
        botonAgregar.setText("Agregar");
        botonAgregar.setPreferredSize(new java.awt.Dimension(100, 25));
        botonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarActionPerformed(evt);
            }
        });
        panelBotones.add(botonAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 130, -1));

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
        panelBotones.add(botonConsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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

        panelGruposConsulta.setBackground(new java.awt.Color(204, 204, 204));
        panelGruposConsulta.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Consulta asignaturas asociadas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jScrollPane2.setViewportView(tablaConsulta);

        panelBotonesEliminar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonEliminar.setText("Eliminar");
        botonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarActionPerformed(evt);
            }
        });
        panelBotonesEliminar.add(botonEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 114, -1));

        botonCancelar1.setText("Cancelar");
        botonCancelar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCancelar1ActionPerformed(evt);
            }
        });
        panelBotonesEliminar.add(botonCancelar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 114, -1));

        javax.swing.GroupLayout panelGruposConsultaLayout = new javax.swing.GroupLayout(panelGruposConsulta);
        panelGruposConsulta.setLayout(panelGruposConsultaLayout);
        panelGruposConsultaLayout.setHorizontalGroup(
            panelGruposConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGruposConsultaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelGruposConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(panelGruposConsultaLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(panelBotonesEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panelGruposConsultaLayout.setVerticalGroup(
            panelGruposConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGruposConsultaLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelBotonesEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panelAsignaturas.setBackground(new java.awt.Color(204, 204, 204));
        panelAsignaturas.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Asignaturas disponibles", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jScrollPane3.setViewportView(tablaAsignatura);

        botonGuardar.setText("Guardar");
        botonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarActionPerformed(evt);
            }
        });

        botonCancelar2.setText("Cancelar");
        botonCancelar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCancelar2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelAsignaturasLayout = new javax.swing.GroupLayout(panelAsignaturas);
        panelAsignaturas.setLayout(panelAsignaturasLayout);
        panelAsignaturasLayout.setHorizontalGroup(
            panelAsignaturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAsignaturasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelAsignaturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addGroup(panelAsignaturasLayout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                        .addComponent(botonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(botonCancelar2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panelAsignaturasLayout.setVerticalGroup(
            panelAsignaturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAsignaturasLayout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelAsignaturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonCancelar2)
                    .addComponent(botonGuardar)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Monospaced", 2, 12)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("Uso de la vista <Carga Academica - Grupos>\n1. Boton consultar: Busca las asignaturas previamente registradas hacia este grupo.\n2. Boton Agregar:\n3.\n4.\n5.\n6.");
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
                .addComponent(jScrollPane4)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
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
                    .addComponent(panelAsignaturas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(panelAsignaturas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(47, Short.MAX_VALUE))
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

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonConsulta(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonConsulta
        botonConsultar();
    }//GEN-LAST:event_botonConsulta

    private void botonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarActionPerformed
        if (botonConsultar()) {
            botonAgregar();
            enableComponents(panelAsignaturas, true);
            enableComponents(panelGrupos, false);
            txtGrado.setText(grupoLocal.toString());
            txtNAsignaturas.setText("" + grupoLocal.getCargaAcademicaList().size());
        }

    }//GEN-LAST:event_botonAgregarActionPerformed

    private void botonCancelar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelar2ActionPerformed
        enableComponents(panelAsignaturas, false);
        enableComponents(panelGruposConsulta, false);
        enableComponents(panelGrupos, true);
        limpiarCampos();
    }//GEN-LAST:event_botonCancelar2ActionPerformed

    private void botonCancelar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelar1ActionPerformed
        enableComponents(panelAsignaturas, false);
        enableComponents(panelGruposConsulta, false);
        enableComponents(panelGrupos, true);
        limpiarCampos();
    }//GEN-LAST:event_botonCancelar1ActionPerformed

    private void botonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarActionPerformed
        botonGuardar();
    }//GEN-LAST:event_botonGuardarActionPerformed

    private void botonAjustarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAjustarActionPerformed
        if (botonConsultar()) {
            enableComponents(panelBotonesEliminar, true);
            enableComponents(panelAsignaturas, false);
            enableComponents(panelGrupos, false);
            txtGrado.setText(grupoLocal.toString());
            txtNAsignaturas.setText("" + grupoLocal.getCargaAcademicaList().size());
        }
    }//GEN-LAST:event_botonAjustarActionPerformed

    private void botonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarActionPerformed
        botonEliminar();
    }//GEN-LAST:event_botonEliminarActionPerformed
    private void botonEliminar() {
        int codigo = seleccionTablaConsultaCodigo();
        if (codigo != -1) {
            try {
                controlCarga.eliminar(codigo);
                JOptionPane.showMessageDialog(panelCentral, "Asignatura eliminada exitosamente.",
                        "Informacion", JOptionPane.INFORMATION_MESSAGE, frameIcon);
                botonAjustarActionPerformed(null);
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
                enableComponents(panelBotonesEliminar, false);
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

    private void botonAgregar() {
        try {
            List<Asignatura> listaAsignatura = controlAsignatura.verAsignaturas();
            for (CargaAcademica cargaAcademica : grupoLocal.getCargaAcademicaList()) {
                for (Asignatura asignatura : controlAsignatura.verAsignaturas()) {
                    if (asignatura.getIdAsignatura() == cargaAcademica.getAsignatura().getIdAsignatura()) {
                        listaAsignatura.remove(asignatura);
                    }
                }
            }
            String[] columnas = {"#", "NOMBRE", "AREA"};
            DefaultTableModel modelo = new DefaultTableModel();
            modelo.setColumnIdentifiers(columnas);

            String[] fila = new String[columnas.length];
            for (Asignatura asignatura : listaAsignatura) {
                fila[0] = "" + asignatura.getIdAsignatura();
                fila[1] = asignatura.getNombre();
                fila[2] = asignatura.getArea().getNombre();

                modelo.addRow(fila);
            }
            if (listaAsignatura.isEmpty()) {
                JOptionPane.showMessageDialog(panelCentral, "No hay asignaturas disponibles para este grupo", "Validacion", JOptionPane.QUESTION_MESSAGE);
                tablaAsignatura.setModel(new DefaultTableModel());
            } else {
                tablaAsignatura.setModel(modelo);
                tablaAsignatura.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
                TableColumnModel columnModel = tablaAsignatura.getColumnModel();
                columnModel.getColumn(0).setPreferredWidth(30);
                columnModel.getColumn(1).setPreferredWidth(264);
                columnModel.getColumn(2).setPreferredWidth(250);
            }
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(panelCentral, ex.getMessage(), "Validacion", JOptionPane.QUESTION_MESSAGE);
        } catch (Exception ex) {
            System.out.println(ex.getStackTrace());
            JOptionPane.showMessageDialog(panelCentral, ex.getMessage(), "Excepcion", JOptionPane.WARNING_MESSAGE);
        }

    }

    private void botonGuardar() {
        int codigo = seleccionTablaAsignaturaCodigo();
        if (codigo != -1) {
            try {
                Asignatura asignatura = controlAsignatura.buscarPorCodigo(codigo);
                CargaAcademica cargaNew = new CargaAcademica(asignatura, grupoLocal, anioLectivo);
                controlCarga.registrar(cargaNew);
                JOptionPane.showMessageDialog(panelCentral, "Asignatura registrada exitosamente.", "Informacion", JOptionPane.INFORMATION_MESSAGE);
                botonAgregarActionPerformed(null);
            } catch (NullPointerException ex) {
                JOptionPane.showMessageDialog(panelCentral, ex.getMessage(), "Validacion", JOptionPane.QUESTION_MESSAGE);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(panelCentral, ex.getMessage(), "Excepcion", JOptionPane.WARNING_MESSAGE);
            }
        }
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

    private int seleccionTablaAsignaturaCodigo() {
        int indice = tablaAsignatura.getSelectedRow();
        if (indice == -1) {
            JOptionPane.showMessageDialog(panelCentral, "Seleccione una asignatura! ", "Validacion", JOptionPane.QUESTION_MESSAGE);
            return -1;
        } else {
            String codigo = String.valueOf(tablaAsignatura.getValueAt(indice, 0));
            return Integer.valueOf(codigo);
        }
    }

    private int seleccionTablaConsultaCodigo() {
        int indice = tablaConsulta.getSelectedRow();
        if (indice == -1) {
            JOptionPane.showMessageDialog(panelCentral, "Seleccione una asignatura! ", "Validacion", JOptionPane.QUESTION_MESSAGE);
            return -1;
        } else {
            String codigo = String.valueOf(tablaConsulta.getValueAt(indice, 3));
            return Integer.valueOf(codigo);
        }
    }

    private void tablaAsignaturasRegistradas() {
        if (grupoLocal.getCargaAcademicaList().size() <= 0) {
            JOptionPane.showMessageDialog(panelCentral, "No tiene asignaturas registradas! ", "Validacion", JOptionPane.QUESTION_MESSAGE);
        }

        String[] columnas = {"#", "NOMBRE", "AREA", "REF"};
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.setColumnIdentifiers(columnas);

        String[] fila = new String[columnas.length];
        for (CargaAcademica cargar : grupoLocal.getCargaAcademicaList()) {
            fila[0] = "" + cargar.getAsignatura().getIdAsignatura();
            fila[1] = cargar.getAsignatura().getNombre();
            fila[2] = cargar.getAsignatura().getArea().getNombre();
            fila[3] = "" + cargar.getIdCarga();
            modelo.addRow(fila);
        }
        tablaConsulta.setModel(modelo);
        tablaConsulta.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        TableColumnModel columnModel = tablaConsulta.getColumnModel();
        columnModel.getColumn(0).setPreferredWidth(30);
        columnModel.getColumn(1).setPreferredWidth(264);
        columnModel.getColumn(2).setPreferredWidth(250);
        columnModel.getColumn(3).setPreferredWidth(30);
    }

    private void limpiarCampos() {
        txtGrado.setText("");
        txtNAsignaturas.setText("");
        tablaAsignatura.setModel(new DefaultTableModel());
        tablaConsulta.setModel(new DefaultTableModel());
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
    private javax.swing.JButton botonConsulta;
    private javax.swing.JButton botonEliminar;
    private javax.swing.JButton botonGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPanel panelAsignaturas;
    private javax.swing.JPanel panelBotones;
    private javax.swing.JPanel panelBotonesEliminar;
    private javax.swing.JPanel panelCentral;
    private javax.swing.JPanel panelGrupos;
    private javax.swing.JPanel panelGruposConsulta;
    private javax.swing.JTable tablaAsignatura;
    private javax.swing.JTable tablaConsulta;
    private javax.swing.JTable tablaGrupos;
    private javax.swing.JLabel txtGrado;
    private javax.swing.JLabel txtNAsignaturas;
    // End of variables declaration//GEN-END:variables
}
