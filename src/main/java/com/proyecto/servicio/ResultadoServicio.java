package com.proyecto.servicio;

import java.util.List;
import java.util.Optional;

import com.proyecto.entidad.Resultado;


public interface ResultadoServicio {

	public Resultado insertaActualizaResultado(Resultado obj);
	public Optional<Resultado> buscarResultadoPorId(int id);
	public void eliminaResultado(int idResultado);
	public List<Resultado> listaResultado();
}
