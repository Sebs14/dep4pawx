package com.messiesuii.veterinary.models.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity(name = "pet_medical_record")
public class PetMedicalRecord {
	
	@Id
	@Column(name = "id_record")
	private Integer id_record;
	
	@Column(name = "appointment_description")
	private String appointment_description;
	
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name ="id_pet")
	private Pet id_pet;
	
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name ="id_veterinary")
	private Veterinary id_veterinary;

	//Constructors
	public PetMedicalRecord(Integer id_record, String appointment_description, Pet id_pet,
			Veterinary id_veterinary) {
		super();
		this.id_record = id_record;
		this.appointment_description = appointment_description;
		this.id_pet = id_pet;
		this.id_veterinary = id_veterinary;
	}

	//Getters and setters
	public PetMedicalRecord() {
		super();
	}

	public Integer getId_record() {
		return id_record;
	}

	public void setId_record(Integer id_record) {
		this.id_record = id_record;
	}

	public String getAppointment_description() {
		return appointment_description;
	}

	public void setAppointment_description(String appointment_description) {
		this.appointment_description = appointment_description;
	}

	public Pet getId_pet() {
		return id_pet;
	}

	public void setId_pet(Pet id_pet) {
		this.id_pet = id_pet;
	}

	public Veterinary getId_veterinary() {
		return id_veterinary;
	}

	public void setId_veterinary(Veterinary id_veterinary) {
		this.id_veterinary = id_veterinary;
	}
}
