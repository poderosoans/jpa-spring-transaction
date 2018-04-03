package pe.edu.cibertec.repositorio;

import pe.edu.cibertec.dominio.Usuario;

/**
 *
 * @author Roger P.
 */
public interface UsuarioRepositorio {
    Usuario buscar(Long id);
    void crear (Usuario usuario);
}
