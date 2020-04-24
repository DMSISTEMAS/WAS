package org.cce.sistema.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Catequista implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private Integer idCatequista;
	private String nombre;
	private String apellidoPaterno;
	private String apellidoMaterno;
	private String direccion;
	private String telefono;
	private Date fechaNacimiento;
	private String foto;
	@SuppressWarnings("rawtypes")
	private Set registros = new HashSet(0);

	public Catequista() {
	}

	@SuppressWarnings("rawtypes")
	public Catequista(String nombre, String apellidoPaterno, String apellidoMaterno, String direccion, String telefono,
			Date fechaNacimiento, String foto, Set registros) {
		this.nombre = nombre;
		this.apellidoPaterno = apellidoPaterno;
		this.apellidoMaterno = apellidoMaterno;
		this.direccion = direccion;
		this.telefono = telefono;
		this.fechaNacimiento = fechaNacimiento;
		this.foto = foto;
		this.registros = registros;
	}

	public Integer getIdCatequista() {
		return this.idCatequista;
	}

	public void setIdCatequista(Integer idCatequista) {
		this.idCatequista = idCatequista;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidoPaterno() {
		return this.apellidoPaterno;
	}

	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}

	public String getApellidoMaterno() {
		return this.apellidoMaterno;
	}

	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return this.telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public Date getFechaNacimiento() {
		return this.fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getFoto() {
		return this.foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
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
