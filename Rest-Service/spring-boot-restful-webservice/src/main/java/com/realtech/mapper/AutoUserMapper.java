package com.realtech.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.realtech.dto.UserDto;
import com.realtech.entity.User;

@Mapper
public interface AutoUserMapper {

	AutoUserMapper mapper = Mappers.getMapper(AutoUserMapper.class);
	
	UserDto mapToUserDto(User user);
	User mapToUser(UserDto userDto);
}
