package edu.alumno.toni.dwesUd3WebAppSpringBoot.dto;

import java.io.Serializable;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ModuloEdit implements Serializable{
    /**
    *
    */
    private static final long serialVersionUID = 1L;

    @NotNull(message = "El id no puede estar vacio")
	@Range(min=8,max=200,message = "El id no es correcto")
	private Integer id;
	@NotNull(message = "El nombre no puede estar vacio")
	private String nombre;
	@NotNull(message = "La abreviatura no puede estar vacio")
	@Length(min=3, message = "No puede tener una longitud menor que 3")
	private String abreviatura;
    @NotNull(message = "Las horas no puede estar vacio")
	@Range(min = 2, max = 8, message = "Las horas tiene que ser como maximo 8 o minimo 2")
	private int horas;
    @NotNull(message = "El ciclo no puede estar vacio")
	@Length(min=3, message = "No puede tener una longitud menor que 3")
	private String ciclo;
    @NotNull(message = "El professor no puede estar vacio")
	@Length(min=3, message = "No puede tener una longitud menor que 3")
	private String professor;
}
