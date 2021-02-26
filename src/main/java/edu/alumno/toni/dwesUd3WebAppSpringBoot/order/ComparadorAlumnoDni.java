package edu.alumno.toni.dwesUd3WebAppSpringBoot.order;

import java.util.Comparator;

import edu.alumno.toni.dwesUd3WebAppSpringBoot.ram.Alumno;


public class ComparadorAlumnoDni implements Comparator<Alumno>{

	public int compare(Alumno a1, Alumno a2) {
		return a1.getDni().compareTo(a2.getDni());
	}

}