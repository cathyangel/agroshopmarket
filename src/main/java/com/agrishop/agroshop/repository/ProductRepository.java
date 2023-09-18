package com.agrishop.agroshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.agrishop.agroshop.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {

}
