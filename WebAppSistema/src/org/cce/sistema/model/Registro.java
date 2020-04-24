package org.cce.sistema.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Registro implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private Integer idRegistro;
	private Catequista catequista;
	private Catequizado catequizado;
	private Ciclo ciclo;
	private Horario horario;
	private Libro libro;
	private Parroquia parroquia;
	private Long folioRecibo;
	private Long costo;
	private Integer faltas;
	private String evaluacion;
	private Date alta;
	@SuppressWarnings("rawtypes")
	private Set bitacoras = new HashSet(0);

	public Registro() {
	}

	@SuppressWarnings("rawtypes")
	public Registro(Catequista catequista, Catequizado catequizado, Ciclo ciclo, Horario horario, Libro libro,
			Parroquia parroquia, Long folioRecibo, Long costo, Integer faltas, String evaluacion, Date alta,
			Set bitacoras) {
		this.catequista = catequista;
		this.catequizado = catequizado;
		this.ciclo = ciclo;
		this.horario = horario;
		this.libro = libro;
		this.parroquia = parroquia;
		this.folioRecibo = folioRecibo;
		this.costo = costo;
		this.faltas = faltas;
		this.evaluacion = evaluacion;
		this.alta = alta;
		this.bitacoras = bitacoras;
	}

	public Integer getIdRegistro() {
		return this.idRegistro;
	}

	public void setIdRegistro(Integer idRegistro) {
		this.idRegistro = idRegistro;
	}

	public Catequista getCatequista() {
		return this.catequista;
	}

	public void setCatequista(Catequista catequista) {
		this.catequista = catequista;
	}

	public Catequizado getCatequizado() {
		return this.catequizado;
	}

	public void setCatequizado(Catequizado catequizado) {
		this.catequizado = catequizado;
	}

	public Ciclo getCiclo() {
		return this.ciclo;
	}

	public void setCiclo(Ciclo ciclo) {
		this.ciclo = ciclo;
	}

	public Horario getHorario() {
		return this.horario;
	}

	public void setHorario(Horario horario) {
		this.horario = horario;
	}

	public Libro getLibro() {
		return this.libro;
	}

	public void setLibro(Libro libro) {
		this.libro = libro;
	}

	public Parroquia getParroquia() {
		return this.parroquia;
	}

	public void setParroquia(Parroquia parroquia) {
		this.parroquia = parroquia;
	}

	public Long getFolioRecibo() {
		return this.folioRecibo;
	}

	public void setFolioRecibo(Long folioRecibo) {
		this.folioRecibo = folioRecibo;
	}

	public Long getCosto() {
		return this.costo;
	}

	public void setCosto(Long costo) {
		this.costo = costo;
	}

	public Integer getFaltas() {
		return this.faltas;
	}

	public void setFaltas(Integer faltas) {
		this.faltas = faltas;
	}

	public String getEvaluacion() {
		return this.evaluacion;
	}

	public void setEvaluacion(String evaluacion) {
		this.evaluacion = evaluacion;
	}

	public Date getAlta() {
		return this.alta;
	}

	public void setAlta(Date alta) {
		this.alta = alta;
	}

	@SuppressWarnings("rawtypes")
	public Set getBitacoras() {
		return this.bitacoras;
	}

	@SuppressWarnings("rawtypes")
	public void setBitacoras(Set bitacoras) {
		this.bitacoras = bitacoras;
	}

}
