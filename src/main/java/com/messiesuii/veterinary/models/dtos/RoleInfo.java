package com.messiesuii.veterinary.models.dtos;

public class RoleInfo {
	
	private Integer id_rol;
	
	private String rol;

	public RoleInfo(Integer id_rol, String rol) {
		super();
		this.id_rol = id_rol;
		this.rol = rol;
	}

	public RoleInfo() {
		super();
	}

	public Integer getId_rol() {
		return id_rol;
	}

	public void setId_rol(Integer id_rol) {
		this.id_rol = id_rol;
	}

	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}
}
