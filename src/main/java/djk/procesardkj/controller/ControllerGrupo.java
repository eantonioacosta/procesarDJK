package djk.procesardkj.controller;


import djk.procesardkj.datos.GrupoJpaController;
import djk.procesardkj.domain.AnioLectivo;
import djk.procesardkj.domain.Estudiante;
import djk.procesardkj.domain.Grupo;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ControllerGrupo {

    GrupoJpaController dao;

    public ControllerGrupo() {
        dao = new GrupoJpaController();
    }

    public void registrar(Grupo grupo) throws Exception, NullPointerException {

        if (grupo.getJornada() == 0 || grupo.getJornada() == -1) {
            throw new NullPointerException("Favor seleccionar el nivel");
        }

        dao.create(grupo);
    }

    public void actualizar(Grupo grupo) throws Exception, NullPointerException {
        if (grupo.getIdGrupo()== 0) {
            throw new NullPointerException("Id vacia");
        }
        if (grupo.getJornada() == 0 || grupo.getJornada() == -1) {
            throw new NullPointerException("Favor seleccionar el nivel");
        }
        dao.edit(grupo);
    }

    public void eliminar(int codigo) throws Exception {
        dao.destroy(codigo);
    }

    public List<Grupo> verGruposTodos() throws Exception {
        return dao.findGrupoEntities();
    }

    public List<Grupo> verGrupos(int idAnioLectivo) throws Exception {//mejorar consulta 
        List<Grupo> listaGrupo = new ArrayList<>();
        for (Grupo grupo : dao.findGrupoEntities()) {
            if (grupo.getAnioLectivo().getIdAnioLectivo()== idAnioLectivo) {
                listaGrupo.add(grupo);
            }
        }
        return listaGrupo;
    }
    public Grupo buscarGrupoItem(int idAnioLectivo, int item)throws Exception, NullPointerException{
        if(item == -1){
            throw new NullPointerException("Seleccione el grado");
        }
        return verGrupos(idAnioLectivo).get(item);
    }
    public List<Grupo> verGrupos(int idAnioLectivo, int grado, int jornada) throws Exception {
        List<Grupo> listaGrupo = new ArrayList<>();

        for (Grupo grupo : verGrupos(idAnioLectivo)) {
            if (grupo.getNombre() == grado && grupo.getJornada() == jornada) {
                listaGrupo.add(grupo);
            }
        }
        return listaGrupo;
    }

    public Grupo buscarPorCodigo(int idGrupo) throws Exception {
        return dao.findGrupo(idGrupo);
    }

    public DefaultTableModel getTabla(int idAnioLectivo) throws Exception {

        String[] columnas = {"ID", "NOMBRE", "JORNADA", "INDICE GRUPOS", "DIRECTOR GRUPO"};
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.setColumnIdentifiers(columnas);

        List<Grupo> listaGrupo = verGrupos(idAnioLectivo);

        String[] fila = new String[columnas.length];
        for (Grupo grupo : listaGrupo) {
            fila[0] = "" + grupo.getIdGrupo();
            fila[1] = grupo.getNombreTexto();
            fila[2] = grupo.getJornadaTexto();
            fila[3] = "" + grupo.getIndiceGrupo();
            fila[4] = (grupo.getDocente()!=null)?  grupo.getDocente().getNombreCompleto() : "";
            modelo.addRow(fila);
        }
        return modelo;
    }
    public DefaultTableModel getTablaCarga(AnioLectivo anio) throws Exception {
        String[] columnas = {"ID", "NOMBRE"};
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.setColumnIdentifiers(columnas);
        
        List<Grupo> listaGrupo = verGrupos(anio.getIdAnioLectivo());
        
        String[] fila = new String[columnas.length];
        for (Grupo grupo : listaGrupo) {
            fila[0] = "" + grupo.getIdGrupo();
            fila[1] = grupo.toString();
            modelo.addRow(fila);
        }
        return modelo;
    }
    

    private boolean[] editable = {false, false, false, false, true, false};
    public void visualizar(JTable tabla) {

        tabla.setDefaultRenderer(Object.class, new Render());
        DefaultTableModel dt = new DefaultTableModel(new String[]{"ID", "NOMBRE", "JORNADA", "INDICE GRUPOS", "DIRECTOR GRUPO","BOTON"}, 0) {

            Class[] types = new Class[]{
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }

            public boolean isCellEditable(int row, int column) {
                return editable[column];
            }
        };

        JButton btn_visualizar = new JButton("Visualizar");
        btn_visualizar.setName("v");

        List<Grupo> list = dao.findGrupoEntities();
        for (Grupo grupo : list) {
            Object fila[] = new Object[6];
            
            fila[0] = grupo.getIdGrupo();
            fila[1] = grupo.getNombreTexto();
            fila[2] = grupo.getJornadaTexto();
            fila[3] = grupo.getIndiceGrupo();
            int ac = 1;//(int) grupo.getActivo();
            if (ac == 1) {
                fila[4] = true;
            } else {
                fila[4] = false;
            }
            fila[5] = btn_visualizar;

            dt.addRow(fila);
        }

        tabla.setModel(dt);

    }
}
