package com.projetoecibra.encibra.dto;

import com.projetoecibra.encibra.models.UserEntity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor 
public class PasswordDTO {

	private String description;
	private String tag;
	private String password;
	private UserEntity userEntity;
	
	
}
