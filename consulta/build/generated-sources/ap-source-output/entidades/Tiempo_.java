package entidades;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.0.v20170811-rNA", date="2018-05-14T12:07:16")
@StaticMetamodel(Tiempo.class)
public class Tiempo_ { 

    public static volatile SingularAttribute<Tiempo, BigDecimal> tiempoid;
    public static volatile SingularAttribute<Tiempo, BigDecimal> numero;
    public static volatile SingularAttribute<Tiempo, BigInteger> hora;
    public static volatile SingularAttribute<Tiempo, BigInteger> dia;

}