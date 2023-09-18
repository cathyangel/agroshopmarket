package com.agrishop.agroshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.agrishop.agroshop.model.Farmer;

@Repository
public interface FarmerRepository extends JpaRepository<Farmer,Long>{

}
