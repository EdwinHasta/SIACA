package entidades;

import entidades.Profesor;
import java.math.BigDecimal;
import java.math.BigInteger;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2018-05-08T11:14:52")
@StaticMetamodel(Departamento.class)
public class Departamento_ { 

    public static volatile SingularAttribute<Departamento, BigInteger> numero;
    public static volatile SingularAttribute<Departamento, BigInteger> telefono;
    public static volatile SingularAttribute<Departamento, String> nombre;
    public static volatile SingularAttribute<Departamento, BigDecimal> departamentoid;
    public static volatile CollectionAttribute<Departamento, Profesor> profesorCollection;

}