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

import com.messiesuii.veterinary.models.dtos.AppointmentInfo;
import com.messiesuii.veterinary.models.dtos.MessageDTO;
import com.messiesuii.veterinary.models.entities.Appointment;
import com.messiesuii.veterinary.models.entities.User;
import com.messiesuii.veterinary.services.AppointmentService;
import com.messiesuii.veterinary.services.UserService;

@RestController
@RequestMapping("/appointment")
@CrossOrigin(origins="*")
public class AppointmentController {
	
	@Autowired
	private AppointmentService appointmentService;
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/add")
	public ResponseEntity<MessageDTO> addAppointment (@Valid AppointmentInfo AppointmentInfo, BindingResult result) {
		try {
			if(result.hasErrors()) {
				String errors = result.getAllErrors().toString();
						
				
				return new ResponseEntity<>(
						new MessageDTO("Hay errores: " + errors),
						HttpStatus.BAD_REQUEST
					);
			}
			
			appointmentService.register(AppointmentInfo);
			
			return new ResponseEntity<>(
					new MessageDTO("Cita Registrada"),
					HttpStatus.CREATED
				);
		} catch (Exception e) {
			return new ResponseEntity<>(
						new MessageDTO("Error interno"),
						HttpStatus.INTERNAL_SERVER_ERROR
					);
		}
	}
	
	@GetMapping("/my-appointments")
	public ResponseEntity<?> getMyAppointments(){
		try {
			User user = userService.getUserAuthenticated();
			List<Appointment> appointments = appointmentService.getUserAppointments(user);
			
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
	
	@GetMapping("/all")
	public ResponseEntity<List<Appointment>> findAllUsers() {
		
		try {
			User userAuth = userService.getUserAuthenticated();
			System.out.println(userAuth.getName());
			
			List<Appointment> users = appointmentService.findAll();
			
			return new ResponseEntity<>(
		            users,
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
