package br.com.usjt.mediacenter.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

@Entity
@Table(name="Arquivo")
public class Arquivo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotBlank
	@Size(min = 2, max = 255)
	@Column(name="extensao", length=255)
	private String extensao;
	
	@NotBlank
	@Size(min = 2, max = 255)
	@Column(name="caminho", length=255)
	private String caminho;
	
	@NotBlank
	@Size(min = 2, max = 255)
	@Column(name="nome", length=255)
	private String nome;
	
	@OneToOne(cascade=CascadeType.ALL)
	private TipoArquivo tipoArquivoId;
	
	@ManyToOne
	@JoinColumn(name="conteudo_id")
	private Conteudo conteudo;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getExtensao() {
		return extensao;
	}

	public void setExtensao(String extensao) {
		this.extensao = extensao;
	}

	public String getCaminho() {
		return caminho;
	}

	public void setCaminho(String caminho) {
		this.caminho = caminho;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public TipoArquivo getTipoArquivoId() {
		return tipoArquivoId;
	}

	public void setTipoArquivoId(TipoArquivo tipoArquivoId) {
		this.tipoArquivoId = tipoArquivoId;
	}

	public Conteudo getConteudo() {
		return conteudo;
	}

	public void setConteudo(Conteudo conteudo) {
		this.conteudo = conteudo;
	}

}
