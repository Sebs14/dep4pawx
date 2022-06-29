package com.messiesuii.veterinary.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.messiesuii.veterinary.models.entities.Token;
import com.messiesuii.veterinary.models.entities.User;

public interface TokenRepository extends JpaRepository<Token, Long>{
	List<Token> findByUserAndActive(User user, Boolean active);
}

