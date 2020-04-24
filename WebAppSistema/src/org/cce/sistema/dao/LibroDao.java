package org.cce.sistema.dao;

import java.util.List;

import org.cce.sistema.model.Libro;

public interface LibroDao {
	public List<Libro> lista();

	public void guardar(Libro libro);

	public void actualizar(Libro libro);

	public void borrar(Libro libro);
	
	public List<String> listarLibro(String nombre);
	
	public List<Integer> listaDeLisbros();
}
