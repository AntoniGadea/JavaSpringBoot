package edu.alumno.toni.dwesUd3WebAppSpringBoot;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import edu.alumno.toni.dwesUd3WebAppSpringBoot.ram.Usuario;

@Controller
@SessionAttributes({"loginName","loginNickName","usuario"})
    public class LogOutController {

      @RequestMapping(value = ("logout") ,method=RequestMethod.GET)
      public String logout(@ModelAttribute Usuario usuario,ModelMap model,SessionStatus status) {
    	status.setComplete();
    	model.put("usuario", new Usuario("","","",""));
    	model.clear();
        return "redirect:login";
      }
    }