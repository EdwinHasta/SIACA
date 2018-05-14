package entidades;

import entidades.Profesor;
import java.math.BigDecimal;
import java.math.BigInteger;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.0.v20170811-rNA", date="2018-05-14T12:07:16")
@StaticMetamodel(Departamento.class)
public class Departamento_ { 

    public static volatile SingularAttribute<Departamento, BigInteger> numero;
    public static volatile SingularAttribute<Departamento, BigInteger> telefono;
    public static volatile SingularAttribute<Departamento, String> nombre;
    public static volatile SingularAttribute<Departamento, BigDecimal> departamentoid;
    public static volatile CollectionAttribute<Departamento, Profesor> profesorCollection;

}