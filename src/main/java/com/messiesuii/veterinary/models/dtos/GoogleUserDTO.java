package com.messiesuii.veterinary.models.dtos;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class GoogleUserDTO {

	
	@NotBlank
	@Pattern(regexp = "^[^@ \\t\\r\\n]+@[^@ \\t\\r\\n]+\\.[^@ \\t\\r\\n]+$")
	private String email;
	
	@NotBlank
	@Size(min = 4, max = 50)
	private String name;

	
	public GoogleUserDTO() {
		super();
	}

	public GoogleUserDTO(Long googleId,
			@NotBlank @Pattern(regexp = "^[^@ \\t\\r\\n]+@[^@ \\t\\r\\n]+\\.[^@ \\t\\r\\n]+$") String email,
			@NotBlank @Size(min = 4, max = 50) String name) {
		super();
		this.email = email;
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
