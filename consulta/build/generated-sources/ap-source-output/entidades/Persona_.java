package entidades;

import entidades.Ciudad;
import entidades.Estudiante;
import entidades.Profesor;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.0.v20170811-rNA", date="2018-05-14T12:07:16")
@StaticMetamodel(Persona.class)
public class Persona_ { 

    public static volatile SingularAttribute<Persona, String> apellidos;
    public static volatile SingularAttribute<Persona, Estudiante> estudiante;
    public static volatile SingularAttribute<Persona, Date> fechanacimiento;
    public static volatile SingularAttribute<Persona, BigInteger> numero;
    public static volatile SingularAttribute<Persona, Profesor> profesor;
    public static volatile SingularAttribute<Persona, Ciudad> lugarnacimiento;
    public static volatile SingularAttribute<Persona, Ciudad> lugarresidencia;
    public static volatile SingularAttribute<Persona, BigDecimal> personaid;
    public static volatile SingularAttribute<Persona, String> nombres;

}