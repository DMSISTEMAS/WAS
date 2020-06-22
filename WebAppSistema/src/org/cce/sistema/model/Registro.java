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
	private Porcentaje porcentaje;
	private Long costo;
	private Date alta;
	private String estado;
	@SuppressWarnings("rawtypes")
	private Set calificacions = new HashSet(0);
	@SuppressWarnings("rawtypes")
	private Set bitacoras = new HashSet(0);

	public Registro() {
	}

	@SuppressWarnings("rawtypes")
	public Registro(Catequista catequista, Catequizado catequizado, Ciclo ciclo, Horario horario, Libro libro,
			Parroquia parroquia, Porcentaje porcentaje, Long costo, Date alta, String estado, Set calificacions,
			Set bitacoras) {
		this.catequista = catequista;
		this.catequizado = catequizado;
		this.ciclo = ciclo;
		this.horario = horario;
		this.libro = libro;
		this.parroquia = parroquia;
		this.porcentaje = porcentaje;
		this.costo = costo;
		this.alta = alta;
		this.estado = estado;
		this.calificacions = calificacions;
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

	public Porcentaje getPorcentaje() {
		return this.porcentaje;
	}

	public void setPorcentaje(Porcentaje porcentaje) {
		this.porcentaje = porcentaje;
	}

	public Long getCosto() {
		return this.costo;
	}

	public void setCosto(Long costo) {
		this.costo = costo;
	}

	public Date getAlta() {
		return this.alta;
	}

	public void setAlta(Date alta) {
		this.alta = alta;
	}

	public String getEstado() {
		return this.estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	@SuppressWarnings("rawtypes")
	public Set getCalificacions() {
		return this.calificacions;
	}

	@SuppressWarnings("rawtypes")
	public void setCalificacions(Set calificacions) {
		this.calificacions = calificacions;
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
