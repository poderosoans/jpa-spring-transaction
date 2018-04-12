/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.cibertec.main;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import pe.edu.cibertec.dominio.Carrito;
import pe.edu.cibertec.dominio.Producto;
import pe.edu.cibertec.dominio.Usuario;
import pe.edu.cibertec.repositorio.CarritoRepositorio;
import pe.edu.cibertec.repositorio.ProductoRepositorio;
import pe.edu.cibertec.repositorio.UsuarioRepositorio;
import pe.edu.cibertec.repositorio.impl.CarritoJpaRepositorioImpl;
import pe.edu.cibertec.repositorio.impl.UsuarioJpaRepositorioImpl;
import pe.edu.cibertec.repositorio.impl.ProductoJpaRepositorioImpl;

/**
 *
 * @author Java-LM
 */
public class Principal {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("labjpa");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
       /*
        UsuarioRepositorio usuarioRepositorio =
                new UsuarioJpaRepositorioImpl().setEm(em);
        
        Usuario usuario = usuarioRepositorio.buscar(1L);
        System.out.printf("Usuario %d %s %s\n", 
                usuario.getId(),
                usuario.getNombre(),
                usuario.getApellido());
        
        Usuario otroUsuario = usuarioRepositorio.buscar(2L);
        
       // Usuario nuevo = new Usuario();
       // nuevo.setNombre("MJ");
       // nuevo.setApellido("Fernandez");
       // usuarioRepositorio.crear(nuevo);
        
       // Usuario existente = usuarioRepositorio.buscar(nuevo.getId());
       // System.out.println(nuevo.equals(existente));
       // System.out.println(nuevo == existente);
        System.out.println("edad: "+otroUsuario.getEdad());
        */
       /*
       ProductoRepositorio productoRepositorio = new ProductoJpaRepositorioImpl().setEm(em);
       Producto producto = productoRepositorio.buscar(1L);
       System.out.println(producto.getId()+ " " + producto.getNombre() + " " + producto.getCategoria().getNombre());
       
       List<Producto> productoLista = productoRepositorio.obtenerTodos();
       productoLista.forEach(pr -> System.out.println(pr.getNombre() +" "+ pr.getCategoria().getNombre()));
       */
       /*
       CarritoRepositorio carritoRepositorio = new CarritoJpaRepositorioImpl().setEm(em);
       
       List<Carrito> listaCarrito = carritoRepositorio.buscarPorUsuario(1L);
       listaCarrito.forEach(carrito -> {
           System.out.println(carrito.getId()+" "+ carrito.getTotal() +" "+ carrito.getUsuario().getNombre());
           System.out.println("------------------------------");
       });
       */
       
       ProductoRepositorio productoRepositorio = new ProductoJpaRepositorioImpl().setEm(em);
       List<Producto> productosLista = productoRepositorio.obtenerPorCategoria(1L);
       productosLista.forEach(producto -> {
           System.out.println(producto.getNombre() +" "+ producto.getCategoria().getNombre());
       });
               
        em.getTransaction().commit();
        em.close();
        emf.close();
    }
}
