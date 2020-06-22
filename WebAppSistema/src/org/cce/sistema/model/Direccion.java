package org.cce.sistema.model;

import java.util.HashSet;
import java.util.Set;

public class Direccion implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private Integer idDireccion;
	private String calle;
	@SuppressWarnings("rawtypes")
	private Set catequizados = new HashSet(0);

	public Direccion() {
	}

	@SuppressWarnings("rawtypes")
	public Direccion(String calle, Set catequizados) {
		this.calle = calle;
		this.catequizados = catequizados;
	}

	public Integer getIdDireccion() {
		return this.idDireccion;
	}

	public void setIdDireccion(Integer idDireccion) {
		this.idDireccion = idDireccion;
	}

	public String getCalle() {
		return this.calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
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
