package entidades;

import entidades.Departamento;
import entidades.Graduado;
import entidades.Persona;
import entidades.Visitante;
import java.math.BigDecimal;
import java.math.BigInteger;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.0.v20170811-rNA", date="2018-05-14T12:07:16")
@StaticMetamodel(Profesor.class)
public class Profesor_ { 

    public static volatile SingularAttribute<Profesor, Persona> persona;
    public static volatile SingularAttribute<Profesor, BigInteger> codigoprof;
    public static volatile SingularAttribute<Profesor, String> titulo;
    public static volatile SingularAttribute<Profesor, Visitante> visitante;
    public static volatile SingularAttribute<Profesor, Departamento> departamento;
    public static volatile CollectionAttribute<Profesor, Graduado> graduadoCollection;
    public static volatile SingularAttribute<Profesor, String> tipocontrato;
    public static volatile SingularAttribute<Profesor, BigDecimal> profesorid;

}