package com.example.userservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    @GetMapping("/{userId}")
    public UserDTO getUser(@PathVariable long userId) {
        return new UserDTO(userId, "dummy user",
                "dummy@gmail.com", "New York, Lift st. 41",  25);

    }
}
