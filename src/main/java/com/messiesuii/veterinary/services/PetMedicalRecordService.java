package com.messiesuii.veterinary.services;

import java.util.List;

import com.messiesuii.veterinary.models.entities.PetMedicalRecord;

public interface PetMedicalRecordService {
	List<PetMedicalRecord> findAllByIdPet(Integer id_pet);
	List<PetMedicalRecord> finAllByIdVeterinary(Integer id_veterinary);
	PetMedicalRecord findOneById(Integer id_record);
}
