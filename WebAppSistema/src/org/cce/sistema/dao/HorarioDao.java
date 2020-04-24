package org.cce.sistema.dao;

import java.util.List;

import org.cce.sistema.model.Horario;

public interface HorarioDao {
	public List<Horario> lista();

	public void guardar(Horario horario);

	public void actualizar(Horario horario);

	public void borrar(Horario horario);
	
	public List<String> listarHorario(String nombre);
	
	public Horario listaHorarioId(int id);
	
	public List<String> listaDeHorarios();
}
