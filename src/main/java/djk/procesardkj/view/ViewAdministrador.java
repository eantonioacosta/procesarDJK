package djk.procesardkj.view;

import djk.procesardkj.view.inicio.ViewEstudiantes;
import djk.procesardkj.view.inicio.ViewMatricula;
import djk.procesardkj.view.inicio.ViewCargaAcademicaDocente;
import djk.procesardkj.view.inicio.ViewCargaAcademica;
import djk.procesardkj.view.inicio.ViewAsignaturas;
import djk.procesardkj.view.inicio.ViewDocente;
import djk.procesardkj.view.inicio.ViewAniosLectivos;
import djk.procesardkj.view.inicio.ViewGrupos;
import djk.procesardkj.view.inicio.ViewUsuarios;
import djk.procesardkj.domain.AnioLectivo;
import djk.procesardkj.domain.Usuario;
import djk.procesardkj.view.inicio.consultas.ViewConsultaGrados;
import java.awt.BorderLayout;
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

    private void iniciarComponentes() {
        this.setExtendedState(MAXIMIZED_BOTH);
        this.setLayout(new BorderLayout());
        this.getContentPane().add(escritorio);
        jLabelUsuario.setText(usuarioSistema.getNombre());
        jLabelPerfil.setText(usuarioSistema.getNivelUsuarioText());
        jLabelAnio.setText(anioLectivo.getNombre());
        
        if (usuarioSistema.getNivelUsuario() == 1) {
            jMenuInicio.setVisible(true);
        } else {
            jMenuInicio.setVisible(false);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabelPerfil = new javax.swing.JLabel();
        jLabelUsuario = new javax.swing.JLabel();
        jLabelAnio = new javax.swing.JLabel();
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
        jMenuItemRegistrar = new javax.swing.JMenuItem();
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
        jMenuItemGradosConsulta = new javax.swing.JMenuItem();
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

        escritorio.setBackground(new java.awt.Color(204, 204, 255));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/imgLogo.jpg"))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        jLabelPerfil.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelPerfil.setForeground(new java.awt.Color(0, 153, 51));
        jLabelPerfil.setText("Perfil");

        jLabelUsuario.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabelUsuario.setText("Nombre del Usuario");

        jLabelAnio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelAnio.setText("Año lectivo");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Perfil:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Nombre:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Año lectivo:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelAnio, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabelPerfil))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabelUsuario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelAnio)))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        escritorio.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jPanel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(escritorioLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(347, Short.MAX_VALUE))
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escritorioLayout.createSequentialGroup()
                .addContainerGap(134, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(32, 32, 32)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );

        jMenuBar1.setBackground(new java.awt.Color(204, 204, 204));
        jMenuBar1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jMenuBar1.setPreferredSize(new java.awt.Dimension(458, 40));

        jMenuInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGS/hogar.png"))); // NOI18N
        jMenuInicio.setText("INICIO");
        jMenuInicio.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuInicio.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jMenuInicio.setPreferredSize(new java.awt.Dimension(100, 20));

        jMenu5.setText("Logistica");
        jMenu5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenu5.setPreferredSize(new java.awt.Dimension(179, 35));

        jMenuItem5.setText("Usuarios");
        jMenuItem5.setPreferredSize(new java.awt.Dimension(237, 30));
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemUsuarios(evt);
            }
        });
        jMenu5.add(jMenuItem5);
        jMenu5.add(jSeparator3);

        jMenuItem7.setText("Grupos");
        jMenuItem7.setPreferredSize(new java.awt.Dimension(237, 30));
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem7);
        jMenu5.add(jSeparator4);

        jMenuItem6.setText("Años Lectivos");
        jMenuItem6.setPreferredSize(new java.awt.Dimension(237, 30));
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAniosLectivos(evt);
            }
        });
        jMenu5.add(jMenuItem6);

        jMenuInicio.add(jMenu5);
        jMenuInicio.add(jSeparator5);

        jMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGS/gorro-de-graduacion.png"))); // NOI18N
        jMenu6.setText("Alumnos");
        jMenu6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenu6.setPreferredSize(new java.awt.Dimension(179, 35));

        MenuItemMatricular.setText("Matricular");
        MenuItemMatricular.setPreferredSize(new java.awt.Dimension(237, 30));
        MenuItemMatricular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemMatricularActionPerformed(evt);
            }
        });
        jMenu6.add(MenuItemMatricular);

        jMenuItem9.setText("Deshacer Matricula");
        jMenuItem9.setPreferredSize(new java.awt.Dimension(237, 30));
        jMenu6.add(jMenuItem9);
        jMenu6.add(jSeparator1);

        jMenuItemRegistrar.setText("Registrar Estudiante");
        jMenuItemRegistrar.setPreferredSize(new java.awt.Dimension(237, 30));
        jMenuItemRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemRegistrarActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItemRegistrar);

        jMenuItem2.setText("Borrar del Sistema");
        jMenuItem2.setPreferredSize(new java.awt.Dimension(237, 30));
        jMenu6.add(jMenuItem2);

        jMenuInicio.add(jMenu6);
        jMenuInicio.add(jSeparator8);

        jMenu7.setText("Areas Academicas");
        jMenu7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenu7.setPreferredSize(new java.awt.Dimension(179, 35));

        menuItemAreas.setText("Areas Asignatura");
        menuItemAreas.setPreferredSize(new java.awt.Dimension(250, 30));
        menuItemAreas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemAreasActionPerformed(evt);
            }
        });
        jMenu7.add(menuItemAreas);

        itemAsignaruraGrupos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.SHIFT_MASK));
        itemAsignaruraGrupos.setText("Carga Academica - grupos");
        itemAsignaruraGrupos.setPreferredSize(new java.awt.Dimension(250, 30));
        itemAsignaruraGrupos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemAsignaruraGruposActionPerformed(evt);
            }
        });
        jMenu7.add(itemAsignaruraGrupos);

        itemASignaturaDocente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.SHIFT_MASK));
        itemASignaturaDocente.setText("Carga Academica - docente");
        itemASignaturaDocente.setPreferredSize(new java.awt.Dimension(250, 30));
        itemASignaturaDocente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemASignaturaDocenteActionPerformed(evt);
            }
        });
        jMenu7.add(itemASignaturaDocente);

        jMenuInicio.add(jMenu7);
        jMenuInicio.add(jSeparator7);

        jMenu8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGS/usuarios-alt.png"))); // NOI18N
        jMenu8.setText("Docentes");
        jMenu8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenu8.setPreferredSize(new java.awt.Dimension(179, 35));

        jMenuItem11.setText("Crear / Modificar");
        jMenuItem11.setPreferredSize(new java.awt.Dimension(237, 30));
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem11);
        jMenu8.add(jSeparator2);

        jMenuItem14.setText("Asignaturas");
        jMenuItem14.setPreferredSize(new java.awt.Dimension(237, 30));
        jMenu8.add(jMenuItem14);

        jMenuItem12.setText("Cursos");
        jMenuItem12.setPreferredSize(new java.awt.Dimension(237, 30));
        jMenu8.add(jMenuItem12);

        jMenuInicio.add(jMenu8);

        jMenuBar1.add(jMenuInicio);

        jMenuProcesos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGS/ajustes.png"))); // NOI18N
        jMenuProcesos.setText("PROCESOS");
        jMenuProcesos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuProcesos.setPreferredSize(new java.awt.Dimension(130, 28));

        jMenuItem3.setText("Calificacion / Valoracion");
        jMenuProcesos.add(jMenuItem3);

        jMenuItem15.setText("Nivelacion");
        jMenuProcesos.add(jMenuItem15);

        jMenuItem16.setText("Ubicar Planillas Excel");
        jMenuProcesos.add(jMenuItem16);

        jMenuBar1.add(jMenuProcesos);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGS/libro-alt.png"))); // NOI18N
        jMenu3.setText("CONSULTAS");
        jMenu3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenu3.setPreferredSize(new java.awt.Dimension(130, 28));

        jMenuItem17.setText("General");
        jMenuItem17.setPreferredSize(new java.awt.Dimension(179, 35));
        jMenu3.add(jMenuItem17);

        jMenuItemGradosConsulta.setText("Por Grados");
        jMenuItemGradosConsulta.setPreferredSize(new java.awt.Dimension(179, 35));
        jMenuItemGradosConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemGradosConsultaActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItemGradosConsulta);

        jMenuItem19.setText("Matriculados");
        jMenuItem19.setPreferredSize(new java.awt.Dimension(179, 35));
        jMenuItem19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem19ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem19);

        jMenuBar1.add(jMenu3);

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGS/estadisticas.png"))); // NOI18N
        jMenu1.setText("REPORTES");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenu1.setPreferredSize(new java.awt.Dimension(120, 28));

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

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGS/bulbo.png"))); // NOI18N
        jMenu2.setText("UTILIDADES");
        jMenu2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenu2.setPreferredSize(new java.awt.Dimension(130, 28));
        jMenuBar1.add(jMenu2);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGS/interrogatorio.png"))); // NOI18N
        jMenu4.setText("MAS OPCIONES");
        jMenu4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenu4.setPreferredSize(new java.awt.Dimension(150, 28));

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
            .addGroup(layout.createSequentialGroup()
                .addComponent(escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        if (JOptionPane.showConfirmDialog(rootPane, "Seguro que desea salir?",
                "AVISO", JOptionPane.WARNING_MESSAGE, JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            new ViewLogin().setVisible(true);
            this.dispose();
        }

    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void menuItemUsuarios(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemUsuarios
        ViewUsuarios formUsuarios = new ViewUsuarios();
        
        escritorio.add(formUsuarios);
        formUsuarios.show();
    }//GEN-LAST:event_menuItemUsuarios

    private void jMenuItemAniosLectivos(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAniosLectivos
        ViewAniosLectivos formAnio = new ViewAniosLectivos();
        escritorio.add(formAnio);
        formAnio.show();
        
    }//GEN-LAST:event_jMenuItemAniosLectivos

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        ViewGrupos formGrupo = new ViewGrupos();
        escritorio.add(formGrupo);
        formGrupo.show();
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem19ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem19ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        ViewDocente formDocente = new ViewDocente();
        escritorio.add(formDocente);
        formDocente.show();
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void MenuItemMatricularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemMatricularActionPerformed
        ViewMatricula viewMatricula = new ViewMatricula();
        escritorio.add(viewMatricula);
        viewMatricula.show();
    }//GEN-LAST:event_MenuItemMatricularActionPerformed

    private void menuItemAreasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemAreasActionPerformed
        ViewAsignaturas viewAreas = new ViewAsignaturas();
        escritorio.add(viewAreas);
        viewAreas.show();
    }//GEN-LAST:event_menuItemAreasActionPerformed

    private void itemAsignaruraGruposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemAsignaruraGruposActionPerformed
        ViewCargaAcademica cargaAcademicaView = new ViewCargaAcademica();
        escritorio.add(cargaAcademicaView);
        cargaAcademicaView.show();
    }//GEN-LAST:event_itemAsignaruraGruposActionPerformed

    private void itemASignaturaDocenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemASignaturaDocenteActionPerformed
        ViewCargaAcademicaDocente cargaAcademicaView = new ViewCargaAcademicaDocente();
        escritorio.add(cargaAcademicaView);
        cargaAcademicaView.show();
    }//GEN-LAST:event_itemASignaturaDocenteActionPerformed

    private void jMenuItemRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemRegistrarActionPerformed
        ViewEstudiantes estudiantesView = new ViewEstudiantes();
        escritorio.add(estudiantesView);
        estudiantesView.show();
    }//GEN-LAST:event_jMenuItemRegistrarActionPerformed

    private void jMenuItemGradosConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemGradosConsultaActionPerformed
        ViewConsultaGrados gradoConsultaView = new ViewConsultaGrados();
        escritorio.add(gradoConsultaView);
        gradoConsultaView.show();             
    }//GEN-LAST:event_jMenuItemGradosConsultaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MenuItemMatricular;
    public static javax.swing.JDesktopPane escritorio;
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
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
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
    private javax.swing.JMenuItem jMenuItemGradosConsulta;
    private javax.swing.JMenuItem jMenuItemRegistrar;
    private javax.swing.JMenu jMenuProcesos;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    private javax.swing.JPopupMenu.Separator jSeparator7;
    private javax.swing.JPopupMenu.Separator jSeparator8;
    private javax.swing.JMenuItem menuItemAreas;
    // End of variables declaration//GEN-END:variables
}
