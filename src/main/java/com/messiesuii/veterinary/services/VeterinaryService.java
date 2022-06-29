package com.messiesuii.veterinary.services;

import java.util.List;

import com.messiesuii.veterinary.models.entities.Veterinary;

public interface VeterinaryService {
	Veterinary findOneById(Integer id_veterinary);
	List<Veterinary> findAll();
}
