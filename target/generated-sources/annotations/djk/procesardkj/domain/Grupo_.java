package djk.procesardkj.domain;

import djk.procesardkj.domain.AnioLectivo;
import djk.procesardkj.domain.CargaAcademica;
import djk.procesardkj.domain.Docente;
import djk.procesardkj.domain.Matricula;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2022-07-10T18:17:52")
@StaticMetamodel(Grupo.class)
public class Grupo_ { 

    public static volatile SingularAttribute<Grupo, AnioLectivo> anioLectivo;
    public static volatile SingularAttribute<Grupo, Integer> jornada;
    public static volatile ListAttribute<Grupo, Matricula> matriculaList;
    public static volatile SingularAttribute<Grupo, Docente> docente;
    public static volatile ListAttribute<Grupo, CargaAcademica> cargaAcademicaList;
    public static volatile SingularAttribute<Grupo, Integer> nombre;
    public static volatile SingularAttribute<Grupo, Integer> indiceGrupo;
    public static volatile SingularAttribute<Grupo, Integer> idGrupo;

}