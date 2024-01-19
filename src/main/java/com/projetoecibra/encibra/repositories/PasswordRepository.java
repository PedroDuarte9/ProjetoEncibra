package com.projetoecibra.encibra.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projetoecibra.encibra.models.PasswordEntity;

@Repository
public interface PasswordRepository extends JpaRepository<PasswordEntity, Long>{

}
