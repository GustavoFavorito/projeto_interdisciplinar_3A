package br.com.usjt.mediacenter.dao;

import java.util.List;

import br.com.usjt.mediacenter.model.Tag;

public interface TagDao {
	
	void cadastrar(Tag tag);
	
	List<Tag> findAll();

}
