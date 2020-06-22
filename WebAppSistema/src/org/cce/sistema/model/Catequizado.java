package org.cce.sistema.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Catequizado implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private Integer idCatequizado;
	private Bautismo bautismo;
	private Codigo codigo;
	private Direccion direccion;
	private Municipio municipio;
	private Numero numero;
	private String nombre;
	private String apellidoPaterno;
	private String apellidoMaterno;
	private String direccion_1;
	private String telefono;
	private String correo;
	private Date fechaNacimiento;
	private Date fechaAlta;
	private byte[] foto;
	private String nombrePapa;
	private String nombreMama;
	private Date fechaBautismo;
	private String lugarBautismo;
	private String estadoRegistro;
	private String estado;
	private String observaciones;
	@SuppressWarnings("rawtypes")
	private Set registros = new HashSet(0);

	public Catequizado() {
	}

	@SuppressWarnings("rawtypes")
	public Catequizado(Bautismo bautismo, Codigo codigo, Direccion direccion, Municipio municipio, Numero numero,
			String nombre, String apellidoPaterno, String apellidoMaterno, String direccion_1, String telefono,
			String correo, Date fechaNacimiento, Date fechaAlta, byte[] foto, String nombrePapa, String nombreMama,
			Date fechaBautismo, String lugarBautismo, String estadoRegistro, String estado, String observaciones,
			Set registros) {
		this.bautismo = bautismo;
		this.codigo = codigo;
		this.direccion = direccion;
		this.municipio = municipio;
		this.numero = numero;
		this.nombre = nombre;
		this.apellidoPaterno = apellidoPaterno;
		this.apellidoMaterno = apellidoMaterno;
		this.direccion_1 = direccion_1;
		this.telefono = telefono;
		this.correo = correo;
		this.fechaNacimiento = fechaNacimiento;
		this.fechaAlta = fechaAlta;
		this.foto = foto;
		this.nombrePapa = nombrePapa;
		this.nombreMama = nombreMama;
		this.fechaBautismo = fechaBautismo;
		this.lugarBautismo = lugarBautismo;
		this.estadoRegistro = estadoRegistro;
		this.estado = estado;
		this.observaciones = observaciones;
		this.registros = registros;
	}

	public Integer getIdCatequizado() {
		return this.idCatequizado;
	}

	public void setIdCatequizado(Integer idCatequizado) {
		this.idCatequizado = idCatequizado;
	}

	public Bautismo getBautismo() {
		return this.bautismo;
	}

	public void setBautismo(Bautismo bautismo) {
		this.bautismo = bautismo;
	}

	public Codigo getCodigo() {
		return this.codigo;
	}

	public void setCodigo(Codigo codigo) {
		this.codigo = codigo;
	}

	public Direccion getDireccion() {
		return this.direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public Municipio getMunicipio() {
		return this.municipio;
	}

	public void setMunicipio(Municipio municipio) {
		this.municipio = municipio;
	}

	public Numero getNumero() {
		return this.numero;
	}

	public void setNumero(Numero numero) {
		this.numero = numero;
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

	public String getDireccion_1() {
		return this.direccion_1;
	}

	public void setDireccion_1(String direccion_1) {
		this.direccion_1 = direccion_1;
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

	public String getEstadoRegistro() {
		return this.estadoRegistro;
	}

	public void setEstadoRegistro(String estadoRegistro) {
		this.estadoRegistro = estadoRegistro;
	}

	public String getEstado() {
		return this.estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getObservaciones() {
		return this.observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
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
