package org.cce.sistema.dao;

import java.util.List;

import org.cce.sistema.model.Bautismo;

public interface BautismoDao {

	public List<Bautismo> lista();

	public void guardar(Bautismo bautismo);

	public void actualizar(Bautismo bautismo);

	public void borrar(Bautismo bautismo);

}
