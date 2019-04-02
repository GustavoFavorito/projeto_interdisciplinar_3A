package br.com.usjt.mediacenter.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.NotBlank;

@Entity
@Table(name="Categoria")
public class Categoria {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long categoriaId;
	
	@NotBlank
	@Size(min = 2, max = 255)
	@Column(name="categoria_descricao", length=255)
	private String descricao;
	
	@ManyToMany(cascade=CascadeType.ALL)
	private List<Conteudo> listaConteudos;

	
	public List<Conteudo> getListaConteudos() {
		return listaConteudos;
	}

	public void setListaConteudos(List<Conteudo> listaConteudos) {
		this.listaConteudos = listaConteudos;
	}

	public long getCategoriaId() {
		return categoriaId;
	}

	public void setCategoriaId(long categoriaId) {
		this.categoriaId = categoriaId;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
}
