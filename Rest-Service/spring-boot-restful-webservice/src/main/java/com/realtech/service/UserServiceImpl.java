package com.realtech.service;

import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.realtech.dto.UserDto;
import com.realtech.entity.User;
import com.realtech.exception.EmailAlreadyExistsException;
import com.realtech.exception.ResourceNotFoundException;
import com.realtech.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private ModelMapper modelMapper;

	@Override
	public UserDto createUser(UserDto userDto) {
		
		Optional<User> optionalUser=userRepository.findByEmail(userDto.getEmail());
		if(optionalUser.isPresent()) {
			throw new EmailAlreadyExistsException("Email Already Exists for User");
		}

		// User user = UserMapper.mapToUser(userDto);//replace with model mapper library
		User user = modelMapper.map(userDto, User.class);// replace with map struct library
		// User user = mapper.mapToUser(userDto);

		User savedUser = userRepository.save(user);

		// UserDto savedDto = UserMapper.mapToUserDto(savedUser);//replace with model
		// mapper library
		UserDto savedDto = modelMapper.map(savedUser, UserDto.class);// replace with map struct library
		// UserDto savedDto = mapper.mapToUserDto(savedUser);

		return savedDto;
	}

	@Override
	public UserDto getUserById(Long id) {
		User existingUser = userRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("User", "id", id));
		// User existingUser = userRepository.findById(id).get();
		// UserDto userDto = UserMapper.mapToUserDto(existingUser);//replace with model
		// mapper library
		UserDto userDto = modelMapper.map(existingUser, UserDto.class);
		return userDto;
	}

	@Override
	public List<UserDto> getAllUsers() {
		List<User> userList = userRepository.findAll();
		// return userList.stream().map(user->UserMapper.mapToUserDto(user)).toList();
		// //replace with model mapper library
		return userList.stream().map(user -> modelMapper.map(user, UserDto.class)).toList();
	}

	@Override
	public UserDto updateUser(UserDto user) {
		User existingUser = userRepository.findById(user.getId())
				.orElseThrow(() -> new ResourceNotFoundException("User", "id", user.getId()));
		//User existingUser = userRepository.findById(user.getId()).get();

		existingUser.setFirstName(user.getFirstName());
		existingUser.setLastName(user.getLastName());
		existingUser.setEmail(user.getEmail());

		User updatedUser = userRepository.save(existingUser);
		// UserDto userDto = UserMapper.mapToUserDto(updatedUser);//replace with model
		// mapper library
		UserDto userDto = modelMapper.map(updatedUser, UserDto.class);
		return userDto;
	}

	@Override
	public void deleteUser(Long id) {
		User existingUser = userRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("User", "id", id));
		userRepository.deleteById(id);
	}

}
