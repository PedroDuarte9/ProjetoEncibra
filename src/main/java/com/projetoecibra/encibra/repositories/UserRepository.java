package com.projetoecibra.encibra.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projetoecibra.encibra.models.UserEntity;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long>{

}
