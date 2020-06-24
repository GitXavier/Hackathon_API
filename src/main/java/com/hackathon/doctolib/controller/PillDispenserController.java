package com.hackathon.doctolib.controller;

import java.util.List;

import com.hackathon.doctolib.entity.PillDispenser;
import com.hackathon.doctolib.service.PillDispenserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/piluliers")

public class PillDispenserController {

    @Autowired
    PillDispenserService service;

    @GetMapping
    public List<PillDispenser> findAll(){
        return service.findAll();
    }
    @GetMapping("/{id}")
    public PillDispenser findById(@PathVariable Long id){
        return service.getById(id);
    }

    @PostMapping
    public PillDispenser create(@RequestBody PillDispenser pillDispenser){
        return service.create(pillDispenser);
    }

    @PutMapping("/{id}")
    public PillDispenser update(@PathVariable long id, @RequestBody PillDispenser pillDispenser){
        return service.update(id, pillDispenser);
    }

    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable long id){
        return service.delete(id);
    }
 

    
    
}