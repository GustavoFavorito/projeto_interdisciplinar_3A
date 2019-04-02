package br.com.usjt.mediacenter.dao;

import java.util.List;

import br.com.usjt.mediacenter.model.Categoria;

public interface CategoriaDao {

	void salvar(Categoria categoria);

	void update(Categoria categoria);

	List<Categoria> findAll();

}
