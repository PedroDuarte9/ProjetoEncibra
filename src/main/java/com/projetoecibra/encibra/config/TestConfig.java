package com.projetoecibra.encibra.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.projetoecibra.encibra.models.PasswordEntity;
import com.projetoecibra.encibra.models.UserEntity;
import com.projetoecibra.encibra.repositories.PasswordRepository;
import com.projetoecibra.encibra.repositories.UserRepository;

@Configuration
public class TestConfig implements CommandLineRunner{

	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private PasswordRepository passwordRepository;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
	
	}
	
	
}
