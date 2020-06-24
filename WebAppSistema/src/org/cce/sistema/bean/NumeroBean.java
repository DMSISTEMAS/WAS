package org.cce.sistema.bean;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

import org.cce.sistema.dao.NumeroDao;
import org.cce.sistema.imp.NumeroDaoImp;
import org.cce.sistema.model.Numero;
import org.primefaces.context.RequestContext;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Named("numero")
@ViewScoped
public class NumeroBean implements Serializable {

	private static final long serialVersionUID = 1L;
	private List<Numero> lista;
	private Numero numero;

	public NumeroBean() {
		this.lista = new ArrayList<Numero>();
		this.numero = new Numero();
	}

	public Numero getNumero() {
		return numero;
	}

	public void setNumero(Numero numero) {
		this.numero = numero;
	}

	public List<Numero> getLista() {
		NumeroDao nDao = new NumeroDaoImp();
		this.lista = nDao.lista();
		return lista;
	}

	public void guardar() {
		NumeroDao nDao = new NumeroDaoImp();
		nDao.guardar(numero);
		this.numero = new Numero();
		RequestContext.getCurrentInstance().update("frmPrincipal");
		RequestContext.getCurrentInstance().execute("PF('dlgAgregar').hide()");
	}

	public void actualizar() {
		NumeroDao nDao = new NumeroDaoImp();
		nDao.actualizar(numero);
		this.numero = new Numero();
	}

}
