
package pe.edu.cibertec.service;

import java.util.List;
import pe.edu.cibertec.dominio.Categoria;

public interface CategoriaService {
    Categoria buscar(Long id);
    void crear (Categoria categoria);
    void actualizar(Categoria categoria);
    void eliminar(Categoria categoria);
    List<Categoria> obtenerTodos();
}
