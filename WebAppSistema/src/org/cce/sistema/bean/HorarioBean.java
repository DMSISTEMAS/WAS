package org.cce.sistema.bean;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

import org.cce.sistema.dao.HorarioDao;
import org.cce.sistema.imp.HorarioDaoImp;
import org.cce.sistema.model.Horario;
import org.primefaces.context.RequestContext;

import java.io.Serializable;
import java.util.List;

@Named("horario")
@ViewScoped
public class HorarioBean implements Serializable {
	private static final long serialVersionUID = 1L;

	private Horario horario;
	private List<Horario> listaHorario;
	public HorarioBean() {
		this.horario = new Horario();
	}

	public Horario getHorario() {
		return horario;
	}

	public void setHorario(Horario horario) {
		this.horario = horario;
	}

	public List<Horario> getListaHorario() {
		HorarioDao hDao = new HorarioDaoImp();
		listaHorario=hDao.lista();
		return listaHorario;
	}
	

	public void guardar() {
		HorarioDao hDao = new HorarioDaoImp();
		hDao.guardar(horario);
		RequestContext.getCurrentInstance().update("frmPrincipal");
		RequestContext.getCurrentInstance().execute("PF('dlgAgregar').hide()");
		this.horario = new Horario();
	}

}
