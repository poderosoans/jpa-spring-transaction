
package pe.edu.cibertec.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.cibertec.dominio.DetalleCarrito;
import pe.edu.cibertec.repositorio.DetalleCarritoRepositorio;
import pe.edu.cibertec.service.DetalleCarritoService;

@Service
@Transactional
public class DetalleCarritoServiceImpl implements DetalleCarritoService{
    
    @Autowired
    private DetalleCarritoRepositorio detalleCarritoRepositorio;
    
    @Override
    public void crear(DetalleCarrito detalleCarrito) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
