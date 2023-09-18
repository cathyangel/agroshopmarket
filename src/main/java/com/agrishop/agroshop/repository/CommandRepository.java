package com.agrishop.agroshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.agrishop.agroshop.model.Command;

@Repository
public interface CommandRepository extends JpaRepository<Command, Long> {

}
