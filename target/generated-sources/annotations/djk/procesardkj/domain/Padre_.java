package djk.procesardkj.domain;

import djk.procesardkj.domain.Estudiante;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2022-07-18T09:06:59")
@StaticMetamodel(Padre.class)
public class Padre_ { 

    public static volatile SingularAttribute<Padre, String> apellidos;
    public static volatile SingularAttribute<Padre, Integer> tipoId;
    public static volatile ListAttribute<Padre, Estudiante> estudianteList1;
    public static volatile SingularAttribute<Padre, String> correo;
    public static volatile ListAttribute<Padre, Estudiante> estudianteList;
    public static volatile SingularAttribute<Padre, String> idPadre;
    public static volatile SingularAttribute<Padre, String> telefono;
    public static volatile SingularAttribute<Padre, String> nombres;

}