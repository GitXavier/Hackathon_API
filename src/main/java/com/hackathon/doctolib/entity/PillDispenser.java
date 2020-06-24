package com.hackathon.doctolib.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.List;

@Entity
public class PillDispenser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String pathology;

    @OneToMany(mappedBy = "pillDispenser")
    @JsonBackReference("pilulier")
    private List<Prescription> prescriptions;

    public PillDispenser(){}

    public Long getId(){
        return this.id;
    }
    public String getName (){
        return this.name;
    }
    public String getPathology(){
        return this.pathology;
    }

    public void setId(Long id){
        this.id=id;
    }
    public void setName(String name) {
        this.name=name;
    }
    public void setPathology(String pathology){
        this.pathology=pathology;
    }

    public List<Prescription> getPrescriptions() {
        return prescriptions;
    }

    public void setPrescriptions(List<Prescription> prescriptions) {
        this.prescriptions = prescriptions;
    }
}