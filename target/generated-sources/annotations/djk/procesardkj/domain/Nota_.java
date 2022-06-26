package djk.procesardkj.domain;

import djk.procesardkj.domain.CargaAcademica;
import djk.procesardkj.domain.Estudiante;
import djk.procesardkj.domain.Matricula;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2022-06-25T18:59:07")
@StaticMetamodel(Nota.class)
public class Nota_ { 

    public static volatile SingularAttribute<Nota, Estudiante> estudiante;
    public static volatile SingularAttribute<Nota, Float> periodoTres;
    public static volatile SingularAttribute<Nota, Float> nivelacionTres;
    public static volatile SingularAttribute<Nota, Float> nivelacionDos;
    public static volatile SingularAttribute<Nota, Integer> idObservacionDos;
    public static volatile SingularAttribute<Nota, Float> nivelacionCuatro;
    public static volatile SingularAttribute<Nota, Float> periodoDos;
    public static volatile SingularAttribute<Nota, Float> nivelacionUno;
    public static volatile SingularAttribute<Nota, Float> final1;
    public static volatile SingularAttribute<Nota, Integer> idObservacionCuatro;
    public static volatile SingularAttribute<Nota, Integer> idObservacionUno;
    public static volatile SingularAttribute<Nota, Integer> idObservacionTres;
    public static volatile SingularAttribute<Nota, Integer> idNotas;
    public static volatile SingularAttribute<Nota, Float> periodoCuatro;
    public static volatile SingularAttribute<Nota, Matricula> matricula;
    public static volatile SingularAttribute<Nota, CargaAcademica> cargaAcademica;
    public static volatile SingularAttribute<Nota, Float> periodoUno;

}