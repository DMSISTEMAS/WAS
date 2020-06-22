package org.cce.sistema.model;

public class Calificacion implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private Integer idCalificacion;
	private Registro registro;
	private Long total;
	private String estado;
	private Long faltas;
	private String observaciones;
	private Long tareas;
	private Long extras;
	private Long catequesis;
	private Long misa;
	private Long evaluacion;

	public Calificacion() {
	}

	public Calificacion(Registro registro, Long total, String estado, Long faltas, String observaciones, Long tareas,
			Long extras, Long catequesis, Long misa, Long evaluacion) {
		this.registro = registro;
		this.total = total;
		this.estado = estado;
		this.faltas = faltas;
		this.observaciones = observaciones;
		this.tareas = tareas;
		this.extras = extras;
		this.catequesis = catequesis;
		this.misa = misa;
		this.evaluacion = evaluacion;
	}

	public Integer getIdCalificacion() {
		return this.idCalificacion;
	}

	public void setIdCalificacion(Integer idCalificacion) {
		this.idCalificacion = idCalificacion;
	}

	public Registro getRegistro() {
		return this.registro;
	}

	public void setRegistro(Registro registro) {
		this.registro = registro;
	}

	public Long getTotal() {
		return this.total;
	}

	public void setTotal(Long total) {
		this.total = total;
	}

	public String getEstado() {
		return this.estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Long getFaltas() {
		return this.faltas;
	}

	public void setFaltas(Long faltas) {
		this.faltas = faltas;
	}

	public String getObservaciones() {
		return this.observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
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

	public Long getMisa() {
		return this.misa;
	}

	public void setMisa(Long misa) {
		this.misa = misa;
	}

	public Long getEvaluacion() {
		return this.evaluacion;
	}

	public void setEvaluacion(Long evaluacion) {
		this.evaluacion = evaluacion;
	}

}
