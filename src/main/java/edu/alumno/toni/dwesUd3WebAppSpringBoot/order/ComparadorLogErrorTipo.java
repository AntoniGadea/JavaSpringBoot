package edu.alumno.toni.dwesUd3WebAppSpringBoot.order;

import java.util.Comparator;

import edu.alumno.toni.dwesUd3WebAppSpringBoot.ram.LogError;



public class ComparadorLogErrorTipo implements Comparator<LogError> {

	
	public int compare(LogError e1, LogError e2) {
		// TODO Auto-generated method stub
		return e1.getTipo().compareTo(e2.getTipo());
	}
	
}