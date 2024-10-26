package sanmina.serials.sanmina_serials.controllers;


import java.util.HashMap;
import java.util.Map;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sanmina.serials.sanmina_serials.models.User;

@RestController
@RequestMapping("/api")
public class UserRestController {

    @GetMapping(path = "/details")
    public Map<String, Object> details(){

        User user = new User("Eduardo", "Sustayta");

        Map<String, Object> body = new HashMap<>();

        body.put("title", "Hola mundo en spring boot");
        body.put("user", user);
        
        return body;
    }
}
