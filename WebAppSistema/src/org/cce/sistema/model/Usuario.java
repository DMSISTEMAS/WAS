package org.cce.sistema.model;

import java.util.Date;

public class Usuario implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private Integer idUsuario;
	private String nombre;
	private String nickname;
	private String contrasena;
	private Date fechaAlta;
	private Boolean estado;
	private String perfil;
	private Integer idCatequista;

	public Usuario() {
	}

	public Usuario(String nombre, String nickname, String contrasena, Date fechaAlta, Boolean estado, String perfil,
			Integer idCatequista) {
		this.nombre = nombre;
		this.nickname = nickname;
		this.contrasena = contrasena;
		this.fechaAlta = fechaAlta;
		this.estado = estado;
		this.perfil = perfil;
		this.idCatequista = idCatequista;
	}

	public Integer getIdUsuario() {
		return this.idUsuario;
	}

	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNickname() {
		return this.nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getContrasena() {
		return this.contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public Date getFechaAlta() {
		return this.fechaAlta;
	}

	public void setFechaAlta(Date fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	public Boolean getEstado() {
		return this.estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}

	public String getPerfil() {
		return this.perfil;
	}

	public void setPerfil(String perfil) {
		this.perfil = perfil;
	}

	public Integer getIdCatequista() {
		return this.idCatequista;
	}

	public void setIdCatequista(Integer idCatequista) {
		this.idCatequista = idCatequista;
	}

}
