package org.cce.sistema.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import javax.servlet.ServletContext;

import org.cce.sistema.dao.CatequistaDao;
import org.cce.sistema.dao.CatequizadoDao;
import org.cce.sistema.dao.CicloDao;
import org.cce.sistema.dao.CicloRegDao;
import org.cce.sistema.dao.HorarioDao;
import org.cce.sistema.dao.LibroDao;
import org.cce.sistema.dao.ParroquiaDao;
import org.cce.sistema.dao.RegistroDao;
import org.cce.sistema.imp.CatequistaDaoImp;
import org.cce.sistema.imp.CatequizadoDaoImp;
import org.cce.sistema.imp.CicloDaoImp;
import org.cce.sistema.imp.CicloRegDaoImp;
import org.cce.sistema.imp.HorarioDaoImp;
import org.cce.sistema.imp.LibroDaoImp;
import org.cce.sistema.imp.ParroquiaDaoImp;
import org.cce.sistema.imp.RegistroDaoImp;
import org.cce.sistema.model.Catequista;
import org.cce.sistema.model.Catequizado;
import org.cce.sistema.model.Ciclo;
import org.cce.sistema.model.Bitacora;
import org.cce.sistema.model.Horario;
import org.cce.sistema.model.Libro;
import org.cce.sistema.model.Parroquia;
import org.cce.sistema.model.Registro;
import org.primefaces.context.RequestContext;

@Named("inscripcion")
@ViewScoped
public class InscripcionBean implements Serializable {

	private static final long serialVersionUID = 1L;
	private Registro registro;
	private List<Registro> listaRegistro;
	private Catequizado catequizado;
	private Libro libro;
	private Catequista catequista;
	private Horario horario;
	private Parroquia parroquia;
	private String nombreCatequizado;
	private String nombreCatequista;
	private String nombreLibro;
	private String nombreHorario;
	private String nombreParroquia;
	private String nombreCiclo;
	private List<String> maxVal;
	private Ciclo ciclo;
	private Calendar calendar = Calendar.getInstance();
	private Bitacora ciclo1920;
	private Registro regCredencial;

	public InscripcionBean() {
		this.registro = new Registro();
		this.listaRegistro = new ArrayList<>();
		this.catequizado = new Catequizado();
		this.libro = new Libro();
		this.catequista = new Catequista();
		this.horario = new Horario();
		this.parroquia = new Parroquia();
		this.maxVal = new ArrayList<>();
		this.ciclo = new Ciclo();
		this.ciclo1920 = new Bitacora();
		this.regCredencial = new Registro();

	}

	public Registro getRegistro() {
		return registro;
	}

	public void setRegistro(Registro registro) {
		this.registro = registro;
	}

	public Catequizado getCatequizado() {
		return catequizado;
	}

	public void setCatequizado(Catequizado catequizado) {
		this.catequizado = catequizado;
	}

	public Libro getLibro() {
		return libro;
	}

	public void setLibro(Libro libro) {
		this.libro = libro;
	}

	public Catequista getCatequista() {
		return catequista;
	}

	public void setCatequista(Catequista catequista) {
		this.catequista = catequista;
	}

	public Horario getHorario() {
		return horario;
	}

	public void setHorario(Horario horario) {
		this.horario = horario;
	}

	public Parroquia getParroquia() {
		return parroquia;
	}

	public void setParroquia(Parroquia parroquia) {
		this.parroquia = parroquia;
	}

	public String getNombreCatequizado() {
		return nombreCatequizado;
	}

	public void setNombreCatequizado(String nombreCatequizado) {
		this.nombreCatequizado = nombreCatequizado;
	}

	public String getNombreCatequista() {
		return nombreCatequista;
	}

	public void setNombreCatequista(String nombreCatequista) {
		this.nombreCatequista = nombreCatequista;
	}

	public String getNombreLibro() {
		return nombreLibro;
	}

	public void setNombreLibro(String nombreLibro) {
		this.nombreLibro = nombreLibro;
	}

	public String getNombreHorario() {
		return nombreHorario;
	}

	public void setNombreHorario(String nombreHorario) {
		this.nombreHorario = nombreHorario;
	}

	public String getNombreParroquia() {
		return nombreParroquia;
	}

	public void setNombreParroquia(String nombreParroquia) {
		this.nombreParroquia = nombreParroquia;
	}

	public List<String> getMaxVal() {
		return maxVal;
	}

	public String getNombreCiclo() {
		return nombreCiclo;
	}

	public void setNombreCiclo(String nombreCiclo) {
		this.nombreCiclo = nombreCiclo;
	}

	public Ciclo getCiclo() {
		return ciclo;
	}

	public void setCiclo(Ciclo ciclo) {
		this.ciclo = ciclo;
	}

	public Calendar getCalendar() {
		return calendar;
	}

	public void setCalendar(Calendar calendar) {
		this.calendar = calendar;
	}

	public Bitacora getCiclo1920() {
		return ciclo1920;
	}

	public void setCiclo1920(Bitacora ciclo1920) {
		this.ciclo1920 = ciclo1920;
	}


	public Registro getRegCredencial() {
		return regCredencial;
	}

	public void setRegCredencial(Registro regCredencial) {
		this.regCredencial = regCredencial;
	}

	public List<Registro> getListaRegistro() {
		RegistroDao rDao = new RegistroDaoImp();
		this.listaRegistro = rDao.lista();
		return listaRegistro;
	}

