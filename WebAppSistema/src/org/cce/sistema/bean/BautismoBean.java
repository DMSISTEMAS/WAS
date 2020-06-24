package org.cce.sistema.bean;

import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.cce.sistema.dao.BautismoDao;
import org.cce.sistema.imp.BautismoDaoImp;
import org.cce.sistema.model.Bautismo;
import org.primefaces.context.RequestContext;

@Named("bautismo")
@ViewScoped
public class BautismoBean implements Serializable {

	private static final long serialVersionUID = 1L;
	private List<Bautismo> lista;
	private Bautismo bautismo;

	public BautismoBean() {
		this.lista = new ArrayList<Bautismo>();
		this.bautismo = new Bautismo();
	}

	public Bautismo getBautismo() {
		return bautismo;
	}

	public void setBautismo(Bautismo bautismo) {
		this.bautismo = bautismo;
	}

	public List<Bautismo> getLista() {
		BautismoDao bDao = new BautismoDaoImp();
		this.lista = bDao.lista();
		return lista;
	}

	public void guardar() {
		BautismoDao bDao = new BautismoDaoImp();
		bDao.guardar(bautismo);
		this.bautismo = new Bautismo();
		RequestContext.getCurrentInstance().update("frmPrincipal");
		RequestContext.getCurrentInstance().execute("PF('dlgAgregar').hide()");
	}

	public void actualizar() {
		BautismoDao bDao = new BautismoDaoImp();
		bDao.actualizar(bautismo);
		this.bautismo = new Bautismo();
	}

}
