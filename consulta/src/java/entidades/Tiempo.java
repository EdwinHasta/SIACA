package entidades;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
@Table(name = "TIEMPO", catalog = "", schema = "SIACA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tiempo.findAll", query = "SELECT t FROM Tiempo t")
    , @NamedQuery(name = "Tiempo.findByDia", query = "SELECT t FROM Tiempo t WHERE t.dia = :dia")
    , @NamedQuery(name = "Tiempo.findByHora", query = "SELECT t FROM Tiempo t WHERE t.hora = :hora")
    , @NamedQuery(name = "Tiempo.findByTiempoid", query = "SELECT t FROM Tiempo t WHERE t.tiempoid = :tiempoid")})
public class Tiempo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "DIA")
    private BigInteger dia;
    @Column(name = "HORA")
    private BigInteger hora;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "TIEMPOID")
    private BigDecimal tiempoid;
    @Column(name = "NUMERO")
    private BigDecimal numero;

    public Tiempo() {
    }

    public Tiempo(BigDecimal tiempoid) {
        this.tiempoid = tiempoid;
    }

    public BigInteger getDia() {
        return dia;
    }

    public void setDia(BigInteger dia) {
        this.dia = dia;
    }

    public BigInteger getHora() {
        return hora;
    }

    public void setHora(BigInteger hora) {
        this.hora = hora;
    }

    public BigDecimal getTiempoid() {
        return tiempoid;
    }

    public void setTiempoid(BigDecimal tiempoid) {
        this.tiempoid = tiempoid;
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
        hash += (tiempoid != null ? tiempoid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tiempo)) {
            return false;
        }
        Tiempo other = (Tiempo) object;
        if ((this.tiempoid == null && other.tiempoid != null) || (this.tiempoid != null && !this.tiempoid.equals(other.tiempoid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Tiempo[ tiempoid=" + tiempoid + " ]";
    }
    
}
