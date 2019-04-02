package br.com.usjt.mediacenter.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import br.com.usjt.mediacenter.model.TipoUsuario;

@Repository
public class TipoUsuarioDaoImpl implements TipoUsuarioDao {

	@PersistenceContext
	private EntityManager entity;
	
	@Override
	public TipoUsuario buscarTipoUsuario(int codigo) {
		return entity.createQuery("select tu from TipoUsuario tu "
				+ "where u.id = :usuarioId", TipoUsuario.class)
				.setParameter("usuarioId", codigo).getSingleResult();
	}

}
