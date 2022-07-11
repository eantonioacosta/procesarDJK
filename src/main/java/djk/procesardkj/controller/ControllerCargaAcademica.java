
package djk.procesardkj.controller;

import djk.procesardkj.datos.CargaAcademicaJpaController;
import djk.procesardkj.domain.CargaAcademica;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;


public class ControllerCargaAcademica {
        CargaAcademicaJpaController dao;

    public ControllerCargaAcademica() {
        dao = new CargaAcademicaJpaController();
    }

    public void registrar(CargaAcademica cargaAcademica) throws Exception, NullPointerException {

//        if (grupo.getJornada() == 0 || grupo.getJornada() == -1) {
//            throw new NullPointerException("Favor seleccionar el nivel");
//        }
        dao.create(cargaAcademica);
    }
    
    public void registrarAsignaturaGrupo(CargaAcademica cargaAcademica)throws Exception{
        dao.create(cargaAcademica);
    }

    public void actualizar(CargaAcademica cargaAcademica) throws Exception, NullPointerException {
        if (cargaAcademica.getIdCarga()== 0) {
            throw new NullPointerException("Id vacia");
        }
        dao.edit(cargaAcademica);
    }

    public void eliminar(int codigo) throws Exception {
        dao.destroy(codigo);
    }

    public List<CargaAcademica> verTodos() throws Exception {
        return dao.findCargaAcademicaEntities();
    }
    
    public List<CargaAcademica> verTodos(int idGrupo) throws Exception {
        List<CargaAcademica> lista = new ArrayList<>();
        for (CargaAcademica carga : verTodos()) {
            if(carga.getGrupo().getIdGrupo()==idGrupo)
                lista.add(carga);
        }
        return lista;
    }


    public CargaAcademica buscarPorCodigo(int codigo) throws Exception {
        return dao.findCargaAcademica(codigo);
    }
    
    public DefaultTableModel getTabla(int anioLectivo) throws Exception{

        String[] columnas = {"#", "NOMBRE", "NOMBRE COMPLETO", "HORAS", "AREA"};//Modificar
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.setColumnIdentifiers(columnas);

        String[] fila = new String[columnas.length];
        for (CargaAcademica detalle : verTodos(anioLectivo)) {
            fila[0] = ""+detalle.getIdCarga();
            fila[1] = detalle.getAsignatura().getNombreCompleto();
            //fila[2] = detalle.getIdGrupo().getNombreTexto();
            modelo.addRow(fila);
        }
        return modelo;
    }
}
