package com.messiesuii.veterinary.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.messiesuii.veterinary.models.dtos.MessageDTO;
import com.messiesuii.veterinary.models.dtos.RoleInfo;
import com.messiesuii.veterinary.services.RolesService;

@RestController
@RequestMapping("/roles")
@CrossOrigin(origins="*")
public class RolesController {
	
	@Autowired
	RolesService rolesService;
	
	@PostMapping("/add")
	public ResponseEntity<MessageDTO> addRole(@Valid RoleInfo RoleInfo, BindingResult result){
		try {
			if(result.hasErrors()) {
				String errors = result.getAllErrors().toString();
						
				
				return new ResponseEntity<>(
						new MessageDTO("Hay errores: " + errors),
						HttpStatus.BAD_REQUEST
					);
			}
			
			rolesService.register(RoleInfo);
			return new ResponseEntity<>(
					new MessageDTO("Rol Registrado"),
					HttpStatus.CREATED
				);
			
		} catch (Exception e) {
			return new ResponseEntity<>(
					new MessageDTO("Error interno"),
					HttpStatus.INTERNAL_SERVER_ERROR
				);
		}
	}
}
