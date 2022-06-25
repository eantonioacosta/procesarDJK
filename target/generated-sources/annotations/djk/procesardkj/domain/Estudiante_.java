package djk.procesardkj.domain;

import djk.procesardkj.domain.Matricula;
import djk.procesardkj.domain.Nota;
import djk.procesardkj.domain.Padre;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2022-06-25T18:40:41")
@StaticMetamodel(Estudiante.class)
public class Estudiante_ { 

    public static volatile SingularAttribute<Estudiante, Integer> tipoId;
    public static volatile SingularAttribute<Estudiante, String> lugarExpedicion;
    public static volatile SingularAttribute<Estudiante, String> estado;
    public static volatile SingularAttribute<Estudiante, String> segundoNombre;
    public static volatile SingularAttribute<Estudiante, String> primerNombre;
    public static volatile SingularAttribute<Estudiante, String> primerApellido;
    public static volatile SingularAttribute<Estudiante, Date> fechaNacimiento;
    public static volatile SingularAttribute<Estudiante, String> direccion;
    public static volatile ListAttribute<Estudiante, Matricula> matriculaList;
    public static volatile SingularAttribute<Estudiante, String> segundoApellido;
    public static volatile SingularAttribute<Estudiante, String> identificacion;
    public static volatile ListAttribute<Estudiante, Nota> notaList;
    public static volatile SingularAttribute<Estudiante, Padre> padre1;
    public static volatile SingularAttribute<Estudiante, Date> fechaIngreso;
    public static volatile SingularAttribute<Estudiante, Padre> padre;
    public static volatile SingularAttribute<Estudiante, Integer> tipoSangre;
    public static volatile SingularAttribute<Estudiante, Date> expedicion;
    public static volatile SingularAttribute<Estudiante, String> correo;
    public static volatile SingularAttribute<Estudiante, Integer> idEstudiante;
    public static volatile SingularAttribute<Estudiante, Integer> sexo;

}