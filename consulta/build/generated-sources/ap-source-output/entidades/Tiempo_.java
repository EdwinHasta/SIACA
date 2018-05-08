package entidades;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2018-05-08T11:14:53")
@StaticMetamodel(Tiempo.class)
public class Tiempo_ { 

    public static volatile SingularAttribute<Tiempo, BigDecimal> tiempoid;
    public static volatile SingularAttribute<Tiempo, BigDecimal> numero;
    public static volatile SingularAttribute<Tiempo, BigInteger> hora;
    public static volatile SingularAttribute<Tiempo, BigInteger> dia;

}