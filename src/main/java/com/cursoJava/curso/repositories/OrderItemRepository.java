package com.cursoJava.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursoJava.curso.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
	

}
