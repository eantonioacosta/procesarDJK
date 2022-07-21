/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package djk.procesardkj.view;

import djk.procesardkj.domain.Estudiante;

/**
 *
 * @author ENOR ACOSTA
 */
public class ViewEstudianteResumen extends javax.swing.JInternalFrame {

    /**
     * Creates new form ViewEstudianteResumen
     */
    public ViewEstudianteResumen() {
        initComponents();
    }

    public ViewEstudianteResumen(Estudiante estudiante) {
        initComponents();
        txtPrimerApellidoEstudiante.setText(estudiante.getPrimerApellido());
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
        panelDatosEstudiante = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        labelMatricula = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txtFechaIngresoEstudiante = new javax.swing.JLabel();
        textoMatricula = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        labelPrimerNombreEstudiante = new javax.swing.JLabel();
        txtPrimerNombreEstudiante = new javax.swing.JLabel();
        txtDireccionEstudiante = new javax.swing.JLabel();
        txtPrimerApellidoEstudiante = new javax.swing.JLabel();
        txtSegundoApellidoEstudiante = new javax.swing.JLabel();
        txtCorreoEstudiante = new javax.swing.JLabel();
        txtTipoSangreEstudiante = new javax.swing.JLabel();
        txtTipoIdEstudiante = new javax.swing.JLabel();
        txtSegundoNombreEstudiante = new javax.swing.JLabel();
        txtIdentificacionEstudiante = new javax.swing.JLabel();
        txtFechaExpedicionEstudiante = new javax.swing.JLabel();
        txtLugarExpedicionEstudiante = new javax.swing.JLabel();
        txtFechaNacimientoEstudiante = new javax.swing.JLabel();
        txtSexoEstudiante = new javax.swing.JLabel();
        panelDatosPadre = new javax.swing.JPanel();
        labelNombresPadre = new javax.swing.JLabel();
        labelApellidosPadre = new javax.swing.JLabel();
        labelTipoIdPadre = new javax.swing.JLabel();
        labelIdPadre = new javax.swing.JLabel();
        labelCorreoPadre = new javax.swing.JLabel();
        labelTelefonoPadre = new javax.swing.JLabel();
        txtTipoIdPadre = new javax.swing.JLabel();
        txtApellidosPadre = new javax.swing.JLabel();
        txtCorreoPadre = new javax.swing.JLabel();
        txtIdPadres = new javax.swing.JLabel();
        txtTelefonoPadre = new javax.swing.JLabel();
        txtNombresPadre = new javax.swing.JLabel();
        panelDatosMadre = new javax.swing.JPanel();
        labelPrimerNombre2 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        txtTelefonoMadre = new javax.swing.JLabel();
        txtIdMadre = new javax.swing.JLabel();
        txtApellidosMadre = new javax.swing.JLabel();
        txtNombresMadre = new javax.swing.JLabel();
        txtCorreoMadre = new javax.swing.JLabel();
        txtTipoIdMadre = new javax.swing.JLabel();
        botonCerrar = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        panelDatosEstudiante.setBackground(new java.awt.Color(255, 255, 255));
        panelDatosEstudiante.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 204, 51), null), "Datos del estudiante", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 10))); // NOI18N
        panelDatosEstudiante.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("1er Apellido:");
        panelDatosEstudiante.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("2do Nombre:");
        panelDatosEstudiante.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 40, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("2do Apellido:");
        panelDatosEstudiante.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 60, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setText("Tipo de identificacion:");
        panelDatosEstudiante.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setText("No. Identificacion:");
        panelDatosEstudiante.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 80, 113, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setText("Correo:");
        panelDatosEstudiante.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 100, -1, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel15.setText("Fecha de Expedicion:");
        panelDatosEstudiante.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 20, -1, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel16.setText("Lugar Expedicion: ");
        panelDatosEstudiante.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 40, -1, -1));

        labelMatricula.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelMatricula.setText("No. de Matricula:");
        panelDatosEstudiante.add(labelMatricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel18.setText("Fecha de Nacimiento:");
        panelDatosEstudiante.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 60, -1, -1));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel19.setText("Tipo Sangre:");
        panelDatosEstudiante.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 100, -1, -1));

        txtFechaIngresoEstudiante.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtFechaIngresoEstudiante.setForeground(new java.awt.Color(0, 153, 51));
        txtFechaIngresoEstudiante.setText("yyyy-MM-dd");
        panelDatosEstudiante.add(txtFechaIngresoEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, 100, -1));

        textoMatricula.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        textoMatricula.setForeground(new java.awt.Color(204, 0, 51));
        textoMatricula.setText("0");
        panelDatosEstudiante.add(textoMatricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 100, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Feha Ingreso:");
        panelDatosEstudiante.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, -1, -1));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel20.setText("Direccion:");
        panelDatosEstudiante.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel21.setText("Sexo:");
        panelDatosEstudiante.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 80, -1, -1));

        labelPrimerNombreEstudiante.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelPrimerNombreEstudiante.setText("1er Nombre:");
        panelDatosEstudiante.add(labelPrimerNombreEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        txtPrimerNombreEstudiante.setText("------------");
        panelDatosEstudiante.add(txtPrimerNombreEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 180, -1));

        txtDireccionEstudiante.setText("------------");
        panelDatosEstudiante.add(txtDireccionEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 190, -1));

        txtPrimerApellidoEstudiante.setText("------------");
        panelDatosEstudiante.add(txtPrimerApellidoEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 180, -1));

        txtSegundoApellidoEstudiante.setText("------------");
        panelDatosEstudiante.add(txtSegundoApellidoEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 60, 180, -1));

        txtCorreoEstudiante.setText("------------");
        panelDatosEstudiante.add(txtCorreoEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 100, 220, -1));

        txtTipoSangreEstudiante.setText("------------");
        panelDatosEstudiante.add(txtTipoSangreEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 100, 140, -1));

        txtTipoIdEstudiante.setText("------------");
        panelDatosEstudiante.add(txtTipoIdEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 150, -1));

        txtSegundoNombreEstudiante.setText("------------");
        panelDatosEstudiante.add(txtSegundoNombreEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 40, 180, -1));

        txtIdentificacionEstudiante.setText("------------");
        panelDatosEstudiante.add(txtIdentificacionEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 80, 150, -1));

        txtFechaExpedicionEstudiante.setText("------------");
        panelDatosEstudiante.add(txtFechaExpedicionEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 20, 140, -1));

        txtLugarExpedicionEstudiante.setText("------------");
        panelDatosEstudiante.add(txtLugarExpedicionEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 40, 160, -1));

        txtFechaNacimientoEstudiante.setText("------------");
        panelDatosEstudiante.add(txtFechaNacimientoEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 60, 140, -1));

        txtSexoEstudiante.setText("------------");
        panelDatosEstudiante.add(txtSexoEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 80, 140, -1));

        panelDatosPadre.setBackground(new java.awt.Color(255, 255, 255));
        panelDatosPadre.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 204, 204), null), "Datos del padre", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 10))); // NOI18N
        panelDatosPadre.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelNombresPadre.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelNombresPadre.setText("Nombres:");
        panelDatosPadre.add(labelNombresPadre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        labelApellidosPadre.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelApellidosPadre.setText("Apellidos:");
        panelDatosPadre.add(labelApellidosPadre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        labelTipoIdPadre.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelTipoIdPadre.setText("Tipo de identificacion:");
        panelDatosPadre.add(labelTipoIdPadre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        labelIdPadre.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelIdPadre.setText("No. Identificacion:");
        panelDatosPadre.add(labelIdPadre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 113, -1));

        labelCorreoPadre.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelCorreoPadre.setText("Correo:");
        panelDatosPadre.add(labelCorreoPadre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        labelTelefonoPadre.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelTelefonoPadre.setText("Telefono:");
        panelDatosPadre.add(labelTelefonoPadre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        txtTipoIdPadre.setText("------------");
        panelDatosPadre.add(txtTipoIdPadre, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 150, -1));

        txtApellidosPadre.setText("------------");
        panelDatosPadre.add(txtApellidosPadre, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 210, -1));

        txtCorreoPadre.setText("------------");
        panelDatosPadre.add(txtCorreoPadre, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 210, -1));

        txtIdPadres.setText("------------");
        panelDatosPadre.add(txtIdPadres, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 100, -1));

        txtTelefonoPadre.setText("------------");
        panelDatosPadre.add(txtTelefonoPadre, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 210, -1));

        txtNombresPadre.setText("------------");
        panelDatosPadre.add(txtNombresPadre, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 210, -1));

        panelDatosMadre.setBackground(new java.awt.Color(255, 255, 255));
        panelDatosMadre.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 0, 51), null), "Datos de la madre", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 10))); // NOI18N
        panelDatosMadre.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelPrimerNombre2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelPrimerNombre2.setText("Nombres:");
        panelDatosMadre.add(labelPrimerNombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel26.setText("Apellidos:");
        panelDatosMadre.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel27.setText("Tipo de identificacion:");
        panelDatosMadre.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel28.setText("No. Identificacion:");
        panelDatosMadre.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 113, -1));

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel29.setText("Correo:");
        panelDatosMadre.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel30.setText("Telefono:");
        panelDatosMadre.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        txtTelefonoMadre.setText("------------");
        panelDatosMadre.add(txtTelefonoMadre, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 210, -1));

        txtIdMadre.setText("------------");
        panelDatosMadre.add(txtIdMadre, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 100, -1));

        txtApellidosMadre.setText("------------");
        panelDatosMadre.add(txtApellidosMadre, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 210, -1));

        txtNombresMadre.setText("------------");
        panelDatosMadre.add(txtNombresMadre, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 210, -1));

        txtCorreoMadre.setText("------------");
        panelDatosMadre.add(txtCorreoMadre, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 210, -1));

        txtTipoIdMadre.setText("------------");
        panelDatosMadre.add(txtTipoIdMadre, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 140, -1));

        botonCerrar.setText("Cerrar");
        botonCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(802, Short.MAX_VALUE)
                .addComponent(botonCerrar)
                .addGap(88, 88, 88))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 21, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(panelDatosEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 910, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(panelDatosPadre, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(10, 10, 10)
                            .addComponent(panelDatosMadre, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(0, 22, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(281, Short.MAX_VALUE)
                .addComponent(botonCerrar)
                .addGap(71, 71, 71))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 41, Short.MAX_VALUE)
                    .addComponent(panelDatosEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(11, 11, 11)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(panelDatosPadre, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(panelDatosMadre, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 41, Short.MAX_VALUE)))
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

    private void botonCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCerrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_botonCerrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCerrar;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelApellidosPadre;
    private javax.swing.JLabel labelCorreoPadre;
    private javax.swing.JLabel labelIdPadre;
    private javax.swing.JLabel labelMatricula;
    private javax.swing.JLabel labelNombresPadre;
    private javax.swing.JLabel labelPrimerNombre2;
    private javax.swing.JLabel labelPrimerNombreEstudiante;
    private javax.swing.JLabel labelTelefonoPadre;
    private javax.swing.JLabel labelTipoIdPadre;
    private javax.swing.JPanel panelDatosEstudiante;
    private javax.swing.JPanel panelDatosMadre;
    private javax.swing.JPanel panelDatosPadre;
    private javax.swing.JLabel textoMatricula;
    private javax.swing.JLabel txtApellidosMadre;
    private javax.swing.JLabel txtApellidosPadre;
    private javax.swing.JLabel txtCorreoEstudiante;
    private javax.swing.JLabel txtCorreoMadre;
    private javax.swing.JLabel txtCorreoPadre;
    private javax.swing.JLabel txtDireccionEstudiante;
    private javax.swing.JLabel txtFechaExpedicionEstudiante;
    private javax.swing.JLabel txtFechaIngresoEstudiante;
    private javax.swing.JLabel txtFechaNacimientoEstudiante;
    private javax.swing.JLabel txtIdMadre;
    private javax.swing.JLabel txtIdPadres;
    private javax.swing.JLabel txtIdentificacionEstudiante;
    private javax.swing.JLabel txtLugarExpedicionEstudiante;
    private javax.swing.JLabel txtNombresMadre;
    private javax.swing.JLabel txtNombresPadre;
    private javax.swing.JLabel txtPrimerApellidoEstudiante;
    private javax.swing.JLabel txtPrimerNombreEstudiante;
    private javax.swing.JLabel txtSegundoApellidoEstudiante;
    private javax.swing.JLabel txtSegundoNombreEstudiante;
    private javax.swing.JLabel txtSexoEstudiante;
    private javax.swing.JLabel txtTelefonoMadre;
    private javax.swing.JLabel txtTelefonoPadre;
    private javax.swing.JLabel txtTipoIdEstudiante;
    private javax.swing.JLabel txtTipoIdMadre;
    private javax.swing.JLabel txtTipoIdPadre;
    private javax.swing.JLabel txtTipoSangreEstudiante;
    // End of variables declaration//GEN-END:variables
}
