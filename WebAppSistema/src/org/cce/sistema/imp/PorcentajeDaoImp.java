package org.cce.sistema.imp;

import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import org.cce.sistema.dao.PorcentajeDao;
import org.cce.sistema.model.Porcentaje;
import org.cce.sistema.util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class PorcentajeDaoImp implements PorcentajeDao {

	@SuppressWarnings("unchecked")
	@Override
	public List<Porcentaje> lista() {
		List<Porcentaje> lista = null;
		Session session = HibernateUtil.getSf().openSession();
		Transaction t = session.beginTransaction();
		try {
			lista = session.createQuery("FROM Porcentaje").list();
			t.commit();
			session.close();
		} catch (HibernateException e) {
			System.err.println(e.getMessage());
			t.rollback();
		}
		return lista;
	}

	@Override
	public void guardar(Porcentaje porcentaje) {
		Session session = null;
		try {
			session = HibernateUtil.getSf().openSession();
			session.beginTransaction();
			session.save(porcentaje);
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
	public void actualizar(Porcentaje porcentaje) {
		Session session = null;
		try {
			session = HibernateUtil.getSf().openSession();
			session.beginTransaction();
			session.update(porcentaje);
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
	public void borrar(Porcentaje porcentaje) {
		Session session = null;
		try {
			session = HibernateUtil.getSf().openSession();
			session.beginTransaction();
			session.delete(porcentaje);
			session.getTransaction().commit();
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
