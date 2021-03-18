package com.projetospringboot.springbootjpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetospringboot.springbootjpa.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
