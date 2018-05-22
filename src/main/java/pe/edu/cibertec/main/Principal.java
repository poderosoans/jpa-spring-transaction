
package pe.edu.cibertec.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import pe.edu.cibertec.dominio.Producto;

import pe.edu.cibertec.service.ProductoService;


@ComponentScan("pe.edu.cibertec")
@PropertySource("classpath:database.properties")
public class Principal {
    public static void main(String[] args) {
        
        ApplicationContext ctx = new AnnotationConfigApplicationContext(Principal.class);

        ProductoService psImpl = ctx.getBean(ProductoService.class);
        
        List<Producto> productoLista = psImpl.obtenerTodos();
        productoLista.forEach(pr -> System.out.println(pr.getNombre() +" "+ pr.getCategoria().getNombre()));
        
        // Estoy llamando a un bean que es una interfaz (.class)
        // En que momento usar el @Bean ya se sabe que es instancia de un componente
        // Ya podría usar las transacciones de JPA (commit, rollback) en que momento los declaro para usarlo.
    }
}
