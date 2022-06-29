package com.messiesuii.veterinary.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.messiesuii.veterinary.models.entities.VaccineRecord;

public interface VaccineRecordRepository extends JpaRepository<VaccineRecord, Integer>{
	VaccineRecord findOneById(Integer id);
}
