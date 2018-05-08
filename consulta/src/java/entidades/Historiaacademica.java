/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author PC_Angelo
 */
@Entity
@Table(name = "HISTORIAACADEMICA", catalog = "", schema = "SIACA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Historiaacademica.findAll", query = "SELECT h FROM Historiaacademica h")
    , @NamedQuery(name = "Historiaacademica.findByCurso", query = "SELECT h FROM Historiaacademica h WHERE h.curso = :curso")
    , @NamedQuery(name = "Historiaacademica.findByNota", query = "SELECT h FROM Historiaacademica h WHERE h.nota = :nota")
    , @NamedQuery(name = "Historiaacademica.findBySecuencia", query = "SELECT h FROM Historiaacademica h WHERE h.secuencia = :secuencia")
    , @NamedQuery(name = "Historiaacademica.findBySemestre", query = "SELECT h FROM Historiaacademica h WHERE h.semestre = :semestre")
    , @NamedQuery(name = "Historiaacademica.findByHistoriaacademicaid", query = "SELECT h FROM Historiaacademica h WHERE h.historiaacademicaid = :historiaacademicaid")})
public class Historiaacademica implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "CURSO")
    private BigInteger curso;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "NOTA")
    private Double nota;
    @Column(name = "SECUENCIA")
    private BigInteger secuencia;
    @Column(name = "SEMESTRE")
    private BigInteger semestre;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "HISTORIAACADEMICAID")
    private BigDecimal historiaacademicaid;
    @JoinColumn(name = "ESTUDIANTE", referencedColumnName = "ESTUDIANTEID")
    @ManyToOne
    private Estudiante estudiante;

    public Historiaacademica() {
    }

    public Historiaacademica(BigDecimal historiaacademicaid) {
        this.historiaacademicaid = historiaacademicaid;
    }

    public BigInteger getCurso() {
        return curso;
    }

    public void setCurso(BigInteger curso) {
        this.curso = curso;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }

    public BigInteger getSecuencia() {
        return secuencia;
    }

    public void setSecuencia(BigInteger secuencia) {
        this.secuencia = secuencia;
    }

    public BigInteger getSemestre() {
        return semestre;
    }

    public void setSemestre(BigInteger semestre) {
        this.semestre = semestre;
    }

    public BigDecimal getHistoriaacademicaid() {
        return historiaacademicaid;
    }

    public void setHistoriaacademicaid(BigDecimal historiaacademicaid) {
        this.historiaacademicaid = historiaacademicaid;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (historiaacademicaid != null ? historiaacademicaid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Historiaacademica)) {
            return false;
        }
        Historiaacademica other = (Historiaacademica) object;
        if ((this.historiaacademicaid == null && other.historiaacademicaid != null) || (this.historiaacademicaid != null && !this.historiaacademicaid.equals(other.historiaacademicaid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Historiaacademica[ historiaacademicaid=" + historiaacademicaid + " ]";
    }
    
}
