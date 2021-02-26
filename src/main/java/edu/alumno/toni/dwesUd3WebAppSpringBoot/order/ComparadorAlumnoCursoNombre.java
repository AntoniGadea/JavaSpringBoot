package edu.alumno.toni.dwesUd3WebAppSpringBoot.order;

import java.util.Comparator;

import edu.alumno.toni.dwesUd3WebAppSpringBoot.ram.Alumno;



public class ComparadorAlumnoCursoNombre implements Comparator<Alumno> {

	
	public int compare(Alumno a1, Alumno a2) {
		int comparaCurso = a1.getCurso()-(a2.getCurso());
		
		if (comparaCurso!=0) {
			return comparaCurso;
		} else {
			return a1.getNombre().compareTo(a2.getNombre());
		}
	}

}