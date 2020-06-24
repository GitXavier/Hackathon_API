package com.hackathon.doctolib.service;

import java.util.List;
import java.util.Optional;

import com.hackathon.doctolib.entity.PillDispenser;
import com.hackathon.doctolib.repository.PillDispenserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import org.modelmapper.ModelMapper;

@Service

public class PillDispenserService {

    @Autowired
    PillDispenserRepository repository;
    @Autowired
    ModelMapper modelMapper;

    public List<PillDispenser> findAll(){
        return repository.findAll();
    }
    public PillDispenser getById(long id){
        return repository.findById(id).get();
    }

    public PillDispenser update(Long id, PillDispenser newElement) {

        if (newElement.getId() != id) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Inconsistent parameter");
        }

        Optional<PillDispenser> OptionalElement = this.repository.findById(newElement.getId());
        PillDispenser updateElement = OptionalElement.get();

        this.modelMapper.map(newElement, updateElement);

        return repository.save(updateElement);
    }

    public PillDispenser create(PillDispenser pillDispenser){
        return repository.save(pillDispenser);
    }
    
    public boolean delete(Long id){
        repository.deleteById(id);
        return true;
    }
    
}