package djk.procesardkj.domain;

import djk.procesardkj.domain.Docente;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2022-07-25T22:40:37")
@StaticMetamodel(Usuario.class)
public class Usuario_ { 

    public static volatile SingularAttribute<Usuario, String> codigo;
    public static volatile SingularAttribute<Usuario, String> clave;
    public static volatile SingularAttribute<Usuario, Integer> nivelUsuario;
    public static volatile SingularAttribute<Usuario, Docente> docente;
    public static volatile SingularAttribute<Usuario, String> nombre;

}