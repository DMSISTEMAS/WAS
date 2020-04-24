package org.cce.sistema.dao;

import java.util.List;

import org.cce.sistema.model.Registro;

public interface RegistroDao {
	public List<Registro> lista();

	public void guardar(Registro registro);

	public void actualizar(Registro registro);

	public void borrar(Registro registro);

	public List<String> obtenerMaxValor();
}
