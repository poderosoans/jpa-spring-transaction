
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void crear(Carrito carrito) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void actualizar(Carrito carrito) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
