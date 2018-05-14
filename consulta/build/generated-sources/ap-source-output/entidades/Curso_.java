package entidades;

import entidades.Aula;
import entidades.Programaacademico;
import java.math.BigDecimal;
import java.math.BigInteger;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.0.v20170811-rNA", date="2018-05-14T12:07:16")
@StaticMetamodel(Curso.class)
public class Curso_ { 

    public static volatile SingularAttribute<Curso, Aula> aula;
    public static volatile SingularAttribute<Curso, BigInteger> numero;
    public static volatile SingularAttribute<Curso, BigInteger> tiempo;
    public static volatile SingularAttribute<Curso, BigInteger> profesor;
    public static volatile SingularAttribute<Curso, BigDecimal> cursoid;
    public static volatile SingularAttribute<Curso, BigInteger> programaacademico;
    public static volatile SingularAttribute<Curso, String> nombre;
    public static volatile CollectionAttribute<Curso, Programaacademico> programaacademicoCollection;

}