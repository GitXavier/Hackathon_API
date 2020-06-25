package com.hackathon.doctolib.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstname;
    private String lastname;
    private Integer phone;
    private Date birthday;
    private int height;
    private int weight;
    private boolean isPatient;
    private String sexe;
    private Boolean isStop;
    private Boolean isEnd;

    @OneToOne
    @JoinColumn(name="pillDispenser_id", referencedColumnName = "id")
    private PillDispenser pillDispenser;

    public User() { }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public boolean isPatient() {
        return isPatient;
    }

    public void setPatient(boolean patient) {
        isPatient = patient;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public PillDispenser getPillDispenser() {
        return pillDispenser;
    }

    public void setPillDispenser(PillDispenser pillDispenser) {
        this.pillDispenser = pillDispenser;
    }

    public Boolean getIsStop(){
        return this.isStop;
    }
    public void setIsStop(Boolean isStop){
        this.isStop=isStop;
    }
    public Boolean getIsEnd(){
        return this.isEnd;
    }
    public void setIsEnd(Boolean isEnd){
        this.isEnd=isEnd;
    }

}
