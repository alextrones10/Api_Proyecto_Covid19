package com.proyecto.servicio;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.entidad.Resultado;
import com.proyecto.repositorio.ResultadoRepositorio;
import com.proyecto.repositorio.UsuarioRepositorio;

@Service
public class ResultadoServicioImpl implements ResultadoServicio{

	@Autowired
	private ResultadoRepositorio repositorio; 
	
	@Override
	public Resultado insertaActualizaResultado(Resultado obj) {
		return repositorio.save(obj);
	}

	@Override
	public Optional<Resultado> buscarResultadoPorId(int id) {
		return repositorio.findById(id);
	}

	@Override
	public void eliminaResultado(int idResultado) {
		repositorio.deleteById(idResultado);
	}

	@Override
	public List<Resultado> listaResultado() {
		return repositorio.findAll();
	}

	

}


