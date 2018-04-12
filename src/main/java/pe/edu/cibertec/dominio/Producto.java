
package pe.edu.cibertec.dominio;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import pe.edu.cibertec.dominio.base.EntidadBase;

@Entity
@Table(name = "tab_producto")
@NamedQueries(
        @NamedQuery(name = "nq_obtener_productos_por_categoria",
        query = "SELECT p FROM Producto p WHERE p.categoria.id = :idCategoria")
)
public class Producto extends EntidadBase{
    @Basic
    private String nombre;
    @Basic
    private String descripcion;
    @Column(name="precio", precision= 10, scale = 2) // Puede tener 10 digitos | 8 enteros 2 decimales
    private BigDecimal precio;
    @Lob // Para un tipo de dato binario 
    private byte[] imagen;
    
    // MUCHOS productos pueden tener UNA categoría
    @ManyToOne (optional = false) // Nunca sera nula la relacion y usara Inner join
    // En JoinColumn indicamos el NOMBRE de la COLUMNA en la tabla PRODUCTO para la referencia a la tabla CATEGORÍA
    @JoinColumn(name = "id_categoria")        
    private Categoria categoria;

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    public byte[] getImagen() {
        return imagen;
    }

    public void setImagen(byte[] imagen) {
        this.imagen = imagen;
    }
    
    
    
}
