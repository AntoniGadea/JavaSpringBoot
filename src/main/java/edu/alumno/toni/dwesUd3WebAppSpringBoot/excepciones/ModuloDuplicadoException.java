package edu.alumno.toni.dwesUd3WebAppSpringBoot.excepciones;

import edu.alumno.toni.dwesUd3WebAppSpringBoot.ram.Modulo;

public class ModuloDuplicadoException extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Modulo nuevo;
	private Modulo existente;

	public ModuloDuplicadoException(Modulo existente, Modulo nuevo) {
			this.nuevo = nuevo;
			this.existente = existente;
	}
	
	public ModuloDuplicadoException(Modulo nuevo) {
		this.nuevo = nuevo;
}

	@Override
	public String toString() {
		return "El modulo que quiere introducir: " + nuevo.getId() +  " ya está registrado en este modulo: " + existente.getNombre();
	}
	
	
	
	
	
}