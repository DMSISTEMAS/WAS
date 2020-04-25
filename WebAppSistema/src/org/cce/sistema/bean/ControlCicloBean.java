package org.cce.sistema.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.model.SelectItem;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

import org.cce.sistema.dao.CicloControlDao;
import org.cce.sistema.dao.CicloRegDao;
import org.cce.sistema.dao.HorarioDao;
import org.cce.sistema.dao.LibroDao;
import org.cce.sistema.imp.CicloControlDaoImp;
import org.cce.sistema.imp.CicloRegDaoImp;
import org.cce.sistema.imp.HorarioDaoImp;
import org.cce.sistema.imp.LibroDaoImp;
import org.cce.sistema.model.Bitacora;

@Named("control")
@ViewScoped
public class ControlCicloBean implements Serializable {

	private static final long serialVersionUID = 1L;
	private Bitacora ciclo1920;
	private List<Bitacora> listaPorSemana;
	private String semana;
	private String idHorario;
	private int idLibro;
	private List<SelectItem> listaSemanas;
	private List<SelectItem> listaLibros;
	private List<SelectItem> listaHorarios;

	public ControlCicloBean() {
		this.ciclo1920 = new Bitacora();
		this.listaPorSemana = new ArrayList<>();
		this.listaSemanas = new ArrayList<>();
		this.listaLibros = new ArrayList<>();
		this.listaHorarios = new ArrayList<>();
	}

	public Bitacora getCiclo1920() {
		return ciclo1920;
	}

	public void setCiclo1920(Bitacora ciclo1920) {
		this.ciclo1920 = ciclo1920;
	}

	public List<Bitacora> getListaPorSemana() {
		return listaPorSemana;
	}

	public String getSemana() {
		return semana;
	}

	public void setSemana(String semana) {
		this.semana = semana;
	}

	public String getIdHorario() {
		return idHorario;
	}

	public void setIdHorario(String idHorario) {
		this.idHorario = idHorario;
	}

	public int getIdLibro() {
		return idLibro;
	}

	public void setIdLibro(int idLibro) {
		this.idLibro = idLibro;
	}

	public void actualizar() {
		CicloRegDao cDao = new CicloRegDaoImp();
		cDao.actualizar(ciclo1920);
		ciclo1920 = new Bitacora();
	}

	public List<Bitacora> listaPorSemana() {
		CicloControlDao cDao = new CicloControlDaoImp();
		String datoHorario[];
		datoHorario = idHorario.split("_");
		String datoSemana[];
		datoSemana = semana.split("_");
		this.listaPorSemana = cDao.listarPorSemana(Integer.valueOf(datoHorario[1]), idLibro,
				Integer.valueOf(datoSemana[1]));
		return listaPorSemana;
	}

	public List<SelectItem> getListaSemanas() {
		CicloControlDao cDao = new CicloControlDaoImp();
		List<String> lista = cDao.listarSemanas();
		for (int i = 0; i < lista.size(); i++) {
			SelectItem sem = new SelectItem(lista.get(i));
			this.listaSemanas.add(sem);
		}

		return listaSemanas;
	}

	public List<SelectItem> getListaLibros() {
		LibroDao lDao = new LibroDaoImp();
		List<Integer> lista = lDao.listaDeLisbros();
		for (int i = 0; i < lista.size(); i++) {
			SelectItem lib = new SelectItem(lista.get(i));
			this.listaLibros.add(lib);

		}
		return listaLibros;
	}

	public List<SelectItem> getListaHorarios() {
		HorarioDao hDao = new HorarioDaoImp();
		List<String> lista = hDao.listaDeHorarios();
		for (int i = 0; i < lista.size(); i++) {
			SelectItem hor = new SelectItem(lista.get(i));
			this.listaHorarios.add(hor);
		}
		return listaHorarios;
	}

}
