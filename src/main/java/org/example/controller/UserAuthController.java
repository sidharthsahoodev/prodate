package org.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/api/user")
public class UserAuthController {

    @PostMapping("/create")
    public String createUser(@RequestBody String test) {
        return test;
    }

}
