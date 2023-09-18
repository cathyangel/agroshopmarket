package com.agrishop.agroshop.repository;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.agrishop.agroshop.model.User;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

	Optional<User> findByUserNameOrEmail(String username, String email);

}
