package org.cce.sistema.dao;

import java.util.List;

import org.cce.sistema.model.Parroquia;

public interface ParroquiaDao {
	public List<Parroquia> lista();

	public void guardar(Parroquia parroquia);

	public void actualizar(Parroquia parroquia);

	public void borrar(Parroquia parroquia);

	public List<String> listarParroquia(String nombre);
}
