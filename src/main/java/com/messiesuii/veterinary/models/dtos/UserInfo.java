package com.messiesuii.veterinary.models.dtos;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class UserInfo {
	
	
	private Long id_user;
	
	@NotBlank
	@Pattern(regexp = "^[^@ \\t\\r\\n]+@[^@ \\t\\r\\n]+\\.[^@ \\t\\r\\n]+$")
	private String email;
	
	@NotBlank
	@Size(min = 8, max = 32)
	@Pattern(regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,32}$")
	private String password;
	
	@NotBlank
	@Size(min = 4, max = 50)
	
	private String name;

	public UserInfo() {
		super();
	}

	public UserInfo(@NotBlank @Size(min = 4, max = 32) Long id_user,
			@NotBlank @Pattern(regexp = "^[^@ \\t\\r\\n]+@[^@ \\t\\r\\n]+\\.[^@ \\t\\r\\n]+$") String email,
			@NotBlank @Size(min = 8, max = 32) @Pattern(regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,32}$") String password,
			@NotBlank @Size(min = 4, max = 50) String name) {
		super();
		this.id_user = id_user;
		this.email = email;
		this.password = password;
		this.name = name;
	}

	public Long getId_user() {
		return id_user;
	}

	public void setId_user(Long id_user) {
		this.id_user = id_user;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
