package org.cce.sistema.dao;

import java.util.List;

import org.cce.sistema.model.Municipio;

public interface MunicipioDao {
	
	public List<Municipio> lista();

	public void guardar(Municipio municipio);

	public void actualizar(Municipio municipio);

	public void borrar(Municipio municipio);

}
