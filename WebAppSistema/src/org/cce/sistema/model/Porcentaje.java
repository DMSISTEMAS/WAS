package org.cce.sistema.model;

import java.util.HashSet;
import java.util.Set;

public class Porcentaje implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private Integer idPorcentaje;
	private Long misa;
	private Long tareas;
	private Long extras;
	private Long catequesis;
	private Long asistencia;
	private Long evaluacion;
	private String descricpion;
	@SuppressWarnings("rawtypes")
	private Set registros = new HashSet(0);

	public Porcentaje() {
	}

	@SuppressWarnings("rawtypes")
	public Porcentaje(Long misa, Long tareas, Long extras, Long catequesis, Long asistencia, Long evaluacion,
			String descricpion, Set registros) {
		this.misa = misa;
		this.tareas = tareas;
		this.extras = extras;
		this.catequesis = catequesis;
		this.asistencia = asistencia;
		this.evaluacion = evaluacion;
		this.descricpion = descricpion;
		this.registros = registros;
	}

	public Integer getIdPorcentaje() {
		return this.idPorcentaje;
	}

	public void setIdPorcentaje(Integer idPorcentaje) {
		this.idPorcentaje = idPorcentaje;
	}

	public Long getMisa() {
		return this.misa;
	}

	public void setMisa(Long misa) {
		this.misa = misa;
	}

	public Long getTareas() {
		return this.tareas;
	}

	public void setTareas(Long tareas) {
		this.tareas = tareas;
	}

	public Long getExtras() {
		return this.extras;
	}

	public void setExtras(Long extras) {
		this.extras = extras;
	}

	public Long getCatequesis() {
		return this.catequesis;
	}

	public void setCatequesis(Long catequesis) {
		this.catequesis = catequesis;
	}

	public Long getAsistencia() {
		return this.asistencia;
	}

	public void setAsistencia(Long asistencia) {
		this.asistencia = asistencia;
	}

	public Long getEvaluacion() {
		return this.evaluacion;
	}

	public void setEvaluacion(Long evaluacion) {
		this.evaluacion = evaluacion;
	}

	public String getDescricpion() {
		return this.descricpion;
	}

	public void setDescricpion(String descricpion) {
		this.descricpion = descricpion;
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
