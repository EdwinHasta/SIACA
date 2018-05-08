package entidades;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author PC_Angelo
 */
@Entity
@Table(name = "CURSO", catalog = "", schema = "SIACA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Curso.findAll", query = "SELECT c FROM Curso c")
    , @NamedQuery(name = "Curso.findByAula", query = "SELECT c FROM Curso c WHERE c.aula = :aula")
    , @NamedQuery(name = "Curso.findByNombre", query = "SELECT c FROM Curso c WHERE c.nombre = :nombre")
    , @NamedQuery(name = "Curso.findByNumero", query = "SELECT c FROM Curso c WHERE c.numero = :numero")
    , @NamedQuery(name = "Curso.findByProfesor", query = "SELECT c FROM Curso c WHERE c.profesor = :profesor")
    , @NamedQuery(name = "Curso.findByProgramaacademico", query = "SELECT c FROM Curso c WHERE c.programaacademico = :programaacademico")
    , @NamedQuery(name = "Curso.findByTiempo", query = "SELECT c FROM Curso c WHERE c.tiempo = :tiempo")
    , @NamedQuery(name = "Curso.findByCursoid", query = "SELECT c FROM Curso c WHERE c.cursoid = :cursoid")})
public class Curso implements Serializable {

    private static final long serialVersionUID = 1L;
    @JoinColumn(name = "AULA", referencedColumnName = "AULAID")
    @ManyToOne
    private Aula aula;
    @Size(max = 100)
    @Column(name = "NOMBRE")
    private String nombre;
    @Column(name = "NUMERO")
    private BigInteger numero;
    @Column(name = "PROFESOR")
    private BigInteger profesor;
    @Column(name = "PROGRAMAACADEMICO")
    private BigInteger programaacademico;
    @Column(name = "TIEMPO")
    private BigInteger tiempo;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CURSOID")
    private BigDecimal cursoid;
    @JoinTable(name = "JOINCURSOTOPROGRAMAACADEMICO", joinColumns = {
        @JoinColumn(name = "CURSOID", referencedColumnName = "CURSOID")}, inverseJoinColumns = {
        @JoinColumn(name = "PROGRAMAACADEMICOID", referencedColumnName = "PROGRAMAACADEMICOID")})
    @ManyToMany
    private Collection<Programaacademico> programaacademicoCollection;

    public Curso() {
    }

    public Curso(BigDecimal cursoid) {
        this.cursoid = cursoid;
    }

    public Aula getAula() {
        return aula;
    }

    public void setAula(Aula aula) {
        this.aula = aula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public BigInteger getNumero() {
        return numero;
    }

    public void setNumero(BigInteger numero) {
        this.numero = numero;
    }

    public BigInteger getProfesor() {
        return profesor;
    }

    public void setProfesor(BigInteger profesor) {
        this.profesor = profesor;
    }

    public BigInteger getProgramaacademico() {
        return programaacademico;
    }

    public void setProgramaacademico(BigInteger programaacademico) {
        this.programaacademico = programaacademico;
    }

    public BigInteger getTiempo() {
        return tiempo;
    }

    public void setTiempo(BigInteger tiempo) {
        this.tiempo = tiempo;
    }

    public BigDecimal getCursoid() {
        return cursoid;
    }

    public void setCursoid(BigDecimal cursoid) {
        this.cursoid = cursoid;
    }

    @XmlTransient
    public Collection<Programaacademico> getProgramaacademicoCollection() {
        return programaacademicoCollection;
    }

    public void setProgramaacademicoCollection(Collection<Programaacademico> programaacademicoCollection) {
        this.programaacademicoCollection = programaacademicoCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cursoid != null ? cursoid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Curso)) {
            return false;
        }
        Curso other = (Curso) object;
        if ((this.cursoid == null && other.cursoid != null) || (this.cursoid != null && !this.cursoid.equals(other.cursoid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Curso[ cursoid=" + cursoid + " ]";
    }
    
}
