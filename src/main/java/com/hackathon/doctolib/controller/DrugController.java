package com.hackathon.doctolib.controller;

import com.hackathon.doctolib.entity.Drug;
import com.hackathon.doctolib.service.DrugService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/drugs")
public class DrugController {

    @Autowired
    DrugService service;

    @GetMapping
    public List<Drug> getPropertyAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Drug getPropertyById(@PathVariable Long id) {
        return service.getById(id);
    }

    @PostMapping
    public Drug addProperty(@RequestBody Drug element) {
        return service.add(element);
    }

    @PutMapping("/{id}")
    public Drug updateProperty(@PathVariable Long id, @RequestBody Drug element) {
        return service.update(id, element);
    }

    @DeleteMapping("/{id}")
    public boolean deleteBook(@PathVariable Long id) {
        return service.delete(id);
    }
}
