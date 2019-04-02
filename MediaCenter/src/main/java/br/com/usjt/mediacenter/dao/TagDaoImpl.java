package br.com.usjt.mediacenter.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import br.com.usjt.mediacenter.model.Tag;

@Repository
public class TagDaoImpl implements TagDao {
	
	@PersistenceContext
	private EntityManager entity;

	@Override
	public void cadastrar(Tag tag) {
		entity.persist(tag);
	}

	@Override
	public List<Tag> findAll() {
		
		return entity.createQuery("SELECT t FROM Tag t", Tag.class).getResultList();
		
	}

}
