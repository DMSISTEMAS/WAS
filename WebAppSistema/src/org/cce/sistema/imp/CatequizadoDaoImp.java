package org.cce.sistema.imp;

import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import org.cce.sistema.dao.CatequizadoDao;
import org.cce.sistema.model.Catequizado;
import org.cce.sistema.util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class CatequizadoDaoImp implements CatequizadoDao {

	@SuppressWarnings("unchecked")
	@Override
	public List<Catequizado> lista() {
		List<Catequizado> lista = null;
		Session session = HibernateUtil.getSf().openSession();
		Transaction t = session.beginTransaction();
		try {
			lista = session.createQuery("FROM Catequizado").list();
			t.commit();
			session.close();
		} catch (HibernateException e) {
			System.err.println(e.getMessage());
			t.rollback();
		}
		return lista;
	}

	@Override
	public void guardar(Catequizado catequizado) {
		Session session = null;
		try {
			session = HibernateUtil.getSf().openSession();
			session.beginTransaction();
			session.save(catequizado);
			session.getTransaction().commit();
			FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage(FacesMessage.SEVERITY_INFO, "CCE", "Registro agregado"));
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
	public void actualizar(Catequizado catequizado) {
		Session session = null;
		try {
			session = HibernateUtil.getSf().openSession();
			session.beginTransaction();
			session.update(catequizado);
			session.getTransaction().commit();
			FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage(FacesMessage.SEVERITY_INFO, "CCE", "Registro actualizado"));
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
	public void borrar(Catequizado catequizado) {
		Session session = null;
		try {
			session = HibernateUtil.getSf().openSession();
			session.beginTransaction();
			session.delete(catequizado);
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

	@SuppressWarnings("unchecked")
	@Override
	public List<String> listarCatequizado(String nombre) {
		 List<String> lista = null;
	        Session session = HibernateUtil.getSf().openSession();
	        Transaction t = session.beginTransaction();
	        String hql = "SELECT DISTINCT nombre || ' ' || apellidoPaterno || ' ' || apellidoMaterno || '_' || idCatequizado FROM Catequizado WHERE nombre LIKE'" + nombre +"%'";
	        try {
	            lista = session.createQuery(hql).list();
	            t.commit();
	            session.close();
	        } catch (HibernateException e) {
	            t.rollback();
	        }
	        return lista;
	}

}
