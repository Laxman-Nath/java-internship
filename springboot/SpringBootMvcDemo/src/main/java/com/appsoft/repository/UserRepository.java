package com.appsoft.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.appsoft.models.User;

public interface UserRepository extends JpaRepository<User, Integer>{
boolean existsByNameAndPassword(String name,String password);
boolean existsByName(String name);
}
