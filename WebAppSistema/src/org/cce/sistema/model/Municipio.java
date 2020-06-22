package org.cce.sistema.model;

import java.util.HashSet;
import java.util.Set;

public class Municipio implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private Integer idMunicipio;
	private String nombre;
	@SuppressWarnings("rawtypes")
	private Set catequizados = new HashSet(0);

	public Municipio() {
	}

	@SuppressWarnings("rawtypes")
	public Municipio(String nombre, Set catequizados) {
		this.nombre = nombre;
		this.catequizados = catequizados;
	}

	public Integer getIdMunicipio() {
		return this.idMunicipio;
	}

	public void setIdMunicipio(Integer idMunicipio) {
		this.idMunicipio = idMunicipio;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@SuppressWarnings("rawtypes")
	public Set getCatequizados() {
		return this.catequizados;
	}

	@SuppressWarnings("rawtypes")
	public void setCatequizados(Set catequizados) {
		this.catequizados = catequizados;
	}

}
