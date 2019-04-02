package br.com.usjt.mediacenter.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.usjt.mediacenter.dao.TipoUsuarioDao;
import br.com.usjt.mediacenter.dao.UsuarioDao;
import br.com.usjt.mediacenter.model.Usuario;

@Service
public class UsuarioServiceImpl implements UsuarioService{
	
	@Autowired
	private UsuarioDao usuarioDao;
	
	@Autowired
	private TipoUsuarioDao tipoUsuarioDao;

	@Override
	public void salvar(Usuario usuario) throws Exception {
		Usuario usuarioCadastrado = usuarioDao.findUsuarioByNome(usuario.getNome());
		
		if(usuarioCadastrado == null) {
			//Quando colocar combo na tela, retirar essa linha
			usuario.setTipoUsuarioId(tipoUsuarioDao.buscarTipoUsuario(2));
			usuarioDao.salvar(usuario);
		} else {
			throw new Exception("Usuario ja cadastrado");
		}
		
	}

	@Override
	public void alterar(Usuario usuario) {
		usuarioDao.update(usuario);
		
	}

	@Override
	public void deletar(long id) {
		usuarioDao.delete(id);
		
	}

	@Override
	public List<Usuario> buscarTodos() {
		return usuarioDao.findAll();
	}

	@Override
	public Usuario logar(String nome, String senha) throws Exception {
		Usuario usuarioLogar = usuarioDao.findUsuarioByNome(nome);
		if (usuarioLogar.getSenha().equals(senha)) {
			return usuarioLogar;
		} else {
			throw new Exception("Usuario ja cadastrado");
		}
	}

}
