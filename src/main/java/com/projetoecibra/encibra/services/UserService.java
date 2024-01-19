package com.projetoecibra.encibra.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetoecibra.encibra.models.UserEntity;
import com.projetoecibra.encibra.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public List<UserEntity> findAll(){
		return userRepository.findAll();
	}
	
	public UserEntity insert(UserEntity obj) {
		return userRepository.save(obj);
	
	}
	
	public void deleteById(Long id) {
	 userRepository.deleteById(id);
	}
	
	
	//getReferenceById() 
}
