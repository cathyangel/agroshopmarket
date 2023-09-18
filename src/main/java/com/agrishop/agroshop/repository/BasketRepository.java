package com.agrishop.agroshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.agrishop.agroshop.model.Basket;

@Repository
public interface BasketRepository extends JpaRepository<Basket, Long> {

}
