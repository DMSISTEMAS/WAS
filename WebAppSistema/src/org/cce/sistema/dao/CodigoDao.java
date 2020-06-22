package org.cce.sistema.dao;

import java.util.List;

import org.cce.sistema.model.Codigo;

public interface CodigoDao {

	public List<Codigo> lista();

	public void guardar(Codigo codigo);

	public void actualizar(Codigo codigo);

	public void borrar(Codigo codigo);

}
