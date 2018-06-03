
package pe.edu.cibertec.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.cibertec.dominio.Categoria;
import pe.edu.cibertec.repositorio.CategoriaRepositorio;
import pe.edu.cibertec.service.CategoriaService;

@Service
@Transactional
public class CategoriaServiceImpl implements CategoriaService{
    @Autowired
    private CategoriaRepositorio categoriaRepositorio;
    
    @Override
    public Categoria buscar(Long id) {
        return categoriaRepositorio.buscar(id);
    }

    @Override
    public void crear(Categoria categoria) {
        categoriaRepositorio.crear(categoria);
    }

    @Override
    public void actualizar(Categoria categoria) {
        categoriaRepositorio.actualizar(categoria);
    }

    @Override
    public void eliminar(Categoria categoria) {
        categoriaRepositorio.eliminar(categoria);
    }

    @Override
    public List<Categoria> obtenerTodos() {
        return categoriaRepositorio.obtenerTodos();
    }
    
}
