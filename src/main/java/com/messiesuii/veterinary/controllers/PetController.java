package com.messiesuii.veterinary.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.messiesuii.veterinary.models.dtos.MessageDTO;
import com.messiesuii.veterinary.models.dtos.PetInfo;
import com.messiesuii.veterinary.models.dtos.UserInfo;
import com.messiesuii.veterinary.models.entities.Appointment;
import com.messiesuii.veterinary.models.entities.Pet;
import com.messiesuii.veterinary.models.entities.User;
import com.messiesuii.veterinary.services.PetsService;
import com.messiesuii.veterinary.services.UserService;

@RestController
@RequestMapping("/pet")
public class PetController {
	
	@Autowired
	PetsService petService;
	
	@Autowired
	private UserService userService;

	@PostMapping("/register")
	public ResponseEntity<MessageDTO> registerPet (@Valid PetInfo petInfo, BindingResult result) {
		try {
			if(result.hasErrors()) {
				String errors = result.getAllErrors().toString();
						
				return new ResponseEntity<>(
						new MessageDTO("Hay errores: " + errors),
						HttpStatus.BAD_REQUEST
					);
			}
			
			petService.register(petInfo);
			
			return new ResponseEntity<>(
					new MessageDTO("Mascota Registrada"),
					HttpStatus.CREATED
				);
		} catch (Exception e) {
			return new ResponseEntity<>(
						new MessageDTO("Error interno"),
						HttpStatus.INTERNAL_SERVER_ERROR
					);
		}
	}
	
	@GetMapping("/my-pets")
	public ResponseEntity<?> getMyAppointments(){
		try {
			User user = userService.getUserAuthenticated();
			List<Pet> appointments = petService.getUserPets(user);
			
			return new ResponseEntity<>(
					appointments,
					HttpStatus.OK
			);
			
		} catch (Exception e) {
			return new ResponseEntity<>(
					new MessageDTO("Error interno de servidor"),
					HttpStatus.INTERNAL_SERVER_ERROR
				);
		}
	}
	
}
