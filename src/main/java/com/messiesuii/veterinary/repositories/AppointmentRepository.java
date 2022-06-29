package com.messiesuii.veterinary.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.messiesuii.veterinary.models.entities.Appointment;
import com.messiesuii.veterinary.models.entities.User;

public interface AppointmentRepository extends JpaRepository<Appointment, Integer>{
	List<Appointment> findByUser(User user);
	Appointment findOneById(Integer id_appointment);
}
