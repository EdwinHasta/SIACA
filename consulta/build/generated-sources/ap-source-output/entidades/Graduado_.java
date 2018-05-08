package entidades;

import entidades.Estudiante;
import entidades.Profesor;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2018-05-08T11:14:52")
@StaticMetamodel(Graduado.class)
public class Graduado_ { 

    public static volatile SingularAttribute<Graduado, Estudiante> estudiante;
    public static volatile SingularAttribute<Graduado, Date> fechagrado;
    public static volatile SingularAttribute<Graduado, BigDecimal> graduadoid;
    public static volatile SingularAttribute<Graduado, Profesor> profesorconsejero;

}