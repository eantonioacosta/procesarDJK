package djk.procesardkj.domain;

import djk.procesardkj.domain.CargaAcademica;
import djk.procesardkj.domain.Grupo;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2022-07-16T13:04:06")
@StaticMetamodel(AnioLectivo.class)
public class AnioLectivo_ { 

    public static volatile ListAttribute<AnioLectivo, Grupo> grupoList;
    public static volatile SingularAttribute<AnioLectivo, Integer> idAnioLectivo;
    public static volatile ListAttribute<AnioLectivo, CargaAcademica> cargaAcademicaList;
    public static volatile SingularAttribute<AnioLectivo, String> nombre;

}