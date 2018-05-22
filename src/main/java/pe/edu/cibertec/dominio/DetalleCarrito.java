
package pe.edu.cibertec.dominio;

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import pe.edu.cibertec.dominio.base.EntidadBase;

@Entity
@Table (name="detalle_carrito")
public class DetalleCarrito extends EntidadBase{
    @ManyToOne
    @JoinColumn(name="id_carrito") // JoinColumn hace referencia a una columna en la Base de Datos
    private Carrito carritoCompras;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="id_producto")
    private Producto producto;
    
    private int cantidad;
    @Column(name="precio_unitario", precision = 10, scale = 2)
    private BigDecimal precioUnitario;

    public Carrito getCarritoCompras() {
        return carritoCompras;
    }

    public void setCarritoCompras(Carrito carritoCompras) {
        this.carritoCompras = carritoCompras;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public BigDecimal getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(BigDecimal precioUnitario) {
        this.precioUnitario = precioUnitario;
    }
    
    
}
