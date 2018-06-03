
package pe.edu.cibertec.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.cibertec.dominio.Usuario;
import pe.edu.cibertec.repositorio.UsuarioRepositorio;
import pe.edu.cibertec.service.UsuarioService;

@Service
@Transactional
public class UsuarioServiceImpl implements UsuarioService{
    
    @Autowired
    private UsuarioRepositorio usuarioRepositorio;

    @Override
    public Usuario buscar(Long id) {
        return usuarioRepositorio.buscar(id);
    }

    @Override
    public void crear(Usuario usuario) {
        usuarioRepositorio.crear(usuario);
    }

    @Override
    public void actualizar(Usuario usuario) {
        usuarioRepositorio.actualizar(usuario);
    }

    @Override
    public void eliminar(Usuario usuario) {
        usuarioRepositorio.eliminar(usuario);
    }

    @Override
    public Usuario login(String email, String password) {
        return usuarioRepositorio.login(email, password);
    }
    
}
