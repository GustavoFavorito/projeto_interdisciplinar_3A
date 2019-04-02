package br.com.usjt.mediacenter.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Conteudo")
public class Conteudo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@OneToMany(cascade=CascadeType.ALL, mappedBy="conteudo")
	private List<Tag> tagId;
	
	@OneToMany(cascade=CascadeType.ALL, mappedBy="conteudo")
	private List<Arquivo> arquivoId;
	
	@ManyToMany(mappedBy = "listaConteudos") 
	private List<Usuario> usuarioInclusaoId;
	
	@ManyToMany(mappedBy = "listaConteudos") 
	private List<Categoria> categoriaId;
	
	@OneToOne(cascade=CascadeType.ALL)
	private NivelAcesso nivelAcessoId;
	
	@OneToOne(cascade=CascadeType.ALL)
	private Procedencia procedenciaId;
	
	@OneToMany(cascade=CascadeType.ALL, mappedBy="conteudo")
	private List<FeedBack> listaFeedback;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public List<Tag> getTagId() {
		return tagId;
	}

	public void setTagId(List<Tag> tagId) {
		this.tagId = tagId;
	}

	public List<Arquivo> getArquivoId() {
		return arquivoId;
	}

	public void setArquivoId(List<Arquivo> arquivoId) {
		this.arquivoId = arquivoId;
	}

	public List<Usuario> getUsuarioInclusaoId() {
		return usuarioInclusaoId;
	}

	public void setUsuarioInclusaoId(List<Usuario> usuarioInclusaoId) {
		this.usuarioInclusaoId = usuarioInclusaoId;
	}

	public List<Categoria> getCategoriaId() {
		return categoriaId;
	}

	public void setCategoriaId(List<Categoria> categoriaId) {
		this.categoriaId = categoriaId;
	}

	public NivelAcesso getNivelAcessoId() {
		return nivelAcessoId;
	}

	public void setNivelAcessoId(NivelAcesso nivelAcessoId) {
		this.nivelAcessoId = nivelAcessoId;
	}

	public Procedencia getProcedenciaId() {
		return procedenciaId;
	}

	public void setProcedenciaId(Procedencia procedenciaId) {
		this.procedenciaId = procedenciaId;
	}

	public List<FeedBack> getListaFeedback() {
		return listaFeedback;
	}

	public void setListaFeedback(List<FeedBack> listaFeedback) {
		this.listaFeedback = listaFeedback;
	}
	
}
