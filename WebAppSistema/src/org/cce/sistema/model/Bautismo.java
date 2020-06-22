package org.cce.sistema.model;

import java.util.HashSet;
import java.util.Set;

public class Bautismo implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private Integer idBautismo;
	private String parroquia;
	private String lugar;
	@SuppressWarnings("rawtypes")
	private Set catequizados = new HashSet(0);

	public Bautismo() {
	}

	@SuppressWarnings("rawtypes")
	public Bautismo(String parroquia, String lugar, Set catequizados) {
		this.parroquia = parroquia;
		this.lugar = lugar;
		this.catequizados = catequizados;
	}

	public Integer getIdBautismo() {
		return this.idBautismo;
	}

	public void setIdBautismo(Integer idBautismo) {
		this.idBautismo = idBautismo;
	}

	public String getParroquia() {
		return this.parroquia;
	}

	public void setParroquia(String parroquia) {
		this.parroquia = parroquia;
	}

	public String getLugar() {
		return this.lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
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
