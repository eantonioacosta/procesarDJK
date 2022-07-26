package djk.procesardkj.domain;

import djk.procesardkj.domain.CargaAcademica;
import djk.procesardkj.domain.Grupo;
import djk.procesardkj.domain.Usuario;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2022-07-25T22:40:37")
@StaticMetamodel(Docente.class)
public class Docente_ { 

    public static volatile SingularAttribute<Docente, String> apellidos;
    public static volatile ListAttribute<Docente, Grupo> grupoList;
    public static volatile SingularAttribute<Docente, Integer> estado;
    public static volatile SingularAttribute<Docente, Date> fechaNacimiento;
    public static volatile SingularAttribute<Docente, String> direccion;
    public static volatile SingularAttribute<Docente, String> titulo;
    public static volatile SingularAttribute<Docente, Integer> idDocente;
    public static volatile SingularAttribute<Docente, String> nombres;
    public static volatile SingularAttribute<Docente, Integer> tipoSangre;
    public static volatile SingularAttribute<Docente, String> ciudad;
    public static volatile SingularAttribute<Docente, String> correo;
    public static volatile SingularAttribute<Docente, Usuario> usuario;
    public static volatile SingularAttribute<Docente, String> telefono;
    public static volatile ListAttribute<Docente, CargaAcademica> cargaAcademicaList;

}