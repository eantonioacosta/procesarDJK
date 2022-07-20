package djk.procesardkj.domain;

import djk.procesardkj.domain.Area;
import djk.procesardkj.domain.CargaAcademica;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2022-07-19T21:59:52")
@StaticMetamodel(Asignatura.class)
public class Asignatura_ { 

    public static volatile SingularAttribute<Asignatura, Area> area;
    public static volatile SingularAttribute<Asignatura, Integer> iHoraria;
    public static volatile SingularAttribute<Asignatura, Integer> idAsignatura;
    public static volatile SingularAttribute<Asignatura, Integer> porcentaje;
    public static volatile SingularAttribute<Asignatura, String> nombreCompleto;
    public static volatile ListAttribute<Asignatura, CargaAcademica> cargaAcademicaList;
    public static volatile SingularAttribute<Asignatura, String> nombre;

}