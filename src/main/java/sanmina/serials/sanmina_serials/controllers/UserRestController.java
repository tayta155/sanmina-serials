package sanmina.serials.sanmina_serials.controllers;


import java.util.HashMap;
import java.util.Map;
import java.util.List;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sanmina.serials.sanmina_serials.controllers.dto.UserDto;
import sanmina.serials.sanmina_serials.models.User;

@RestController
@RequestMapping("/api")
public class UserRestController {

    @GetMapping(path = "/details")
    public UserDto details(){

        UserDto userDto = new UserDto();
        User user = new User("Eduardo", "Sustayta");
        userDto.setUser(user);
        userDto.setTitle("Hola mundo");
        return userDto;
    }

    public List<User> list(){

        User user = new User(null, null);
        User user2 = new User(null, null);
        User user3 = new User(null, null);
    }

    @GetMapping(path = "/details-map")
    public Map<String, Object> detailsmap(){

        User user = new User("Eduardo", "Sustayta");

        Map<String, Object> body = new HashMap<>();

        body.put("title", "Hola mundo en spring boot");
        body.put("user", user);
        
        return body;
    }
}

