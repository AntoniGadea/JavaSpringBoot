package edu.alumno.toni.dwesUd3WebAppSpringBoot;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.alumno.toni.dwesUd3WebAppSpringBoot.srv.AlumnoServiceBD;

@RestController
@RequestMapping("/api/")
public class AlumnoRestController {
    
    @Autowired
    AlumnoServiceBD alumnoServicio;

    @GetMapping("/alumnos")
    public ResponseEntity<List> getAlumnosList() {

        Optional<List> alumno = Optional.of(alumnoServicio.allAlumnos());
        System.out.println(alumno);
        if (alumno.isPresent())
            return ResponseEntity.ok().body(alumno.get());
        else throw new RuntimeException("Lista not found on :: ");
 
    }
}
