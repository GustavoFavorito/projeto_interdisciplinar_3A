package br.com.usjt.mediacenter.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

@Entity
@Table(name = "Usuario")
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@NotBlank
	@Size(min = 2, max = 255)
	@Column(name = "nome", length = 255)
	private String nome;

	@NotBlank
	@Size(min = 2, max = 255)
	@Column(name = "senha", length = 255)
	private String senha;

	@NotBlank
	@Size(min = 2, max = 255)
	@Column(name = "email", length = 255)
	private String email;

	@OneToOne(cascade = CascadeType.ALL)
	private TipoUsuario tipoUsuarioId;

	@ManyToMany(cascade = CascadeType.ALL)
	private List<Conteudo> listaConteudos;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public TipoUsuario getTipoUsuarioId() {
		return tipoUsuarioId;
	}

	public void setTipoUsuarioId(TipoUsuario tipoUsuarioId) {
		this.tipoUsuarioId = tipoUsuarioId;
	}

	public List<Conteudo> getListaConteudos() {
		return listaConteudos;
	}

	public void setListaConteudos(List<Conteudo> listaConteudos) {
		this.listaConteudos = listaConteudos;
	}

}
