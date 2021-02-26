package edu.alumno.toni.dwesUd3WebAppSpringBoot.order;

import java.util.Comparator;

import edu.alumno.toni.dwesUd3WebAppSpringBoot.ram.Alumno;



public class ComparadorAlumnoEdadNombre implements Comparator<Alumno>{

	public int compare(Alumno a1, Alumno a2) {
		int comparaEdad = a1.getEdad()-(a2.getEdad());
		
		if (comparaEdad!=0) {
			return comparaEdad;
		} else {
			return a1.getNombre().compareTo(a2.getNombre());
		}
		
	}

}