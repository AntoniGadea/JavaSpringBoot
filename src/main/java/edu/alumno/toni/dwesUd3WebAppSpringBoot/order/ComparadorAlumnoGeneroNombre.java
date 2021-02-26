package edu.alumno.toni.dwesUd3WebAppSpringBoot.order;

import java.util.Comparator;

import edu.alumno.toni.dwesUd3WebAppSpringBoot.ram.Alumno;



public class ComparadorAlumnoGeneroNombre implements Comparator<Alumno>{

	public int compare(Alumno a1, Alumno a2) {
		int comparaGenero = a1.getGenero().compareTo(a2.getGenero());
		
		if (comparaGenero!=0) {
			return comparaGenero;
		} else {
			return a1.getNombre().compareTo(a2.getNombre());
		}
		
	}

}