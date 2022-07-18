/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package djk.procesardkj.view;

import djk.procesardkj.controller.ControllerDocente;
import djk.procesardkj.controller.ControllerGrupo;
import djk.procesardkj.domain.AnioLectivo;
import djk.procesardkj.domain.Docente;
import djk.procesardkj.domain.Grupo;
import java.awt.Component;
import java.awt.Container;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.TableColumnModel;

public class ViewGrupos extends javax.swing.JInternalFrame {

    /**
     * Creates new form FormGrupos
     */
    ControllerGrupo controlGrupo;
    ControllerDocente controlDocente;
    AnioLectivo anioLectivo;

    public ViewGrupos() {
        initComponents();
        iniciarComponentes();
    }

    private void iniciarComponentes() {
        anioLectivo = ViewAdministrador.anioLectivo;
        enableComponents(panelCreacion, false);
        controlGrupo = new ControllerGrupo();
        controlDocente = new ControllerDocente();
        cargarTabla();
        cargarComboDocente();
    }

    private void cargarTabla() {
        try {
            table.setModel(controlGrupo.getTabla(anioLectivo.getIdAnioLectivo()));
            table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
            TableColumnModel columnModel = table.getColumnModel();
            columnModel.getColumn(0).setPreferredWidth(30);
            columnModel.getColumn(1).setPreferredWidth(150);
            columnModel.getColumn(2).setPreferredWidth(180);
            columnModel.getColumn(3).setPreferredWidth(100);
            columnModel.getColumn(4).setPreferredWidth(250);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(panelCentral, ex.getMessage(),
                    "Excepcion", JOptionPane.WARNING_MESSAGE);
        }
    }

