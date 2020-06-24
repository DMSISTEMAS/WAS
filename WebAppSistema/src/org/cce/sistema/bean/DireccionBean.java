package org.cce.sistema.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

import org.cce.sistema.dao.DireccionDao;
import org.cce.sistema.imp.DireccionDaoImp;
import org.cce.sistema.model.Direccion;
import org.primefaces.context.RequestContext;

@Named("direccion")
@ViewScoped
public class DireccionBean implements Serializable {

	private static final long serialVersionUID = 1L;
	private List<Direccion> lista;
	private Direccion direccion;

	public DireccionBean() {
		this.lista = new ArrayList<>();
		this.direccion = new Direccion();
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public List<Direccion> getLista() {
		DireccionDao lDao = new DireccionDaoImp();
		this.lista = lDao.lista();
		return lista;
	}

	public void guardar() {
		DireccionDao lDao = new DireccionDaoImp();
		lDao.guardar(direccion);
		direccion = new Direccion();
		RequestContext.getCurrentInstance().update("frmPrincipal");
		RequestContext.getCurrentInstance().execute("PF('dlgAgregar').hide()");
	}

	public void actualizar() {
		DireccionDao lDao = new DireccionDaoImp();
		lDao.actualizar(direccion);
		direccion = new Direccion();
	}

}
