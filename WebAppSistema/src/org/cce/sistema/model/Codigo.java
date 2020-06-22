package org.cce.sistema.model;

import java.util.HashSet;
import java.util.Set;

public class Codigo implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private Integer idCodigo;
	private Integer codigoPostal;
	private String colonia;
	@SuppressWarnings("rawtypes")
	private Set catequizados = new HashSet(0);

	public Codigo() {
	}
	@SuppressWarnings("rawtypes")
	public Codigo(Integer codigoPostal, String colonia, Set catequizados) {
		this.codigoPostal = codigoPostal;
		this.colonia = colonia;
		this.catequizados = catequizados;
	}

	public Integer getIdCodigo() {
		return this.idCodigo;
	}

	public void setIdCodigo(Integer idCodigo) {
		this.idCodigo = idCodigo;
	}

	public Integer getCodigoPostal() {
		return this.codigoPostal;
	}

	public void setCodigoPostal(Integer codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	public String getColonia() {
		return this.colonia;
	}

	public void setColonia(String colonia) {
		this.colonia = colonia;
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
