package com.messiesuii.veterinary.services;

import java.util.List;

import com.messiesuii.veterinary.models.dtos.UserInfo;
import com.messiesuii.veterinary.models.entities.User;

public interface UserService {
	void register(UserInfo userInfo) throws Exception;
	List<User> findAll() throws Exception;
	User findOneByEmail(String email) throws Exception;
	Boolean comparePassword(User user, String passToCompare) throws Exception;
	void insertToken(User user, String token) throws Exception;
	Boolean isTokenValid(User user, String token) throws Exception;
	
	User getUserAuthenticated() throws Exception;
}
