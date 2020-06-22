package org.cce.sistema.dao;

import java.util.List;

import org.cce.sistema.model.Porcentaje;

public interface PorcentajeDao {

	public List<Porcentaje> lista();

	public void guardar(Porcentaje porcentaje);

	public void actualizar(Porcentaje porcentaje);

	public void borrar(Porcentaje porcentaje);

}
