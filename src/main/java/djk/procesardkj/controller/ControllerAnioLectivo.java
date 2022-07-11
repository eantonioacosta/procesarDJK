package djk.procesardkj.controller;


import djk.procesardkj.datos.AnioLectivoJpaController;
import djk.procesardkj.domain.AnioLectivo;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ControllerAnioLectivo {

    AnioLectivoJpaController dao;

    public ControllerAnioLectivo() {
        dao = new AnioLectivoJpaController();
    }

    public void registrar(AnioLectivo lectivo) throws Exception, NullPointerException{
        if(lectivo.getNombre().trim().length()==0){
            throw new NullPointerException("Favor ingresar nombre");
        }
        dao.create(lectivo);
    }

    public void actualizar(AnioLectivo lectivo) throws Exception{
        dao.edit(lectivo);
    }

    public void eliminar(int codigo) throws Exception{
        dao.destroy(codigo);
    }

    public List<AnioLectivo> verAniosLectivos() throws Exception{
        return dao.findAnioLectivoEntities();
    }

    public AnioLectivo buscarPorCodigo(int codigo) throws Exception, NullPointerException{
        if(codigo ==-1 || codigo == 0){
            throw new NullPointerException("Seleccionar el año lectivo!");
        }
        return dao.findAnioLectivo(codigo);
    }

    public AnioLectivo buscarPorItem(int item) throws Exception{
        return dao.findAnioLectivoEntities().get(item);
    }

    public DefaultTableModel getTabla() throws Exception{
        String[] columnas = {"NRO", "NOMBRE"};
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.setColumnIdentifiers(columnas);
        
        String[] fila = new String[columnas.length];
        for (AnioLectivo anio : dao.findAnioLectivoEntities()) {
            fila[0] = "" + anio.getIdAnioLectivo();
            fila[1] = anio.getNombre();
            modelo.addRow(fila);
        }
        return modelo;
    }
}
