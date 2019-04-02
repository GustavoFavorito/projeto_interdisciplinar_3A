package br.com.usjt.mediacenter.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.usjt.mediacenter.model.Usuario;
import br.com.usjt.mediacenter.service.UsuarioService;

@Controller
@RequestMapping("login")
public class LoginController {
	
	@Autowired
	private UsuarioService usuarioService;

//	@GetMapping(value = {"/login", "/"})
//	public ModelAndView login(){
//		ModelAndView mv = new ModelAndView("login");
//		mv.addObject(new Usuario());
//		return mv;
//	}
	
	@PostMapping("/salvar")
	public String salvar(@Valid @ModelAttribute("usuario") Usuario usuario, BindingResult result, RedirectAttributes attr) {
		if(result.hasErrors()) {
			return "login/login";
		}
		try {
			usuarioService.salvar(usuario);
			attr.addFlashAttribute("mensagem", "Usuario cadastrado com sucesso.");
		} catch (Exception e) {
			attr.addFlashAttribute("mensagem", "Usuario ja cadastrado.");

		}
		return "/login/login";
	}
	
	@RequestMapping("/login")
	public String login(@RequestParam String nome, @RequestParam String senha, BindingResult result, RedirectAttributes attr) {
		String paginaRetorno = "";
		if(result.hasErrors()) {
			return "login/login";
		}
		try {
			usuarioService.logar(nome, senha);
			paginaRetorno = "/noticias/criar_noticias";
		} catch (Exception e) {
			attr.addFlashAttribute("mensagem", "Nome ou senha incorreto.");
			paginaRetorno = "/login/login";
		}
		return paginaRetorno;
	}
	
	@PostMapping("/semConta")
	public String acessoSemConta() {
		return "/home";
	}
	
	

}
