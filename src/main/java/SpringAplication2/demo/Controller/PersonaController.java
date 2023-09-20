package SpringAplication2.demo.Controller;

import SpringAplication2.demo.InterfaceService.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class PersonaController {

    @Autowired
    private IPersonaService servicio; //Se inyecta la interface del servicio

    @GetMapping("listar")
    public String listarPersona(Model modelo){
        modelo.addAttribute("titulo","DATOS ESTUDIANTES");
        modelo.addAttribute("datos",servicio.listar());

        return "index";
    }

}
