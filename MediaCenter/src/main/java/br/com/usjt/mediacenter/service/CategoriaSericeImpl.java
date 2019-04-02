package br.com.usjt.mediacenter.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.usjt.mediacenter.dao.CategoriaDao;
import br.com.usjt.mediacenter.model.Categoria;


@Service
public class CategoriaSericeImpl implements CategoriaService {
	
	@Autowired
	private CategoriaDao categoriaDao;

	@Override
	public void salvarCategoria(Categoria categoria) {
		categoriaDao.salvar(categoria);

	}

	@Override
	public List<Categoria> buscarTodos() {
		
		return categoriaDao.findAll();
		
	}

}
