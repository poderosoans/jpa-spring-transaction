/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.cibertec.repositorio.impl;

import javax.persistence.EntityManager;
import pe.edu.cibertec.dominio.Producto;
import pe.edu.cibertec.repositorio.ProductoRepositorio;

/**
 *
 * @author Poderosoans
 */
public class ProductoRepositorioImpl implements ProductoRepositorio{
    
    private EntityManager em;
    
    public ProductoRepositorioImpl setEm(EntityManager em) {
        this.em = em;
        return this;
    }
    
    @Override
    public Producto buscar(Long id) {
        return em.find(Producto.class, id);
    }

    @Override
    public void crear(Producto producto) {
        em.persist(producto);
    }

    @Override
    public void actualizar(Producto producto) {
        em.merge(producto);
    }

    @Override
    public void eliminar(Producto producto) {
        em.remove(producto);
    }
    
}
