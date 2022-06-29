package com.messiesuii.veterinary.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.messiesuii.veterinary.models.dtos.MessageDTO;
import com.messiesuii.veterinary.models.dtos.VaccineInfo;
import com.messiesuii.veterinary.models.entities.User;
import com.messiesuii.veterinary.models.entities.VaccineRecord;
import com.messiesuii.veterinary.services.UserService;
import com.messiesuii.veterinary.services.VaccineRecordService;

@RestController
@RequestMapping("/vaccine")
@CrossOrigin(origins="*")
public class VaccineController {

	@Autowired
	VaccineRecordService vaccineRecordService;
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/add")
	public ResponseEntity<MessageDTO> addVaccine (@Valid VaccineInfo VaccineInfo, BindingResult result){
		try {
			if(result.hasErrors()) {
				String errors = result.getAllErrors().toString();
						
				
				return new ResponseEntity<>(
						new MessageDTO("Hay errores: " + errors),
						HttpStatus.BAD_REQUEST
					);
			}
			
			vaccineRecordService.register(VaccineInfo);
			
			return new ResponseEntity<>(
					new MessageDTO("Vacuna Registrada"),
					HttpStatus.CREATED
				);
		} catch (Exception e) {
			return new ResponseEntity<>(
					new MessageDTO("Error interno"),
					HttpStatus.INTERNAL_SERVER_ERROR
				);
		}
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<VaccineRecord>> findAllVaccines(){
		try {
			User userAuth = userService.getUserAuthenticated();
			System.out.println(userAuth.getName());
			
			List<VaccineRecord> vaccines = vaccineRecordService.findAll();
			
			return new ResponseEntity<>(
		            vaccines,
		            HttpStatus.OK
		        );
			
		} catch (Exception e) {
			return new ResponseEntity<>(
		            null,
		            HttpStatus.INTERNAL_SERVER_ERROR
		        );
		}
	}
}
