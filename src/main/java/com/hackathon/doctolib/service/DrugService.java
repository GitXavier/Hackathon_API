package com.hackathon.doctolib.service;

import com.hackathon.doctolib.entity.Drug;
import com.hackathon.doctolib.repository.DrugRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
public class DrugService {

    @Autowired
    DrugRepository Repository;

    @Autowired
    protected ModelMapper modelMapper;

    public List<Drug> getAll() { return this.Repository.findAll(); }

    public Drug getById( Long id ) { return this.Repository.findById(id).get(); }

    public Drug add( Drug element) { return this.Repository.save(element); }

    public Drug update(Long id, Drug newElement) {

        if (newElement.getId() != id) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Inconsistent parameter");
        }

        Optional<Drug> OptionalElement = this.Repository.findById(newElement.getId());
        Drug updateElement = OptionalElement.get();

        this.modelMapper.map(newElement, updateElement);

        return Repository.save(updateElement);
    }

    public boolean delete( Long id ) {

        Repository.deleteById(id);
        return true;
    }
}
