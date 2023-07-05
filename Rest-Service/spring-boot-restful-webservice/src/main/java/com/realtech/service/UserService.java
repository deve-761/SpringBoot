package com.realtech.service;

import java.util.List;

import com.realtech.dto.UserDto;

public interface UserService {

	UserDto createUser(UserDto user);

	UserDto getUserById(Long id);

	List<UserDto> getAllUsers();

	UserDto updateUser(UserDto user);

	void deleteUser(Long id);
}
