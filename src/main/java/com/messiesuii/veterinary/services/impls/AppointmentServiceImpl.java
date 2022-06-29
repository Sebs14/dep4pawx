package com.messiesuii.veterinary.services.impls;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.messiesuii.veterinary.models.dtos.AppointmentInfo;
import com.messiesuii.veterinary.models.entities.Appointment;
import com.messiesuii.veterinary.models.entities.Pet;
import com.messiesuii.veterinary.models.entities.User;
import com.messiesuii.veterinary.repositories.AppointmentRepository;
import com.messiesuii.veterinary.repositories.PetRepository;
import com.messiesuii.veterinary.repositories.UserRepository;
import com.messiesuii.veterinary.services.AppointmentService;
import com.messiesuii.veterinary.services.UserService;

@Service
public class AppointmentServiceImpl implements AppointmentService{
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private AppointmentRepository appointmentRepository;
	
	@Autowired
	private PetRepository petRepository;

	@Override
	public List<Appointment> findAllByIdPet(Integer id_pet) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Appointment> findAllByIdUser(Integer id_user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Appointment finOneById(Integer id_appointment) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void register(AppointmentInfo appointmentInfo) throws Exception {
		
		Appointment appointment = new Appointment();
		
		User user = userService.getUserAuthenticated();

		Pet pet = petRepository.findOneById(appointmentInfo.getIdPet());
		
		appointment.setDate_appointment(appointmentInfo.getDateAppointment());
		appointment.setSymptoms(appointmentInfo.getSymptoms());
		appointment.setId_pet(pet);
		appointment.setId_user(user);
		
		appointmentRepository.save(appointment);
	}

	@Override
	public List<Appointment> getUserAppointments(User user) {
		return appointmentRepository.findByUser(user);
	}

	@Override
	public List<Appointment> findAll() throws Exception {
		return appointmentRepository.findAll();
	}

}
