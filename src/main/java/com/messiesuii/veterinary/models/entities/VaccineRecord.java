package com.messiesuii.veterinary.models.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

@Entity(name = "vaccine_record")
public class VaccineRecord {
	
	@Id
	@Column(name = "id_vaccine")
	@SequenceGenerator(name = "vaccine_record_id_vaccine_seq", sequenceName = "vaccine_record_id_vaccine_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "vaccine_record_id_vaccine_seq")
	private Integer id;
	
	@Column(name = "type")
	private String type;
	
	@Column(name = "vaccine_date")
	private Date date;
	
	@Column(name = "vaccine_reinforcement")
	private Date reinforcement;
	
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name ="id_pet", referencedColumnName = "id_pet", nullable = true)
	private Pet pet;

	//Constructors
	public VaccineRecord(Integer id, String type, Date date, Date reinforcement, Pet pet) {
		super();
		this.id = id;
		this.type = type;
		this.date = date;
		this.reinforcement = reinforcement;
		this.pet = pet;
	}

	public VaccineRecord() {
		super();
	}

	//Getters and setters
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Date getReinforcement() {
		return reinforcement;
	}

	public void setReinforcement(Date reinforcement) {
		this.reinforcement = reinforcement;
	}

	public Pet getPet() {
		return pet;
	}

	public void setPet(Pet pet) {
		this.pet = pet;
	}
}
