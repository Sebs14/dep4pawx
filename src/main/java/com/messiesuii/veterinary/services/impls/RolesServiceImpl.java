package com.messiesuii.veterinary.services.impls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.messiesuii.veterinary.models.dtos.RoleInfo;
import com.messiesuii.veterinary.models.entities.Roles;
import com.messiesuii.veterinary.repositories.RolesRepository;
import com.messiesuii.veterinary.services.RolesService;

@Service
public class RolesServiceImpl implements RolesService{

	@Autowired
	RolesRepository rolesRepository;
	
	@Override
	public void register(RoleInfo roleInfo) throws Exception {
		Roles rol = new Roles();
		
		rol.setRol(roleInfo.getRol());
		
		rolesRepository.save(rol);
	}

}
