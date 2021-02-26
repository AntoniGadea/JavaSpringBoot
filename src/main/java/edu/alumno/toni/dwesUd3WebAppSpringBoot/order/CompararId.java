package edu.alumno.toni.dwesUd3WebAppSpringBoot.order;

import java.util.Comparator;

import edu.alumno.toni.dwesUd3WebAppSpringBoot.ram.Modulo;

public class CompararId implements Comparator<Modulo>{

	public int compare(Modulo m1, Modulo m2) {
		return m1.getId()-m2.getId();
	}



}
