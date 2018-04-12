/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.cibertec.dominio;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import pe.edu.cibertec.dominio.base.EntidadBase;

/**
 *
 * @author Java-LM
 */
@Entity
public class Carrito extends EntidadBase{
  
    private BigDecimal total;
    
    @Column(name="fecha_creacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCreacion;
    
    @Column(name="fecha_compra")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCompra;
    
    @Column(name="direccion_envio")
    private String direccionEnvio;
    private boolean activo;
    
    /*
    * OneToMany sirve para mapear un objeto de tipo Carrito a muchos objetos 
    * de tipo DetalleCarrito puesto que será una relación bidireccional,
    * es decir que DetalleCarrito tiene un mapeo hacia Carrito, se debe indicar
    * el campo mappedBy, que es el nombre del ATRIBUTO en la CLASE DetalleCarrito
    * para identificar al objeto de tipo Carrito.
    */
    @OneToMany(mappedBy = "carritoCompras", fetch = FetchType.EAGER)
    private List<DetalleCarrito> detalleCarritoList;
    
    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private Usuario usuario;

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Date getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(Date fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public String getDireccionEnvio() {
        return direccionEnvio;
    }

    public void setDireccionEnvio(String direccionEnvio) {
        this.direccionEnvio = direccionEnvio;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public List<DetalleCarrito> getDetalleCarritoList() {
        return detalleCarritoList;
    }

    public void setDetalleCarritoList(List<DetalleCarrito> detalleCarritoList) {
        this.detalleCarritoList = detalleCarritoList;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    
    
}
