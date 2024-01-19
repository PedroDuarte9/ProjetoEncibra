package com.projetoecibra.encibra.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projetoecibra.encibra.dto.PasswordDTO;
import com.projetoecibra.encibra.models.PasswordEntity;
import com.projetoecibra.encibra.services.PasswordService;



@RestController
@RequestMapping("/password")
public class PasswordResourse {
	
	@Autowired
	private PasswordService passwordService ;

//	@GetMapping
//	public ResponseEntity<List<PasswordEntity>> findAll() {
//		List<PasswordEntity> list = passwordService.findAll();
//		return ResponseEntity.ok().body(list);
//	}
	
	@GetMapping
	public ResponseEntity<List<PasswordDTO>> findAllWithPreviewPassword() {
		List<PasswordDTO> listDto = passwordService.listPasswordInText();
		return ResponseEntity.ok().body(listDto);
	}
	
	@PostMapping
	public ResponseEntity<PasswordEntity> insert(@RequestBody PasswordEntity passwordEntity){	
		PasswordEntity password = passwordService.insert(passwordEntity);
		return ResponseEntity.ok().body(password);
	}
	
	@DeleteMapping(value = "{id}")
	public ResponseEntity<Void> delete(@PathVariable Long id){
		passwordService.deleteById(id);
		return ResponseEntity.noContent().build();
	}
	
	@PutMapping(value = "{id}")
	public ResponseEntity<PasswordEntity> update(@PathVariable Long id, @RequestBody PasswordEntity passwordEntity){
	PasswordEntity pass	= passwordService.update(id, passwordEntity);
	return ResponseEntity.ok().body(pass);
	}
	
}
