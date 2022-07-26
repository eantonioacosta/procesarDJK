package djk.procesardkj.view.procesos;

import djk.procesardkj.controller.ControllerCargaAcademica;
import djk.procesardkj.controller.ControllerDocente;
import djk.procesardkj.domain.AnioLectivo;
import djk.procesardkj.domain.CargaAcademica;
import djk.procesardkj.domain.Docente;
import djk.procesardkj.domain.Usuario;
import djk.procesardkj.view.ViewAdministrador;
import java.awt.Color;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.border.BevelBorder;
import javax.swing.table.JTableHeader;
import vo.PersonaVo;

public class ViewCalificaciones extends javax.swing.JInternalFrame {

    ArrayList<PersonaVo> listaPersonas;
    ModeloTabla modelo;
    private int filasTabla;
    private int columnasTabla;

    Docente docenteLocal;
    AnioLectivo anioLocal;

    ControllerDocente controlDocente;
    ControllerCargaAcademica controlCarga;

    public ViewCalificaciones() {
        initComponents();
        iniciarInstancias();
        construirTabla();//borrar
    }

    private void iniciarInstancias() {
        controlDocente = new ControllerDocente();
        controlCarga = new ControllerCargaAcademica();
        docenteLocal = ViewAdministrador.usuarioSistema.getDocente();
        anioLocal = ViewAdministrador.anioLectivo;

        cargarCombo();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelCentral = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane = new javax.swing.JScrollPane();
        tablaCalificaciones = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        comboDocente = new javax.swing.JComboBox<>();

        setClosable(true);
        setIconifiable(true);
        setTitle("Calificaciones / Nivelaciones");
        setPreferredSize(new java.awt.Dimension(1100, 600));

        panelCentral.setBackground(new java.awt.Color(255, 255, 255));
        panelCentral.setPreferredSize(new java.awt.Dimension(1100, 600));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Tabla de calificaciones / Estudiantes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        tablaCalificaciones.setBackground(Color.WHITE);
        tablaCalificaciones.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
        tablaCalificaciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaCalificacionesMouseClicked(evt);
            }
        });
        jScrollPane.setViewportView(tablaCalificaciones);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 1058, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(comboDocente, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(comboDocente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(131, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelCentralLayout = new javax.swing.GroupLayout(panelCentral);
        panelCentral.setLayout(panelCentralLayout);
        panelCentralLayout.setHorizontalGroup(
            panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCentralLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelCentralLayout.setVerticalGroup(
            panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCentralLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCentral, javax.swing.GroupLayout.PREFERRED_SIZE, 1090, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelCentral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tablaCalificacionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaCalificacionesMouseClicked
        //capturo fila o columna dependiendo de mi necesidad
        int fila = tablaCalificaciones.rowAtPoint(evt.getPoint());
        int columna = tablaCalificaciones.columnAtPoint(evt.getPoint());

        /*uso la columna para valiar si corresponde a la columna de perfil garantizando
		 * que solo se produzca algo si selecciono una fila de esa columna
         */
        if (columna == Utilidades.PERFIL) {
            //sabiendo que corresponde a la columna de perfil, envio la posicion de la fila seleccionada
            validarSeleccionMouse(fila);
        } else if (columna == Utilidades.EVENTO) {//se valida que sea la columna del otro evento
            JOptionPane.showMessageDialog(null, "Evento del otro icono");
        }
    }//GEN-LAST:event_tablaCalificacionesMouseClicked

    private void cargarCombo() {
        if (docenteLocal == null) {
            try {
                for (CargaAcademica carga : controlCarga.verTodosPorAnio(anioLocal)) {
                    comboDocente.addItem(carga.getCargaAsignatura());
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(panelCentral, ex.getMessage(),
                        "Excepcion", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            try {
//                for(CargaAcademica carga : docenteLocal.getCargaAcademicaList()){
//                    System.out.println(carga.getCargaAsignatura());
//                }
                for (CargaAcademica carga : controlCarga.consultarPorDocente(docenteLocal, anioLocal)) {
                    comboDocente.addItem(carga.getCargaAsignatura());
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(panelCentral, ex.getMessage(),
                        "Excepcion", JOptionPane.WARNING_MESSAGE);
            }
        }
    }

    private void construirTabla() {

        listaPersonas = consultarListaPersonas();

        ArrayList<String> titulosList = new ArrayList<>();

        titulosList.add("Documento");
        titulosList.add("Nombre");
        titulosList.add("Direccion");
        titulosList.add("Telefono");
        titulosList.add("Profesion");
        titulosList.add("Edad");
        titulosList.add("Nota1");
        titulosList.add("Nota2");
        titulosList.add("Nota3");
        titulosList.add("Promedio");
        titulosList.add(" ");
        titulosList.add(" ");

        //se asignan las columnas al arreglo para enviarse al momento de construir la tabla
        String titulos[] = new String[titulosList.size()];
        for (int i = 0; i < titulos.length; i++) {
            titulos[i] = titulosList.get(i);
        }
        /*obtenemos los datos de la lista y los guardamos en la matriz
		 * que luego se manda a construir la tabla
         */
        Object[][] data = obtenerMatrizDatos(titulosList);
        construirTabla(titulos, data);

    }

    private ArrayList<PersonaVo> consultarListaPersonas() {
        ArrayList<PersonaVo> lista = new ArrayList<>();

        lista.add(new PersonaVo("1234", "Cristian David Henao", "Calle 2# 23-09 Armenia", "7564323", "Ingeniero", 23, 2.5, 4.3, 3.0, (2.5 + 4.3 + 3) / 33));
        lista.add(new PersonaVo("3455", "Juan Camilo Perez", "Calle 2# 23-09 Armenia", "7564323", "Ingeniero", 0, 0, 0, 0, 0));
        lista.add(new PersonaVo("3214", "Marlon Guapacha", "Calle 2# 23-09 Armenia", "7564323", "Ingeniero", 0, 0, 0, 0, 0));
        lista.add(new PersonaVo("7886", "Marina Marin", "Calle 2# 23-09 Armenia", "7564323", "Ingeniero", 0, 0, 0, 0, 0));
        lista.add(new PersonaVo("4331", "Juliana Henao", "Calle 2# 23-09 Armenia", "7564323", "Ingeniero", 0, 0, 0, 0, 0));
        lista.add(new PersonaVo("98675", "David Henao", "Calle 2# 23-09 Armenia", "7564323", "Ingeniero", 0, 0, 0, 0, 0));
        lista.add(new PersonaVo("1221", "Cristian mendez Henao", "Calle 2# 23-09 Armenia", "7564323", "Ingeniero", 0, 0, 0, 0, 0));

        return lista;
    }

    private Object[][] obtenerMatrizDatos(ArrayList<String> titulosList) {

        /*se crea la matriz donde las filas son dinamicas pues corresponde
		 * a todos los usuarios, mientras que las columnas son estaticas
		 * correspondiendo a las columnas definidas por defecto
         */
        String informacion[][] = new String[listaPersonas.size()][titulosList.size()];

        for (int x = 0; x < informacion.length; x++) {

            informacion[x][Utilidades.DOCUMENTO] = listaPersonas.get(x).getDocumento() + "";
            informacion[x][Utilidades.NOMBRE] = listaPersonas.get(x).getNombre() + "";
            informacion[x][Utilidades.DIRECCION] = listaPersonas.get(x).getDireccion() + "";
            informacion[x][Utilidades.TELEFONO] = listaPersonas.get(x).getTelefono() + "";
            informacion[x][Utilidades.PROFESION] = listaPersonas.get(x).getProfesion() + "";
            informacion[x][Utilidades.EDAD] = listaPersonas.get(x).getEdad() + "";
            informacion[x][Utilidades.NOTA1] = listaPersonas.get(x).getNota1() + "";
            informacion[x][Utilidades.NOTA2] = listaPersonas.get(x).getNota2() + "";
            informacion[x][Utilidades.NOTA3] = listaPersonas.get(x).getNota3() + "";
            informacion[x][Utilidades.PROMEDIO] = listaPersonas.get(x).getPromedio() + "";
            //se asignan las plabras clave para que en la clase GestionCeldas se use para asignar el icono correspondiente
            informacion[x][Utilidades.PERFIL] = "PERFIL";
            informacion[x][Utilidades.EVENTO] = "EVENTO";
        }

        return informacion;
    }

    private void construirTabla(String[] titulos, Object[][] data) {
        modelo = new ModeloTabla(data, titulos);
        //se asigna el modelo a la tabla
        tablaCalificaciones.setModel(modelo);

        filasTabla = tablaCalificaciones.getRowCount();
        columnasTabla = tablaCalificaciones.getColumnCount();

        //se asigna el tipo de dato que tendr�n las celdas de cada columna definida respectivamente para validar su personalizaci�n
        tablaCalificaciones.getColumnModel().getColumn(Utilidades.EDAD).setCellRenderer(new GestionCeldas("numerico"));
        tablaCalificaciones.getColumnModel().getColumn(Utilidades.NOTA1).setCellRenderer(new GestionCeldas("numerico"));
        tablaCalificaciones.getColumnModel().getColumn(Utilidades.NOTA2).setCellRenderer(new GestionCeldas("numerico"));
        tablaCalificaciones.getColumnModel().getColumn(Utilidades.NOTA3).setCellRenderer(new GestionCeldas("numerico"));
        tablaCalificaciones.getColumnModel().getColumn(Utilidades.PROMEDIO).setCellRenderer(new GestionCeldas("numerico"));
        tablaCalificaciones.getColumnModel().getColumn(Utilidades.PERFIL).setCellRenderer(new GestionCeldas("icono"));
        tablaCalificaciones.getColumnModel().getColumn(Utilidades.EVENTO).setCellRenderer(new GestionCeldas("icono"));

        //se recorre y asigna el resto de celdas que serian las que almacenen datos de tipo texto
        for (int i = 0; i < titulos.length - 7; i++) {//se resta 7 porque las ultimas 7 columnas se definen arriba
            System.out.println(i);
            tablaCalificaciones.getColumnModel().getColumn(i).setCellRenderer(new GestionCeldas("texto"));
        }

        tablaCalificaciones.getTableHeader().setReorderingAllowed(false);
        tablaCalificaciones.setRowHeight(25);//tama�o de las celdas
        tablaCalificaciones.setGridColor(new java.awt.Color(0, 0, 0));
        //Se define el tama�o de largo para cada columna y su contenido
        tablaCalificaciones.getColumnModel().getColumn(Utilidades.DOCUMENTO).setPreferredWidth(130);//documento
        tablaCalificaciones.getColumnModel().getColumn(Utilidades.NOMBRE).setPreferredWidth(380);//nombre
        tablaCalificaciones.getColumnModel().getColumn(Utilidades.DIRECCION).setPreferredWidth(350);//direccion
        tablaCalificaciones.getColumnModel().getColumn(Utilidades.TELEFONO).setPreferredWidth(130);//telefono
        tablaCalificaciones.getColumnModel().getColumn(Utilidades.PROFESION).setPreferredWidth(280);//profesion
        tablaCalificaciones.getColumnModel().getColumn(Utilidades.EDAD).setPreferredWidth(80);//edad
        tablaCalificaciones.getColumnModel().getColumn(Utilidades.NOTA1).setPreferredWidth(100);//nota1
        tablaCalificaciones.getColumnModel().getColumn(Utilidades.NOTA2).setPreferredWidth(100);//nota2
        tablaCalificaciones.getColumnModel().getColumn(Utilidades.NOTA3).setPreferredWidth(100);//nota3
        tablaCalificaciones.getColumnModel().getColumn(Utilidades.PROMEDIO).setPreferredWidth(130);//promedio
        tablaCalificaciones.getColumnModel().getColumn(Utilidades.PERFIL).setPreferredWidth(30);//accion perfil
        tablaCalificaciones.getColumnModel().getColumn(Utilidades.EVENTO).setPreferredWidth(30);//accion evento

        //personaliza el encabezado
        JTableHeader jtableHeader = tablaCalificaciones.getTableHeader();
        jtableHeader.setDefaultRenderer(new GestionEncabezadoTabla());
        tablaCalificaciones.setTableHeader(jtableHeader);

    }

    private void validarSeleccionMouse(int fila) {
        Utilidades.filaSeleccionada = fila;

        //teniendo la fila entonces se obtiene el objeto correspondiente para enviarse como parammetro o imprimir la informaci�n
        PersonaVo miPersona = new PersonaVo();
        miPersona.setDocumento(tablaCalificaciones.getValueAt(fila, Utilidades.DOCUMENTO).toString());
        miPersona.setNombre(tablaCalificaciones.getValueAt(fila, Utilidades.NOMBRE).toString());

        String info = "INFO PERSONA\n";
        info += "Documento: " + miPersona.getDocumento() + "\n";
        info += "Nombre: " + miPersona.getNombre() + "\n";

        JOptionPane.showMessageDialog(null, info);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comboDocente;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JPanel panelCentral;
    private javax.swing.JTable tablaCalificaciones;
    // End of variables declaration//GEN-END:variables
}
