package com.hackathon.doctolib.controller;


import com.hackathon.doctolib.entity.User;
import com.hackathon.doctolib.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserService service;

    @GetMapping
    public List<User> getPropertyAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public User getPropertyById(@PathVariable Long id) {
        return service.getById(id);
    }

    @PostMapping
    public User addProperty(@RequestBody User element) {
        return service.add(element);
    }

    @PutMapping("/{id}")
    public User updateProperty(@PathVariable Long id, @RequestBody User element) {
        return service.update(id, element);
    }

    @DeleteMapping("/{id}")
    public boolean deleteBook(@PathVariable Long id) {
        return service.delete(id);
    }
}
