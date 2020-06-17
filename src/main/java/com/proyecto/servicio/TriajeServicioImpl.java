package com.proyecto.servicio;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.entidad.Triaje;
import com.proyecto.repositorio.TriajeRepositorio;

@Service
public class TriajeServicioImpl implements TriajeServicio{

	@Autowired
	private TriajeRepositorio repositorio; 
	
	@Override
	public Triaje insertaActualizaTriaje(Triaje obj) {
		return repositorio.save(obj);
	}

	@Override
	public Optional<Triaje> buscarTriajePorId(int id) {
		return repositorio.findById(id);
	}

	@Override
	public void eliminaTriaje(int idTriaje) {
		repositorio.deleteById(idTriaje);
	}

	@Override
	public List<Triaje> listaTriaje() {
		return repositorio.findAll();
	}

	

}


