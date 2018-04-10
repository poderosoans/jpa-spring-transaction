/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.cibertec.repositorio.impl;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import pe.edu.cibertec.dominio.Producto;
import pe.edu.cibertec.repositorio.ProductoRepositorio;

/**
 *
 * @author Poderosoans
 */
public class ProductoJpaRepositorioImpl implements ProductoRepositorio{
    
    private EntityManager em;
    
    public ProductoJpaRepositorioImpl setEm(EntityManager em) {
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
    
    private static final String SELECT_PRODUCTOS = "SELECT p FROM Producto p JOIN p.categoria c";
    
    @Override
    public List<Producto> obtenerTodos() {
        TypedQuery<Producto> query = em.createQuery(SELECT_PRODUCTOS,Producto.class);
        return query.getResultList();
    }
    
}
