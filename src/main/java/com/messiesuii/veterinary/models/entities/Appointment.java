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

@Entity(name = "add_appointment")
public class Appointment {
	
	@Id
	@Column(name = "id_appointment")
	@SequenceGenerator(name = "add_appointment_id_appointment_seq", sequenceName = "add_appointment_id_appointment_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "add_appointment_id_appointment_seq")
	private Integer id;
	
	@Column(name = "appointment_date")
	private Date date_appointment;
	
	@Column(name = "symptoms")
	private String symptoms;
	
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name ="id_pet")
	private Pet id_pet;
	
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name ="id_user", referencedColumnName = "id_user", nullable = true)
	private User user;

	//Constructors
	public Appointment(Integer id, Date date_appointment, String symptoms, Pet id_pet,
			User id_user) {
		super();
		this.id = id;
		this.date_appointment = date_appointment;
		this.symptoms = symptoms;
		this.id_pet = id_pet;
		this.user = id_user;
	}

	public Appointment() {
		super();
	}

	//Getters and setters
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getDate_appointment() {
		return date_appointment;
	}

	public void setDate_appointment(Date date_appointment) {
		this.date_appointment = date_appointment;
	}

	public String getSymptoms() {
		return symptoms;
	}

	public void setSymptoms(String symptoms) {
		this.symptoms = symptoms;
	}

	public Pet getId_pet() {
		return id_pet;
	}

	public void setId_pet(Pet id_pet) {
		this.id_pet = id_pet;
	}

	public User getId_user() {
		return user;
	}

	public void setId_user(User id_user) {
		this.user = id_user;
	}
}
