package com.hackathon.doctolib.service;

import java.util.List;
import java.util.Optional;

import com.hackathon.doctolib.entity.Prescription;
import com.hackathon.doctolib.repository.PrescriptionRepository;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service

public class PrescriptionService {

    @Autowired
    PrescriptionRepository repository;
    @Autowired
    ModelMapper modelMapper;

    public List<Prescription> getAll(){
        return repository.findAll();
    }
    public Prescription getById(long id){
        return repository.findById(id).get();
    }

    public Prescription update(Long id, Prescription newElement) {

        if (newElement.getId() != id) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Inconsistent parameter");
        }

        Optional<Prescription> OptionalElement = this.repository.findById(newElement.getId());
        Prescription updateElement = OptionalElement.get();

        this.modelMapper.map(newElement, updateElement);

        return repository.save(updateElement);
    }

    public Prescription create(Prescription prescription){
        return repository.save(prescription);
    }

    public boolean delete(Long id){
        repository.deleteById(id);
        return true;
    }
    
}
    