package org.cce.sistema.dao;

import java.util.List;

import org.cce.sistema.model.Usuario;

public interface UsuarioDao {
	public Usuario obtenerDatos(Usuario usuario);

	public Usuario login(Usuario usuario);

	public List<Usuario> listaUsuarios();

	public void guardar(Usuario usuario);

	public void actualizar(Usuario usuario);

	public void borrar(Usuario usuario);
}
