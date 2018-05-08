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
import javax.persistence.ManyToOne;
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
@Table(name = "GRADUADO", catalog = "", schema = "SIACA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Graduado.findAll", query = "SELECT g FROM Graduado g")
    , @NamedQuery(name = "Graduado.findByFechagrado", query = "SELECT g FROM Graduado g WHERE g.fechagrado = :fechagrado")
    , @NamedQuery(name = "Graduado.findByGraduadoid", query = "SELECT g FROM Graduado g WHERE g.graduadoid = :graduadoid")})
public class Graduado implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "FECHAGRADO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechagrado;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "GRADUADOID")
    private BigDecimal graduadoid;
    @JoinColumn(name = "GRADUADOID", referencedColumnName = "ESTUDIANTEID", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Estudiante estudiante;
    @JoinColumn(name = "PROFESORCONSEJERO", referencedColumnName = "PROFESORID")
    @ManyToOne
    private Profesor profesorconsejero;

    public Graduado() {
    }

    public Graduado(BigDecimal graduadoid) {
        this.graduadoid = graduadoid;
    }

    public Date getFechagrado() {
        return fechagrado;
    }

    public void setFechagrado(Date fechagrado) {
        this.fechagrado = fechagrado;
    }

    public BigDecimal getGraduadoid() {
        return graduadoid;
    }

    public void setGraduadoid(BigDecimal graduadoid) {
        this.graduadoid = graduadoid;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public Profesor getProfesorconsejero() {
        return profesorconsejero;
    }

    public void setProfesorconsejero(Profesor profesorconsejero) {
        this.profesorconsejero = profesorconsejero;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (graduadoid != null ? graduadoid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Graduado)) {
            return false;
        }
        Graduado other = (Graduado) object;
        if ((this.graduadoid == null && other.graduadoid != null) || (this.graduadoid != null && !this.graduadoid.equals(other.graduadoid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Graduado[ graduadoid=" + graduadoid + " ]";
    }
    
}
