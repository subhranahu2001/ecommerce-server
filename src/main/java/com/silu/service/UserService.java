package com.silu.service;

import java.util.List;

import com.silu.exception.UserException;
import com.silu.modal.User;

public interface UserService {
	
	public User findUserById(Long userId) throws UserException;
	
	public User findUserProfileByJwt(String jwt) throws UserException;
	
	public List<User> findAllUsers();

}
