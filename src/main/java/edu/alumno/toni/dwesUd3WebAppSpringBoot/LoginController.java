package edu.alumno.toni.dwesUd3WebAppSpringBoot;


import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import edu.alumno.toni.dwesUd3WebAppSpringBoot.ram.Pagina;
import edu.alumno.toni.dwesUd3WebAppSpringBoot.ram.Usuario;
import edu.alumno.toni.dwesUd3WebAppSpringBoot.srv.I18nService;
import edu.alumno.toni.dwesUd3WebAppSpringBoot.srv.LoginService;
import edu.alumno.toni.dwesUd3WebAppSpringBoot.srv.PaginaService;

@Controller
//@SessionAttributes("usuario")
@SessionAttributes({"loginName","loginNickName","usuario"})

public class LoginController {
	@Autowired
	LoginService loginService = new LoginService();
	@Autowired
	PaginaService paginas = new PaginaService();
	Pagina pagina = new Pagina("login", "login");
	@Autowired
	I18nService language = new I18nService();

	@RequestMapping(value = {"/login","/"}, method = RequestMethod.GET)
	public String mostrarLogin(HttpServletRequest request,HttpServletResponse response, Locale locale,ModelMap model) {
		//Traza i18n
		//Información idioma de la petición del navegador
		System.out.println("Accept-Language: "+ request.getHeader("Accept-Language"));

		//Información del localeResolver
		
		System.out.println(String.format("Petición recibida. Languaje: %s, País: %s %n", locale.getLanguage(), locale.getDisplayCountry()));
		//Datos para la cabecera de la página
		language.configuraIdiomaPeticion(request, response, locale);
		paginas.setPagina(pagina);
		model.put("pagina", new Pagina("Home","login", language.getIdioma()));
		System.out.println("language.getIdioma "+language.getIdioma());
		model.addAttribute("loginName", "Desconocido");
		model.put("loginNickname", "Desconocido");
		//Datos para el formulario de login
		model.addAttribute("usuario", new Usuario());
		return "login";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String procesaLogin(String errores, ModelMap model, @Valid Usuario usuari, BindingResult validacion) {
		if (validacion.hasErrors()) {
			return "login";
		}
		model.addAttribute("usuario", usuari);
		model.addAttribute("loginName", usuari.getNombre());
		model.addAttribute("loginNickName", usuari.getNickname());
		paginas.setPagina(pagina);
		model.addAttribute("pagina", paginas.getPagina());
		if (loginService.usuarioValido(usuari)) {
			
			return "bienvenida";
		}
		model.put("errores", "Usuario "+usuari.getNickname()+" o contraseña incorrectos");
		return "login";
	}
}
