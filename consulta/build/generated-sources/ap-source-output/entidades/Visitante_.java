package entidades;

import entidades.Profesor;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2018-05-08T11:14:52")
@StaticMetamodel(Visitante.class)
public class Visitante_ { 

    public static volatile SingularAttribute<Visitante, Date> finnombramiento;
    public static volatile SingularAttribute<Visitante, Date> inicionombramiento;
    public static volatile SingularAttribute<Visitante, BigDecimal> visitanteid;
    public static volatile SingularAttribute<Visitante, Profesor> profesor;

}