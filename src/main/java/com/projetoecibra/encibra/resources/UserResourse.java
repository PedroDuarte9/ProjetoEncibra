package com.projetoecibra.encibra.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projetoecibra.encibra.models.UserEntity;
import com.projetoecibra.encibra.services.UserService;



@RestController
@RequestMapping("/users")
public class UserResourse {
	
	@Autowired
	private UserService userService;

	@GetMapping
	public ResponseEntity<List<UserEntity>> findAll() {
		List<UserEntity> list = userService.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@PostMapping
	public ResponseEntity<UserEntity> insert(@RequestBody UserEntity userEntity){	
		UserEntity user = userService.insert(userEntity);
		return ResponseEntity.ok().body(user);
	}
	
	@DeleteMapping(value = "{id}")
	public ResponseEntity<Void> delete(@PathVariable Long id){
		userService.deleteById(id);
		return ResponseEntity.noContent().build();
	}
}
