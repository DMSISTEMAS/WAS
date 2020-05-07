package org.cce.sistema.model;

import java.util.HashSet;
import java.util.Set;

public class Libro implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private Integer idLibro;
	private String nombre;
	private String descripcion;
	@SuppressWarnings("rawtypes")
	private Set registros = new HashSet(0);

	public Libro() {
	}

	public Libro(String nombre, String descripcion, Set registros) {
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.registros = registros;
	}

	public Integer getIdLibro() {
		return this.idLibro;
	}

	public void setIdLibro(Integer idLibro) {
		this.idLibro = idLibro;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
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
