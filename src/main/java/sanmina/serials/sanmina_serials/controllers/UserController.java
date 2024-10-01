package sanmina.serials.sanmina_serials.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping("/details")
    public String details(Model model){

        model.addAttribute("title", "Hola mundo en spring boot");
        model.addAttribute("nombre", "Eduardo");
        model.addAttribute("lastname", "sustayta20");


        return "details";
    }
}
