package djk.procesardkj.domain;

import djk.procesardkj.domain.Estudiante;
import djk.procesardkj.domain.Grupo;
import djk.procesardkj.domain.Nota;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2022-07-18T09:06:59")
@StaticMetamodel(Matricula.class)
public class Matricula_ { 

    public static volatile SingularAttribute<Matricula, Estudiante> estudiante;
    public static volatile SingularAttribute<Matricula, Integer> tipoMatricula;
    public static volatile SingularAttribute<Matricula, Integer> idMatricula;
    public static volatile SingularAttribute<Matricula, Grupo> grupo;
    public static volatile SingularAttribute<Matricula, Date> fechaMatricula;
    public static volatile ListAttribute<Matricula, Nota> notaList;

}