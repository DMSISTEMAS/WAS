package org.cce.sistema.dao;

import java.util.List;

import org.cce.sistema.model.Ciclo;

public interface CicloDao {
	public List<Ciclo> listaCiclo();

	public void guardar(Ciclo ciclo);

	public void actualizar(Ciclo ciclo);

	public void borrar(Ciclo ciclo);

	public List<String> listarCiclo(String nombre);

}
