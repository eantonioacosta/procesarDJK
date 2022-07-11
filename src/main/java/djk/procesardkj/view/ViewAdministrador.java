
package djk.procesardkj.view;


import djk.procesardkj.domain.AnioLectivo;
import djk.procesardkj.domain.Usuario;
import javax.swing.JOptionPane;


public class ViewAdministrador extends javax.swing.JFrame {

    public ViewAdministrador() {
        initComponents();
    }
    public static Usuario usuarioSistema;
    public static AnioLectivo anioLectivo;
    public ViewAdministrador(Usuario usuario, AnioLectivo anio) {
        initComponents();
        this.usuarioSistema = usuario;
        this.anioLectivo = anio;
        iniciarComponentes();
    }
    private void iniciarComponentes(){
        this.setExtendedState(MAXIMIZED_BOTH);
        jLabelUsuario.setText(usuarioSistema.getNombre());
        jLabelPerfil.setText(usuarioSistema.getNivelUsuarioText());
        jLabelAnio.setText(anioLectivo.getNombre());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        layeredPanel = new javax.swing.JLayeredPane();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabelAnio = new javax.swing.JLabel();
        jLabelUsuario = new javax.swing.JLabel();
        jLabelPerfil = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuInicio = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenuItem7 = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        jMenuItem6 = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        jMenu6 = new javax.swing.JMenu();
        MenuItemMatricular = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jSeparator8 = new javax.swing.JPopupMenu.Separator();
        jMenu7 = new javax.swing.JMenu();
        menuItemAreas = new javax.swing.JMenuItem();
        itemAsignaruraGrupos = new javax.swing.JMenuItem();
        itemASignaturaDocente = new javax.swing.JMenuItem();
        jSeparator7 = new javax.swing.JPopupMenu.Separator();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem11 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuProcesos = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenuItem18 = new javax.swing.JMenuItem();
        jMenuItem19 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenu9 = new javax.swing.JMenu();
        jMenuItem23 = new javax.swing.JMenuItem();
        jMenuItem25 = new javax.swing.JMenuItem();
        jMenuItem24 = new javax.swing.JMenuItem();
        jMenuItem22 = new javax.swing.JMenuItem();
        jMenu13 = new javax.swing.JMenu();
        jMenuItem20 = new javax.swing.JMenuItem();
        jMenuItem26 = new javax.swing.JMenuItem();
        jMenuItem27 = new javax.swing.JMenuItem();
        jMenuItem21 = new javax.swing.JMenuItem();
        jSeparator6 = new javax.swing.JPopupMenu.Separator();
        jMenu10 = new javax.swing.JMenu();
        jMenu11 = new javax.swing.JMenu();
        jMenu12 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PROCESAR - PRINCIPAL");

        layeredPanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/imgLogo.jpg"))); // NOI18N

        jPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jLabelAnio.setText("Año lectivo");

        jLabelUsuario.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabelUsuario.setText("Nombre del Usuario");

        jLabelPerfil.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelPerfil.setForeground(new java.awt.Color(0, 153, 51));
        jLabelPerfil.setText("Perfil");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Perfil:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Nombre:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Año lectivo:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelAnio, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabelPerfil))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabelUsuario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabelAnio))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layeredPanel.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layeredPanel.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layeredPanelLayout = new javax.swing.GroupLayout(layeredPanel);
        layeredPanel.setLayout(layeredPanelLayout);
        layeredPanelLayout.setHorizontalGroup(
            layeredPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layeredPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(325, Short.MAX_VALUE))
        );
        layeredPanelLayout.setVerticalGroup(
            layeredPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layeredPanelLayout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(33, 33, 33)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jMenuBar1.setBackground(new java.awt.Color(204, 204, 204));
        jMenuBar1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jMenuInicio.setText("INICIO");
        jMenuInicio.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jMenu5.setText("Logistica");
        jMenu5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jMenuItem5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenuItem5.setText("Usuarios");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemUsuarios(evt);
            }
        });
        jMenu5.add(jMenuItem5);
        jMenu5.add(jSeparator3);

        jMenuItem7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenuItem7.setText("Grupos");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem7);
        jMenu5.add(jSeparator4);

        jMenuItem6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenuItem6.setText("Años Lectivos");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAniosLectivos(evt);
            }
        });
        jMenu5.add(jMenuItem6);

        jMenuInicio.add(jMenu5);
        jMenuInicio.add(jSeparator5);

        jMenu6.setText("Alumnos");
        jMenu6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        MenuItemMatricular.setText("Matricular");
        MenuItemMatricular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemMatricularActionPerformed(evt);
            }
        });
        jMenu6.add(MenuItemMatricular);

        jMenuItem9.setText("Deshacer Matricula");
        jMenu6.add(jMenuItem9);
        jMenu6.add(jSeparator1);

        jMenuItem1.setText("Retirar del Grado");
        jMenu6.add(jMenuItem1);

        jMenuItem2.setText("Borrar del Sistema");
        jMenu6.add(jMenuItem2);

        jMenuInicio.add(jMenu6);
        jMenuInicio.add(jSeparator8);

        jMenu7.setText("Areas Academicas");
        jMenu7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        menuItemAreas.setText("Areas Asignatura");
        menuItemAreas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemAreasActionPerformed(evt);
            }
        });
        jMenu7.add(menuItemAreas);

        itemAsignaruraGrupos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.SHIFT_MASK));
        itemAsignaruraGrupos.setText("Asignaturas - Grupos");
        itemAsignaruraGrupos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemAsignaruraGruposActionPerformed(evt);
            }
        });
        jMenu7.add(itemAsignaruraGrupos);

        itemASignaturaDocente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.SHIFT_MASK));
        itemASignaturaDocente.setText("Asignatura - Docente");
        itemASignaturaDocente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemASignaturaDocenteActionPerformed(evt);
            }
        });
        jMenu7.add(itemASignaturaDocente);

        jMenuInicio.add(jMenu7);
        jMenuInicio.add(jSeparator7);

        jMenu8.setText("Docentes");
        jMenu8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jMenuItem11.setText("Crear / Modificar");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem11);
        jMenu8.add(jSeparator2);

        jMenuItem14.setText("Asignaturas");
        jMenu8.add(jMenuItem14);

        jMenuItem12.setText("Cursos");
        jMenu8.add(jMenuItem12);

        jMenuInicio.add(jMenu8);

        jMenuBar1.add(jMenuInicio);

        jMenuProcesos.setText("PROCESOS");
        jMenuProcesos.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jMenuItem3.setText("Calificacion / Valoracion");
        jMenuProcesos.add(jMenuItem3);

        jMenuItem15.setText("Nivelacion");
        jMenuProcesos.add(jMenuItem15);

        jMenuItem16.setText("Ubicar Planillas Excel");
        jMenuProcesos.add(jMenuItem16);

        jMenuBar1.add(jMenuProcesos);

        jMenu3.setText("CONSULTAS");
        jMenu3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jMenuItem17.setText("General");
        jMenu3.add(jMenuItem17);

        jMenuItem18.setText("Por Grados");
        jMenu3.add(jMenuItem18);

        jMenuItem19.setText("Matriculados");
        jMenuItem19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem19ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem19);

        jMenuBar1.add(jMenu3);

        jMenu1.setText("REPORTES");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jMenu9.setText("Planillas");

        jMenuItem23.setText("Dimensiones");
        jMenu9.add(jMenuItem23);

        jMenuItem25.setText("jMenuItem25");
        jMenu9.add(jMenuItem25);

        jMenuItem24.setText("jMenuItem24");
        jMenu9.add(jMenuItem24);

        jMenuItem22.setText("jMenuItem22");
        jMenu9.add(jMenuItem22);

        jMenu1.add(jMenu9);

        jMenu13.setText("Informes");

        jMenuItem20.setText("Concepto");
        jMenu13.add(jMenuItem20);

        jMenuItem26.setText("Boletin");
        jMenu13.add(jMenuItem26);

        jMenuItem27.setText("Certificado");
        jMenu13.add(jMenuItem27);

        jMenuItem21.setText("Constancias");
        jMenu13.add(jMenuItem21);

        jMenu1.add(jMenu13);
        jMenu1.add(jSeparator6);

        jMenu10.setText("Alumnos");
        jMenu1.add(jMenu10);

        jMenu11.setText("Docentes");
        jMenu1.add(jMenu11);

        jMenu12.setText("Estadisticas");
        jMenu1.add(jMenu12);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("UTILIDADES");
        jMenu2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenuBar1.add(jMenu2);

        jMenu4.setText("MAS OPCIONES");
        jMenu4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, 0));
        jMenuItem4.setText("Cerrar Sesion");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem4);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(layeredPanel)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(layeredPanel)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
                  if (JOptionPane.showConfirmDialog(rootPane, "Seguro que desea salir?",
        "AVISO", JOptionPane.WARNING_MESSAGE, JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
                new ViewLogin().setVisible(true);
                this.dispose();
                  }
         
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void menuItemUsuarios(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemUsuarios
        ViewUsuarios formUsuarios = new ViewUsuarios();
        layeredPanel.add(formUsuarios);
        formUsuarios.setVisible(true);
    }//GEN-LAST:event_menuItemUsuarios

    private void jMenuItemAniosLectivos(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAniosLectivos
        ViewAniosLectivos formAnio = new ViewAniosLectivos();
        layeredPanel.add(formAnio);
        formAnio.setVisible(true);
    }//GEN-LAST:event_jMenuItemAniosLectivos

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        ViewGrupos formGrupo = new ViewGrupos();
        layeredPanel.add(formGrupo);
        formGrupo.setVisible(true);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem19ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem19ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        ViewDocente formDocente = new ViewDocente();
        layeredPanel.add(formDocente);
        formDocente.setVisible(true);
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void MenuItemMatricularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemMatricularActionPerformed

//        FormMatriculas formMatricula = new FormMatriculas();
//        layeredPanel.add(formMatricula);
//        formMatricula.setVisible(true);
    }//GEN-LAST:event_MenuItemMatricularActionPerformed

    private void menuItemAreasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemAreasActionPerformed
        ViewAsignaturas formAreas = new ViewAsignaturas();
        layeredPanel.add(formAreas);
        formAreas.setVisible(true);
    }//GEN-LAST:event_menuItemAreasActionPerformed

    private void itemAsignaruraGruposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemAsignaruraGruposActionPerformed
