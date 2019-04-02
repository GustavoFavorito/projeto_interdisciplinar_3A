package br.com.usjt.mediacenter.service;

import java.util.List;

import br.com.usjt.mediacenter.model.Usuario;

public interface UsuarioService {
	
	void salvar(Usuario usuario) throws Exception;
	
	void alterar(Usuario usuario);
	
	void deletar(long id);
	
	List<Usuario> buscarTodos();
	
	Usuario logar(String nome, String senha)  throws Exception ;
	
}
