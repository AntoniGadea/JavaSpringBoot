package edu.alumno.toni.dwesUd3WebAppSpringBoot.order;

import java.util.Comparator;

import edu.alumno.toni.dwesUd3WebAppSpringBoot.ram.Alumno;



public class ComparadorAlumnoCicloNombre implements Comparator<Alumno> {

	public int compare(Alumno a1, Alumno a2) {
		
		int comparaCiclo = a1.getCiclo().compareTo(a2.getCiclo());
		if (comparaCiclo!=0) {
			return comparaCiclo;
		} else {
			return a1.getNombre().compareTo(a2.getNombre());
		}
	}

}