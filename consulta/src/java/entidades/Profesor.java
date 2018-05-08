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
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
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
@Table(name = "PROFESOR", catalog = "", schema = "SIACA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Profesor.findAll", query = "SELECT p FROM Profesor p")
    , @NamedQuery(name = "Profesor.findByCodigoprof", query = "SELECT p FROM Profesor p WHERE p.codigoprof = :codigoprof")
    , @NamedQuery(name = "Profesor.findByTipocontrato", query = "SELECT p FROM Profesor p WHERE p.tipocontrato = :tipocontrato")
    , @NamedQuery(name = "Profesor.findByTitulo", query = "SELECT p FROM Profesor p WHERE p.titulo = :titulo")
    , @NamedQuery(name = "Profesor.findByProfesorid", query = "SELECT p FROM Profesor p WHERE p.profesorid = :profesorid")})
public class Profesor implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "CODIGOPROF")
    private BigInteger codigoprof;
    @Size(max = 100)
    @Column(name = "TIPOCONTRATO")
    private String tipocontrato;
    @Size(max = 100)
    @Column(name = "TITULO")
    private String titulo;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "PROFESORID")
    private BigDecimal profesorid;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "profesor")
    private Visitante visitante;
    @OneToMany(mappedBy = "profesorconsejero")
    private Collection<Graduado> graduadoCollection;
    @JoinColumn(name = "DEPARTAMENTO", referencedColumnName = "DEPARTAMENTOID")
    @ManyToOne
    private Departamento departamento;
    @JoinColumn(name = "PROFESORID", referencedColumnName = "PERSONAID", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Persona persona;

    public Profesor() {
    }

    public Profesor(BigDecimal profesorid) {
        this.profesorid = profesorid;
    }

    public BigInteger getCodigoprof() {
        return codigoprof;
    }

    public void setCodigoprof(BigInteger codigoprof) {
        this.codigoprof = codigoprof;
    }

    public String getTipocontrato() {
        return tipocontrato;
    }

    public void setTipocontrato(String tipocontrato) {
        this.tipocontrato = tipocontrato;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public BigDecimal getProfesorid() {
        return profesorid;
    }

    public void setProfesorid(BigDecimal profesorid) {
        this.profesorid = profesorid;
    }

    public Visitante getVisitante() {
        return visitante;
    }

    public void setVisitante(Visitante visitante) {
        this.visitante = visitante;
    }

    @XmlTransient
    public Collection<Graduado> getGraduadoCollection() {
        return graduadoCollection;
    }

    public void setGraduadoCollection(Collection<Graduado> graduadoCollection) {
        this.graduadoCollection = graduadoCollection;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
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
        hash += (profesorid != null ? profesorid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Profesor)) {
            return false;
        }
        Profesor other = (Profesor) object;
        if ((this.profesorid == null && other.profesorid != null) || (this.profesorid != null && !this.profesorid.equals(other.profesorid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Profesor[ profesorid=" + profesorid + " ]";
    }
    
}
