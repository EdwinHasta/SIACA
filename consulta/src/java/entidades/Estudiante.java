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
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author PC_Angelo
 */
@Entity
@Table(name = "ESTUDIANTE", catalog = "", schema = "SIACA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Estudiante.findAll", query = "SELECT e FROM Estudiante e")
    , @NamedQuery(name = "Estudiante.findByCodigoest", query = "SELECT e FROM Estudiante e WHERE e.codigoest = :codigoest")
    , @NamedQuery(name = "Estudiante.findByEstudianteid", query = "SELECT e FROM Estudiante e WHERE e.estudianteid = :estudianteid")})
public class Estudiante implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "CODIGOEST")
    private BigInteger codigoest;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ESTUDIANTEID")
    private BigDecimal estudianteid;
    @OneToMany(mappedBy = "estudiante")
    private Collection<Historiaacademica> historiaacademicaCollection;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "estudiante")
    private Graduado graduado;
    @JoinColumn(name = "ESTUDIANTEID", referencedColumnName = "PERSONAID", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Persona persona;

    public Estudiante() {
    }

    public Estudiante(BigDecimal estudianteid) {
        this.estudianteid = estudianteid;
    }

    public BigInteger getCodigoest() {
        return codigoest;
    }

    public void setCodigoest(BigInteger codigoest) {
        this.codigoest = codigoest;
    }

    public BigDecimal getEstudianteid() {
        return estudianteid;
    }

    public void setEstudianteid(BigDecimal estudianteid) {
        this.estudianteid = estudianteid;
    }

    @XmlTransient
    public Collection<Historiaacademica> getHistoriaacademicaCollection() {
        return historiaacademicaCollection;
    }

    public void setHistoriaacademicaCollection(Collection<Historiaacademica> historiaacademicaCollection) {
        this.historiaacademicaCollection = historiaacademicaCollection;
    }

    public Graduado getGraduado() {
        return graduado;
    }

    public void setGraduado(Graduado graduado) {
        this.graduado = graduado;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (estudianteid != null ? estudianteid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Estudiante)) {
            return false;
        }
        Estudiante other = (Estudiante) object;
        if ((this.estudianteid == null && other.estudianteid != null) || (this.estudianteid != null && !this.estudianteid.equals(other.estudianteid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Estudiante[ estudianteid=" + estudianteid + " ]";
    }
    
}
