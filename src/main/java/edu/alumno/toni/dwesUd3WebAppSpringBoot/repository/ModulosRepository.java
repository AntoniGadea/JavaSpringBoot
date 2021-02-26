package edu.alumno.toni.dwesUd3WebAppSpringBoot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.alumno.toni.dwesUd3WebAppSpringBoot.ram.Modulo;

@Repository
public interface ModulosRepository extends JpaRepository<Modulo, Integer> {
    
}
