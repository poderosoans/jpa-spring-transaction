/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.cibertec.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import pe.edu.cibertec.dominio.Usuario;
import pe.edu.cibertec.repositorio.UsuarioRepositorio;
import pe.edu.cibertec.repositorio.impl.UsuarioJpaRepositorioImpl;

/**
 *
 * @author Java-LM
 */
public class Principal {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("labjpa");
        EntityManager em = emf.createEntityManager();
        UsuarioRepositorio usuarioRepositorio =
                new UsuarioJpaRepositorioImpl().setEm(em);
        
        Usuario usuario = usuarioRepositorio.buscar(1L);
        System.out.printf("Usuario %d %s %s\n", 
                usuario.getId(),
                usuario.getNombre(),
                usuario.getApellido());
        
        em.close();
        emf.close();
    }
}
