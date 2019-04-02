package br.com.usjt.mediacenter.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import br.com.usjt.mediacenter.model.Categoria;

@Repository
public class CategoriaDaoImpl implements CategoriaDao {
	
	@PersistenceContext
	private EntityManager entity;

	@Override
	public void salvar(Categoria categoria) {
		// TODO Auto-generated method stub
	}

	@Override
	public void update(Categoria categoria) {
		// TODO Auto-generated method stub
	}

	@Override
	public List<Categoria> findAll() {
		return entity.createQuery("SELECT c FROM Categoria c", Categoria.class).getResultList();
	}

}
