
package djk.procesardkj.view.inicio;

import com.toedter.calendar.JCalendar;
import djk.procesardkj.controller.ControllerEstudiante;
import djk.procesardkj.controller.ControllerGrupo;
import djk.procesardkj.controller.ControllerMatricula;
import djk.procesardkj.domain.AnioLectivo;
import djk.procesardkj.domain.Estudiante;
import djk.procesardkj.domain.Grupo;
import djk.procesardkj.domain.Matricula;
import djk.procesardkj.view.ViewAdministrador;
import java.awt.Component;
import java.awt.Container;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author ENOR ACOSTA
 */
public class ViewMatricula extends javax.swing.JInternalFrame {

    /**
     * Creates new form ViewMatricula
     */
    ControllerEstudiante controlEstudiante;
    ControllerGrupo controlGrupo;
    ControllerMatricula controlMatricula;
    
    AnioLectivo anioLocal;
    Estudiante estudianteLocal;
    Grupo grupoLocal;
    public ViewMatricula() {
        initComponents();
        iniciarControladores();
        iniciarPaneles();
    }
    private void iniciarControladores(){
        controlEstudiante = new ControllerEstudiante();
        controlGrupo = new ControllerGrupo();
        controlMatricula = new ControllerMatricula();
        anioLocal = ViewAdministrador.anioLectivo;
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
        panelPrincipal = new javax.swing.JPanel();
        panelBotones = new javax.swing.JPanel();
        botnPromovido = new javax.swing.JButton();
        botonNuevo = new javax.swing.JButton();
        botonRepitente = new javax.swing.JButton();
        botonEspecial = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        panelDatos = new javax.swing.JPanel();
        panelGrado = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        comboGrados = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        comboJornada = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        comboGrupo = new javax.swing.JComboBox<>();
        botonAceptar = new javax.swing.JButton();
        panelEstudiante = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        textoIdentificacion = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        labelNombreCompleto = new javax.swing.JLabel();
        botonBuscar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        labelEstado = new javax.swing.JLabel();
        botonCancelar = new javax.swing.JButton();
        panelDatosFinales = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        textTipoMatricula = new javax.swing.JTextField();
        textoGrupo = new javax.swing.JTextField();
        labelFecha = new javax.swing.JLabel();
        botonMatricular = new javax.swing.JButton();
        panelProceso = new javax.swing.JPanel();
        panelProcesoGrupo = new javax.swing.JPanel();
        jLabel42 = new javax.swing.JLabel();
        panelProcesoEstudiante = new javax.swing.JPanel();
        jLabel43 = new javax.swing.JLabel();
        panelProcesoMatricula = new javax.swing.JPanel();
        jLabel44 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setTitle("Matricula y modificacion de datos del Estudiante.");
        setPreferredSize(new java.awt.Dimension(1050, 600));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(1050, 640));
        jPanel1.setPreferredSize(new java.awt.Dimension(1050, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        panelPrincipal.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelBotones.setBackground(new java.awt.Color(255, 255, 255));
        panelBotones.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        botnPromovido.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        botnPromovido.setText("Promovido");
        botnPromovido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botnPromovidoActionPerformed(evt);
            }
        });

        botonNuevo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        botonNuevo.setText("Nuevo");
        botonNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonNuevoActionPerformed(evt);
            }
        });

        botonRepitente.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        botonRepitente.setText("Reiniciantes");
        botonRepitente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRepitenteActionPerformed(evt);
            }
        });

        botonEspecial.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        botonEspecial.setText("Especial");
        botonEspecial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEspecialActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBotonesLayout = new javax.swing.GroupLayout(panelBotones);
        panelBotones.setLayout(panelBotonesLayout);
        panelBotonesLayout.setHorizontalGroup(
            panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBotonesLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(botonNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botnPromovido)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonRepitente)
                .addGap(10, 10, 10)
                .addComponent(botonEspecial, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        panelBotonesLayout.setVerticalGroup(
            panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBotonesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonNuevo)
                    .addComponent(botnPromovido)
                    .addComponent(botonRepitente)
                    .addComponent(botonEspecial))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelPrincipal.add(panelBotones, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 480, 50));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 486, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 46, Short.MAX_VALUE)
        );

        panelPrincipal.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 10, 490, 50));

        panelDatos.setBackground(new java.awt.Color(255, 255, 255));
        panelDatos.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelDatos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelGrado.setBackground(new java.awt.Color(255, 255, 255));
        panelGrado.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Grados");

        comboGrados.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opcion:", "Jardin", "Transicion", "Primero", "Segundo", "Tercero", "Cuarto", "Quinto", "Sexto", "Septimo", "Octavo", "Noveno", "Decimo", "Once" }));
        comboGrados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboGradosActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Jornadas");

        comboJornada.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opcion:", "Ma??ana", "Tarde", "Nocturna" }));
        comboJornada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboJornadaActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Grupos");

        comboGrupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboGrupoActionPerformed(evt);
            }
        });

        botonAceptar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        botonAceptar.setText("Aceptar");
        botonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAceptar(evt);
            }
        });

        javax.swing.GroupLayout panelGradoLayout = new javax.swing.GroupLayout(panelGrado);
        panelGrado.setLayout(panelGradoLayout);
        panelGradoLayout.setHorizontalGroup(
            panelGradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGradoLayout.createSequentialGroup()
                .addGroup(panelGradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(panelGradoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(comboGrados, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(comboJornada, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33))
                    .addGroup(panelGradoLayout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(89, 89, 89)))
                .addGroup(panelGradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelGradoLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel5)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panelGradoLayout.createSequentialGroup()
                        .addComponent(comboGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 152, Short.MAX_VALUE)
                        .addComponent(botonAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panelGradoLayout.setVerticalGroup(
            panelGradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGradoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelGradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelGradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboGrados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboJornada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonAceptar))
                .addContainerGap())
        );

        panelDatos.add(panelGrado, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 770, -1));

        panelEstudiante.setBackground(new java.awt.Color(255, 255, 255));
        panelEstudiante.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Nro Identificacion:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Nombre Completo:");

        labelNombreCompleto.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelNombreCompleto.setForeground(new java.awt.Color(0, 153, 0));
        labelNombreCompleto.setText("Nombre Completo:");

        botonBuscar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        botonBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGS/busqueda.png"))); // NOI18N
        botonBuscar.setText("BUSCAR");
        botonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Estado:");

        labelEstado.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelEstado.setForeground(new java.awt.Color(0, 153, 0));
        labelEstado.setText("Estado");

        botonCancelar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        botonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGS/cruz.png"))); // NOI18N
        botonCancelar.setText("CANCELAR");
        botonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelEstudianteLayout = new javax.swing.GroupLayout(panelEstudiante);
        panelEstudiante.setLayout(panelEstudianteLayout);
        panelEstudianteLayout.setHorizontalGroup(
            panelEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEstudianteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(26, 26, 26)
                .addGroup(panelEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelNombreCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(panelEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelEstudianteLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addGap(35, 35, 35)
                        .addComponent(labelEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEstudianteLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75)
                        .addComponent(botonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(87, 87, 87))))
        );
        panelEstudianteLayout.setVerticalGroup(
            panelEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEstudianteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(textoIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonBuscar)
                    .addComponent(botonCancelar))
                .addGap(18, 18, 18)
                .addGroup(panelEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(labelNombreCompleto)
                    .addComponent(jLabel6)
                    .addComponent(labelEstado))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        panelDatos.add(panelEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 920, -1));

        panelDatosFinales.setBackground(new java.awt.Color(255, 255, 255));
        panelDatosFinales.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Datos finales"));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Fecha Matricula:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Tipo Matricula:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Grupo Matriculado:");

        textTipoMatricula.setEditable(false);
        textTipoMatricula.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        textoGrupo.setEditable(false);
        textoGrupo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        labelFecha.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelFecha.setForeground(new java.awt.Color(0, 204, 51));
        labelFecha.setText("yyyy-MM-dd");

        botonMatricular.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        botonMatricular.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGS/controlar.png"))); // NOI18N
        botonMatricular.setText("MATRICULAR");
        botonMatricular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMatricularActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelDatosFinalesLayout = new javax.swing.GroupLayout(panelDatosFinales);
        panelDatosFinales.setLayout(panelDatosFinalesLayout);
        panelDatosFinalesLayout.setHorizontalGroup(
            panelDatosFinalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosFinalesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDatosFinalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelDatosFinalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDatosFinalesLayout.createSequentialGroup()
                        .addComponent(textTipoMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 410, Short.MAX_VALUE)
                        .addComponent(botonMatricular)
                        .addGap(115, 115, 115))
                    .addGroup(panelDatosFinalesLayout.createSequentialGroup()
                        .addGroup(panelDatosFinalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textoGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        panelDatosFinalesLayout.setVerticalGroup(
            panelDatosFinalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosFinalesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDatosFinalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(labelFecha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelDatosFinalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(textTipoMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonMatricular))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelDatosFinalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(textoGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelDatos.add(panelDatosFinales, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 930, 140));

        panelPrincipal.add(panelDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 980, 340));

        panelProceso.setBackground(new java.awt.Color(255, 255, 255));
        panelProceso.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelProceso.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelProcesoGrupo.setBackground(new java.awt.Color(0, 255, 153));
        panelProcesoGrupo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel42.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/check.png"))); // NOI18N
        jLabel42.setText("Datos - Grupo");
        jLabel42.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        panelProcesoGrupo.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 130, -1));

        panelProceso.add(panelProcesoGrupo, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 0, 320, -1));

        panelProcesoEstudiante.setBackground(new java.awt.Color(0, 255, 153));
        panelProcesoEstudiante.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel43.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/check.png"))); // NOI18N
        jLabel43.setText("Datos - Estudiantes");
        jLabel43.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        panelProcesoEstudiante.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, -1, -1));

        panelProceso.add(panelProcesoEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, -1));

        panelProcesoMatricula.setBackground(new java.awt.Color(0, 255, 153));
        panelProcesoMatricula.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel44.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/check.png"))); // NOI18N
        jLabel44.setText("Finalizado");
        jLabel44.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        panelProcesoMatricula.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 130, -1));

        panelProceso.add(panelProcesoMatricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(652, 0, 330, -1));

        panelPrincipal.add(panelProceso, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 980, 40));

        jPanel1.add(panelPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 1000, 520));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1034, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 570, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botnPromovidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botnPromovidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botnPromovidoActionPerformed

    private void botonNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonNuevoActionPerformed
        botonNuevo();
    }//GEN-LAST:event_botonNuevoActionPerformed

    private void botonRepitenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRepitenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonRepitenteActionPerformed

    private void botonEspecialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEspecialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonEspecialActionPerformed

    private void botonMatricularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMatricularActionPerformed
        botonMatricula();
    }//GEN-LAST:event_botonMatricularActionPerformed

    private void comboGradosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboGradosActionPerformed
        if (comboGrados.getSelectedIndex() != 0) {
            comboJornada.setEnabled(true);
        } else {
            comboJornada.setEnabled(false);
            comboGrupo.setEnabled(false);
        }
        comboJornada.setSelectedIndex(0);
        eliminarItemComboGrupo();
    }//GEN-LAST:event_comboGradosActionPerformed

    private void comboJornadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboJornadaActionPerformed
        eliminarItemComboGrupo();
        if (comboJornada.getSelectedIndex() != 0) {
            comboGrupo.setEnabled(true);
            cargarComboGrupos();
        } else {
            comboGrupo.setEnabled(false);
        }
    }//GEN-LAST:event_comboJornadaActionPerformed

    private void comboGrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboGrupoActionPerformed
        if (comboGrupo.getSelectedIndex() != 0) {
            botonAceptar.setEnabled(true);
        } else {
            botonAceptar.setEnabled(false);
        }
    }//GEN-LAST:event_comboGrupoActionPerformed

    private void botonAceptar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAceptar
        botonAceptar();
    }//GEN-LAST:event_botonAceptar

    private void botonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarActionPerformed
        botonConsultar();
    }//GEN-LAST:event_botonBuscarActionPerformed

    private void botonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarActionPerformed
        botonCancelar();
    }//GEN-LAST:event_botonCancelarActionPerformed
    
    private void botonConsultar(){
        try {
            
            String identificacion = textoIdentificacion.getText();
            estudianteLocal = controlEstudiante.buscarPorIdentificacion(identificacion);
            pintarDatosEstudiante();
            
            
            textoIdentificacion.setEnabled(false);
            botonBuscar.setEnabled(false);
            enableComponents(panelGrado, true);
            botonAceptar.setEnabled(false);
            
            //Barra de proceso
            enableComponents(panelProcesoGrupo, true);
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(panelDatos, ex.getMessage(), "Validacion", JOptionPane.QUESTION_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(panelDatos, ex.getMessage(), "Excepcion", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    private void botonNuevo(){
        enableComponents(panelDatos, true);
        enableComponents(panelGrado, false);
        enableComponents(panelDatosFinales, false);
        //Barra de procesos
        enableComponents(panelProceso, true);
        enableComponents(panelProcesoGrupo, false);
        enableComponents(panelProcesoMatricula, false);
    }
    private void limpiarPanelEstudiante(){
        textoIdentificacion.setText("");
        labelNombreCompleto.setText("");
        labelEstado.setText("");
        labelFecha.setText("");
        textTipoMatricula.setText("");
        textoGrupo.setText("");
        comboGrados.setSelectedIndex(0);
        comboGrupo.setSelectedIndex(0);
        comboJornada.setSelectedIndex(0);
        estudianteLocal = null;
        grupoLocal = null;
    }
    
    private void pintarDatosEstudiante(){
        labelNombreCompleto.setText(estudianteLocal.getNombreCompleto());
        labelEstado.setText(estudianteLocal.getEstado());
    }
    
    private void botonAceptar() {
        int indice = comboGrupo.getSelectedIndex() - 1;

        try {
            grupoLocal = getListaGrupos().get(indice);

            JCalendar calendar = new JCalendar();
            SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
            labelFecha.setText(formatoFecha.format(calendar.getDate()));
            textoGrupo.setText(grupoLocal.toString());
            textTipoMatricula.setText("Nuevo");

            enableComponents(panelDatosFinales, true);
            botonAceptar.setEnabled(false);
            comboGrados.setEnabled(false);
            comboJornada.setEnabled(false);
            comboGrupo.setEnabled(false);
            
            //Barra de proceso
            enableComponents(panelProcesoMatricula, true);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(panelDatos, ex.getMessage(), "Excepcion", JOptionPane.WARNING_MESSAGE);
            grupoLocal = null;
        }

    }
    private void botonCancelar(){
        enableComponents(panelGrado, false);
        enableComponents(panelDatosFinales, false);
        enableComponents(panelProceso, false);
        textoIdentificacion.setEnabled(true);
        botonBuscar.setEnabled(true);
        limpiarPanelEstudiante();
        //Barra de proceso
        enableComponents(panelProcesoGrupo, false);
        enableComponents(panelProcesoMatricula, false);
    }
    private void botonMatricula(){
        Matricula matricula = new Matricula();
        matricula.setEstudiante(estudianteLocal);
        matricula.setGrupo(grupoLocal);
        matricula.setTipoMatricula(1);
        JCalendar calendar = new JCalendar();
        matricula.setFechaMatricula(calendar.getDate());
        
        try {
            controlMatricula.registrar(matricula, anioLocal);
            JOptionPane.showMessageDialog(panelDatos, "Estudiante matriculado exitosamente.", "Informacion", JOptionPane.INFORMATION_MESSAGE);
            botonCancelar();
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(panelDatos, ex.getMessage(), "Validacion", JOptionPane.QUESTION_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(panelDatos, ex.getMessage(), "Excepcion", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    private void cargarComboGrupos() {
        try {
            List<Grupo> grupos = getListaGrupos();
            grupos.forEach((g) -> {
                comboGrupo.addItem("" + g.getIndiceGrupo());
            });
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(panelDatos, ex.getMessage(), "Excepcion", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    private List<Grupo> getListaGrupos() throws Exception {
        int jornada = comboJornada.getSelectedIndex();
        int grupo = comboGrados.getSelectedIndex() - 1;
        return controlGrupo.verGrupos(anioLocal.getIdAnioLectivo(), grupo, jornada);
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
    private void iniciarPaneles(){
        enableComponents(panelDatos, false);
        enableComponents(panelProceso, false);
    }
    private void eliminarItemComboGrupo() {
        comboGrupo.removeAllItems();
        comboGrupo.addItem("Selec.");
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botnPromovido;
    private javax.swing.JButton botonAceptar;
    private javax.swing.JButton botonBuscar;
    private javax.swing.JButton botonCancelar;
    private javax.swing.JButton botonEspecial;
    private javax.swing.JButton botonMatricular;
    private javax.swing.JButton botonNuevo;
    private javax.swing.JButton botonRepitente;
    private javax.swing.JComboBox<String> comboGrados;
    private javax.swing.JComboBox<String> comboGrupo;
    private javax.swing.JComboBox<String> comboJornada;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel labelEstado;
    private javax.swing.JLabel labelFecha;
    private javax.swing.JLabel labelNombreCompleto;
    private javax.swing.JPanel panelBotones;
    private javax.swing.JPanel panelDatos;
    private javax.swing.JPanel panelDatosFinales;
    private javax.swing.JPanel panelEstudiante;
    private javax.swing.JPanel panelGrado;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JPanel panelProceso;
    private javax.swing.JPanel panelProcesoEstudiante;
    private javax.swing.JPanel panelProcesoGrupo;
    private javax.swing.JPanel panelProcesoMatricula;
    private javax.swing.JTextField textTipoMatricula;
    private javax.swing.JTextField textoGrupo;
    private javax.swing.JTextField textoIdentificacion;
    // End of variables declaration//GEN-END:variables
}
