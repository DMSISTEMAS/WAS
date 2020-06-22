package org.cce.sistema.model;

import java.util.Date;

public class Bitacora implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private Integer idCiclo;
	private Registro registro;
	private Integer semana;
	private Date fecha;
	private Long puntualidad;
	private Long asistencia;
	private Long conducta;
	private Long misa;
	private Long tarea;
	private Long extra;
	private String observaciones;
	private String ruta;
	private String justificante;
	private Boolean estatus;
	private Long aseo;
	private String catequesisFamiliar;
	private String misaSalida;

	public Bitacora() {
	}

	public Bitacora(Registro registro, Integer semana, Date fecha, Long puntualidad, Long asistencia, Long conducta,
			Long misa, Long tarea, Long extra, String observaciones, String ruta, String justificante, Boolean estatus,
			Long aseo, String catequesisFamiliar, String misaSalida) {
		this.registro = registro;
		this.semana = semana;
		this.fecha = fecha;
		this.puntualidad = puntualidad;
		this.asistencia = asistencia;
		this.conducta = conducta;
		this.misa = misa;
		this.tarea = tarea;
		this.extra = extra;
		this.observaciones = observaciones;
		this.ruta = ruta;
		this.justificante = justificante;
		this.estatus = estatus;
		this.aseo = aseo;
		this.catequesisFamiliar = catequesisFamiliar;
		this.misaSalida = misaSalida;
	}

	public Integer getIdCiclo() {
		return this.idCiclo;
	}

	public void setIdCiclo(Integer idCiclo) {
		this.idCiclo = idCiclo;
	}

	public Registro getRegistro() {
		return this.registro;
	}

	public void setRegistro(Registro registro) {
		this.registro = registro;
	}

	public Integer getSemana() {
		return this.semana;
	}

	public void setSemana(Integer semana) {
		this.semana = semana;
	}

	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Long getPuntualidad() {
		return this.puntualidad;
	}

	public void setPuntualidad(Long puntualidad) {
		this.puntualidad = puntualidad;
	}

	public Long getAsistencia() {
		return this.asistencia;
	}

	public void setAsistencia(Long asistencia) {
		this.asistencia = asistencia;
	}

	public Long getConducta() {
		return this.conducta;
	}

	public void setConducta(Long conducta) {
		this.conducta = conducta;
	}

	public Long getMisa() {
		return this.misa;
	}

	public void setMisa(Long misa) {
		this.misa = misa;
	}

	public Long getTarea() {
		return this.tarea;
	}

	public void setTarea(Long tarea) {
		this.tarea = tarea;
	}

	public Long getExtra() {
		return this.extra;
	}

	public void setExtra(Long extra) {
		this.extra = extra;
	}

	public String getObservaciones() {
		return this.observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public String getRuta() {
		return this.ruta;
	}

	public void setRuta(String ruta) {
		this.ruta = ruta;
	}

	public String getJustificante() {
		return this.justificante;
	}

	public void setJustificante(String justificante) {
		this.justificante = justificante;
	}

	public Boolean getEstatus() {
		return this.estatus;
	}

	public void setEstatus(Boolean estatus) {
		this.estatus = estatus;
	}

	public Long getAseo() {
		return this.aseo;
	}

	public void setAseo(Long aseo) {
		this.aseo = aseo;
	}

	public String getCatequesisFamiliar() {
		return this.catequesisFamiliar;
	}

	public void setCatequesisFamiliar(String catequesisFamiliar) {
		this.catequesisFamiliar = catequesisFamiliar;
	}

	public String getMisaSalida() {
		return this.misaSalida;
	}

	public void setMisaSalida(String misaSalida) {
		this.misaSalida = misaSalida;
	}

}