    private void cargarComboDocente() {
        try {
            controlDocente.verDocentesActivo().forEach((docente) -> {
                ComboDirector.addItem(docente.getNombreCompleto());
            });
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
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        btnNuevo = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        panelCreacion = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        ComboDirector = new javax.swing.JComboBox<>();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaGrado = new javax.swing.JList<>();
        jLabel7 = new javax.swing.JLabel();
        spinner = new javax.swing.JSpinner();
        jLabel8 = new javax.swing.JLabel();
        comboJornada = new javax.swing.JComboBox<>();
        labelCodigo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setResizable(true);
        setTitle("Creacion/Modificacion de grupos");
        setMinimumSize(new java.awt.Dimension(730, 590));
        setPreferredSize(new java.awt.Dimension(730, 590));
        setVisible(false);

        panelCentral.setBackground(new java.awt.Color(255, 255, 255));
        panelCentral.setMinimumSize(new java.awt.Dimension(730, 590));
        panelCentral.setPreferredSize(new java.awt.Dimension(730, 590));
        panelCentral.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 153, 204), null), "Grupos Creados", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(table);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 678, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
        );

        panelCentral.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 690, -1));

        btnNuevo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGS/documento_1.png"))); // NOI18N
        btnNuevo.setText("NUEVO");
        btnNuevo.setPreferredSize(new java.awt.Dimension(120, 25));
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        panelCentral.add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, 140, -1));

        btnModificar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGS/editar.png"))); // NOI18N
        btnModificar.setText("MODIFICAR");
        btnModificar.setPreferredSize(new java.awt.Dimension(120, 25));
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        panelCentral.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 270, 140, -1));

        btnEliminar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGS/basura.png"))); // NOI18N
        btnEliminar.setText("ELIMINAR");
        btnEliminar.setPreferredSize(new java.awt.Dimension(120, 25));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        panelCentral.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 270, 130, -1));

        panelCreacion.setBackground(new java.awt.Color(255, 255, 255));
        panelCreacion.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 153, 153), null), "Creacion/Modificacion de Datos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
        panelCreacion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Grado:");
        panelCreacion.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Director de grupo:");
        panelCreacion.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, -1, -1));

        ComboDirector.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opcion:" }));
        panelCreacion.add(ComboDirector, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, 170, -1));

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGS/controlar.png"))); // NOI18N
        btnGuardar.setText("GUARDAR");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        panelCreacion.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 140, -1));

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGS/varita-magica.png"))); // NOI18N
        btnCancelar.setText("CANCELAR");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        panelCreacion.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 170, 130, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Codigo:");
        panelCreacion.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, -1, -1));

        listaGrado.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Jardin", "Transicion", "Primero", "Segundo", "Tercero", "Cuarto", "Quinto", "Sexto", "Septimo", "Octavo", "Noveno", "Decimo", "Once" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(listaGrado);

        panelCreacion.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 100, 170));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Jornada:");
        panelCreacion.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, -1, -1));

        spinner.setModel(new javax.swing.SpinnerNumberModel(1, 1, 10, 1));
        panelCreacion.add(spinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 90, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Indice de grupo:");
        panelCreacion.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, -1, -1));

        comboJornada.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opcion:", "Mañana", "Tarde", "Nocturna" }));
        panelCreacion.add(comboJornada, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, 170, -1));

        labelCodigo.setText("0");
        panelCreacion.add(labelCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, 60, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/imgGrupos.png"))); // NOI18N
        panelCreacion.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 48, 130, 130));

        panelCentral.add(panelCreacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 680, 220));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCentral, javax.swing.GroupLayout.PREFERRED_SIZE, 735, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCentral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        limpiarCampos();
        enableComponents(panelCreacion, true);
        btnGuardar.setText("GUARDAR");
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed

        botonModificar();
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        enableComponents(panelCreacion, false);
        limpiarCampos();
        botonEliminar();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if (btnGuardar.getText().equals("MODIFICAR")) {
            modificar();

        } else {
            botonGuardar();
        }
        cargarTabla();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        enableComponents(panelCreacion, false);
        limpiarCampos();
    }//GEN-LAST:event_btnCancelarActionPerformed
    private void botonEliminar() {
        int codigo = seleccionTablaCodigo();

        if (codigo != -1) {
            if (JOptionPane.showConfirmDialog(rootPane, "Seguro que desea eliminar el grupo?",
                    "AVISO", JOptionPane.WARNING_MESSAGE, JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                try {
                    controlGrupo.eliminar(codigo);
                    JOptionPane.showMessageDialog(panelCentral, "Grado eliminado exitosamente!",
                            "Informacion", JOptionPane.INFORMATION_MESSAGE);

                    cargarTabla();
                } catch (NullPointerException ex) {
                    JOptionPane.showMessageDialog(panelCentral, ex.getMessage(),
                            "Validacion", JOptionPane.QUESTION_MESSAGE);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(panelCentral, ex.getMessage(),
                            "Excepcion", JOptionPane.WARNING_MESSAGE);
                }

            }

        }
    }

    private void modificar() {
        try {
            Grupo grupo = obtenerCamposActualizar();
            controlGrupo.actualizar(grupo);

            JOptionPane.showMessageDialog(panelCentral, "Grado modificado exitosamente. ",
                    "Informacion", JOptionPane.INFORMATION_MESSAGE);
            limpiarCampos();
            enableComponents(panelCreacion, false);
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
            Grupo grupo;
            try {
                grupo = controlGrupo.buscarPorCodigo(codigo);
                pintarCampos(grupo);
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
            JOptionPane.showMessageDialog(panelCentral, "Seleccione un Grupo! ",
                    "Validacion", JOptionPane.QUESTION_MESSAGE);
            return -1;
        } else {
            String codigo = String.valueOf(table.getValueAt(indice, 0));
            return Integer.valueOf(codigo);
        }
    }

    private void botonGuardar() {
        Grupo grupo = obtenerCampos();
        try {
            controlGrupo.registrar(grupo);
            JOptionPane.showMessageDialog(panelCentral, "Grupo registrado exitosamente.", "Informacion", JOptionPane.INFORMATION_MESSAGE);
            limpiarCampos();
            enableComponents(panelCreacion, false);
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(panelCentral, ex.getMessage(), "Validacion", JOptionPane.QUESTION_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(panelCentral, ex.getMessage(),"Excepcion", JOptionPane.WARNING_MESSAGE);
        }

    }

    private Grupo obtenerCampos() {
        int idGrupo = Integer.parseInt(labelCodigo.getText());
        int nombre = listaGrado.getSelectedIndex();
        int indiceGrupo = (int) spinner.getValue();
        int jornada = comboJornada.getSelectedIndex();
        int indiceDocente = ComboDirector.getSelectedIndex() - 1;

        Docente docente = null;
        try {
            docente = controlDocente.verDocentesActivo().get(indiceDocente);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(panelCentral, ex.getMessage(),
                    "Excepcion", JOptionPane.WARNING_MESSAGE);
        }
        return new Grupo(idGrupo, nombre, jornada, indiceGrupo, anioLectivo, docente);

    }

    private Grupo obtenerCamposActualizar() {
        int idGrupo = Integer.parseInt(labelCodigo.getText());
        try {
            Grupo grupo = controlGrupo.buscarPorCodigo(idGrupo);
            grupo.setNombre(listaGrado.getSelectedIndex());
            grupo.setIndiceGrupo((int) spinner.getValue());
            grupo.setJornada(comboJornada.getSelectedIndex());

            int indiceDocente = ComboDirector.getSelectedIndex() - 1;
            Docente docente = null;
            try {
                docente = controlDocente.verDocentesActivo().get(indiceDocente);
            } catch (Exception ex) {
                
            }
            grupo.setDocente(docente);
            return grupo;

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(panelCentral, ex.getMessage(),"Excepcion", JOptionPane.WARNING_MESSAGE);
        }
        return null;
    }

    private void pintarCampos(Grupo grupo) {
        labelCodigo.setText("" + grupo.getIdGrupo());
        listaGrado.setSelectedIndex(grupo.getNombre());
        spinner.setValue(grupo.getIndiceGrupo());
        comboJornada.setSelectedIndex(grupo.getJornada());
        try {
            ComboDirector.setSelectedIndex(controlDocente.DocenteActivoIndice(grupo.getDocente()));
        } catch (Exception ex) {
            ComboDirector.setSelectedIndex(0);
        }

    }

    private void limpiarCampos() {
        labelCodigo.setText("0");
        spinner.setValue(1);
        ComboDirector.setSelectedIndex(0);
        comboJornada.setSelectedIndex(0);
        listaGrado.setSelectedIndex(0);
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
    private javax.swing.JComboBox<String> ComboDirector;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JComboBox<String> comboJornada;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelCodigo;
    private javax.swing.JList<String> listaGrado;
    private javax.swing.JPanel panelCentral;
    private javax.swing.JPanel panelCreacion;
    private javax.swing.JSpinner spinner;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
