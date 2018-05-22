
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
public class ProductoServiceImpl implements ProductoService{
    
    @Autowired
    private ProductoRepositorio productoRepositorio;

    @Override
    public Producto buscar(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void crear(Producto producto) {
        productoRepositorio.crear(producto);
    }

    @Override
    public void actualizar(Producto producto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar(Producto producto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Transactional(readOnly = true)
    @Override
    public List<Producto> obtenerTodos() {
        return productoRepositorio.obtenerTodos();
    }

    @Override
    public List<Producto> obtenerPorCategoria(Long idCategoria) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Producto> obtenerPorCategoriaCriteriaApi(Long idCategoria) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
