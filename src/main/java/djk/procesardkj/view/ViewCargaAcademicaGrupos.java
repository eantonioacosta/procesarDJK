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
import java.util.Objects;

import javax.swing.JOptionPane;

public class ViewCargaAcademicaGrupos extends javax.swing.JInternalFrame {

    ControllerCargaAcademica controlCargaAcademica;
    ControllerGrupo controlGrupo;
    ControllerAsignaturas controlAsignaturas;

    List<Asignatura> listSeleccionada;
    List<Asignatura> listRegistrada;
    Grupo grupoLocal;
    AnioLectivo anioLectivo =ViewAdministrador.anioLectivo;

    public ViewCargaAcademicaGrupos() {
        initComponents();
        iniciarComponentes();

    }

    private void iniciarComponentes() {
        controlGrupo = new ControllerGrupo();
        controlAsignaturas = new ControllerAsignaturas();
        controlCargaAcademica = new ControllerCargaAcademica();
        cargarListaGrupo();
        cargarListaAsignatura();
        enableComponents(panelAsignaturas, false);
        listaGruposRegistrados.setEnabled(false);
        listSeleccionada = new ArrayList<>();

    }

    private void nuevoRegistro() {
        int indiceGrupo = listaGrupos.getSelectedIndex();
        try {
            grupoLocal = controlGrupo.buscarGrupoItem(anioLectivo.getIdAnioLectivo(), indiceGrupo);
            txtGrado.setText(grupoLocal.toString());
            txtNAsignaturas.setText("" + grupoLocal.getMatriculaList().size());
            listaGrupos.setEnabled(false);
            listaGruposRegistrados.setEnabled(false);
            enableComponents(panelAsignaturas, true);
            listSeleccionada = new ArrayList<Asignatura>();

        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(panelCentral, ex.getMessage(),
                    "Validacion", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception ex) {
            if (indiceGrupo == -1) {
                JOptionPane.showMessageDialog(panelCentral, "No hay grupos registrados, ok.",
                        "Excepcion", JOptionPane.WARNING_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(panelCentral, ex.getMessage(),
                        "Excepcion", JOptionPane.WARNING_MESSAGE);
            }

        }

    }

    private void cargarListaGrupo() {
        try {
            List<Grupo> lista = controlGrupo.verGrupos(anioLectivo.getIdAnioLectivo());

            String[] item = new String[lista.size()];
            for (int i = 0; i < lista.size(); i++) {
                item[i] = lista.get(i).toString();
            }
            listaGrupos.setListData(item);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(panelCentral, ex.getMessage(),"Excepcion", JOptionPane.WARNING_MESSAGE);
        }
    }

    private void cargarListaAsignatura() {
        listaAsignatura.removeAll();
        listaAsignatura.repaint();
        try {
            List<Asignatura> lista = controlAsignaturas.verAsignaturas();
            String[] item = new String[lista.size()];
            for (int i = 0; i < lista.size(); i++) {
                item[i] = lista.get(i).getNombre();
            }
            listaAsignatura.setListData(item);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(panelCentral, ex.getMessage(),
                    "Excepcion", JOptionPane.WARNING_MESSAGE);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panelCentral = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaGrupos = new javax.swing.JList<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        listaGruposRegistrados = new javax.swing.JList<>();
        botonNuevo = new javax.swing.JButton();
        panelAsignaturas = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaAsignatura = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        listaAsignaturaSelec = new javax.swing.JList<>();
        btnRegistrar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        txtGrado = new javax.swing.JLabel();
        txtNAsignaturas = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();

        setClosable(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        panelCentral.setBackground(new java.awt.Color(255, 255, 255));
        panelCentral.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelCentral.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        listaGrupos.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Cursos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 10))); // NOI18N
        listaGrupos.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        listaGrupos.setName(""); // NOI18N
        listaGrupos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                listaGruposMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(listaGrupos);

        panelCentral.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 360, 270));

