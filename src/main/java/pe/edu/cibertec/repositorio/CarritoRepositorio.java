
package pe.edu.cibertec.repositorio;

import java.util.List;
import pe.edu.cibertec.dominio.Carrito;

public interface CarritoRepositorio {
    List<Carrito> buscarPorUsuario(Long idUsuario);
    
    void crear (Carrito carrito);
    
    void actualizar(Carrito carrito);
}
