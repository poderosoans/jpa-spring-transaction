/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.cibertec.dominio;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
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
    @Basic 
    private BigDecimal total;
    
    @Basic
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
