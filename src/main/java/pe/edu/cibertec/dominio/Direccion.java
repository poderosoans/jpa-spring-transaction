/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.cibertec.dominio;

import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import pe.edu.cibertec.dominio.base.EntidadBase;

/**
 *
 * @author Poderosoans
 */

@Entity
@Table (name="direccion")
public class Direccion extends EntidadBase{
    @ManyToOne
    @JoinColumn(name="id_usuario") // JoinColumn hace referencia a una columna en la Base de Datos
    private Usuario usuario;
    
    @ManyToOne (optional = false)
    @JoinColumn(name = "id_tipo_direccion")
    private TipoDireccion tipoDireccion;
    
    @ManyToOne (optional = false)
    @JoinColumn(name = "id_distrito")
    private Distrito distrito;
    @Basic
    private String direccion;
    @Basic
    private String lote;
    @Basic
    private String departamento;
    @Basic
    private String utbanizacion;
    @Basic
    private String referencia;

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public TipoDireccion getTipoDireccion() {
        return tipoDireccion;
    }

    public void setTipoDireccion(TipoDireccion tipoDireccion) {
        this.tipoDireccion = tipoDireccion;
    }

    public Distrito getDistrito() {
        return distrito;
    }

    public void setDistrito(Distrito distrito) {
        this.distrito = distrito;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getLote() {
        return lote;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getUtbanizacion() {
        return utbanizacion;
    }

    public void setUtbanizacion(String utbanizacion) {
        this.utbanizacion = utbanizacion;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }
    
    
    
}
