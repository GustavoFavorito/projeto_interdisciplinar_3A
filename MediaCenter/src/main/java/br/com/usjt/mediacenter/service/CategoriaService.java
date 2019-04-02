package br.com.usjt.mediacenter.service;

import java.util.List;

import br.com.usjt.mediacenter.model.Categoria;

public interface CategoriaService {
	
	void salvarCategoria(Categoria categoria);
	
	List<Categoria> buscarTodos();

}
