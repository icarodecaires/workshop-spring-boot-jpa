package com.projetospringboot.springbootjpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetospringboot.springbootjpa.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
