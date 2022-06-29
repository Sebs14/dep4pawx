package com.messiesuii.veterinary.models.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

@Entity(name = "pets")
public class Pet {
	
	@Id
	@SequenceGenerator(name = "pets_id_pet_seq", sequenceName = "pets_id_pet_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pets_id_pet_seq")
	@Column(name = "id_pet")
	private Integer id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "color")
	private String color;
	
	@Column(name = "age")
	private Integer age;
	
	@Column(name = "breed")
	private String breed;
	
	@Column(name = "specie")
	private String specie;
	
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name ="id_user", referencedColumnName = "id_user", nullable = true)
	private User user;

	//Constructors
	public Pet(Integer id, String name, String color, Integer age, String breed, String specie, User id_user) {
		super();
		this.id = id;
		this.name = name;
		this.color = color;
		this.age = age;
		this.breed = breed;
		this.specie = specie;
		this.user = id_user;
	}
	
	public Pet() {
		super();
	}

	//Getters and setters
	public Integer getId() {
		return id;
	}

	public void setId_pet(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public String getSpecie() {
		return specie;
	}

	public void setSpecie(String specie) {
		this.specie = specie;
	}

	public User getId_user() {
		return user;
	}

	public void setId_user(User id_user) {
		this.user = id_user;
	}
}
