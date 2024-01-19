package com.projetoecibra.encibra.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.projetoecibra.encibra.dto.PasswordDTO;

import com.projetoecibra.encibra.models.PasswordEntity;

import com.projetoecibra.encibra.repositories.PasswordRepository;
import com.projetoecibra.encibra.utils.MD5Util;

@Service
public class PasswordService {

	@Autowired
	private PasswordRepository passwordRepository;

	public List<PasswordEntity> findAll() {
		return passwordRepository.findAll();
	}

	public PasswordEntity insert(PasswordEntity obj) {
		String ecripty = MD5Util.encriptyPassword(obj.getPassword());
		obj.setPassword(ecripty);
		return passwordRepository.save(obj);
	}

	public void deleteById(Long id) {
		passwordRepository.deleteById(id);
	}

	public List<PasswordDTO> listPasswordInText() {
		List<PasswordEntity> list = findAll();
		List<PasswordDTO> listDto = new ArrayList<>();

		for (PasswordEntity entity : list) {
			PasswordDTO dto = new PasswordDTO();
			dto.setDescription(entity.getDescription());
			dto.setPassword(entity.getPassword());
			dto.setTag(entity.getTag());
			listDto.add(dto);
		}
		return listDto;
	}

	public PasswordEntity update(Long id, PasswordEntity obj) {
		PasswordEntity passwordEntity = passwordRepository.getReferenceById(id);
		updateData(passwordEntity, obj);
		return passwordRepository.save(passwordEntity);
	}

	private void updateData(PasswordEntity passwordEntity, PasswordEntity obj) {
		passwordEntity.setPassword(obj.getPassword());
		passwordEntity.setDescription(obj.getDescription());
		passwordEntity.setTag(obj.getTag());

	}

}
