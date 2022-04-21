package com.majortomdev.user.controller;
//By JoeK 13-04-22
import com.majortomdev.user.UserWithField.ResponseTemplateUWF;
import com.majortomdev.user.service.UserService;
import com.majortomdev.user.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/users")
@Slf4j
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/")
    public User saveUser(@RequestBody User user) {
        log.info("inside saveUser of usercontroller");
        return userService.saveUser(user);
    }
    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/")
    public List<User> getUsers() {
        log.info("inside getUsers of usercontroller");
        return userService.getUsers();
    }

    @GetMapping("/{id}")
    public ResponseTemplateUWF getUserWithField(@PathVariable("id") Long userId){
        log.info("inside getUserWithField of usercontroller");
        return userService.getUserWithField(userId);
    }

}
