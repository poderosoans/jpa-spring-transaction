
package pe.edu.cibertec.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.cibertec.dominio.Producto;
import pe.edu.cibertec.repositorio.ProductoRepositorio;
import pe.edu.cibertec.service.ProductoService;

@Service
@Transactional
public class ProductoServiceImpl implements ProductoService {
    
    @Autowired
    private ProductoRepositorio productoRepositorio;

    @Override
    public Producto buscar(Long id) {
        return productoRepositorio.buscar(id);
    }

    @Override
    public void crear(Producto producto) {
        productoRepositorio.crear(producto);
    }

    @Override
    public void actualizar(Producto producto) {
        productoRepositorio.actualizar(producto);
    }

    @Override
    public void eliminar(Producto producto) {
        productoRepositorio.eliminar(producto);
    }
    
    @Transactional(readOnly = true)
    @Override
    public List<Producto> obtenerTodos() {
        return productoRepositorio.obtenerTodos();
    }

    @Override
    public List<Producto> obtenerPorCategoria(Long idCategoria) {
        return productoRepositorio.obtenerPorCategoria(idCategoria);
    }

    @Override
    public List<Producto> obtenerPorCategoriaCriteriaApi(Long idCategoria) {
        return productoRepositorio.obtenerPorCategoriaCriteriaApi(idCategoria);
    }
    
}
