package br.com.usjt.mediacenter.dao;

import java.util.List;

import br.com.usjt.mediacenter.model.Conteudo;
import br.com.usjt.mediacenter.model.Usuario;

public interface UsuarioDao {
	
	void salvar(Usuario usuario);
	
	void update(Usuario usuario);
	
	void delete(long id);
	
	Usuario findById(long id);
	
	List<Usuario> findAll();
	
	Usuario findUsuarioByConteudo(Conteudo conteudo);
	
	Usuario findUsuarioByNome(String nome);

}
