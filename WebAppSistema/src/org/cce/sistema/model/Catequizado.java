package org.cce.sistema.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Catequizado implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private Integer idCatequizado;
	private String nombre;
	private String apellidoPaterno;
	private String apellidoMaterno;
	private String direccion;
	private String telefono;
	private String correo;
	private Date fechaNacimiento;
	private Date fechaAlta;
	private byte[] foto;
	private String nombrePapa;
	private String nombreMama;
	private Date fechaBautismo;
	private String lugarBautismo;
	@SuppressWarnings("rawtypes")
	private Set registros = new HashSet(0);

	public Catequizado() {
	}

	@SuppressWarnings("rawtypes")
	public Catequizado(String nombre, String apellidoPaterno, String apellidoMaterno, String direccion, String telefono,
			String correo, Date fechaNacimiento, Date fechaAlta, byte[] foto, String nombrePapa, String nombreMama,
			Date fechaBautismo, String lugarBautismo, Set registros) {
		this.nombre = nombre;
		this.apellidoPaterno = apellidoPaterno;
		this.apellidoMaterno = apellidoMaterno;
		this.direccion = direccion;
		this.telefono = telefono;
		this.correo = correo;
		this.fechaNacimiento = fechaNacimiento;
		this.fechaAlta = fechaAlta;
		this.foto = foto;
		this.nombrePapa = nombrePapa;
		this.nombreMama = nombreMama;
		this.fechaBautismo = fechaBautismo;
		this.lugarBautismo = lugarBautismo;
		this.registros = registros;
	}

	public Integer getIdCatequizado() {
		return this.idCatequizado;
	}

	public void setIdCatequizado(Integer idCatequizado) {
		this.idCatequizado = idCatequizado;
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

	public String getCorreo() {
		return this.correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public Date getFechaNacimiento() {
		return this.fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public Date getFechaAlta() {
		return this.fechaAlta;
	}

	public void setFechaAlta(Date fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	public byte[] getFoto() {
		return this.foto;
	}

	public void setFoto(byte[] foto) {
		this.foto = foto;
	}

	public String getNombrePapa() {
		return this.nombrePapa;
	}

	public void setNombrePapa(String nombrePapa) {
		this.nombrePapa = nombrePapa;
	}

	public String getNombreMama() {
		return this.nombreMama;
	}

	public void setNombreMama(String nombreMama) {
		this.nombreMama = nombreMama;
	}

	public Date getFechaBautismo() {
		return this.fechaBautismo;
	}

	public void setFechaBautismo(Date fechaBautismo) {
		this.fechaBautismo = fechaBautismo;
	}

	public String getLugarBautismo() {
		return this.lugarBautismo;
	}

	public void setLugarBautismo(String lugarBautismo) {
		this.lugarBautismo = lugarBautismo;
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