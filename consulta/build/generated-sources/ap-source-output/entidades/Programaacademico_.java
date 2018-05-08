package entidades;

import entidades.Curso;
import java.math.BigDecimal;
import java.math.BigInteger;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2018-05-08T11:14:52")
@StaticMetamodel(Programaacademico.class)
public class Programaacademico_ { 

    public static volatile SingularAttribute<Programaacademico, BigInteger> codigo;
    public static volatile CollectionAttribute<Programaacademico, Curso> cursoCollection;
    public static volatile SingularAttribute<Programaacademico, BigDecimal> programaacademicoid;
    public static volatile SingularAttribute<Programaacademico, String> nombre;

}