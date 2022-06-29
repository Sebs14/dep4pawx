package com.messiesuii.veterinary.models.dtos;

import java.util.Date;

public class AppointmentInfo {
	
	private Integer id;
	
	private Date dateAppointment;
	
	private String symptoms;
	
	private Integer idPet;

	public AppointmentInfo() {
		super();
	}

	public AppointmentInfo(Integer id, Date dateAppointment, String symptoms, Integer idPet) {
		super();
		this.id = id;
		this.dateAppointment = dateAppointment;
		this.symptoms = symptoms;
		this.idPet = idPet;
	}


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getDateAppointment() {
		return dateAppointment;
	}

	public void setDateAppointment(Date dateAppointment) {
		this.dateAppointment = dateAppointment;
	}

	public String getSymptoms() {
		return symptoms;
	}

	public void setSymptoms(String symptoms) {
		this.symptoms = symptoms;
	}

	public Integer getIdPet() {
		return idPet;
	}

	public void setIdPet(Integer idPet) {
		this.idPet = idPet;
	}
	
	
}
