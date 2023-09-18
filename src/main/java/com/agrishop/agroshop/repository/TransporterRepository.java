package com.agrishop.agroshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.agrishop.agroshop.model.Transporter;

@Repository
public interface TransporterRepository extends JpaRepository<Transporter,Long>{

}
