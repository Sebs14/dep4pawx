package com.messiesuii.veterinary.services;

import java.util.List;

import com.messiesuii.veterinary.models.dtos.AppointmentInfo;
import com.messiesuii.veterinary.models.entities.Appointment;
import com.messiesuii.veterinary.models.entities.User;

public interface AppointmentService {
	List<Appointment> findAllByIdPet(Integer id_pet);
	List<Appointment> findAllByIdUser(Integer id_user);
	Appointment finOneById(Integer id_appointment);
	void register(AppointmentInfo appointmentInfo) throws Exception;
	List<Appointment> getUserAppointments(User user);
	List<Appointment> findAll() throws Exception;
}
