/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.cibertec.repositorio.impl;

import javax.persistence.EntityManager;
import pe.edu.cibertec.dominio.Categoria;
import pe.edu.cibertec.repositorio.CategoriaRepositorio;

/**
 *
 * @author Poderosoans
 */
public class CategoriaJpaRepositorioImpl implements CategoriaRepositorio{
    
    private EntityManager em;
    
    public CategoriaJpaRepositorioImpl setEm(EntityManager em) {
        this.em = em;
        return this;
    }
    
    @Override
    public Categoria buscar(Long id) {
        return em.find(Categoria.class, id);
    }

    @Override
    public void crear(Categoria categoria) {
        em.persist(categoria);
    }

    @Override
    public void actualizar(Categoria categoria) {
        em.merge(categoria);
    }

    @Override
    public void eliminar(Categoria categoria) {
        em.remove(categoria);
    }
    
}
