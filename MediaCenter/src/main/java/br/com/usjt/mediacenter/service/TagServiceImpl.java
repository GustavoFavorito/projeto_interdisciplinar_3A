package br.com.usjt.mediacenter.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.usjt.mediacenter.dao.TagDao;
import br.com.usjt.mediacenter.model.Tag;

@Service
public class TagServiceImpl implements TagService {
	
	@Autowired
	private TagDao tagDao;

	@Override
	public void salvarTag(Tag tag) {
		tagDao.cadastrar(tag);
	}

	@Override
	public List<Tag> buscarTodasTag() {
		return tagDao.findAll();
	}

}
