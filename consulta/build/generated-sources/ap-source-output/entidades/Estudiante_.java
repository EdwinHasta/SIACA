package entidades;

import entidades.Graduado;
import entidades.Historiaacademica;
import entidades.Persona;
import java.math.BigDecimal;
import java.math.BigInteger;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2018-05-08T11:14:52")
@StaticMetamodel(Estudiante.class)
public class Estudiante_ { 

    public static volatile SingularAttribute<Estudiante, BigDecimal> estudianteid;
    public static volatile SingularAttribute<Estudiante, Persona> persona;
    public static volatile SingularAttribute<Estudiante, Graduado> graduado;
    public static volatile SingularAttribute<Estudiante, BigInteger> codigoest;
    public static volatile CollectionAttribute<Estudiante, Historiaacademica> historiaacademicaCollection;

}