package com.hackathon.doctolib.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class PillDispenser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    String name;
    String pathology;
    String listPrescription;


    PillDispenser(){}

    public long getId(){
        return this.id;
    }
    public String getName (){
        return this.name;
    }
    public String getPathology(){
        return this.pathology;
    }
    public String getListPrescription(){
        return this.listPrescription;
    }

    public void setId(long id){
        this.id=id;
    }
    public void setName(String name) {
        this.name=name;
    }
    public void setPathology(String pathology){
        this.pathology=pathology;
    }
    public void setListPrescription(String listPrescription){
        this.listPrescription=listPrescription;
    }


    
}