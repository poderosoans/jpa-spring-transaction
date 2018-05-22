/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.cibertec.repositorio.impl;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import org.springframework.stereotype.Repository;
import pe.edu.cibertec.dominio.Carrito;
import pe.edu.cibertec.repositorio.CarritoRepositorio;

@Repository
public class CarritoJpaRepositorioImpl implements CarritoRepositorio{
    
    @PersistenceContext
    private EntityManager em;

    @Override
    public List<Carrito> buscarPorUsuario(Long idUsuario) {
        String sql = "SELECT c FROM Carrito c WHERE c.usuario.id = :idUsuario"
                + " ORDER BY c.fechaCompra DESC";
        TypedQuery<Carrito> query = em.createQuery(sql, Carrito.class)
                .setParameter("idUsuario", idUsuario);
        return query.getResultList();
        
    }

    @Override
    public void crear(Carrito carrito) {
        em.persist(carrito);
    }

    @Override
    public void actualizar(Carrito carrito) {
        em.merge(carrito);
    }
    
}
