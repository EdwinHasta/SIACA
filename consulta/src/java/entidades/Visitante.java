/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author PC_Angelo
 */
@Entity
@Table(name = "VISITANTE", catalog = "", schema = "SIACA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Visitante.findAll", query = "SELECT v FROM Visitante v")
    , @NamedQuery(name = "Visitante.findByFinnombramiento", query = "SELECT v FROM Visitante v WHERE v.finnombramiento = :finnombramiento")
    , @NamedQuery(name = "Visitante.findByInicionombramiento", query = "SELECT v FROM Visitante v WHERE v.inicionombramiento = :inicionombramiento")
    , @NamedQuery(name = "Visitante.findByVisitanteid", query = "SELECT v FROM Visitante v WHERE v.visitanteid = :visitanteid")})
public class Visitante implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "FINNOMBRAMIENTO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date finnombramiento;
    @Column(name = "INICIONOMBRAMIENTO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date inicionombramiento;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "VISITANTEID")
    private BigDecimal visitanteid;
    @JoinColumn(name = "VISITANTEID", referencedColumnName = "PROFESORID", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Profesor profesor;

    public Visitante() {
    }

    public Visitante(BigDecimal visitanteid) {
        this.visitanteid = visitanteid;
    }

    public Date getFinnombramiento() {
        return finnombramiento;
    }

    public void setFinnombramiento(Date finnombramiento) {
        this.finnombramiento = finnombramiento;
    }

    public Date getInicionombramiento() {
        return inicionombramiento;
    }

    public void setInicionombramiento(Date inicionombramiento) {
        this.inicionombramiento = inicionombramiento;
    }

    public BigDecimal getVisitanteid() {
        return visitanteid;
    }

    public void setVisitanteid(BigDecimal visitanteid) {
        this.visitanteid = visitanteid;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (visitanteid != null ? visitanteid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Visitante)) {
            return false;
        }
        Visitante other = (Visitante) object;
        if ((this.visitanteid == null && other.visitanteid != null) || (this.visitanteid != null && !this.visitanteid.equals(other.visitanteid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Visitante[ visitanteid=" + visitanteid + " ]";
    }
    
}
