package com.messiesuii.veterinary.models.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;


@Entity(name = "veterinary")
public class Veterinary {
	
	@Id
	@Column(name = "id_veterinary")
	private Integer id_veterinary;
	
	@Column(name = "specialty")
	private String specialty;
	
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name ="id_user")
	private User id_user;

	//Constructors
	public Veterinary(Integer id_veterinary, String specialty, User id_user) {
		super();
		this.id_veterinary = id_veterinary;
		this.specialty = specialty;
		this.id_user = id_user;
	}
	
	public Veterinary() {
		super();
	}

	//Getters and setters
	public Integer getId_veterinary() {
		return id_veterinary;
	}

	public void setId_veterinary(Integer id_veterinary) {
		this.id_veterinary = id_veterinary;
	}

	public String getSpecialty() {
		return specialty;
	}

	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}

	public User getId_user() {
		return id_user;
	}

	public void setId_user(User id_user) {
		this.id_user = id_user;
	}
}
