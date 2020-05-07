package org.cce.sistema.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Horario implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private Integer idHorario;
	private String dia;
	private Date horaInicio;
	private Date horaFin;
	private Date inicioCiclo;
	private String nombre;
	private Boolean estatus;
	@SuppressWarnings("rawtypes")
	private Set registros = new HashSet(0);

	public Horario() {
	}

	@SuppressWarnings("rawtypes")
	public Horario(String dia, Date horaInicio, Date horaFin, Date inicioCiclo, String nombre, Boolean estatus,
			Set registros) {
		this.dia = dia;
		this.horaInicio = horaInicio;
		this.horaFin = horaFin;
		this.inicioCiclo = inicioCiclo;
		this.nombre = nombre;
		this.estatus = estatus;
		this.registros = registros;
	}

	public Integer getIdHorario() {
		return this.idHorario;
	}

	public void setIdHorario(Integer idHorario) {
		this.idHorario = idHorario;
	}

	public String getDia() {
		return this.dia;
	}

	public void setDia(String dia) {
		this.dia = dia;
	}

	public Date getHoraInicio() {
		return this.horaInicio;
	}

	public void setHoraInicio(Date horaInicio) {
		this.horaInicio = horaInicio;
	}

	public Date getHoraFin() {
		return this.horaFin;
	}

	public void setHoraFin(Date horaFin) {
		this.horaFin = horaFin;
	}

	public Date getInicioCiclo() {
		return this.inicioCiclo;
	}

	public void setInicioCiclo(Date inicioCiclo) {
		this.inicioCiclo = inicioCiclo;
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
