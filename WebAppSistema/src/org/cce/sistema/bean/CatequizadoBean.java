package org.cce.sistema.bean;

import java.io.IOException;
import java.io.Serializable;
import java.nio.file.Path;
import java.util.List;

import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import javax.servlet.ServletContext;

import org.cce.sistema.dao.CatequizadoDao;
import org.cce.sistema.imp.CatequizadoDaoImp;
import org.cce.sistema.model.Catequizado;
import org.primefaces.context.RequestContext;
import org.primefaces.model.UploadedFile;

@Named("catequizado")
@ViewScoped
public class CatequizadoBean implements Serializable {

	private static final long serialVersionUID = 1L;
	private Catequizado catequizado;
	private Catequizado actualizarCatequizado;
	private List<Catequizado> listaCatequizado;
	private UploadedFile file;
	private Path to;

	public CatequizadoBean() {
		this.catequizado = new Catequizado();
		this.actualizarCatequizado = new Catequizado();
	}

	public Catequizado getCatequizado() {
		return catequizado;
	}

	public void setCatequizado(Catequizado catequizado) {
		this.catequizado = catequizado;
	}

	public UploadedFile getFile() {
		return file;
	}

	public void setFile(UploadedFile file) {
		this.file = file;
	}

	public Path getTo() {
		return to;
	}

	public void setTo(Path to) {
		this.to = to;
	}

	public Catequizado getActualizarCatequizado() {
		return actualizarCatequizado;
	}

	public void setActualizarCatequizado(Catequizado actualizarCatequizado) {
		this.actualizarCatequizado = actualizarCatequizado;
	}

	public List<Catequizado> getListaCatequizado() {
		CatequizadoDao cDao = new CatequizadoDaoImp();
		listaCatequizado = cDao.lista();
		return listaCatequizado;
	}

	public void guardar() throws IOException {
		CatequizadoDao cDao = new CatequizadoDaoImp();
//		String fi = file.getFileName();
//		String nota = file.
//		System.out.println(fi);
//		File f = new File("/home/dmsistemas/Descargas/dnate.png");
//		@SuppressWarnings("resource")
//		InputStream is = new FileInputStream(file.getContents());
//		byte[] buffer = new byte[(int) f.length()];
//		int leer = is.read(buffer);
		catequizado.setFoto(file.getContents());
		cDao.guardar(catequizado);
		RequestContext.getCurrentInstance().update("frmPrincipal");
		RequestContext.getCurrentInstance().execute("PF('dlgAgregar').hide()");
		this.catequizado = new Catequizado();
	}

	public void actualizar() {
		CatequizadoDao cDao = new CatequizadoDaoImp();
		cDao.actualizar(actualizarCatequizado);
		// catequizado = new Catequizado();
	}

	public void imprimirDetalle(String idReg) {
		DetalleAlumno credencial = new DetalleAlumno();
		FacesContext facesContext = FacesContext.getCurrentInstance();
		ServletContext servletContext = (ServletContext) facesContext.getExternalContext().getContext();
		String ruta = servletContext.getRealPath("/QR/detalleAlumno.jasper");
		credencial.getCredencial(ruta, idReg);
		FacesContext.getCurrentInstance().responseComplete();
	}

}
