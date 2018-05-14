package entidades;

import entidades.Estudiante;
import java.math.BigDecimal;
import java.math.BigInteger;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.0.v20170811-rNA", date="2018-05-14T12:07:16")
@StaticMetamodel(Historiaacademica.class)
public class Historiaacademica_ { 

    public static volatile SingularAttribute<Historiaacademica, Estudiante> estudiante;
    public static volatile SingularAttribute<Historiaacademica, BigInteger> curso;
    public static volatile SingularAttribute<Historiaacademica, BigInteger> secuencia;
    public static volatile SingularAttribute<Historiaacademica, BigInteger> semestre;
    public static volatile SingularAttribute<Historiaacademica, Double> nota;
    public static volatile SingularAttribute<Historiaacademica, BigDecimal> historiaacademicaid;

}