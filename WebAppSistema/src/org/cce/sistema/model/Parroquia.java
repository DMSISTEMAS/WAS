package org.cce.sistema.model;

import java.util.HashSet;
import java.util.Set;

public class Parroquia implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private Integer idParroquia;
	private String diocesis;
	private String decanato;
	private String parroquia;
	private String presbitero;
	private byte[] logo;
	@SuppressWarnings("rawtypes")
	private Set registros = new HashSet(0);

	public Parroquia() {
	}

	@SuppressWarnings("rawtypes")
	public Parroquia(String diocesis, String decanato, String parroquia, String presbitero, byte[] logo,
			Set registros) {
		this.diocesis = diocesis;
		this.decanato = decanato;
		this.parroquia = parroquia;
		this.presbitero = presbitero;
		this.logo = logo;
		this.registros = registros;
	}

	public Integer getIdParroquia() {
		return this.idParroquia;
	}

	public void setIdParroquia(Integer idParroquia) {
		this.idParroquia = idParroquia;
	}

	public String getDiocesis() {
		return this.diocesis;
	}

	public void setDiocesis(String diocesis) {
		this.diocesis = diocesis;
	}

	public String getDecanato() {
		return this.decanato;
	}

	public void setDecanato(String decanato) {
		this.decanato = decanato;
	}

	public String getParroquia() {
		return this.parroquia;
	}

	public void setParroquia(String parroquia) {
		this.parroquia = parroquia;
	}

	public String getPresbitero() {
		return this.presbitero;
	}

	public void setPresbitero(String presbitero) {
		this.presbitero = presbitero;
	}

	public byte[] getLogo() {
		return this.logo;
	}

	public void setLogo(byte[] logo) {
		this.logo = logo;
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
