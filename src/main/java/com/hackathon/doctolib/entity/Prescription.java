package com.hackathon.doctolib.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import java.util.Date;

import javax.persistence.*;

@Entity
public class Prescription {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer quantity;
    private Integer frequency;
    private Integer duration;
    private Date startDate;
    private String moment;
    private Date hours;
    private String comment;

    @ManyToOne
    @JoinColumn(name = "pillDispenser_id")
    @JsonBackReference
    private PillDispenser pillDispenser;

    public Prescription(){}

    public Long getId(){
        return this.id;
    }
    public void setId(Long id){
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

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public PillDispenser getPillDispenser() {
        return pillDispenser;
    }

    public void setPillDispenser(PillDispenser pillDispenser) {
        this.pillDispenser = pillDispenser;
    }
}