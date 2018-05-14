package entidades;

import entidades.Persona;
import java.math.BigDecimal;
import java.math.BigInteger;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.0.v20170811-rNA", date="2018-05-14T12:07:16")
@StaticMetamodel(Ciudad.class)
public class Ciudad_ { 

    public static volatile SingularAttribute<Ciudad, BigInteger> codigo;
    public static volatile CollectionAttribute<Ciudad, Persona> personaCollection;
    public static volatile CollectionAttribute<Ciudad, Persona> personaCollection1;
    public static volatile SingularAttribute<Ciudad, BigDecimal> ciudadid;
    public static volatile SingularAttribute<Ciudad, String> nombre;

}