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

@Generated(value="EclipseLink-2.7.0.v20170811-rNA", date="2018-05-14T12:07:16")
@StaticMetamodel(Estudiante.class)
public class Estudiante_ { 

    public static volatile SingularAttribute<Estudiante, BigDecimal> estudianteid;
    public static volatile SingularAttribute<Estudiante, Persona> persona;
    public static volatile SingularAttribute<Estudiante, Graduado> graduado;
    public static volatile SingularAttribute<Estudiante, BigInteger> codigoest;
    public static volatile CollectionAttribute<Estudiante, Historiaacademica> historiaacademicaCollection;

}