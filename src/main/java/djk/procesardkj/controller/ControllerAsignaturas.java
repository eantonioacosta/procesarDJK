
package djk.procesardkj.controller;
import djk.procesardkj.datos.AsignaturaJpaController;
import djk.procesardkj.datos.exceptions.PreexistingEntityException;
import djk.procesardkj.domain.Asignatura;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class ControllerAsignaturas {
    
    AsignaturaJpaController dao;

    public ControllerAsignaturas() {
        dao = new AsignaturaJpaController();
    }

    public void registrar(Asignatura asignatura) throws PreexistingEntityException, Exception, NullPointerException{
        if(asignatura.getNombre().trim().length()==0){
            throw new NullPointerException("Favor ingresar el nombre");
        }
        if(asignatura.getArea().getIdArea()==0 || asignatura.getArea().getIdArea()==-1){
            throw new NullPointerException("Favor de seleccionar el area");
        }
        dao.create(asignatura);
    }

    public void actualizar(Asignatura asignatura) throws Exception{
        dao.edit(asignatura);
    }

    public void eliminar(int idAsignatura) throws Exception, NullPointerException{
        dao.destroy(idAsignatura);
    }

    public List<Asignatura> verAsignaturas() throws Exception{
        return dao.findAsignaturaEntities();
    }

    public Asignatura buscarPorCodigo(int idAsignatura) throws Exception{
        return dao.findAsignatura(idAsignatura);
    }

    public Asignatura buscarPorItem(int item) throws Exception, NullPointerException{
        if(item == -1){
            throw new NullPointerException("Seleccione una opcion");
        }
        return dao.findAsignaturaEntities().get(item);
    }

    public DefaultTableModel getTabla() throws Exception{

        String[] columnas = {"#", "NOMBRE", "NOMBRE COMPLETO", "HORAS", "AREA"};
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.setColumnIdentifiers(columnas);

        String[] fila = new String[columnas.length];
        for (Asignatura asignatura : dao.findAsignaturaEntities()) {
            fila[0] = ""+asignatura.getIdAsignatura();
            fila[1] = asignatura.getNombre();
            fila[2] = asignatura.getNombreCompleto();
            fila[3] = ""+asignatura.getIHoraria();
            fila[4] = asignatura.getArea().getNombre();

            modelo.addRow(fila);
        }
        return modelo;
    }
}
