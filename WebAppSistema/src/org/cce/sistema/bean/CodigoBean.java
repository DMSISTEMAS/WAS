package org.cce.sistema.bean;

import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.cce.sistema.dao.CodigoDao;
import org.cce.sistema.imp.CodigoDaoImp;
import org.cce.sistema.model.Codigo;
import org.primefaces.context.RequestContext;

@Named("codigo")
@ViewScoped
public class CodigoBean implements Serializable {

	private static final long serialVersionUID = 1L;
	private List<Codigo> lista;
	private Codigo codigo;

	public CodigoBean() {
		this.lista = new ArrayList<Codigo>();
		this.codigo = new Codigo();
	}

	public Codigo getCodigo() {
		return codigo;
	}

	public void setCodigo(Codigo codigo) {
		this.codigo = codigo;
	}

	public List<Codigo> getLista() {
		CodigoDao cDao = new CodigoDaoImp();
		this.lista = cDao.lista();
		return lista;
	}

	public void guardar() {
		CodigoDao cDao = new CodigoDaoImp();
		cDao.guardar(codigo);
		this.codigo = new Codigo();
		RequestContext.getCurrentInstance().update("frmPrincipal");
		RequestContext.getCurrentInstance().execute("PF('dlgAgregar').hide()");
	}

	public void actualizar() {
		CodigoDao cDao = new CodigoDaoImp();
		cDao.actualizar(codigo);
		this.codigo = new Codigo();
	}
}
