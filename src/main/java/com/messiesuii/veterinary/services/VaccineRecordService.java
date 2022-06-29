package com.messiesuii.veterinary.services;

import java.util.List;

import com.messiesuii.veterinary.models.dtos.VaccineInfo;
import com.messiesuii.veterinary.models.entities.VaccineRecord;

public interface VaccineRecordService {
	VaccineRecord findOneById_pet(Integer id_pet);
	void register(VaccineInfo vaccineInfo) throws Exception;
	List<VaccineRecord> findAll() throws Exception;
}
