
package pe.edu.cibertec.dominio;


import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.PostLoad;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import pe.edu.cibertec.dominio.base.EntidadBase;

/**
 *
 * @author Roger P.
 */
@Entity
public class Usuario extends EntidadBase {
    
    //@Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY) // Auto (JPA se encarga de evaluar) | Sequence: indicar cual es la secuencia que hibernate debe usar SequenceGenerator | Table: Tabla de contadores
    //private Long id;
    @Basic // Nombre de atributo es el nombre de la columna
    private String nombre;
    private String apellido;
    
    @Column(name="fecha_nacimiento")
    @Temporal(TemporalType.TIMESTAMP)  // Date (solo fecha) Time (solo tiempo) TIMESTAMP (date+time)
    private Date fechaNacimiento;
    @Transient
    private transient Integer edad; // Transient: No necesita ser serializado (En JPA no es una columa en BD, no lo envía o interactura) 
    
    @Basic
    private String email;
    @Basic
    private String password;
    @Basic
    private String telefono;
    @Basic
    private String sexo;
    @Basic
    private String dni;
    
    @OneToMany(mappedBy = "usuario", fetch = FetchType.EAGER)
    private List<Usuario> usuarioList;

    public List<Usuario> getUsuarioList() {
        return usuarioList;
    }

    public void setUsuarioList(List<Usuario> usuarioList) {
        this.usuarioList = usuarioList;
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
        LocalDate ahora = LocalDate.now();
        LocalDate fechaNacimiento = this.fechaNacimiento.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        edad = (int)fechaNacimiento.until(ahora, ChronoUnit.YEARS);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
    
    
}
