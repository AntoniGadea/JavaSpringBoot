package edu.alumno.toni.dwesUd3WebAppSpringBoot.srv.mapper;

import java.util.ArrayList;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import edu.alumno.toni.dwesUd3WebAppSpringBoot.dto.ModuloEdit;
import edu.alumno.toni.dwesUd3WebAppSpringBoot.dto.ModuloList;
import edu.alumno.toni.dwesUd3WebAppSpringBoot.ram.Modulo;

@Mapper
public interface ModuloMapper {
    ModuloMapper INSTANCE= Mappers.getMapper(ModuloMapper.class);

    ModuloEdit moduloToModuloEdit(Modulo modulo);
    ModuloList moduloToModuloList(Modulo modulo);
    Modulo moduloEditToModulo(ModuloEdit modulo);

    ArrayList<ModuloList> modulosToModulosList(ArrayList<Modulo> modulos);
}
