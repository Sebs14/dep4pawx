package com.messiesuii.veterinary.models.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity(name = "roles")
public class Roles {
	
	@Id
	@Column(name = "id_rol")
	@SequenceGenerator(name = "roles_id_rol_seq", sequenceName = "roles_id_rol_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "roles_id_rol_seq")
	private Integer id;
	
	@Column(name = "rol")
	private String rol;

	//Constructors
	public Roles(Integer id, String rol) {
		super();
		this.id = id;
		this.rol = rol;
	}

	public Roles() {
		super();
	}

	//Getters and setters
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}
}
