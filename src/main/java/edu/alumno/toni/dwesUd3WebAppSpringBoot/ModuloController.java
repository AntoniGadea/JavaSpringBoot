package edu.alumno.toni.dwesUd3WebAppSpringBoot;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import ch.qos.logback.core.joran.conditional.ElseAction;
import edu.alumno.toni.dwesUd3WebAppSpringBoot.dto.ModuloEdit;
import edu.alumno.toni.dwesUd3WebAppSpringBoot.ram.Modulo;
import edu.alumno.toni.dwesUd3WebAppSpringBoot.srv.ModuloServiceV2;
import edu.alumno.toni.dwesUd3WebAppSpringBoot.srv.mapper.ModuloMapper;

@Controller
public class ModuloController {

    @Autowired
    ModuloServiceV2 moduloservicio;

    @ModelAttribute("modulos")
    public List<ModuloEdit> getModulos() {
        return moduloservicio.listModulo();
    }

    @GetMapping(value="list-modulo")
    public String listarModulos(ModelMap model){
        model.put("modulo",new ModuloEdit(moduloservicio.setId(), null, null, 0, null, null));
        return "list-modulo";
    }

    @GetMapping(value="del-modulo/{id}")
    public String delModulo(@PathVariable(value="id") Integer id){
        moduloservicio.delModulo(new Modulo(id));
        return "redirect:/list-modulo";
    }

    @PostMapping(value="add-modulo")
    public String addModulo(@Valid ModuloEdit moduloEdit, BindingResult validacion){

        if(validacion.hasErrors())
            return "list-modulo";
        else
            moduloservicio.addModulo(ModuloMapper.INSTANCE.moduloEditToModulo(moduloEdit));

        return "redirect:/list-modulo";
    }

}   
