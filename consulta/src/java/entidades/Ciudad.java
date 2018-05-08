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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author PC_Angelo
 */
@Entity
@Table(name = "CIUDAD", catalog = "", schema = "SIACA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ciudad.findAll", query = "SELECT c FROM Ciudad c")
    , @NamedQuery(name = "Ciudad.findByCodigo", query = "SELECT c FROM Ciudad c WHERE c.codigo = :codigo")
    , @NamedQuery(name = "Ciudad.findByCiudadid", query = "SELECT c FROM Ciudad c WHERE c.ciudadid = :ciudadid")})
public class Ciudad implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "CODIGO")
    private BigInteger codigo;
    @Column(name = "NOMBRE")
    private String nombre;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CIUDADID")
    private BigDecimal ciudadid;
    @OneToMany(mappedBy = "lugarnacimiento")
    private Collection<Persona> personaCollection;
    @OneToMany(mappedBy = "lugarresidencia")
    private Collection<Persona> personaCollection1;

    public Ciudad() {
    }

    public Ciudad(BigDecimal ciudadid) {
        this.ciudadid = ciudadid;
    }

    public BigInteger getCodigo() {
        return codigo;
    }

    public void setCodigo(BigInteger codigo) {
        this.codigo = codigo;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public BigDecimal getCiudadid() {
        return ciudadid;
    }

    public void setCiudadid(BigDecimal ciudadid) {
        this.ciudadid = ciudadid;
    }

    @XmlTransient
    public Collection<Persona> getPersonaCollection() {
        return personaCollection;
    }

    public void setPersonaCollection(Collection<Persona> personaCollection) {
        this.personaCollection = personaCollection;
    }

    @XmlTransient
    public Collection<Persona> getPersonaCollection1() {
        return personaCollection1;
    }

    public void setPersonaCollection1(Collection<Persona> personaCollection1) {
        this.personaCollection1 = personaCollection1;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ciudadid != null ? ciudadid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ciudad)) {
            return false;
        }
        Ciudad other = (Ciudad) object;
        if ((this.ciudadid == null && other.ciudadid != null) || (this.ciudadid != null && !this.ciudadid.equals(other.ciudadid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Ciudad[ ciudadid=" + ciudadid + " ]";
    }
    
}
