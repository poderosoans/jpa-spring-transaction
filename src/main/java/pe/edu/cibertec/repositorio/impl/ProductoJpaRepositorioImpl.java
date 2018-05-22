
package pe.edu.cibertec.repositorio.impl;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.springframework.stereotype.Repository;
import pe.edu.cibertec.dominio.Producto;
import pe.edu.cibertec.repositorio.ProductoRepositorio;

@Repository
public class ProductoJpaRepositorioImpl implements ProductoRepositorio{
    
    @PersistenceContext
    private EntityManager em;
    
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

    @Override
    public List<Producto> obtenerPorCategoria(Long idCategoria) {
        TypedQuery<Producto> query = em.createNamedQuery(Producto.NQ_OBTENER_PRODUCTOS_POR_CATEGORIA, Producto.class);
        query.setParameter("idCategoria", idCategoria);
        return query.getResultList();
    }

    @Override
    public List<Producto> obtenerPorCategoriaCriteriaApi(Long idCategoria) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Producto> cq = cb.createQuery(Producto.class);
        Root<Producto> producto = cq.from(Producto.class);
        cq.select(producto).where(
                cb.equal(producto.get("categoria").get("id"), idCategoria)
        ).orderBy(cb.asc(producto.get("nombre")));
        TypedQuery<Producto> query = em.createQuery(cq);
        return query.getResultList();
    }
    
}
