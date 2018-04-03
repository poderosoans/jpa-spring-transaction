
package pe.edu.cibertec.repositorio.impl;

import javax.persistence.EntityManager;
import pe.edu.cibertec.dominio.Usuario;
import pe.edu.cibertec.repositorio.UsuarioRepositorio;

/**
 *
 * @author Roger P.
 */
public class UsuarioJpaRepositorioImpl implements UsuarioRepositorio{
    
    private EntityManager em;

    public UsuarioJpaRepositorioImpl setEm(EntityManager em) {
        this.em = em;
        return this;
    }

    @Override
    public Usuario buscar(Long id) {
        return em.find(Usuario.class, id);
    }

    @Override
    public void crear(Usuario usuario) {
        em.persist(usuario);
    }
    
}
