/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.cibertec.repositorio.impl;

import javax.persistence.EntityManager;
import pe.edu.cibertec.dominio.DetalleCarrito;
import pe.edu.cibertec.repositorio.DetalleCarritoRepositorio;

/**
 *
 * @author Poderosoans
 */
public class DetalleCarritoJpaRepositorioImpl implements DetalleCarritoRepositorio {
    private EntityManager em;
    
    public DetalleCarritoJpaRepositorioImpl setEm(EntityManager em) {
        this.em = em;
        return this;
    }
    
    @Override
    public void crear(DetalleCarrito detalleCarrito) {
        em.persist(detalleCarrito);
    }
    
}