//        FormGrupoAsignaturas formGrupo = new FormGrupoAsignaturas();
//        layeredPanel.add(formGrupo);
//        formGrupo.setVisible(true);
    }//GEN-LAST:event_itemAsignaruraGruposActionPerformed

    private void itemASignaturaDocenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemASignaturaDocenteActionPerformed
//        FormDocenteAsignatura ventana = new FormDocenteAsignatura();
//        layeredPanel.add(ventana);
//        ventana.setVisible(true);
        
    }//GEN-LAST:event_itemASignaturaDocenteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MenuItemMatricular;
    private javax.swing.JMenuItem itemASignaturaDocente;
    private javax.swing.JMenuItem itemAsignaruraGrupos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelAnio;
    private javax.swing.JLabel jLabelPerfil;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu12;
    private javax.swing.JMenu jMenu13;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuInicio;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem19;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem20;
    private javax.swing.JMenuItem jMenuItem21;
    private javax.swing.JMenuItem jMenuItem22;
    private javax.swing.JMenuItem jMenuItem23;
    private javax.swing.JMenuItem jMenuItem24;
    private javax.swing.JMenuItem jMenuItem25;
    private javax.swing.JMenuItem jMenuItem26;
    private javax.swing.JMenuItem jMenuItem27;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JMenu jMenuProcesos;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    private javax.swing.JPopupMenu.Separator jSeparator7;
    private javax.swing.JPopupMenu.Separator jSeparator8;
    private javax.swing.JLayeredPane layeredPanel;
    private javax.swing.JMenuItem menuItemAreas;
    // End of variables declaration//GEN-END:variables
}
