package com.proyecto.servicio;

import java.util.List;
import java.util.Optional;

import com.proyecto.entidad.Triaje;

public interface TriajeServicio {

	public Triaje insertaActualizaTriaje(Triaje obj);
	public Optional<Triaje> buscarTriajePorId(int id);
	public void eliminaTriaje(int idTriaje);
	public List<Triaje> listaTriaje();

}
