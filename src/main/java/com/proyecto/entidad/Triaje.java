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
	@Column(name = "idtriaje")
	private int idTriaje;
	
	@Column(name = "departamento")
	private String departamento;
	
	@Column(name = "provincia")
	private String provincia;
	
	@Column(name = "distrito")
	private String distrito;
	
	@Column(name = "direccion")
	private String direccion;
	
	@Column(name = "ubigeo")
	private int ubigeo;
	
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
	
	@Column(name = "estado")
	private String estado;
	
	@Column(name = "userId")
	private int userId;

	public int getIdTriaje() {
		return idTriaje;
	}

	public void setIdTriaje(int idTriaje) {
		this.idTriaje = idTriaje;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public String getDistrito() {
		return distrito;
	}

	public void setDistrito(String distrito) {
		this.distrito = distrito;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getUbigeo() {
		return ubigeo;
	}

	public void setUbigeo(int ubigeo) {
		this.ubigeo = ubigeo;
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

	
	

	
	
	
	

		
	
}
