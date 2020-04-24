package org.cce.sistema.imp;

import java.util.List;

import javax.faces.context.FacesContext;

import org.cce.sistema.dao.HorarioDao;
import org.cce.sistema.model.Horario;
import org.cce.sistema.model.Usuario;
import org.cce.sistema.util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class HorarioDaoImp implements HorarioDao {
	Usuario us = (Usuario) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("usuario");

	@SuppressWarnings("unchecked")
	@Override
	public List<Horario> lista() {
		List<Horario> lista = null;
		Session session = HibernateUtil.getSf().openSession();
		Transaction t = session.beginTransaction();
		try {
			lista = session.createQuery("FROM Horario").list();
			t.commit();
			session.close();
		} catch (HibernateException e) {
			System.err.println(e.getMessage());
			t.rollback();
		}
		return lista;
	}

	@Override
	public void guardar(Horario horario) {
		Session session = null;
		try {
			session = HibernateUtil.getSf().openSession();
			session.beginTransaction();
			session.save(horario);
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

	@Override
	public void actualizar(Horario horario) {
		Session session = null;
		try {
			session = HibernateUtil.getSf().openSession();
			session.beginTransaction();
			session.update(horario);
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

	@Override
	public void borrar(Horario horario) {
		Session session = null;
		try {
			session = HibernateUtil.getSf().openSession();
			session.beginTransaction();
			session.delete(horario);
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
	public List<String> listarHorario(String nombre) {
		List<String> lista = null;
		Session session = HibernateUtil.getSf().openSession();
		Transaction t = session.beginTransaction();
		String hql = "SELECT DISTINCT dia || ' ' || horaInicio || ' ' || horaFin || '_' || idHorario FROM Horario WHERE dia LIKE'"
				+ nombre + "%'";
		try {
			lista = session.createQuery(hql).list();
			t.commit();
			session.close();
		} catch (HibernateException e) {
			t.rollback();
		}
		return lista;
	}

	@Override
	public Horario listaHorarioId(int id) {
		Session session = HibernateUtil.getSf().openSession();
		String hql = "FROM Horario WHERE idHorario=:idHorario";
		Query<?> q = session.createQuery(hql);
		q.setParameter("idHorario", id);
		return (Horario) q.uniqueResult();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<String> listaDeHorarios() {
		List<String> lista = null;
		Session session = HibernateUtil.getSf().openSession();
		Transaction t = session.beginTransaction();
		String hql = "SELECT DISTINCT registro.horario.dia || ' ' || registro.horario.horaInicio || ' ' || registro.horario.horaFin || '_' || registro.horario.idHorario  FROM Bitacora WHERE registro.catequista.idCatequista='"
				+ us.getIdCatequista() + "'";
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
