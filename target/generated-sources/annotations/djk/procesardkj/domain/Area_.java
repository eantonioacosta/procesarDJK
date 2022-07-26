package djk.procesardkj.domain;

import djk.procesardkj.domain.Asignatura;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2022-07-25T07:20:53")
@StaticMetamodel(Area.class)
public class Area_ { 

    public static volatile SingularAttribute<Area, Integer> idArea;
    public static volatile ListAttribute<Area, Asignatura> asignaturaList;
    public static volatile SingularAttribute<Area, String> nombre;

}