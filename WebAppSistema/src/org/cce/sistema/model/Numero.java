package org.cce.sistema.model;

import java.util.HashSet;
import java.util.Set;

public class Numero implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private Integer idNumero;
	private Integer numeroCasa;
	@SuppressWarnings("rawtypes")
	private Set catequizados = new HashSet(0);

	public Numero() {
	}

	@SuppressWarnings("rawtypes")
	public Numero(Integer numeroCasa, Set catequizados) {
		this.numeroCasa = numeroCasa;
		this.catequizados = catequizados;
	}

	public Integer getIdNumero() {
		return this.idNumero;
	}

	public void setIdNumero(Integer idNumero) {
		this.idNumero = idNumero;
	}

	public Integer getNumeroCasa() {
		return this.numeroCasa;
	}

	public void setNumeroCasa(Integer numeroCasa) {
		this.numeroCasa = numeroCasa;
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
