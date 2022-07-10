package djk.procesardkj.controller;


import djk.procesardkj.datos.AreaJpaController;
import djk.procesardkj.datos.exceptions.IllegalOrphanException;
import djk.procesardkj.datos.exceptions.NonexistentEntityException;
import djk.procesardkj.datos.exceptions.PreexistingEntityException;
import djk.procesardkj.domain.Area;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class ControllerAreasAsignaturas {

    AreaJpaController dao;

    public ControllerAreasAsignaturas() {
        dao = new AreaJpaController();
    }

    public void registrar(Area area) throws PreexistingEntityException, Exception, NullPointerException {
        if (area.getNombre().trim().length() == 0) {
            throw new NullPointerException("Favor ingresar el nombre del area!");
        }
        dao.create(area);
    }

    public void actualizar(Area area) throws IllegalOrphanException, NonexistentEntityException, Exception  {
        dao.edit(area);
    }

    public void eliminar(int codigo) throws Exception, NullPointerException, IllegalOrphanException {
        dao.destroy(codigo);
    }

    public List<Area> verAreas() throws Exception {
        return dao.findAreaEntities();
    }

    public Area buscarPorCodigo(int codigo) throws Exception {
        return dao.findArea(codigo);
    }

    public Area buscarPorItem(int item) throws Exception {
        return dao.findAreaEntities().get(item);
    }

    public int buscarPorIndice(int codigo) throws Exception {
        List<Area> listaArea = verAreas();
        for (int i = 0; i < listaArea.size(); i++) {
            if(listaArea.get(i).getIdArea()== codigo){
                return i+1;
            }  
        }
        return -1;
    }

    public DefaultTableModel getTabla() throws Exception {

        String[] columnas = {"CODIGO", "NOMBRE", "# ASIGNATURAS"};
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.setColumnIdentifiers(columnas);
        Object fila[] = new Object[columnas.length];
        for (Area area : dao.findAreaEntities()) {
            fila[0] = "" + area.getIdArea();
            fila[1] = area.getNombre();
            fila[2] = "" + area.getAsignaturaList().size();
            modelo.addRow(fila);
        }
        return modelo;
    }
}
