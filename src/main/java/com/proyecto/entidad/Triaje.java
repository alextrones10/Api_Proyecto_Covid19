package com.proyecto.entidad;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

/*
 * @Table--->Tabla
 * @Id------>Primary key
 * @Column-->Columna
 * GenerationType.IDENTITY-->Base de datos genera la pk
 */

@Entity
@Table(name = "triaje")
public class Triaje {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	@Column(name = "id_triaje")
	private int idTriaje;
	
	@Column(name = "difresp")
	private String dificultadRespirar;
	
	@Column(name = "fiebre")
	private String fiebre;
	
	@Column(name = "tos")
	private String tos;
	
	@Column(name = "cansancio")
	private String cansancio;
	
	@Column(name = "dolorgarg")
	private String dolorGarganta;
	
	@Column(name = "malestargen")
	private String malestarGeneral;
	
	@Column(name = "otros")
	private String otros;
	
	@Column(name = "situacion")
	private String situacionEconomica;
	
	@Column(name = "userId")
	private int userId;

	public int getIdTriaje() {
		return idTriaje;
	}

	public void setIdTriaje(int idTriaje) {
		this.idTriaje = idTriaje;
	}

	public String getDificultadRespirar() {
		return dificultadRespirar;
	}

	public void setDificultadRespirar(String dificultadRespirar) {
		this.dificultadRespirar = dificultadRespirar;
	}

	public String getFiebre() {
		return fiebre;
	}

	public void setFiebre(String fiebre) {
		this.fiebre = fiebre;
	}

	public String getTos() {
		return tos;
	}

	public void setTos(String tos) {
		this.tos = tos;
	}

	public String getCansancio() {
		return cansancio;
	}

	public void setCansancio(String cansancio) {
		this.cansancio = cansancio;
	}

	public String getDolorGarganta() {
		return dolorGarganta;
	}

	public void setDolorGarganta(String dolorGarganta) {
		this.dolorGarganta = dolorGarganta;
	}

	public String getMalestarGeneral() {
		return malestarGeneral;
	}

	public void setMalestarGeneral(String malestarGeneral) {
		this.malestarGeneral = malestarGeneral;
	}

	public String getOtros() {
		return otros;
	}

	public void setOtros(String otros) {
		this.otros = otros;
	}

	public String getSituacionEconomica() {
		return situacionEconomica;
	}

	public void setSituacionEconomica(String situacionEconomica) {
		this.situacionEconomica = situacionEconomica;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	

		
	
}
