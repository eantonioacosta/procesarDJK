package djk.procesardkj.view;

import djk.procesardkj.controller.ControllerAnioLectivo;
import djk.procesardkj.controller.ControllerUsuario;
import djk.procesardkj.domain.AnioLectivo;
import djk.procesardkj.domain.Usuario;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class ViewLogin extends javax.swing.JFrame {

    ControllerUsuario controller;
    ControllerAnioLectivo controlAnioLectivo;

    public ViewLogin() {
        initComponents();
        controller = new ControllerUsuario();
        controlAnioLectivo = new ControllerAnioLectivo();
        getServiceHilos();

    }

    private void cargarAniosLectivos() {
        comboAnio.removeAllItems();
        comboAnio.addItem("Seleccione una opcion:");
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    controlAnioLectivo.verAniosLectivos().forEach((lectivo) -> {
                        comboAnio.addItem(lectivo.getIdAnioLectivo() + " - " + lectivo.getNombre());
                    });
                    comboAnio.setSelectedIndex(1);// Borrar
                } catch (NullPointerException ex) {
                    JOptionPane.showMessageDialog(panelCentral, ex.getMessage(),
                            "Validacion", JOptionPane.QUESTION_MESSAGE);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(panelCentral, ex.getMessage(),
                            "Excepcion, la conexion a internet ha fallado", JOptionPane.WARNING_MESSAGE);
                }
            }
        });

    }

    private void getServiceHilos() {
        Runnable proceso = new Runnable() {
            @Override
            public void run() {
                cargarAniosLectivos();
            }
        };
        Thread hilo = new Thread(proceso);
        hilo.start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelCentral = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        comboAnio = new javax.swing.JComboBox<>();
        textUsuario = new javax.swing.JTextField();
        TextPassword = new javax.swing.JPasswordField();
        botonEntrar = new javax.swing.JButton();
        botonSalir = new javax.swing.JButton();
        labelActualizar = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        panelCentral.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Usuario:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Contraseña:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Año Lectivo:");

        comboAnio.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        comboAnio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                comboAnioKeyPressed(evt);
            }
        });

        textUsuario.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        textUsuario.setText("41994774");
        textUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textUsuarioActionPerformed(evt);
            }
        });
        textUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textUsuarioKeyPressed(evt);
            }
        });

        TextPassword.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        TextPassword.setText("4567");
        TextPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TextPasswordKeyPressed(evt);
            }
        });

        botonEntrar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        botonEntrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGS/comprobacion-de-insignias.png"))); // NOI18N
        botonEntrar.setText("ENTRAR");
        botonEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEntrarActionPerformed(evt);
            }
        });

        botonSalir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        botonSalir.setText("SALIR");
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });

        labelActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGS/interrogatorio.png"))); // NOI18N
        labelActualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                labelActualizarMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(textUsuario)
                    .addComponent(TextPassword)
                    .addComponent(comboAnio, 0, 223, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelActualizar)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(botonEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addComponent(botonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(textUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(labelActualizar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(TextPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(comboAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonEntrar)
                    .addComponent(botonSalir))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/imgLogo.jpg"))); // NOI18N

        javax.swing.GroupLayout panelCentralLayout = new javax.swing.GroupLayout(panelCentral);
        panelCentral.setLayout(panelCentralLayout);
        panelCentralLayout.setHorizontalGroup(
            panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCentralLayout.createSequentialGroup()
                .addComponent(jLabel6)
                .addGap(15, 15, 15)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelCentralLayout.setVerticalGroup(
            panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6)
            .addGroup(panelCentralLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCentral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCentral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        if (JOptionPane.showConfirmDialog(rootPane, "Seguro que desea salir?",
                "AVISO", JOptionPane.WARNING_MESSAGE, JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
            System.exit(0);
    }//GEN-LAST:event_botonSalirActionPerformed

    private void botonEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEntrarActionPerformed
        entrarSistema();
    }//GEN-LAST:event_botonEntrarActionPerformed

    private void textUsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textUsuarioKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            entrarSistema();
        }
    }//GEN-LAST:event_textUsuarioKeyPressed

    private void TextPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextPasswordKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            entrarSistema();
        }
    }//GEN-LAST:event_TextPasswordKeyPressed

    private void comboAnioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_comboAnioKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            entrarSistema();
        }
    }//GEN-LAST:event_comboAnioKeyPressed

    private void textUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textUsuarioActionPerformed

    private void labelActualizarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelActualizarMousePressed
        JOptionPane.showMessageDialog(panelCentral, "PROCESAR DJK 2022", "actualizando...", JOptionPane.INFORMATION_MESSAGE);
        getServiceHilos();
    }//GEN-LAST:event_labelActualizarMousePressed
    private void entrarSistema() {
        try {
            String codigo = textUsuario.getText();
            String Clave = String.valueOf(TextPassword.getPassword());

            AnioLectivo anio = new ControllerAnioLectivo().buscarPorCodigo(comboAnio.getSelectedIndex());

            Usuario usuario = controller.iniciarSesion(codigo, Clave);
            JOptionPane.showMessageDialog(panelCentral, "BIENVENIDO AL SISTEMA\n\t" + usuario.getNombre(), "Informacion", JOptionPane.INFORMATION_MESSAGE);

            ViewAdministrador principal = new ViewAdministrador(usuario, anio);
            principal.setVisible(true);
            this.dispose();
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(panelCentral, ex.getMessage(),
                    "Validacion", JOptionPane.QUESTION_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(panelCentral, ex.getMessage(),
                    "ERROR EN LA BASE DE DATOS", JOptionPane.WARNING_MESSAGE);

        }
    }

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField TextPassword;
    private javax.swing.JButton botonEntrar;
    private javax.swing.JButton botonSalir;
    private javax.swing.JComboBox<String> comboAnio;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelActualizar;
    private javax.swing.JPanel panelCentral;
    private javax.swing.JTextField textUsuario;
    // End of variables declaration//GEN-END:variables
}
