package edu.alumno.toni.dwesUd3WebAppSpringBoot.order;

import java.util.Comparator;

import edu.alumno.toni.dwesUd3WebAppSpringBoot.ram.Modulo;

public class CompararNombre implements Comparator<Modulo> {

	@Override
	public int compare(Modulo m1, Modulo m2) {
		return m1.getNombre().compareTo(m2.getNombre());
	}

}
