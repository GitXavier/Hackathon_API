package com.hackathon.doctolib.service;


import com.hackathon.doctolib.entity.User;
import com.hackathon.doctolib.repository.UserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    UserRepository Repository;

    @Autowired
    protected ModelMapper modelMapper;

    public List<User> getAll() { return this.Repository.findAll(); }

    public User getById( Long id ) { return this.Repository.findById(id).get(); }

    public User add( User element) { return this.Repository.save(element); }

    public User update(Long id, User newElement) {

        if (newElement.getId() != id) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Inconsistent parameter");
        }

        Optional<User> OptionalElement = this.Repository.findById(newElement.getId());
        User updateElement = OptionalElement.get();

        this.modelMapper.map(newElement, updateElement);

        return Repository.save(updateElement);
    }

    public boolean delete( Long id ) {

        Repository.deleteById(id);
        return true;
    }
}
