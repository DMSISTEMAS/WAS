package org.cce.sistema.dao;

import java.util.List;

import org.cce.sistema.model.Catequista;

public interface CatequistaDao {

	public List<Catequista> lista();

	public void guardar(Catequista catequista);

	public void actualizar(Catequista catequista);

	public void borrar(Catequista catequista);
	
	public List<String> listarCatequista(String nombre);

}
