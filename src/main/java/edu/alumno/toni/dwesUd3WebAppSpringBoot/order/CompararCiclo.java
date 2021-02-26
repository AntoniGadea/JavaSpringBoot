package edu.alumno.toni.dwesUd3WebAppSpringBoot.order;

import java.util.Comparator;

import edu.alumno.toni.dwesUd3WebAppSpringBoot.ram.Modulo;

public class CompararCiclo implements Comparator<Modulo> {

    @Override
    public int compare(Modulo m1, Modulo m2) {
		return m1.getCiclo().compareTo(m2.getCiclo());
	}
    
}
