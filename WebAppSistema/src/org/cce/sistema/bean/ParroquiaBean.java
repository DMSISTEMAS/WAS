package org.cce.sistema.bean;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

import org.cce.sistema.dao.ParroquiaDao;
import org.cce.sistema.imp.ParroquiaDaoImp;
import org.cce.sistema.model.Parroquia;
import org.primefaces.context.RequestContext;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Named("parroquia")
@ViewScoped
public class ParroquiaBean implements Serializable {

	private static final long serialVersionUID = 1L;
	private Parroquia parroquia;
	private List<Parroquia> lista;

	public ParroquiaBean() {
		this.parroquia = new Parroquia();
		this.lista = new ArrayList<>();
	}

	public Parroquia getParroquia() {
		return parroquia;
	}

	public void setParroquia(Parroquia parroquia) {
		this.parroquia = parroquia;
	}

	public List<Parroquia> getLista() {
		ParroquiaDao pDao = new ParroquiaDaoImp();
		this.lista = pDao.lista();
		return lista;
	}

	public void guardar() {
		ParroquiaDao pDao = new ParroquiaDaoImp();
		pDao.guardar(parroquia);
		this.parroquia = new Parroquia();
		RequestContext.getCurrentInstance().update("frmPrincipal");
		RequestContext.getCurrentInstance().execute("PF('dlgAgregar').hide()");
	}

	public void actualizar() {
		ParroquiaDao pDao = new ParroquiaDaoImp();
		pDao.actualizar(parroquia);
		parroquia = new Parroquia();
	}

}
