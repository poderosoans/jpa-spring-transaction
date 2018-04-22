/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.cibertec.dominio;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Table;
import pe.edu.cibertec.dominio.base.EntidadBase;

/**
 *
 * @author Poderosoans
 */
@Entity
@Table (name="tipo_direccion")
public class TipoDireccion extends EntidadBase{
    @Basic
    private String descripcion;

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
}
