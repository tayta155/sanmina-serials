package sanmina.serials.sanmina_serials.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import sanmina.serials.sanmina_serials.models.User;

@Controller
public class UserController {

    @GetMapping("/details")
    public String details(Model model){

        User user = new User("Eduardo", "Sustayta");
        model.addAttribute("title", "Hola mundo en spring boot");
        model.addAttribute("user", user);

        return "details";
    }
}
