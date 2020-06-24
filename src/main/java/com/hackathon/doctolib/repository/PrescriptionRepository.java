package com.hackathon.doctolib.repository;

import com.hackathon.doctolib.entity.Prescription;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface PrescriptionRepository extends JpaRepository<Prescription,Long>{
    
}