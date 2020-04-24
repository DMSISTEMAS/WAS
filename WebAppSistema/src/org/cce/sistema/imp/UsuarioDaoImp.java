package org.cce.sistema.imp;

import java.util.List;

import org.cce.sistema.dao.UsuarioDao;
import org.cce.sistema.model.Usuario;
import org.cce.sistema.sha.Mask;
import org.cce.sistema.util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class UsuarioDaoImp implements UsuarioDao {
	@Override
	public Usuario obtenerDatos(Usuario usuario) {
		Session session = HibernateUtil.getSf().openSession();
		String hql = "FROM Usuario WHERE nickname=:nickname";
		Query<?> q = session.createQuery(hql);
		q.setParameter("nickname", usuario.getNickname());
		return (Usuario) q.uniqueResult();

	}

	@Override
	public Usuario login(Usuario usuario) {
		Usuario user = this.obtenerDatos(usuario);
		if (user != null) {
			if (!user.getContrasena().equals(Mask.algorithm(usuario.getContrasena()))) {
				user = null;
			}
		}
		return user;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Usuario> listaUsuarios() {
		List<Usuario> lista = null;
		Session session = HibernateUtil.getSf().openSession();
		Transaction t = session.beginTransaction();
		try {
			lista = session.createQuery("FROM Usuario").list();
			t.commit();
			session.close();
		} catch (HibernateException e) {
			System.err.println(e.getMessage());
			t.rollback();
		}
		return lista;
	}

	@Override
	public void guardar(Usuario usuario) {
		Session session = null;
		try {
			session = HibernateUtil.getSf().openSession();
			session.beginTransaction();
			session.save(usuario);
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
	public void actualizar(Usuario usuario) {
		Session session = null;
		try {
			session = HibernateUtil.getSf().openSession();
			session.beginTransaction();
			session.update(usuario);
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
	public void borrar(Usuario usuario) {
		Session session = null;
		try {
			session = HibernateUtil.getSf().openSession();
			session.beginTransaction();
			session.delete(usuario);
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
