package com.hackathon.doctolib.controller;

import com.hackathon.doctolib.service.PrescriptionService;

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

import java.util.List;

import com.hackathon.doctolib.entity.Prescription;


@RestController
@CrossOrigin
@RequestMapping("/prescriptions")
public class PrescriptionController {

    @Autowired 
    PrescriptionService service;

    @GetMapping
    public List<Prescription> getPropertyAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Prescription getPropertyById(@PathVariable Long id) {
        return service.getById(id);
    }

    @PostMapping
    public Prescription addProperty(@RequestBody Prescription element) {
        return service.create(element);
    }

    @PutMapping("/{id}")
    public Prescription updateProperty(@PathVariable Long id, @RequestBody Prescription element) {
        return service.update(id, element);
    }

    @DeleteMapping("{id}")
    public boolean deleteBook(@PathVariable Long id) {
        return service.delete(id);
    }
    
}