package org.cce.sistema.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

import org.cce.sistema.dao.LibroDao;
import org.cce.sistema.imp.LibroDaoImp;
import org.cce.sistema.model.Libro;
import org.primefaces.context.RequestContext;


@Named("libro")
@ViewScoped
public class LibroBean implements Serializable {

	private static final long serialVersionUID = 1L;
	private List<Libro> lista;
	private Libro libro;

	public LibroBean() {
		this.lista = new ArrayList<>();
		this.libro = new Libro();
	}

	public Libro getLibro() {
		return libro;
	}

	public void setLibro(Libro libro) {
		this.libro = libro;
	}

	public List<Libro> getLista() {
		LibroDao lDao = new LibroDaoImp();
		this.lista = lDao.lista();
		return lista;
	}

	public void guardar() {
		LibroDao lDao = new LibroDaoImp();
		lDao.guardar(libro);
		this.libro = new Libro();
		RequestContext.getCurrentInstance().update("frmPrincipal");
		RequestContext.getCurrentInstance().execute("PF('dlgAgregar').hide()");
	}

	public void actualizar() {
		LibroDao lDao = new LibroDaoImp();
		lDao.actualizar(libro);
		libro = new Libro();
	}

}
