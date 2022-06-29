package com.messiesuii.veterinary.models.entities;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

@Entity(name = "user_roles")
public class UserRoles {
	
	@Id
	@SequenceGenerator(name = "book_loan_id_gen", sequenceName = "book_loan_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "book_loan_id_gen")
	private Integer id_user_roles;
	
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name ="id_user")
	private User id_user;
	
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name ="id_rol")
	private Roles id_rol;

	//Constructors
	public UserRoles(User id_user, Roles id_rol) {
		super();
		this.id_user = id_user;
		this.id_rol = id_rol;
	}

	public UserRoles() {
		super();
	}

	//Getters and setters
	public User getId_user() {
		return id_user;
	}

	public void setId_user(User id_user) {
		this.id_user = id_user;
	}

	public Roles getId_rol() {
		return id_rol;
	}

	public void setId_rol(Roles id_rol) {
		this.id_rol = id_rol;
	}
}
