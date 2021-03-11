package com.projetospringboot.springbootjpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetospringboot.springbootjpa.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
