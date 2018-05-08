/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author PC_Angelo
 */
@Entity
@Table(name = "AULA", catalog = "", schema = "SIACA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Aula.findAll", query = "SELECT a FROM Aula a")
    , @NamedQuery(name = "Aula.findByEdificio", query = "SELECT a FROM Aula a WHERE a.edificio = :edificio")
    , @NamedQuery(name = "Aula.findByAulaid", query = "SELECT a FROM Aula a WHERE a.aulaid = :aulaid")})
public class Aula implements Serializable {

    private static final long serialVersionUID = 1L;
    @Size(max = 100)
    @Column(name = "EDIFICIO")
    private String edificio;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "AULAID")
    private BigDecimal aulaid;
    @Column(name = "NUMERO")
    private BigDecimal numero;

    public Aula() {
    }

    public Aula(BigDecimal aulaid) {
        this.aulaid = aulaid;
    }

    public String getEdificio() {
        return edificio;
    }

    public void setEdificio(String edificio) {
        this.edificio = edificio;
    }

    public BigDecimal getAulaid() {
        return aulaid;
    }

    public void setAulaid(BigDecimal aulaid) {
        this.aulaid = aulaid;
    }

    public BigDecimal getNumero() {
        return numero;
    }

    public void setNumero(BigDecimal numero) {
        this.numero = numero;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (aulaid != null ? aulaid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Aula)) {
            return false;
        }
        Aula other = (Aula) object;
        if ((this.aulaid == null && other.aulaid != null) || (this.aulaid != null && !this.aulaid.equals(other.aulaid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Aula[ aulaid=" + aulaid + " ]";
    }
    
}
