package edu.alumno.toni.dwesUd3WebAppSpringBoot.srv;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.alumno.toni.dwesUd3WebAppSpringBoot.ram.Alumno;
import edu.alumno.toni.dwesUd3WebAppSpringBoot.repository.AlumnoRepository;

@Service
public class AlumnoServiceBD {

    private final AlumnoRepository alumnoRepo;
	
	@Autowired
    public  AlumnoServiceBD(AlumnoRepository alumnoRepo) {
        this.alumnoRepo = alumnoRepo;
    }
    
    public List<Alumno> allAlumnos(){
		List<Alumno> lista = alumnoRepo.findAll();
		return lista;
	}
}
