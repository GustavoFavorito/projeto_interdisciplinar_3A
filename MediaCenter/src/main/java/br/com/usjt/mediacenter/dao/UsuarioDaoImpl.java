package br.com.usjt.mediacenter.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import br.com.usjt.mediacenter.model.Conteudo;
import br.com.usjt.mediacenter.model.Usuario;

@Repository
public class UsuarioDaoImpl implements UsuarioDao {
	
	@PersistenceContext
	private EntityManager entity;

	@Override
	public void salvar(Usuario usuario) {
		
		entity.persist(usuario);
		
	}

	@Override
	public void update(Usuario usuario) {
		entity.merge(usuario);
		
	}

	@Override
	public void delete(long id) {
		entity.remove(findById(id));
	}

	@Override
	public Usuario findById(long id) {
		return entity.createQuery("select u from Usuario u "
				+ "where u.id = :usuarioId", Usuario.class)
				.setParameter("usuarioId", id).getSingleResult();
	}

	@Override
	public List<Usuario> findAll() {
		return entity.createQuery("SELECT u FROM Usuario u", Usuario.class).getResultList();
	}

	@Override
	public Usuario findUsuarioByConteudo(Conteudo conteudo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario findUsuarioByNome(String nome) {
		return entity.createQuery("select u from Usuario u "
				+ "where u.Nome = :nomeUsuario", Usuario.class)
				.setParameter("nomeUsuario", nome).getSingleResult();
	}

}
