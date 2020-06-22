package org.cce.sistema.dao;

import java.util.List;

import org.cce.sistema.model.Numero;

public interface NumeroDao {

	public List<Numero> lista();

	public void guardar(Numero numero);

	public void actualizar(Numero numero);

	public void borrar(Numero numero);
}
