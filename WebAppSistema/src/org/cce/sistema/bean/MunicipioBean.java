package org.cce.sistema.bean;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

import org.cce.sistema.dao.MunicipioDao;
import org.cce.sistema.imp.MunicipioDaoImp;
import org.cce.sistema.model.Municipio;
import org.primefaces.context.RequestContext;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Named("municipio")
@ViewScoped
public class MunicipioBean implements Serializable {

	private static final long serialVersionUID = 1L;
	private List<Municipio> lista;
	private Municipio municipio;

	public MunicipioBean() {
		this.lista = new ArrayList<Municipio>();
		this.municipio = new Municipio();

	}

	public Municipio getMunicipio() {
		return municipio;
	}

	public void setMunicipio(Municipio municipio) {
		this.municipio = municipio;
	}

	public List<Municipio> getLista() {
		MunicipioDao mDao = new MunicipioDaoImp();
		this.lista = mDao.lista();
		return lista;
	}

	public void guardar() {
		MunicipioDao mDao = new MunicipioDaoImp();
		mDao.guardar(municipio);
		this.municipio = new Municipio();
		RequestContext.getCurrentInstance().update("frmPrincipal");
		RequestContext.getCurrentInstance().execute("PF('dlgAgregar').hide()");
	}

	public void actualizar() {
		MunicipioDao mDao = new MunicipioDaoImp();
		mDao.actualizar(municipio);
		this.municipio = new Municipio();
	}

}
