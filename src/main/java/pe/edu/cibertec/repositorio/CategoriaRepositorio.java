/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.cibertec.repositorio;

import pe.edu.cibertec.dominio.Categoria;

/**
 *
 * @author Poderosoans
 */
public interface CategoriaRepositorio {
    Categoria buscar(Long id);
    void crear (Categoria categoria);
    void actualizar(Categoria categoria);
    void eliminar(Categoria categoria);
}
