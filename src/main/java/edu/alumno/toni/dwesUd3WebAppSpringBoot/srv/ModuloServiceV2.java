package edu.alumno.toni.dwesUd3WebAppSpringBoot.srv;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.alumno.toni.dwesUd3WebAppSpringBoot.dto.ModuloList;
import edu.alumno.toni.dwesUd3WebAppSpringBoot.order.CompararCiclo;
import edu.alumno.toni.dwesUd3WebAppSpringBoot.order.CompararId;
import edu.alumno.toni.dwesUd3WebAppSpringBoot.order.CompararNombre;
import edu.alumno.toni.dwesUd3WebAppSpringBoot.ram.Modulo;
import edu.alumno.toni.dwesUd3WebAppSpringBoot.repository.ModulosRepository;
import edu.alumno.toni.dwesUd3WebAppSpringBoot.srv.mapper.ModuloMapper;

@Service
public class ModuloServiceV2 {
    
    static Integer id = 10;
    static Integer num = 0;

    private final ModulosRepository moduloRepo;
	
	@Autowired
    public  ModuloServiceV2(ModulosRepository moduloRepo) {
        this.moduloRepo = moduloRepo;
    }

    public void addModulo(Modulo modulo){
        moduloRepo.save(modulo);
    }

    public void delModulo(Modulo modulo){
        moduloRepo.delete(modulo);
    }

    public List listModulo(){
        return moduloRepo.findAll();
    }


    public Integer setId(){
        return id++;
    }

    public Map<Integer,Modulo> nombres(){
        List<Modulo> modulos = moduloRepo.findAll();
        HashMap<Integer, Modulo> nombres = new HashMap<Integer,Modulo>();

        modulos.stream().forEach( m -> nombres.put(num++,m));

        return nombres;
    }

    public List<ModuloList> listaModulosOrdenado(String criterio) {
		ArrayList<Modulo> modulos = new ArrayList<Modulo>();
        
        switch (criterio) {
		case "id":
			Collections.sort(modulos, new CompararId());
		case "ciclo":
			Collections.sort(modulos, new CompararCiclo());
			break;
		case "nombre":
			Collections.sort(modulos, new CompararNombre());
			break;
		}
		return ModuloMapper.INSTANCE.modulosToModulosList(modulos);
	}
}