        listaGruposRegistrados.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Asignaturas registradas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 10))); // NOI18N
        listaGruposRegistrados.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        listaGruposRegistrados.setName(""); // NOI18N
        listaGruposRegistrados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaGruposRegistradosMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                listaGruposRegistradosMousePressed(evt);
            }
        });
        jScrollPane4.setViewportView(listaGruposRegistrados);

        panelCentral.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, 270, 240));

        botonNuevo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        botonNuevo.setText("NUEVO");
        botonNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonNuevoActionPerformed(evt);
            }
        });
        panelCentral.add(botonNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 450, 110, -1));

        listaAsignatura.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Asignaturas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 10))); // NOI18N
        listaAsignatura.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        listaAsignatura.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaAsignaturaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(listaAsignatura);

        listaAsignaturaSelec.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Asignaturas seleccionadas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 10))); // NOI18N
        listaAsignaturaSelec.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        listaAsignaturaSelec.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaAsignaturaSelecMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(listaAsignaturaSelec);

        btnRegistrar.setText("REGISTRAR");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardar(evt);
            }
        });

        btnCancelar.setText("CANCELAR");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelAsignaturasLayout = new javax.swing.GroupLayout(panelAsignaturas);
        panelAsignaturas.setLayout(panelAsignaturasLayout);
        panelAsignaturasLayout.setHorizontalGroup(
            panelAsignaturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAsignaturasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAsignaturasLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCancelar)
                .addGap(37, 37, 37)
                .addComponent(btnRegistrar)
                .addGap(19, 19, 19))
        );
        panelAsignaturasLayout.setVerticalGroup(
            panelAsignaturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAsignaturasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelAsignaturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 357, Short.MAX_VALUE)
                    .addComponent(jScrollPane3))
                .addGap(18, 18, 18)
                .addGroup(panelAsignaturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnRegistrar))
                .addContainerGap())
        );

        panelCentral.add(panelAsignaturas, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, 490, 420));

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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(20, 20, 20)
                        .addComponent(txtGrado, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txtNAsignaturas, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(txtGrado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNAsignaturas))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelCentral.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 450, 340, 50));

        btnEliminar.setText("AJUSTAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        panelCentral.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 480, 110, -1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelCentral, javax.swing.GroupLayout.DEFAULT_SIZE, 907, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelCentral, javax.swing.GroupLayout.DEFAULT_SIZE, 556, Short.MAX_VALUE))
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

    private void listaAsignaturaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaAsignaturaMouseClicked
        
        try {

            int indice = listaAsignatura.getSelectedIndex();
            Asignatura asignatura = controlAsignaturas.buscarPorItem(indice);

            guardarAsignaturaLocal(asignatura);
            pintarListaAsignaturaSeleccionadas();

        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(panelCentral, ex.getMessage(),
                    "Validacion", JOptionPane.INFORMATION_MESSAGE);
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(panelCentral, ex.getMessage(),
                    "Excepcion", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_listaAsignaturaMouseClicked

    private void listaAsignaturaSelecMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaAsignaturaSelecMouseClicked
        int indice = listaAsignaturaSelec.getSelectedIndex();
        if (indice != -1) {
            listSeleccionada.remove(indice);
            pintarListaAsignaturaSeleccionadas();
        }
    }//GEN-LAST:event_listaAsignaturaSelecMouseClicked

    private void botonNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonNuevoActionPerformed
        nuevoRegistro();
    }//GEN-LAST:event_botonNuevoActionPerformed

    private void botonGuardar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardar
        botonRegistrar();
    }//GEN-LAST:event_botonGuardar

    private void listaGruposMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaGruposMousePressed

        int indice = listaGrupos.getSelectedIndex();
        try {
            Grupo grupo = controlGrupo.verGrupos(anioLectivo.getIdAnioLectivo()).get(indice);
            pintarListaAsignaturaRegistrada(grupo);

        } catch (Exception ex) {
            if (indice == -1) {
                JOptionPane.showMessageDialog(panelCentral, "No hay grupos registrados, ok.",
                        "Excepcion", JOptionPane.WARNING_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(panelCentral, ex.getMessage(),
                        "Excepcion", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_listaGruposMousePressed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        listSeleccionada = new ArrayList<>();

        enableComponents(panelAsignaturas, false);
        listaGrupos.setEnabled(true);
        cargarListaAsignatura();
        pintarListaAsignaturaSeleccionadas();
        pintarListaAsignaturaRegistrada(new Grupo());
        txtGrado.setText("-");
        txtNAsignaturas.setText("0");
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int indiceGrupo = listaGrupos.getSelectedIndex();
        try {
            grupoLocal = controlGrupo.buscarGrupoItem(ViewAdministrador.anioLectivo.getIdAnioLectivo(), indiceGrupo);
            txtGrado.setText(grupoLocal.toString());
            txtNAsignaturas.setText("" + grupoLocal.getCargaAcademicaList().size());
            listaGruposRegistrados.setEnabled(true);
            listaGrupos.setEnabled(false);
            enableComponents(panelAsignaturas, false);

        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(panelCentral, ex.getMessage(),
                    "Validacion", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception ex) {
            if (indiceGrupo == -1) {
                JOptionPane.showMessageDialog(panelCentral, "No hay grupos registrados, ok.",
                        "Excepcion", JOptionPane.WARNING_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(panelCentral, ex.getMessage(),
                        "Excepcion", JOptionPane.WARNING_MESSAGE);
            }

        }


    }//GEN-LAST:event_btnEliminarActionPerformed

    private void listaGruposRegistradosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaGruposRegistradosMousePressed


    }//GEN-LAST:event_listaGruposRegistradosMousePressed

    private void listaGruposRegistradosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaGruposRegistradosMouseClicked
        int indice = listaGruposRegistrados.getSelectedIndex();
        if(indice!=-1){
            if (JOptionPane.showConfirmDialog(rootPane, "Seguro que desea eliminar la asignatura?",
                "AVISO", JOptionPane.WARNING_MESSAGE, JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            
        }
        }
        
    }//GEN-LAST:event_listaGruposRegistradosMouseClicked
    private void botonRegistrar() {
        CargaAcademica detalle;

        Grupo grupo = new Grupo(grupoLocal.getIdGrupo());
        for (Asignatura asignatura : listSeleccionada) {

            try {
                detalle = new CargaAcademica(asignatura, grupo);
                controlCargaAcademica.registrar(detalle);
            } catch (NullPointerException ex) {
                JOptionPane.showMessageDialog(panelCentral, ex.getMessage(),
                        "Validacion", JOptionPane.INFORMATION_MESSAGE);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(panelCentral, ex.getMessage(),
                        "Excepcion", JOptionPane.WARNING_MESSAGE);
            }
        }
        JOptionPane.showMessageDialog(panelCentral, "OK",
                "Informacion", JOptionPane.INFORMATION_MESSAGE);

        // Reiniciar todo
        btnCancelarActionPerformed(null);

    }

    private void pintarListaAsignaturaSeleccionadas() {
        listaAsignaturaSelec.removeAll();
        listaAsignaturaSelec.repaint();

        String[] item = new String[listSeleccionada.size()];
        for (int i = 0; i < listSeleccionada.size(); i++) {
            item[i] = listSeleccionada.get(i).getNombre();
        }
        listaAsignaturaSelec.setListData(item);
    }

    private void pintarListaAsignaturaRegistrada(Grupo grupo) {
        listaGruposRegistrados.removeAll();
        listaGruposRegistrados.repaint();

        listRegistrada = new ArrayList<>();

        String[] item = new String[grupo.getCargaAcademicaList().size()];
        
        for (int i = 0; i < grupo.getCargaAcademicaList().size(); i++) {
            item[i] = grupo.getCargaAcademicaList().get(i).getAsignatura().getNombre();
            listRegistrada.add(grupo.getCargaAcademicaList().get(i).getAsignatura());
        }
        listaGruposRegistrados.setListData(item);
    }

    private boolean guardarAsignaturaLocal(Asignatura asignatura) {
        if (!listSeleccionada.stream().noneMatch((asignatura1)
                -> (Objects.equals(asignatura.getIdAsignatura(), asignatura1.getIdAsignatura())))) {
            return false;
        }
        if (!listRegistrada.stream().noneMatch((asignatura1)
                -> (Objects.equals(asignatura.getIdAsignatura(), asignatura1.getIdAsignatura())))) {
            return false;
        }

        listSeleccionada.add(asignatura);
        return true;
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
    private javax.swing.JButton botonNuevo;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JList<String> listaAsignatura;
    private javax.swing.JList<String> listaAsignaturaSelec;
    private javax.swing.JList<String> listaGrupos;
    private javax.swing.JList<String> listaGruposRegistrados;
    private javax.swing.JPanel panelAsignaturas;
    private javax.swing.JPanel panelCentral;
    private javax.swing.JLabel txtGrado;
    private javax.swing.JLabel txtNAsignaturas;
    // End of variables declaration//GEN-END:variables
}
