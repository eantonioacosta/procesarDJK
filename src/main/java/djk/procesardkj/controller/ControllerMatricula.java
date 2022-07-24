package djk.procesardkj.controller;



import djk.procesardkj.datos.GrupoJpaController;
import djk.procesardkj.datos.MatriculaJpaController;
import djk.procesardkj.datos.exceptions.PreexistingEntityException;
import djk.procesardkj.domain.AnioLectivo;
import djk.procesardkj.domain.Grupo;
import djk.procesardkj.domain.Matricula;
import java.util.List;

public class ControllerMatricula {

    MatriculaJpaController dao;
    ControllerGrupo controlGrupo;

    public ControllerMatricula() {
        dao = new MatriculaJpaController();
        controlGrupo = new ControllerGrupo();
    }

    public void registrar(Matricula matricula, AnioLectivo anio) throws Exception , NullPointerException, PreexistingEntityException{
        if(matricula.getGrupo()==null)
            throw new NullPointerException("Por favor seleccione un grupo/grado");
        if(matricula.getEstudiante()==null)
            throw new NullPointerException("Por favor seleccione un Estudiante");
        if(validarInformacion(matricula, anio))
            throw new NullPointerException("El Estudiante ya se encuentra registrado!");
        dao.create(matricula);
    }

    public void actualizar(Matricula matricula) throws Exception{
        dao.edit(matricula);
    }

    public void eliminar(int id) throws Exception, NullPointerException{
        dao.destroy(id);
    }

    public List<Matricula> verMatriculas() throws Exception{
        return dao.findMatriculaEntities();
    }

    public Matricula buscarPorCodigo(int id) throws Exception{
        return dao.findMatricula(id);
    }

    public Matricula buscarPorItem(int item) throws Exception{
        return dao.findMatriculaEntities().get(item);
    }
    
    private boolean validarInformacion(Matricula matricula, AnioLectivo anio) throws Exception{
        for (Grupo grupo : controlGrupo.verGrupos(anio.getIdAnioLectivo())) {
            for (Matricula m : grupo.getMatriculaList()) {
                if(m.getEstudiante().getIdentificacion()==matricula.getEstudiante().getIdentificacion())
                    return true;
            }
        }

        return false;
    }

}
