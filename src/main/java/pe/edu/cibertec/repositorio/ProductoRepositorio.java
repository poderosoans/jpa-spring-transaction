/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.cibertec.repositorio;

import java.util.List;
import pe.edu.cibertec.dominio.Producto;

/**
 *
 * @author Poderosoans
 */
public interface ProductoRepositorio {
    Producto buscar(Long id);
    void crear (Producto producto);
    void actualizar(Producto producto);
    void eliminar(Producto producto);
    
    // Solo para pruebas
    List<Producto> obtenerTodos();
    
    List<Producto> obtenerPorCategoria(Long idCategoria);
    
    List<Producto> obtenerPorCategoriaCriteriaApi(Long idCategoria);
}
