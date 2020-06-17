package com.proyecto.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proyecto.entidad.Usuario;

public interface UsuarioRepositorio extends JpaRepository<Usuario, Integer> {

}
