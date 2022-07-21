package djk.procesardkj.controller;

import djk.procesardkj.datos.EstudianteJpaController;
import djk.procesardkj.domain.Docente;
import djk.procesardkj.domain.Estudiante;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class ControllerEstudiante {

    EstudianteJpaController dao;

    public ControllerEstudiante() {
        dao = new EstudianteJpaController();
    }

    public void registrar(Estudiante estudiante) {
        if (estudiante.getIdentificacion().trim().length() == 0) {
            throw new NullPointerException("Favor ingresar la identificación.");
        }
        if (estudiante.getTipoId() == 0 || estudiante.getTipoId() == -1) {
            throw new NullPointerException("Favor seleccionar el tipo de identificación.");
        }
        if (estudiante.getPrimerNombre().trim().length() == 0) {
            throw new NullPointerException("Favor ingresar el primer nombre.");
        }
        if (estudiante.getPrimerApellido().trim().length() == 0) {
            throw new NullPointerException("Favor ingresar el primer apellido.");
        }

        dao.create(estudiante);
    }

    public void validate(Estudiante estudiante) throws Exception, NullPointerException {
        if (estudiante.getIdentificacion().trim().length() == 0) {
            throw new NullPointerException("Favor ingresar la identificación.");
        }
        if (estudiante.getTipoId() == 0 || estudiante.getTipoId() == -1) {
            throw new NullPointerException("Favor seleccionar el tipo de identificación.");
        }
        if (estudiante.getPrimerNombre().trim().length() == 0) {
            throw new NullPointerException("Favor ingresar el primer nombre.");
        }
        if (estudiante.getPrimerApellido().trim().length() == 0) {
            throw new NullPointerException("Favor ingresar el primer apellido.");
        }
    }

    public void actualizar(Estudiante estudiante) throws Exception {
        dao.edit(estudiante);
    }

    public void eliminar(int idEstudiante) throws Exception {
        dao.destroy(idEstudiante);
    }

    public List<Estudiante> verEstudiantes() throws Exception {
        return dao.findEstudianteEntities();
    }

    public Estudiante buscarPorCodigo(int idEstudiante) throws Exception {
        return dao.findEstudiante(idEstudiante);
    }

    public Estudiante buscarPorItem(int item) throws Exception {
        return dao.findEstudianteEntities().get(item);
    }

    public List<Estudiante> buscarPorEstado(String estado) throws Exception{
        return dao.findByEstado(estado);
    }
    
     public DefaultTableModel getTabla(String estado) throws Exception{//Validar si la tabla esta vacia
        String[] columnas = {"#", "IDENTFICACION", "TIPO ID","ESTADO", "1er APELLIDO", "2DO APELLIDO", "1er NOMBRE", "2do NOMBRE", 
            "SEXO","FECHA NTO", "DIRECCION", "T.S", "FECHA INGRESO", "CC PADRE", "CC MADRE"};
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.setColumnIdentifiers(columnas);
        
        String[] fila = new String[columnas.length];
        for (Estudiante estudiante : buscarPorEstado(estado)) {
            System.out.println(estudiante.toString());
            fila[0] = "" + estudiante.getIdEstudiante();
            fila[1] = estudiante.getIdentificacion();
            fila[2] = estudiante.getTipoIdTexto();
            fila[3] = estudiante.getEstado();
            fila[4] = estudiante.getPrimerApellido();
            fila[5] = estudiante.getSegundoApellido();
            fila[6] = estudiante.getPrimerNombre();
            fila[7] = estudiante.getSegundoNombre();
            fila[8] = estudiante.getSexoTexto();
            fila[9] = estudiante.getFechaNacimientoTexto();
            fila[10] = estudiante.getDireccion();
            fila[11] = estudiante.getTipoSangreTexto();
            fila[12] = estudiante.getFechaIngresoTexto();
            fila[13] = (estudiante.getPadre()!=null)? estudiante.getPadre().getIdPadre() : "Indefinido";
            fila[14] = (estudiante.getPadre1()!=null)? estudiante.getPadre1().getIdPadre() : "Indefinido";
            modelo.addRow(fila);
        }
        return modelo;
    }
}
