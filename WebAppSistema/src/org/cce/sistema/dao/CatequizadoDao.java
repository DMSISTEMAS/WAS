package org.cce.sistema.dao;

import java.util.List;

import org.cce.sistema.model.Catequizado;

public interface CatequizadoDao {

	public List<Catequizado> lista();

	public void guardar(Catequizado catequizado);

	public void actualizar(Catequizado catequizado);

	public void borrar(Catequizado catequizado);
	
	public List<String> listarCatequizado(String nombre);
}
