package edu.alumno.toni.dwesUd3WebAppSpringBoot.repository;

import org.springframework.stereotype.Repository;

import edu.alumno.toni.dwesUd3WebAppSpringBoot.ram.Alumno;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface AlumnoRepository extends JpaRepository<Alumno,Integer> {
    
}
