package br.com.usjt.mediacenter.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.usjt.mediacenter.service.CategoriaService;
import br.com.usjt.mediacenter.service.TagService;

@Controller
@RequestMapping("noticia")
public class NoticiaController {

	@Autowired
	private TagService tagService;

	@Autowired
	private CategoriaService categoriaService;

	@RequestMapping("/nova")
	public ModelAndView montarNovaNoticia(ModelMap model) {
		model.addAttribute("categorias", categoriaService.buscarTodos());
		model.addAttribute("tags", tagService.buscarTodasTag());

		return new ModelAndView("/noticia/criar_noticia", model);
	}

	@RequestMapping("/logar")
	public ModelAndView Logar() {
//		model.addAttribute("categorias", categoriaService.buscarTodos());
//		model.addAttribute("tags", tagService.buscarTodasTag());

		return new ModelAndView("/login/login");
	}

}
