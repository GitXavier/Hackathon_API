package com.hackathon.doctolib.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Prescription {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    Integer quantity;
    Integer frequency;
    Integer duration;
    Date startDate;
    String moment;
    Date hours;
    String comment;

    public Prescription(){}

    public long getId(){
        return this.id;
    }
    public void setId(long id){
        this.id=id;
    }
    public Integer getQuantity(){
        return this.quantity;
    }
    public void setQuantity(Integer quantity){
        this.quantity=quantity;
    }
    public Integer getFrequency(){
        return this.frequency;
    }
    public void setFrequency(Integer frequency){
        this.frequency = frequency;
    }
    public Integer getDuration(){
        return this.duration;
    }
    public void setDuration(Integer duration){
        this.duration=duration;
    }
    public Date getStartdate(){
        return this.startDate;
    }
    public void setStartdate(Date startDate){
        this.startDate=startDate;
    }
    public String getMoment(){
        return this.moment;
    }
    public void setMoment(String moment){
        this.moment=moment;
    }
    public Date getHours(){
        return this.hours;
    }
    public void setHours(Date hours){
        this.hours=hours;
    }
    public String getComment(){
        return this.comment;
    }
    public void setComment(String comment){
        this.comment=comment;
    }
    
}