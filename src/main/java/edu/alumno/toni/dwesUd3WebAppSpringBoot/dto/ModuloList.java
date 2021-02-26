package edu.alumno.toni.dwesUd3WebAppSpringBoot.dto;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ModuloList  implements Serializable{
    
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    
    @NotNull(message = "El id no puede estar vacio")
	private Integer id;
	@NotNull(message = "El nombre no puede estar vacio")
	private String nombre;
    @NotNull(message = "El ciclo no puede estar vacio")
	private String ciclo;
    @NotNull(message = "El professor no puede estar vacio")
	private String professor;
}
