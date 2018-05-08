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
@Table(name = "DEPARTAMENTO", catalog = "", schema = "SIACA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Departamento.findAll", query = "SELECT d FROM Departamento d")
    , @NamedQuery(name = "Departamento.findByNombre", query = "SELECT d FROM Departamento d WHERE d.nombre = :nombre")
    , @NamedQuery(name = "Departamento.findByNumero", query = "SELECT d FROM Departamento d WHERE d.numero = :numero")
    , @NamedQuery(name = "Departamento.findByTelefono", query = "SELECT d FROM Departamento d WHERE d.telefono = :telefono")
    , @NamedQuery(name = "Departamento.findByDepartamentoid", query = "SELECT d FROM Departamento d WHERE d.departamentoid = :departamentoid")})
public class Departamento implements Serializable {

    private static final long serialVersionUID = 1L;
    @Size(max = 100)
    @Column(name = "NOMBRE")
    private String nombre;
    @Column(name = "NUMERO")
    private BigInteger numero;
    @Column(name = "TELEFONO")
    private BigInteger telefono;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "DEPARTAMENTOID")
    private BigDecimal departamentoid;
    @OneToMany(mappedBy = "departamento")
    private Collection<Profesor> profesorCollection;

    public Departamento() {
    }

    public Departamento(BigDecimal departamentoid) {
        this.departamentoid = departamentoid;
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

    public BigInteger getTelefono() {
        return telefono;
    }

    public void setTelefono(BigInteger telefono) {
        this.telefono = telefono;
    }

    public BigDecimal getDepartamentoid() {
        return departamentoid;
    }

    public void setDepartamentoid(BigDecimal departamentoid) {
        this.departamentoid = departamentoid;
    }

    @XmlTransient
    public Collection<Profesor> getProfesorCollection() {
        return profesorCollection;
    }

    public void setProfesorCollection(Collection<Profesor> profesorCollection) {
        this.profesorCollection = profesorCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (departamentoid != null ? departamentoid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Departamento)) {
            return false;
        }
        Departamento other = (Departamento) object;
        if ((this.departamentoid == null && other.departamentoid != null) || (this.departamentoid != null && !this.departamentoid.equals(other.departamentoid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Departamento[ departamentoid=" + departamentoid + " ]";
    }
    
}
