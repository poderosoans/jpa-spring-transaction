
package pe.edu.cibertec.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.cibertec.dominio.Carrito;
import pe.edu.cibertec.repositorio.CarritoRepositorio;
import pe.edu.cibertec.service.CarritoService;

@Service
@Transactional
public class CarritoServiceImpl implements CarritoService{
    
    @Autowired
    private CarritoRepositorio carritoRepositorio;
    
    @Override
    public List<Carrito> buscarPorUsuario(Long idUsuario) {
        return carritoRepositorio.buscarPorUsuario(idUsuario);
    }

    @Override
    public void crear(Carrito carrito) {
        carritoRepositorio.crear(carrito);
    }

    @Override
    public void actualizar(Carrito carrito) {
        carritoRepositorio.actualizar(carrito);
    }
    
}
