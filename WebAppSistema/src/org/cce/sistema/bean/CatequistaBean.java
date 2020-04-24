package org.cce.sistema.bean;

import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

import org.cce.sistema.dao.CatequistaDao;
import org.cce.sistema.imp.CatequistaDaoImp;
import org.cce.sistema.model.Catequista;
import org.primefaces.context.RequestContext;

import java.io.Serializable;

@Named("catequista")
@ViewScoped
public class CatequistaBean implements Serializable {

	private static final long serialVersionUID = 1L;
	private Catequista catequista;
	private List<Catequista> listaCatequista;

	public CatequistaBean() {
		this.catequista = new Catequista();
	}

	public Catequista getCatequista() {
		return catequista;
	}

	public void setCatequista(Catequista catequista) {
		this.catequista = catequista;
	}

	public List<Catequista> getListaCatequista() {
		CatequistaDao cDao = new CatequistaDaoImp();
		listaCatequista = cDao.lista();
		return listaCatequista;
	}

	public void guardar() {
		CatequistaDao cDao = new CatequistaDaoImp();
		cDao.guardar(catequista);
		this.catequista = new Catequista();
		RequestContext.getCurrentInstance().execute("PF('dlgAgregar').hide()");
		RequestContext.getCurrentInstance().update("frmPrincipal");
	}

}
