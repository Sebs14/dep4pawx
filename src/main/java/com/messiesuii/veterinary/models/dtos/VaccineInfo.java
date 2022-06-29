package com.messiesuii.veterinary.models.dtos;

import java.util.Date;

public class VaccineInfo {
	
	private Integer id;
	
	private String type;
	
	private Date date;
	
	private Date reinforcement;
	
	private Integer idPet;
	
	
	public VaccineInfo(Integer id, String type, Date date, Date reinforcement, Integer idPet) {
		super();
		this.id = id;
		this.type = type;
		this.date = date;
		this.reinforcement = reinforcement;
		this.idPet = idPet;
	}

	public VaccineInfo() {
		super();
	}

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

	public Integer getIdPet() {
		return idPet;
	}

	public void setIdPet(Integer idPet) {
		this.idPet = idPet;
	}
}
