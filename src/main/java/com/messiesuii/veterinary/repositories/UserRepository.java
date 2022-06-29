package com.messiesuii.veterinary.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.messiesuii.veterinary.models.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	User findOneByEmail(String email);
}
