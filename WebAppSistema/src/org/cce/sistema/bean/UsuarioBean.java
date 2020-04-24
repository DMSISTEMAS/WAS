package org.cce.sistema.bean;

import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.inject.Named;

import org.cce.sistema.dao.UsuarioDao;
import org.cce.sistema.imp.UsuarioDaoImp;
import org.cce.sistema.model.Usuario;
import org.primefaces.context.RequestContext;

import java.io.IOException;
import java.io.Serializable;

@Named("usuario")
@SessionScoped
public class UsuarioBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private Usuario usuario;

	public UsuarioBean() {
		this.usuario = new Usuario();
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public void login() throws IOException {
		RequestContext context = RequestContext.getCurrentInstance();
		FacesMessage message = null;
		boolean loggedIn = false;
		String ruta = "";

		UsuarioDao uDao = new UsuarioDaoImp();
		this.usuario = uDao.login(this.usuario);

		if (this.usuario != null) {
			loggedIn = true;
			FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("usuario", this.usuario);
			message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Bienvenido", this.usuario.getNombre());
			switch (this.usuario.getPerfil()) {
			case "Administrador":
				ruta = "/Views/Control.sys";
				break;
			case "Usuario":
				ruta = "/Views/Control.sys";
				break;
			default:
				ruta = "/Views/Control.sys";
				break;
			}

		} else {
			loggedIn = false;

			message = new FacesMessage(FacesMessage.SEVERITY_WARN, "!Error de sesión!",
					"Usuario o password incorrectos...");
			FacesContext.getCurrentInstance().addMessage(null, message);
			this.usuario = new Usuario();

		}
		FacesContext.getCurrentInstance().addMessage(null, message);
		context.addCallbackParam("loggedIn", loggedIn);
		ExternalContext con = FacesContext.getCurrentInstance().getExternalContext();
		con.redirect(ruta);
	}

	public void cerrarSesion() {
		FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
	}

}
