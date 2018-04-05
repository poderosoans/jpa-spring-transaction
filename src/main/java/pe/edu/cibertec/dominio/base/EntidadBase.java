
package pe.edu.cibertec.dominio.base;

import java.io.Serializable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass // Cualquier clase que herede va a tener todas estas columnas (Sirve como base)
public abstract class EntidadBase implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;
    
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
    
}
