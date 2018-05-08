/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
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
@Table(name = "PROGRAMAACADEMICO", catalog = "", schema = "SIACA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Programaacademico.findAll", query = "SELECT p FROM Programaacademico p")
    , @NamedQuery(name = "Programaacademico.findByCodigo", query = "SELECT p FROM Programaacademico p WHERE p.codigo = :codigo")
    , @NamedQuery(name = "Programaacademico.findByNombre", query = "SELECT p FROM Programaacademico p WHERE p.nombre = :nombre")
    , @NamedQuery(name = "Programaacademico.findByProgramaacademicoid", query = "SELECT p FROM Programaacademico p WHERE p.programaacademicoid = :programaacademicoid")})
public class Programaacademico implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "CODIGO")
    private BigInteger codigo;
    @Size(max = 100)
    @Column(name = "NOMBRE")
    private String nombre;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "PROGRAMAACADEMICOID")
    private BigDecimal programaacademicoid;
    @ManyToMany(mappedBy = "programaacademicoCollection")
    private Collection<Curso> cursoCollection;

    public Programaacademico() {
    }

    public Programaacademico(BigDecimal programaacademicoid) {
        this.programaacademicoid = programaacademicoid;
    }

    public BigInteger getCodigo() {
        return codigo;
    }

    public void setCodigo(BigInteger codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public BigDecimal getProgramaacademicoid() {
        return programaacademicoid;
    }

    public void setProgramaacademicoid(BigDecimal programaacademicoid) {
        this.programaacademicoid = programaacademicoid;
    }

    @XmlTransient
    public Collection<Curso> getCursoCollection() {
        return cursoCollection;
    }

    public void setCursoCollection(Collection<Curso> cursoCollection) {
        this.cursoCollection = cursoCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (programaacademicoid != null ? programaacademicoid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Programaacademico)) {
            return false;
        }
        Programaacademico other = (Programaacademico) object;
        if ((this.programaacademicoid == null && other.programaacademicoid != null) || (this.programaacademicoid != null && !this.programaacademicoid.equals(other.programaacademicoid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Programaacademico[ programaacademicoid=" + programaacademicoid + " ]";
    }
    
}
