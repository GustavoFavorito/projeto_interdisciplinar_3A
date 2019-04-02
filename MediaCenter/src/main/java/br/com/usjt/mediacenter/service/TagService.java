package br.com.usjt.mediacenter.service;

import java.util.List;

import br.com.usjt.mediacenter.model.Tag;

public interface TagService {
	
	void salvarTag(Tag tag);
	
	List<Tag> buscarTodasTag();

}
