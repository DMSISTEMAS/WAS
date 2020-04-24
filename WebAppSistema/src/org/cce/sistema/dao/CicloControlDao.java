package org.cce.sistema.dao;

import java.util.List;

import org.cce.sistema.model.Bitacora;

public interface CicloControlDao {

	public List<Bitacora> listaBitacora();

	public List<Bitacora> listarPorSemana(int idHorario, int idLibro, int noSemana);

	public List<String> listarSemanas();

}
