
package pe.edu.cibertec.repositorio.impl;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import pe.edu.cibertec.dominio.Usuario;
import pe.edu.cibertec.repositorio.UsuarioRepositorio;

@Repository
public class UsuarioJpaRepositorioImpl implements UsuarioRepositorio{
    
    @PersistenceContext
    private EntityManager em;

    @Override
    public Usuario buscar(Long id) {
        return em.find(Usuario.class, id);
    }
    /*
    @Override
    public Usuario buscar(String nombre) {
        TypedQuery<Usuario> query = em.createQuery("SELECT u FROM Usuario u WHERE u.nombre = :nombre", Usuario.class);
        try{
            return
        }catch (){
            return null;
        }
    }
    */
    @Override
    public void crear(Usuario usuario) {
        em.persist(usuario);
    }

    @Override
    public void actualizar(Usuario usuario) {
        em.merge(usuario);
    }

    @Override
    public void eliminar(Usuario usuario) {
       em.remove(usuario);
    }

    @Override
    public Usuario login(String email, String password) {
        
        try { 
            Usuario user = (Usuario) em.createQuery( "SELECT u from Usuario u where u.email = :email and u.password = :password") 
            .setParameter("email", email).setParameter("password", password).getSingleResult(); 
            return user; 
        } catch (NoResultException e) {
            return null; 
        }

    }
    
}
