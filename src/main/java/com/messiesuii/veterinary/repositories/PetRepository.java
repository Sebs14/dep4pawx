package com.messiesuii.veterinary.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.messiesuii.veterinary.models.entities.Pet;
import com.messiesuii.veterinary.models.entities.User;

public interface PetRepository extends JpaRepository<Pet, Integer>{
	List<Pet> findByUser(User user);
	Pet findOneById(Integer id_pet);
}
