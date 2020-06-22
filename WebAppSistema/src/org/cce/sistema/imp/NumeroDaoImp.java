package org.cce.sistema.imp;

import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import org.cce.sistema.dao.NumeroDao;
import org.cce.sistema.model.Numero;
import org.cce.sistema.util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class NumeroDaoImp implements NumeroDao {

	@SuppressWarnings("unchecked")
	@Override
	public List<Numero> lista() {
		List<Numero> lista = null;
		Session session = HibernateUtil.getSf().openSession();
		Transaction t = session.beginTransaction();
		try {
			lista = session.createQuery("FROM Numero").list();
			t.commit();
			session.close();
		} catch (HibernateException e) {
			System.err.println(e.getMessage());
			t.rollback();
		}
		return lista;
	}

	@Override
	public void guardar(Numero numero) {
		Session session = null;
		try {
			session = HibernateUtil.getSf().openSession();
			session.beginTransaction();
			session.save(numero);
			session.getTransaction().commit();
			FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage(FacesMessage.SEVERITY_INFO, "CCE", "Registro guardado con éxito"));
		} catch (HibernateException e) {
			System.err.println(e.getMessage());
			session.getTransaction().rollback();
		} finally {
			if (session != null) {
				session.close();
			}
		}

	}

	@Override
	public void actualizar(Numero numero) {
		Session session = null;
		try {
			session = HibernateUtil.getSf().openSession();
			session.beginTransaction();
			session.update(numero);
			session.getTransaction().commit();
			FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage(FacesMessage.SEVERITY_INFO, "CCE", "Registro actualizado con éxito"));
		} catch (HibernateException e) {
			System.err.println(e.getMessage());
			session.getTransaction().rollback();
		} finally {
			if (session != null) {
				session.close();
			}
		}

	}

	@Override
	public void borrar(Numero numero) {
		Session session = null;
		try {
			session = HibernateUtil.getSf().openSession();
			session.beginTransaction();
			session.delete(numero);
			session.getTransaction().commit();
			FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage(FacesMessage.SEVERITY_INFO, "CCE", "Registro borrado con éxito"));
		} catch (HibernateException e) {
			System.err.println(e.getMessage());
			session.getTransaction().rollback();
		} finally {
			if (session != null) {
				session.close();
			}
		}

	}

}
