package com.proyecto.servicio;

import java.util.List;
import java.util.Optional;

import com.proyecto.entidad.Usuario;

public interface UsuarioServicio {

	public Usuario insertaActualizaUsuario(Usuario obj);
	public Optional<Usuario> buscarUsuarioPorId(int id);
	public void eliminaUsuario(int idUsuario);
	public List<Usuario> listaUsuario();
}