	public List<String> completeCatequizado(String nombre) {
		List<String> resultNombre = new ArrayList<>();
		CatequizadoDao cDao = new CatequizadoDaoImp();
		resultNombre = cDao.listarCatequizado(nombre);
		return resultNombre;
	}

	public List<String> completeCatequista(String nombre) {
		List<String> resultNombre = new ArrayList<>();
		CatequistaDao cDao = new CatequistaDaoImp();
		resultNombre = cDao.listarCatequista(nombre);
		return resultNombre;
	}

	public List<String> completeLibro(String nombre) {
		List<String> resultNombre = new ArrayList<>();
		LibroDao lDao = new LibroDaoImp();
		resultNombre = lDao.listarLibro(nombre);
		return resultNombre;
	}

	public List<String> completeHorario(String nombre) {
		List<String> resultNombre = new ArrayList<>();
		HorarioDao hDao = new HorarioDaoImp();
		resultNombre = hDao.listarHorario(nombre);
		return resultNombre;
	}

	public List<String> completeParroquia(String nombre) {
		List<String> resultNombre = new ArrayList<>();
		ParroquiaDao pDao = new ParroquiaDaoImp();
		resultNombre = pDao.listarParroquia(nombre);
		return resultNombre;
	}

	public List<String> completeCiclo(String nombre) {
		List<String> resultNombre = new ArrayList<>();
		CicloDao cDao = new CicloDaoImp();
		resultNombre = cDao.listarCiclo(nombre);
		return resultNombre;
	}

	public void guardarRegistro() {
		RegistroDao rDao = new RegistroDaoImp();

		// COLOCAMOS EL ID DEL CATEQUIZADO
		String[] nCat;
		nCat = this.nombreCatequizado.split("_");
		this.catequizado.setIdCatequizado(Integer.parseInt(nCat[1]));
		this.registro.setCatequizado(catequizado);

		// COLOCAMOS EL ID DEL CATEQUISTA
		String[] cate;
		cate = this.nombreCatequista.split("_");
		this.catequista.setIdCatequista(Integer.parseInt(cate[1]));
		this.registro.setCatequista(catequista);

		// COLOCAMOS EL ID DEL LIBRO
		String[] libr;
		libr = this.nombreLibro.split("_");
		this.libro.setIdLibro(Integer.parseInt(libr[1]));
		this.registro.setLibro(libro);

		// COLOCAMOS EL ID DEL HORARIO
		String[] hor;
		hor = this.nombreHorario.split("_");
		this.horario.setIdHorario(Integer.parseInt(hor[1]));
		this.registro.setHorario(horario);

		// COLOCAMOS EL ID DE LA PARROQUIA
		String[] parr;
		parr = this.nombreParroquia.split("_");
		this.parroquia.setIdParroquia(Integer.parseInt(parr[1]));
		this.registro.setParroquia(parroquia);

		// COLOCAMOS EL ID DEL CICLO
		String[] cic;
		cic = this.nombreCiclo.split("_");
		this.ciclo.setIdCiclo(Integer.parseInt(cic[1]));
		this.registro.setCiclo(ciclo);

		// GUARDAR EN LA TABLA REGISTRO
		rDao.guardar(registro);

		// OBTENEMOS EL MAXIMO VALOR DEL REGISTRO INSERTADO
		RegistroDao rMax = new RegistroDaoImp();
		String f = rMax.obtenerMaxValor().toString().replace("[", "").trim().replace("]", "").trim();

		// LIMPIAMOS EL OBJETO REGISTRO
		this.registro = new Registro();
		this.registro.setIdRegistro(Integer.parseInt(f));

		// VALIDAMOS EL CICLO PARA GUARDARLO EN LA TABLA CORRESPONDIENTE
		if (nombreCiclo.contains("2019-2020")) {
			CicloRegDao cRegDao = new CicloRegDaoImp();
			this.ciclo1920.setRegistro(registro);
			for (int i = 0; i <= 52; i++) {
				this.ciclo1920.setSemana(i + 1);
				buscarFecha(Integer.parseInt(hor[1]), i);
				cRegDao.guardar(ciclo1920);
				calendar.clear();
			}


		}

		// LIMPIAMOS LOS OBJETOS
		this.registro = new Registro();
		RequestContext.getCurrentInstance().execute("PF('dlgAgregar').hide()");
		RequestContext.getCurrentInstance().update("frmPrincipal");

	}

	public void buscarFecha(int id, int cont) {
		// BUSCAMOS LA FECHA DE INICIO DE CICLO EN LA TABLA HORARIO
		HorarioDao horarioDao = new HorarioDaoImp();
		Horario h = new Horario();
		h = horarioDao.listaHorarioId(id);
		calendar.setTime(h.getInicioCiclo());
		calendar.add(Calendar.DATE, 7 * cont);
		Date date = new Date();
		date = calendar.getTime();
		this.ciclo1920.setFecha(date);
	}

	public void imprimirCredencial(String idReg) {
		Credencial credencial = new Credencial();
		FacesContext facesContext = FacesContext.getCurrentInstance();
		ServletContext servletContext = (ServletContext) facesContext.getExternalContext().getContext();
		String ruta = servletContext.getRealPath("/QR/credencial.jasper");
		credencial.getCredencial(ruta, idReg);
		FacesContext.getCurrentInstance().responseComplete();
	}

}
