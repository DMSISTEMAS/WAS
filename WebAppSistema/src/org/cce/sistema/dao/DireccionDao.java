package org.cce.sistema.dao;

import java.util.List;

import org.cce.sistema.model.Direccion;

public interface DireccionDao {
	
	public List<Direccion> lista();

	public void guardar(Direccion direccion);

	public void actualizar(Direccion direccion);

	public void borrar(Direccion direccion);

}
