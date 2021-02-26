package edu.alumno.toni.dwesUd3WebAppSpringBoot.srv;

import org.springframework.stereotype.Service;

import edu.alumno.toni.dwesUd3WebAppSpringBoot.ram.Pagina;
@Service
public class PaginaService {
	
	private static Pagina pagina = new Pagina("Login","Home");

	public Pagina getPagina() {
		return pagina;
	}

	public void setPagina(Pagina nuevaPagina) {
		pagina = nuevaPagina;
	}
	
	

}