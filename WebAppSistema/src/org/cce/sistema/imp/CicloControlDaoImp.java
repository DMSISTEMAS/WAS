package org.cce.sistema.imp;

import java.util.List;

import javax.faces.context.FacesContext;

import org.cce.sistema.dao.CicloControlDao;
import org.cce.sistema.model.Bitacora;
import org.cce.sistema.model.Usuario;
import org.cce.sistema.util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class CicloControlDaoImp implements CicloControlDao {
	Usuario us = (Usuario) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("usuario");

	@SuppressWarnings("unchecked")
	@Override
	public List<Bitacora> listaBitacora() {
		List<Bitacora> lista = null;
		Session session = HibernateUtil.getSf().openSession();
		Transaction t = session.beginTransaction();
		try {
			lista = session.createQuery("FROM Bitacora").list();
			t.commit();
			session.close();
		} catch (HibernateException e) {
			System.err.println(e.getMessage());
			t.rollback();
		}
		return lista;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Bitacora> listarPorSemana(int idHorario, int idLibro, int noSemana) {
		List<Bitacora> lista = null;
		Session session = HibernateUtil.getSf().openSession();
		Transaction t = session.beginTransaction();
		try {
			lista = session.createQuery("FROM Bitacora AS ciclo WHERE ciclo.registro.horario.idHorario='" + idHorario
					+ "' " + "AND ciclo.registro.libro.idLibro='" + idLibro + "' AND semana='" + noSemana + "' "
					+ "AND ciclo.registro.catequista.idCatequista='" + us.getIdCatequista()
					+ "' AND ciclo.registro.catequizado.estado='Alta'").list();
			t.commit();
			session.close();
		} catch (HibernateException e) {
			System.err.println(e.getMessage());
			t.rollback();
		}
		return lista;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<String> listarSemanas() {
		List<String> lista = null;
		Session session = HibernateUtil.getSf().openSession();
		Transaction t = session.beginTransaction();
		try {
			lista = session
					.createQuery("SELECT DISTINCT fecha|| '_' || semana FROM Bitacora WHERE registro.catequista='"
							+ us.getIdCatequista() + "' ")
					.list();
			t.commit();
			session.close();
		} catch (HibernateException e) {
			System.err.println(e.getMessage());
			t.rollback();
		}
		return lista;
	}

}
