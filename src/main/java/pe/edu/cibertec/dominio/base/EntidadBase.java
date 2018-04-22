
package pe.edu.cibertec.dominio.base;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@MappedSuperclass // Cualquier clase que herede va a tener todas estas columnas (Sirve como base)
public abstract class EntidadBase implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;
    
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha_reg;
    
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha_mod;
    
    @Basic
    private Integer estado;
    /*
    Ejemplo en caso que todas mias tablas tengan campos de auditoria
    protected Date fechaCreacion;
    protected Date fechUltimaActualizacion;
    protected String usuarioCreacion;
    protected String usuarioUltimaActualizacion;
    */
    
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getFecha_reg() {
        return fecha_reg;
    }

    public void setFecha_reg(Date fecha_reg) {
        this.fecha_reg = fecha_reg;
    }

    public Date getFecha_mod() {
        return fecha_mod;
    }

    public void setFecha_mod(Date fecha_mod) {
        this.fecha_mod = fecha_mod;
    }

    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }
    
    
}
