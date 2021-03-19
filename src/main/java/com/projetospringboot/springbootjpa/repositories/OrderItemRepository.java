package com.projetospringboot.springbootjpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetospringboot.springbootjpa.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
