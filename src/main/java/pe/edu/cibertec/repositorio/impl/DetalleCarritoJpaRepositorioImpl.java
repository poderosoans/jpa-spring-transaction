
package pe.edu.cibertec.repositorio.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import pe.edu.cibertec.dominio.DetalleCarrito;
import pe.edu.cibertec.repositorio.DetalleCarritoRepositorio;

@Repository
public class DetalleCarritoJpaRepositorioImpl implements DetalleCarritoRepositorio {
    
    @PersistenceContext
    private EntityManager em;
    
    @Override
    public void crear(DetalleCarrito detalleCarrito) {
        em.persist(detalleCarrito);
    }
    
}
