package djk.procesardkj.domain;

import djk.procesardkj.domain.AnioLectivo;
import djk.procesardkj.domain.Asignatura;
import djk.procesardkj.domain.Docente;
import djk.procesardkj.domain.Grupo;
import djk.procesardkj.domain.Nota;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2022-06-25T18:59:07")
@StaticMetamodel(CargaAcademica.class)
public class CargaAcademica_ { 

    public static volatile SingularAttribute<CargaAcademica, Asignatura> asignatura;
    public static volatile SingularAttribute<CargaAcademica, Integer> idCarga;
    public static volatile SingularAttribute<CargaAcademica, AnioLectivo> anioLectivo;
    public static volatile SingularAttribute<CargaAcademica, Grupo> grupo;
    public static volatile SingularAttribute<CargaAcademica, Docente> docente;
    public static volatile ListAttribute<CargaAcademica, Nota> notaList;

}