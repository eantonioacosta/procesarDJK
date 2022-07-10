package djk.procesardkj.controller;

import djk.procesardkj.datos.DocenteJpaController;
import djk.procesardkj.domain.Docente;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class ControllerDocente {

    DocenteJpaController dao;

    public ControllerDocente() {
        dao = new DocenteJpaController();
    }

    public void registrar(Docente docente) throws Exception, NullPointerException{
        if(docente.getUsuario().getCodigo().trim().length()==0){
            throw new NullPointerException("Favor ingresar la identificacion.");
        }
        if(docente.getUsuario().getClave().trim().length()==0){
            throw new NullPointerException("Favor ingresar la contraseña.");
        }
        if(docente.getNombres().trim().length()==0){
            throw new NullPointerException("Favor ingresar el nombre.");
        } 
        if(docente.getApellidos().trim().length()==0){
            throw new NullPointerException("Favor ingresar los apellidos.");
        }
        new ControllerUsuario().registrar(docente.getUsuario());
        dao.create(docente);
    }

    public void actualizar(Docente docente) throws Exception{
        dao.edit(docente);
    }

    public void eliminar(int codigo) throws Exception{
        dao.destroy(codigo);
    }


    public List<Docente> verDocentes() throws Exception{
        return dao.findDocenteEntities();
    }

    public List<Docente> verDocentesActivo() throws Exception{
        List<Docente> lista = new ArrayList<Docente>();
        dao.findDocenteEntities().stream().filter((docente) -> (docente.getEstado() == 1)).forEachOrdered((docente) -> {
            lista.add(docente);
        });

        return lista;
    }

    public int DocenteActivoIndice(Docente docente) throws Exception{
        List<Docente> listaDocente = verDocentesActivo();
        for (int i = 0; i < listaDocente.size(); i++) {
            if (listaDocente.get(i).getIdDocente()== docente.getIdDocente()) {
                return i + 1;
            }
        }
        return -1;
    }

    public Docente buscarPorCodigo(int codigo) throws Exception{
        return dao.findDocente(codigo);
    }

    public DefaultTableModel getTabla() throws Exception{//Validar si la tabla esta vacia
        String[] columnas = {"#", "IDENTFICACION", "NOMBRE COMPLETO", "ESTADO", "FECHA NTO", "T.S", "DIRECCION", "TELEFONO", "CORREO", "CIUDAD", "TITULO"};
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.setColumnIdentifiers(columnas);

        String[] fila = new String[columnas.length];
        for (Docente docente : dao.findDocenteEntities()) {
            fila[0] = "" + docente.getIdDocente();
            fila[1] = "" + docente.getUsuario().getCodigo();
            fila[2] = docente.getNombreCompleto();
            fila[3] = docente.getEstadoTexto();
            fila[4] = docente.getFechaNacimientoTexto();
            fila[5] = docente.getTipoSangreTexto();
            fila[6] = docente.getDireccion();
            fila[7] = docente.getTelefono();
            fila[8] = docente.getCorreo();
            fila[9] = docente.getCiudad();
            fila[10] = docente.getTitulo();

            modelo.addRow(fila);
        }
        return modelo;
    }
}