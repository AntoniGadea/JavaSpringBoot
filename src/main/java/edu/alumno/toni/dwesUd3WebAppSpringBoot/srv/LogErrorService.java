package edu.alumno.toni.dwesUd3WebAppSpringBoot.srv;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Service;

import edu.alumno.toni.dwesUd3WebAppSpringBoot.order.ComparadorLogErrorExplicacion;
import edu.alumno.toni.dwesUd3WebAppSpringBoot.order.ComparadorLogErrorTipo;
import edu.alumno.toni.dwesUd3WebAppSpringBoot.ram.LogError;

@Service
public class LogErrorService {
	// Creamos la lista de errores.
	private static List<LogError> errores = new ArrayList<LogError>();


	// Lista de errores
	public List<LogError> listaErrores() {
		return errores;
	}

	// Lista Errores con Parametro
	public List<LogError> listaErrores(String criterioOrden) {
		switch (criterioOrden) {
		case "id":
			Collections.sort(errores);
			break;

		case "tipo":
			Collections.sort(errores, new ComparadorLogErrorTipo());
			break;

		case "info":
			Collections.sort(errores, new ComparadorLogErrorExplicacion());
			break;

		default:
			break;

		}

		return errores;
	}

	// Funcion añadir Error a la lista.
	public void addLogError(LogError logerror) {

		errores.add(logerror);

	}

	// Funcion eliminar Error de la lista.
	public void delLogError(LogError logerror) {

		errores.remove(logerror);
	}
	
	// Funcion obtener el ultimo id.
	public int asignarId() {
		int idFinal=0;
		for (int i = 0; i < errores.size(); i++) {
			idFinal = errores.get(i).getId();
		}
		return ++idFinal;
	}
	
	// Funcion para encontrar y devolver un Error.
		public LogError devuelveError(int id) {

			for (LogError error : errores) {

				if (error.getId() == id)
					return error;

			}

			return null;

		}
		
	// Funcion para filtrar
		public List<LogError> listaConFiltro(String campoFiltro, String textoFiltro) {
			List<LogError> erroresFiltrados = new ArrayList<LogError>(errores); 

			if (textoFiltro == "")
				return erroresFiltrados;
			
			switch (campoFiltro) {
			case "ID":
				
				for (LogError logError : errores) {
					
					if (logError.getId() != Integer.parseInt(textoFiltro))
						erroresFiltrados.remove(devuelveError(logError.getId()));
				}
								
				break;
				
			case "Tipo":
				
				erroresFiltrados.removeIf(error -> !error.getTipo().toLowerCase().contains(textoFiltro.toLowerCase()));
				
				break;
				
			case "Explicacion":
				
				erroresFiltrados.removeIf(error -> !error.getInfo().toLowerCase().contains(textoFiltro.toLowerCase()));
				
				break;
				

			default:
				break;
			}
			return erroresFiltrados;
		}
}