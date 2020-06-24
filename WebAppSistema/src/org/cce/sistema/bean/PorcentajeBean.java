package org.cce.sistema.bean;

import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.cce.sistema.dao.PorcentajeDao;
import org.cce.sistema.imp.PorcentajeDaoImp;
import org.cce.sistema.model.Porcentaje;
import org.primefaces.context.RequestContext;

@Named("porcentaje")
@ViewScoped
public class PorcentajeBean implements Serializable {

	private static final long serialVersionUID = 1L;
	private List<Porcentaje> lista;
	private Porcentaje porcentaje;

	public PorcentajeBean() {
		this.lista = new ArrayList<Porcentaje>();
		this.porcentaje = new Porcentaje();
	}

	public Porcentaje getPorcentaje() {
		return porcentaje;
	}

	public void setPorcentaje(Porcentaje porcentaje) {
		this.porcentaje = porcentaje;
	}

	public List<Porcentaje> getLista() {
		PorcentajeDao pDao = new PorcentajeDaoImp();
		this.lista = pDao.lista();
		return lista;
	}

	public void guardar() {
		PorcentajeDao pDao = new PorcentajeDaoImp();
		pDao.guardar(porcentaje);
		this.porcentaje = new Porcentaje();
		RequestContext.getCurrentInstance().update("frmPrincipal");
		RequestContext.getCurrentInstance().execute("PF('dlgAgregar').hide()");
	}

	public void actualizar() {
		PorcentajeDao pDao = new PorcentajeDaoImp();
		pDao.actualizar(porcentaje);
		this.porcentaje = new Porcentaje();
	}

}
