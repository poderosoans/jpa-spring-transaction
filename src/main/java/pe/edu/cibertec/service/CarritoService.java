
package pe.edu.cibertec.service;

import java.util.List;
import pe.edu.cibertec.dominio.Carrito;

public interface CarritoService {
    List<Carrito> buscarPorUsuario(Long idUsuario);
    
    void crear (Carrito carrito);
    
    void actualizar(Carrito carrito);
}
