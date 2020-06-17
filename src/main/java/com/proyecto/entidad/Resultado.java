package com.proyecto.entidad;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "resultado")
public class Resultado {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_resultado")
	private int idResultado;
	
	@Column(name = "estado")
	private String estado;
	
	@Column(name = "userId")
	private int userId;
	
	@Column(name = "triajeId")
	private int triajeId;

	public int getIdResultado() {
		return idResultado;
	}

	public void setIdResultado(int idResultado) {
		this.idResultado = idResultado;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getTriajeId() {
		return triajeId;
	}

	public void setTriajeId(int triajeId) {
		this.triajeId = triajeId;
	}

	
	
	
	

}
