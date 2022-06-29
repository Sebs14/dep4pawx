package com.messiesuii.veterinary.services.impls;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.messiesuii.veterinary.models.dtos.PetInfo;
import com.messiesuii.veterinary.models.entities.Pet;
import com.messiesuii.veterinary.models.entities.User;
import com.messiesuii.veterinary.repositories.PetRepository;
import com.messiesuii.veterinary.repositories.UserRepository;
import com.messiesuii.veterinary.services.PetsService;
import com.messiesuii.veterinary.services.UserService;

@Service
public class PetsServiceImpl implements PetsService {
	
	@Autowired
	private PetRepository petRepository;
	
	/*
	@Autowired
	private UserRepository userRepository;
	*/
	
	@Autowired
	private UserService userService;

	@Override
	public void register(PetInfo petInfo) throws Exception {
		
		Pet pet = new Pet();
		
		User user = userService.getUserAuthenticated();
		
		pet.setName(petInfo.getName());
		pet.setColor(petInfo.getColor());
		pet.setAge(petInfo.getAge());
		pet.setBreed(petInfo.getBreed());
		pet.setSpecie(petInfo.getSpecie());
		pet.setId_user(user);
		
		petRepository.save(pet);
	}
	
	@Override
	public Pet findOneById_pet(Integer id_pet) {
		Pet foundPet = petRepository
				.findOneById(id_pet);
		return foundPet;
	}

	@Override
	public List<Pet> findAllByBreed(String breed) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Pet> findAllById_user(Integer id_user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Pet> getUserPets(User user) {
		return petRepository.findByUser(user);
	}

	

}
