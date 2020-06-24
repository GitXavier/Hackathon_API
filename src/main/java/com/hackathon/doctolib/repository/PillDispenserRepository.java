package com.hackathon.doctolib.repository;

import com.hackathon.doctolib.entity.PillDispenser;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface PillDispenserRepository extends JpaRepository <PillDispenser, Long>{
    
}