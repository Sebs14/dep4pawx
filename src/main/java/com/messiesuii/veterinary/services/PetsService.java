package com.messiesuii.veterinary.services;

import java.util.List;

import com.messiesuii.veterinary.models.dtos.PetInfo;
import com.messiesuii.veterinary.models.entities.Pet;
import com.messiesuii.veterinary.models.entities.User;

public interface PetsService {
	
	void register(PetInfo petInfo) throws Exception;
	Pet findOneById_pet(Integer id_pet) throws Exception;
	List<Pet> findAllByBreed(String breed) throws Exception;
	List<Pet> findAllById_user(Integer id_user) throws Exception;
	List<Pet> getUserPets(User user);
}
