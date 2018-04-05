
package pe.edu.cibertec.dominio;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PostLoad;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author Roger P.
 */
@Entity
public class Usuario implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto (JPA se encarga de evaluar) | Sequence: indicar cual es la secuencia que hibernate debe usar SequenceGenerator | Table: Tabla de contadores
    private Long id;
    @Basic // Nombre de atributo es el nombre de la columna
    private String nombre;
    private String apellido;
    
    @Column(name="fecha_nacimiento")
    @Temporal(TemporalType.TIMESTAMP)  // Date (solo fecha) Time (solo tiempo) TIMESTAMP (date+time)
    private Date fechaNacimiento;
    @Transient
    private transient Integer edad; // Transient: No necesita ser serializado (En JPA no es una columa en BD, no lo envía o interactura) 
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Integer getEdad() {
        return edad;
    }
    
    @PostLoad
    public void despuesCargarEntidad() {
        // Método
    }
}
