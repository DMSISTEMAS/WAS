package org.cce.sistema.model;

import java.util.HashSet;
import java.util.Set;

public class Ciclo implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private Integer idCiclo;
	private String nombre;
	private Boolean estatus;
	@SuppressWarnings("rawtypes")
	private Set registros = new HashSet(0);

	public Ciclo() {
	}

	public Ciclo(String nombre, Boolean estatus, Set registros) {
		this.nombre = nombre;
		this.estatus = estatus;
		this.registros = registros;
	}

	public Integer getIdCiclo() {
		return this.idCiclo;
	}

	public void setIdCiclo(Integer idCiclo) {
		this.idCiclo = idCiclo;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Boolean getEstatus() {
		return this.estatus;
	}

	public void setEstatus(Boolean estatus) {
		this.estatus = estatus;
	}

	@SuppressWarnings("rawtypes")
	public Set getRegistros() {
		return this.registros;
	}

	@SuppressWarnings("rawtypes")
	public void setRegistros(Set registros) {
		this.registros = registros;
	}

}
