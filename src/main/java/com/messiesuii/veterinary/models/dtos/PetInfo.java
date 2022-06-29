package com.messiesuii.veterinary.models.dtos;

public class PetInfo {

	private Integer id;
	
	private String name;
	
	private String color;
	
	private Integer age;
	
	private String breed;

	private String specie;

	
	public PetInfo() {
		super();
	}

	public PetInfo(Integer id, String name, String color, Integer age, String breed, String specie) {
		super();
		this.id = id;
		this.name = name;
		this.color = color;
		this.age = age;
		this.breed = breed;
		this.specie = specie;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
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
	
}
