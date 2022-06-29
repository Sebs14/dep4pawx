package com.messiesuii.veterinary.services.impls;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.messiesuii.veterinary.models.dtos.VaccineInfo;
import com.messiesuii.veterinary.models.entities.Pet;
import com.messiesuii.veterinary.models.entities.VaccineRecord;
import com.messiesuii.veterinary.repositories.PetRepository;
import com.messiesuii.veterinary.repositories.VaccineRecordRepository;
import com.messiesuii.veterinary.services.VaccineRecordService;

@Service
public class VaccineRecordServiceImpl implements VaccineRecordService{
	
	@Autowired
	private PetRepository petRepository;
	
	@Autowired
	private VaccineRecordRepository vaccineRecordRepository;

	@Override
	public VaccineRecord findOneById_pet(Integer id_pet) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void register(VaccineInfo vaccineInfo) throws Exception {
		
		VaccineRecord vaccine = new VaccineRecord();
		
		Pet pet = petRepository.findOneById(vaccineInfo.getIdPet());
		
		vaccine.setType(vaccineInfo.getType());
		vaccine.setDate(vaccineInfo.getDate());
		vaccine.setReinforcement(vaccineInfo.getReinforcement());
		vaccine.setPet(pet);
		
		vaccineRecordRepository.save(vaccine);
	}

	@Override
	public List<VaccineRecord> findAll() throws Exception {
		return vaccineRecordRepository.findAll();
	}

}
